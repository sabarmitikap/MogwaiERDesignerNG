/**
 * Mogwai ERDesigner. Copyright (C) 2002 The Mogwai Project.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package de.erdesignerng.model;

/**
 * @author $Author: mirkosertic $
 * @version $Date: 2008-02-01 17:20:25 $
 */
public class TableList extends ModelItemVector<Table> {

    private static final long serialVersionUID = 7291908371933857720L;

    /**
     * Find an attribute by a given system id.
     * 
     * @param aSystemId
     *            the system id
     * @return the attribute or null if nothing was found
     */
    public Attribute findAttributeBySystemId(String aSystemId) {
        for (Table theTable : this) {
            Attribute theAttribute = theTable.getAttributes().findBySystemId(aSystemId);
            if (theAttribute != null) {
                return theAttribute;
            }
        }
        return null;
    }

    /**
     * Test if a defaultvalue is used by a table.
     * 
     * @param aDefault
     *            the default value
     * @return true if its used, else false
     */
    public boolean isDefaultValueUsed(DefaultValue aDefault) {
        for (Table theTable : this) {
            for (Attribute theAttribute : theTable.getAttributes()) {
                if (theAttribute.getDefaultValue() != null) {
                    if (theAttribute.getDefaultValue().getName().equals(aDefault.getName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
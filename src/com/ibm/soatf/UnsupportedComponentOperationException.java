/*
 * Copyright (C) 2013 zANGETSu
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.ibm.soatf;

/**
 * Exception thrown when framework is asked to process not defined operation.
 * As soon as enumeration of operations has been moved into XML schema files, 
 * this exception shouldn't be ever thrown now.
 * @author Ladislav Jech <archenroot@gmail.com>
 */

@Deprecated
public class UnsupportedComponentOperationException extends Exception {

    public UnsupportedComponentOperationException() {
    }

    public UnsupportedComponentOperationException(String message) {
        super(message);
    }

    public UnsupportedComponentOperationException(Throwable cause) {
        super(cause);
    }

    public UnsupportedComponentOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}

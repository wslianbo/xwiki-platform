/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.listener;

/**
 * Represents an image in a Document.
 * 
 * @version $Id$
 * @since 1.7M3
 */
public interface Image extends Cloneable
{
    /**
     * @return the image type (image located in a Document or image located at a URL)
     */
    ImageType getType();

    /**
     * @return a name representing the image (it's used for example as the ALT text in the XHTML renderer)
     */
    String getName();

    /**
     * @return a copy of the image
     */
    Image clone();
}

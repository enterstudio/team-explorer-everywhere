// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildGroupItemSpec;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildGroups;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildServiceSoap_QueryBuildGroups
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _BuildGroupItemSpec[] specs;

    public _BuildServiceSoap_QueryBuildGroups()
    {
        super();
    }

    public _BuildServiceSoap_QueryBuildGroups(final _BuildGroupItemSpec[] specs)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSpecs(specs);
    }

    public _BuildGroupItemSpec[] getSpecs()
    {
        return this.specs;
    }

    public void setSpecs(_BuildGroupItemSpec[] value)
    {
        this.specs = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.specs != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("specs");

            for (int iterator0 = 0; iterator0 < this.specs.length; iterator0++)
            {
                this.specs[iterator0].writeAsElement(
                    writer,
                    "BuildGroupItemSpec");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}

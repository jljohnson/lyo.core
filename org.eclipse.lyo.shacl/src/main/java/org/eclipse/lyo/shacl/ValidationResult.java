// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.shacl;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(ShDomainConstants.VALIDATIONRESULT_NAMESPACE)
@OslcName(ShDomainConstants.VALIDATIONRESULT_LOCALNAME)
@OslcResourceShape(title = "ValidationResult Resource Shape", describes = ShDomainConstants.VALIDATIONRESULT_TYPE)
public class ValidationResult
    extends AbstractResource
    implements IValidationResult
{
    // Start of user code attributeAnnotation:resultpath
    // End of user code
    private URI resultPath;
    // Start of user code attributeAnnotation:focusNode
    // End of user code
    private URI focusNode;
    // Start of user code attributeAnnotation:message
    // End of user code
    private String message;
    // Start of user code attributeAnnotation:resultSeverity
    // End of user code
    private URI resultSeverity;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ValidationResult()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ValidationResult(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        ShDomainConstants.VALIDATIONRESULT_PATH,
        ValidationResult.class);
    }
    
    // Start of user code getterAnnotation:resultpath
    // End of user code
    @OslcName("resultPath")
    @OslcPropertyDefinition(ShDomainConstants.SHACL_NAMSPACE + "resultPath")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    public URI getResultPath()
    {
        // Start of user code getterInit:resultpath
        // End of user code
        return resultPath;
    }
    
    // Start of user code getterAnnotation:focusNode
    // End of user code
    @OslcName("focusNode")
    @OslcPropertyDefinition(ShDomainConstants.SHACL_NAMSPACE + "focusNode")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    public URI getFocusNode()
    {
        // Start of user code getterInit:focusNode
        // End of user code
        return focusNode;
    }
    
    // Start of user code getterAnnotation:message
    // End of user code
    @OslcName("message")
    @OslcPropertyDefinition(ShDomainConstants.SHACL_NAMSPACE + "message")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getMessage()
    {
        // Start of user code getterInit:message
        // End of user code
        return message;
    }
    
    // Start of user code getterAnnotation:resultSeverity
    // End of user code
    @OslcName("resultSeverity")
    @OslcPropertyDefinition(ShDomainConstants.SHACL_NAMSPACE + "resultSeverity")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    @OslcAllowedValue({"http://www.w3.org/ns/shacl#Info", "http://www.w3.org/ns/shacl#Warning", "http://www.w3.org/ns/shacl#Violation"})
    public URI getResultSeverity()
    {
        // Start of user code getterInit:resultSeverity
        // End of user code
        return resultSeverity;
    }
    
    
    // Start of user code setterAnnotation:resultpath
    // End of user code
    public void setResultPath(final URI resultPath )
    {
        // Start of user code setterInit:resultpath
        // End of user code
        this.resultPath = resultPath;
    
        // Start of user code setterFinalize:resultpath
        // End of user code
    }
    
    // Start of user code setterAnnotation:focusNode
    // End of user code
    public void setFocusNode(final URI focusNode )
    {
        // Start of user code setterInit:focusNode
        // End of user code
        this.focusNode = focusNode;
    
        // Start of user code setterFinalize:focusNode
        // End of user code
    }
    
    // Start of user code setterAnnotation:message
    // End of user code
    public void setMessage(final String message )
    {
        // Start of user code setterInit:message
        // End of user code
        this.message = message;
    
        // Start of user code setterFinalize:message
        // End of user code
    }
    
    // Start of user code setterAnnotation:resultSeverity
    // End of user code
    public void setResultSeverity(final URI resultSeverity )
    {
        // Start of user code setterInit:resultSeverity
        // End of user code
        this.resultSeverity = resultSeverity;
    
        // Start of user code setterFinalize:resultSeverity
        // End of user code
    }

    @Override
    public String toString() {
        return "ValidationResult [resultPath=" + resultPath + ", focusNode=" + focusNode + ", message=" + message
                + ", resultSeverity=" + resultSeverity + "]";
    }

}

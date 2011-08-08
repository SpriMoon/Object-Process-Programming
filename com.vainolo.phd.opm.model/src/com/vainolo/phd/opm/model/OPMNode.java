/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getOpd <em>Opd</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMNode()
 * @model
 * @generated
 */
public interface OPMNode extends EObject {
	/**
     * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
     * The list contents are of type {@link com.vainolo.phd.opm.model.OPMLink}.
     * It is bidirectional and its opposite is '{@link com.vainolo.phd.opm.model.OPMLink#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Links</em>' reference list.
     * @see com.vainolo.phd.opm.model.OPMPackage#getOPMNode_IncomingLinks()
     * @see com.vainolo.phd.opm.model.OPMLink#getTarget
     * @model opposite="target"
     * @generated
     */
	EList<OPMLink> getIncomingLinks();

	/**
     * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
     * The list contents are of type {@link com.vainolo.phd.opm.model.OPMLink}.
     * It is bidirectional and its opposite is '{@link com.vainolo.phd.opm.model.OPMLink#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Links</em>' reference list.
     * @see com.vainolo.phd.opm.model.OPMPackage#getOPMNode_OutgoingLinks()
     * @see com.vainolo.phd.opm.model.OPMLink#getSource
     * @model opposite="source"
     * @generated
     */
	EList<OPMLink> getOutgoingLinks();

    /**
     * Returns the value of the '<em><b>Opd</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link com.vainolo.phd.opm.model.OPMObjectProcessDiagram#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Opd</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opd</em>' container reference.
     * @see #setOpd(OPMObjectProcessDiagram)
     * @see com.vainolo.phd.opm.model.OPMPackage#getOPMNode_Opd()
     * @see com.vainolo.phd.opm.model.OPMObjectProcessDiagram#getNodes
     * @model opposite="nodes" transient="false"
     * @generated
     */
    OPMObjectProcessDiagram getOpd();

    /**
     * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMNode#getOpd <em>Opd</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Opd</em>' container reference.
     * @see #getOpd()
     * @generated
     */
    void setOpd(OPMObjectProcessDiagram value);

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' attribute.
     * @see #setConstraints(Rectangle)
     * @see com.vainolo.phd.opm.model.OPMPackage#getOPMNode_Constraints()
     * @model dataType="com.vainolo.phd.opm.model.Rectangle"
     * @generated
     */
    Rectangle getConstraints();

    /**
     * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMNode#getConstraints <em>Constraints</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraints</em>' attribute.
     * @see #getConstraints()
     * @generated
     */
    void setConstraints(Rectangle value);

} // OPMNode
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedural Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMProceduralLink#getKind <em>Kind</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMProceduralLink#getSubKinds <em>Sub Kinds</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMProceduralLink#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMProceduralLink()
 * @model
 * @generated
 */
public interface OPMProceduralLink extends OPMLink {
	/**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link com.vainolo.phd.opm.model.OPMProceduralLinkKind}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see com.vainolo.phd.opm.model.OPMProceduralLinkKind
   * @see #setKind(OPMProceduralLinkKind)
   * @see com.vainolo.phd.opm.model.OPMPackage#getOPMProceduralLink_Kind()
   * @model
   * @generated
   */
	OPMProceduralLinkKind getKind();

	/**
   * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMProceduralLink#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see com.vainolo.phd.opm.model.OPMProceduralLinkKind
   * @see #getKind()
   * @generated
   */
	void setKind(OPMProceduralLinkKind value);

  /**
   * Returns the value of the '<em><b>Sub Kinds</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Kinds</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Kinds</em>' attribute list.
   * @see com.vainolo.phd.opm.model.OPMPackage#getOPMProceduralLink_SubKinds()
   * @model
   * @generated
   */
  EList<String> getSubKinds();

  /**
   * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bendpoints</em>' attribute list.
   * @see com.vainolo.phd.opm.model.OPMPackage#getOPMProceduralLink_Bendpoints()
   * @model dataType="com.vainolo.phd.opm.model.Point"
   * @generated
   */
  EList<Point> getBendpoints();

} // OPMProceduralLink

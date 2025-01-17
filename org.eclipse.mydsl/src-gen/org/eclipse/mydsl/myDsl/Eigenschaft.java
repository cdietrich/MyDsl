/**
 * generated by Xtext 2.19.0
 */
package org.eclipse.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eigenschaft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mydsl.myDsl.Eigenschaft#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mydsl.myDsl.Eigenschaft#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.mydsl.myDsl.Eigenschaft#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mydsl.myDsl.MyDslPackage#getEigenschaft()
 * @model
 * @generated
 */
public interface Eigenschaft extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.mydsl.myDsl.MyDslPackage#getEigenschaft_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.mydsl.myDsl.Eigenschaft#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Eigenschaft)
   * @see org.eclipse.mydsl.myDsl.MyDslPackage#getEigenschaft_SuperType()
   * @model
   * @generated
   */
  Eigenschaft getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.mydsl.myDsl.Eigenschaft#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Eigenschaft value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.mydsl.myDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.eclipse.mydsl.myDsl.MyDslPackage#getEigenschaft_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Eigenschaft

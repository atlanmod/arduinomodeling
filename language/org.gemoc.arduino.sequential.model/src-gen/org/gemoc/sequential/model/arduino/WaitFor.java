/**
 */
package org.gemoc.sequential.model.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sequential.model.arduino.WaitFor#getPin <em>Pin</em>}</li>
 *   <li>{@link org.gemoc.sequential.model.arduino.WaitFor#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getWaitFor()
 * @model
 * @generated
 */
public interface WaitFor extends Utilities {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(Pin)
	 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getWaitFor_Pin()
	 * @model
	 * @generated
	 */
	Pin getPin();

	/**
	 * Sets the value of the '{@link org.gemoc.sequential.model.arduino.WaitFor#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.sequential.model.arduino.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.gemoc.sequential.model.arduino.ChangeType
	 * @see #setMode(ChangeType)
	 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getWaitFor_Mode()
	 * @model
	 * @generated
	 */
	ChangeType getMode();

	/**
	 * Sets the value of the '{@link org.gemoc.sequential.model.arduino.WaitFor#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.gemoc.sequential.model.arduino.ChangeType
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ChangeType value);

} // WaitFor

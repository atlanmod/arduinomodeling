/**
 */
package org.gemoc.sequential.model.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.sequential.model.arduino.ArduinoFactory;
import org.gemoc.sequential.model.arduino.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAssignmentTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableAssignmentTest.class);
	}

	/**
	 * Constructs a new Variable Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableAssignment getFixture() {
		return (VariableAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createVariableAssignment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VariableAssignmentTest

/**
 */
package org.gemoc.sequential.model.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.sequential.model.arduino.ArduinoFactory;
import org.gemoc.sequential.model.arduino.BinaryIntegerExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryIntegerExpressionTest extends BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryIntegerExpressionTest.class);
	}

	/**
	 * Constructs a new Binary Integer Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Integer Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryIntegerExpression getFixture() {
		return (BinaryIntegerExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createBinaryIntegerExpression());
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

} //BinaryIntegerExpressionTest

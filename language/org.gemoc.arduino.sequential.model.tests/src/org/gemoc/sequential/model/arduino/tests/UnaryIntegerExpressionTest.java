/**
 */
package org.gemoc.sequential.model.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.sequential.model.arduino.ArduinoFactory;
import org.gemoc.sequential.model.arduino.UnaryIntegerExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unary Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryIntegerExpressionTest extends UnaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnaryIntegerExpressionTest.class);
	}

	/**
	 * Constructs a new Unary Integer Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unary Integer Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnaryIntegerExpression getFixture() {
		return (UnaryIntegerExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createUnaryIntegerExpression());
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

} //UnaryIntegerExpressionTest

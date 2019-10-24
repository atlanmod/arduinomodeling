/**
 */
package org.gemoc.sequential.model.arduino.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.gemoc.sequential.model.arduino.ArduinoFactory;
import org.gemoc.sequential.model.arduino.Block;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockTest extends TestCase {

	/**
	 * The fixture for this Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockTest.class);
	}

	/**
	 * Constructs a new Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Block fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createBlock());
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

} //BlockTest

/**
 */
package org.gemoc.sequential.model.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.sequential.model.arduino.ArduinoFactory;
import org.gemoc.sequential.model.arduino.SoundSensor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sound Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoundSensorTest extends ArduinoAnalogModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoundSensorTest.class);
	}

	/**
	 * Constructs a new Sound Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sound Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SoundSensor getFixture() {
		return (SoundSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createSoundSensor());
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

} //SoundSensorTest

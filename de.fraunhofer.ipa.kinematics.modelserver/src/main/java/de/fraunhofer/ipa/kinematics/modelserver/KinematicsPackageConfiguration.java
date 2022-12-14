package de.fraunhofer.ipa.kinematics.modelserver;

import java.util.Collection;

import org.eclipse.emfcloud.modelserver.emf.configuration.EPackageConfiguration;

import com.google.common.collect.Lists;

import kinematics.KinematicsPackage;

public class KinematicsPackageConfiguration implements EPackageConfiguration {

	public String getId() {
		return KinematicsPackage.eINSTANCE.getNsURI();
	}

	public Collection<String> getFileExtensions() {
		return Lists.newArrayList("kin");
	}

	public void registerEPackage() {
		KinematicsPackage.eINSTANCE.eClass();
	}

}

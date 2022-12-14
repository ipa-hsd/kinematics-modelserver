package de.fraunhofer.ipa.kinematics.modelserver;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emfcloud.modelserver.common.Routing;
import org.eclipse.emfcloud.modelserver.common.utils.MapBinding;
import org.eclipse.emfcloud.modelserver.common.utils.MultiBinding;
import org.eclipse.emfcloud.modelserver.edit.CommandContribution;
import org.eclipse.emfcloud.modelserver.emf.configuration.EPackageConfiguration;
import org.eclipse.emfcloud.modelserver.emf.di.DefaultModelServerModule;

public class KinematicsServerModule extends DefaultModelServerModule {

	@Override
	protected void configureEPackages(final MultiBinding<EPackageConfiguration> binding) {
		super.configureEPackages(binding);
		binding.add(KinematicsPackageConfiguration.class);
		binding.add(EnotationPackageConfiguration.class);
	}

	@Override
	protected void configureRoutings(final MultiBinding<Routing> binding) {
		super.configureRoutings(binding);
		binding.add(KinematicsRouting.class);
	}
}

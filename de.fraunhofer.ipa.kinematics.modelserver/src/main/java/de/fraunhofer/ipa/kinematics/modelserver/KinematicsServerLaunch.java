package de.fraunhofer.ipa.kinematics.modelserver;

import org.eclipse.emfcloud.modelserver.emf.launch.CLIBasedModelServerLauncher;
import org.eclipse.emfcloud.modelserver.emf.launch.CLIParser;

public class KinematicsServerLaunch {

	private static final String EXECUTABLE_NAME = "";

	private KinematicsServerLaunch() {
	}

	public static void main(final String[] args) {
		final CLIBasedModelServerLauncher launcher = new CLIBasedModelServerLauncher(createCLIParser(args),
				new KinematicsServerModule());
		launcher.run();

	}

	private static CLIParser createCLIParser(String[] args) {
		CLIParser parser = new CLIParser(args, CLIParser.getDefaultCLIOptions(), EXECUTABLE_NAME, 8081);
		return parser;
	}

}

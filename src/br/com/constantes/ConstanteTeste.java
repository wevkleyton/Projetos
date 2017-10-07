package br.com.constantes;

public class ConstanteTeste {

	private static final  String deploy = "/u1/deploy_4.3/deploy.sh -pc -dc -ps -ds";
	private static final String release = "ls -r -1 /u1/deploy_4.3/releases | head -n1 | cut -d. -f1" ;
	private static final String get_release = "/u1/deploy_4.3/get_releases.sh" ;
	private static final String log = "tail -n 100 /var/log/tomcat6/catalina.out" ;

	public static String getDeploy() {
		return deploy;
	}
	public static String getRelease() {
		return release;
	}
	public static String getLog() {
		return log;
	}
	public static String getGetRelease() {
		return get_release;
	}

}

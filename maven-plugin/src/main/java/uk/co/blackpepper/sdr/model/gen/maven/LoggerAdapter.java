package uk.co.blackpepper.sdr.model.gen.maven;

import org.apache.maven.plugin.logging.Log;

import uk.co.blackpepper.sdr.model.gen.Logger;

public class LoggerAdapter implements Logger {

	private Log log;

	public LoggerAdapter(Log log) {
		this.log = log;
	}
	
	@Override
	public void debug(String message, Exception exception) {
		log.debug(message, exception);
	}

	@Override
	public void info(String message) {
		log.info(message);
	}
}

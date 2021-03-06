/**
 * 
 */
package com.hipermind.photorest.domain;

import javax.ws.rs.core.StreamingOutput;

/**
 * Represents graphical data of the photo.
 * @author sjanikowski
 *
 */
public class PhotoData {
	
	private String id;
	private String name;
	private StreamingOutput streamingOutput;
	public PhotoData(String id, String name, StreamingOutput streamingOutput) {
		super();
		this.id = id;
		this.name = name;
		this.streamingOutput = streamingOutput;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * StreamingOutput can be used to stream the data out of the application 
	 * @return StreamingOutput with photo graphical data
	 */
	public StreamingOutput getStreamingOutput() {
		return streamingOutput;
	}
	public void setStreamingOutput(StreamingOutput streamingOutput) {
		this.streamingOutput = streamingOutput;
	}
	
	
	
	
	
	
	



}

package com.matteo.studentapp.models;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ProjectEJBRemote {
	
	List<Project> findProjects()  throws Exception ;
	Project findProjectById(long id)  throws Exception ;
	Project createProject(Project s)  throws Exception ;
	void deleteProject(Project s)  throws Exception;
	Project updateProject(Project s)  throws Exception ;
	
}
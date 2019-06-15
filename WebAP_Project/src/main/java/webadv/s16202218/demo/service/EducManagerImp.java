package webadv.s16202218.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import webadv.s16202218.demo.entity.EducManager;
import webadv.s16202218.demo.repository.EducManagerRepository;

public class EducManagerImp implements EducManagerService{
	
	@Autowired
	private EducManagerRepository educManager;
	
	@Override
	public List<EducManager> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

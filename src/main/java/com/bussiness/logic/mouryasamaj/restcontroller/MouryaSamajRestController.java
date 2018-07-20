package com.bussiness.logic.mouryasamaj.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bussiness.logic.mouryasamaj.dao.MoryaSamajDao;
import com.bussiness.logic.mouryasamaj.repository.MouryaSamajRepository;

@RestController
@RequestMapping("/hello")
public class MouryaSamajRestController {

	@Autowired
	MoryaSamajDao mouryaSamajDao;

	@RequestMapping(value = "{messageid}", method = RequestMethod.GET)
	public String sayHello(@PathVariable("messageid") int messageid) {

		Iterable<MouryaSamajRepository> iterable = mouryaSamajDao.findAll();

		return iterable.toString();
	}

	@RequestMapping(value = "{message}", method = RequestMethod.POST)
	public MouryaSamajRepository addHello(@PathVariable("message") String message) {
		MouryaSamajRepository entity = new MouryaSamajRepository();
		entity.setMessage(message);
		return mouryaSamajDao.save(entity);
	}

}

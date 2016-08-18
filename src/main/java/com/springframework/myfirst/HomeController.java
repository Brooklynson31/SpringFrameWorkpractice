package com.springframework.myfirst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springframework.myfirst.dao.MessageDAO;
import com.springframework.myfirst.domain.Message;

@Controller
@RequestMapping("/app")
public class HomeController {
	
@Autowired
MessageDAO messageDAO;

@RequestMapping(value = "home", method = RequestMethod.GET)	
public String homeGet(ModelMap model )	{
	List<Message> messages = messageDAO.getMessages();
	model.put("messages", messages);


return "app/home";
}

@RequestMapping(value = "home", method = RequestMethod.POST)	
public String homePost(Model modelmap)	{


return "app/home";
}
}
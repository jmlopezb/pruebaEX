package es.fesac.blog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fesac.blog.dao.UserRepository;
import es.fesac.blog.model.User;
import es.fesac.blog.model.beans.LoginBean;

@Controller
public class LoginController {

	
	private UserRepository userRepository;
	
	@Autowired
	private HttpSession httpSession;
	
			@GetMapping(value="/signin")
			public String mostrarFormularioLogin(Model model) 
			{
				LoginBean v= new LoginBean();
				v.setEmail("master@gmail.com");
				model.addAttribute("userLogin",v);
				model.addAttribute("userName",v); //aqui le he mandado al model que me seleccione el atributo de user name, el objeto V
				
				return "login";
			
			
			}
						
			  @PostMapping(value="/login")   
			  public String validarLogin(@ModelAttribute("userLogin") LoginBean loginBean, 
					  Model model) {
				  
				  User u= userRepository.getByEmailAndPassword(loginBean.getEmail(), loginBean.getPassword());
				  
				  if(u!=null) {httpSession.setAttribute("userLoggedIn", u);
				  return "redirect:/";
				  
				  }
				  else 
				  {
					  model.addAttribute("userLogin",loginBean);
					  model.addAttribute("error","error al validar");
					  return "login";
					  
				  }
				  /*
				  if (loginBean.getPassword().equals("1"))
					  return "index";
					  else {
						  model
						   .addAttribute("userLogin", loginBean);
						  return "login";
					  }*/
			 }   
			 

			@GetMapping(value="/logout")
			public String cerrarSesionLogin() 
			{
				return "redirect:/";
			}
	
}

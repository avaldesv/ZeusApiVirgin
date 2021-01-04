package com.psc.Configuration.security.controller;

import com.google.gson.Gson;
import com.psc.Configuration.message.request.LoginForm;
import com.psc.Configuration.message.response.JwtResponse;
import com.psc.Configuration.security.jwt.JwtProvider;
import com.psc.Entity.Usuarios;
import com.psc.Model.RolObj;
import com.psc.Service.UsuariosService;
import java.nio.file.attribute.UserPrincipal;
import java.util.Collections;
import javax.annotation.Resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.1.102:4200", "http://51.38.239.124", "http://172.16.80.73"})
@RestController
@RequestMapping("/login")
public class AuthRestAPIs  {

	@Resource
	AuthenticationManager authenticationManager;
        
        @Resource
	       UsuariosService usuariosService;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	       JwtProvider jwtProvider;

	@PostMapping //("/signin")
	public ResponseEntity<?> authenticateUser( @RequestBody Usuarios loginRequest) {
            
                
              System.out.println(new Gson().toJson(loginRequest));
//            try {
                Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
                        SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = jwtProvider.generateJwtToken(authentication);
                System.out.println("jwt--------------- "+jwt);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
               Usuarios u= usuariosService.loadUserByUsername(userDetails.getUsername());
               JwtResponse aa=  new JwtResponse(jwt, userDetails.getUsername(),u.getIdUsuario(),u.getNombre()+" "+u.getApellidos(), u.getRolidRol().getRol(),userDetails.getAuthorities());
               System.out.println(new Gson().toJson(aa));
               
                return ResponseEntity.ok(aa);
//	
//            } catch (Exception e) {
//                System.out.println("ERROR EN EL CONTROLLER  "+e);
//    return ResponseEntity.ok("ERROR DE USUARIO");
//            }
//		
		
        }
	
}
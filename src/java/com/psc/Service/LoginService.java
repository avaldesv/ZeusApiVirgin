/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.Service;

import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Rol;
import com.psc.Entity.Usuarios;
import com.psc.Repository.UsuariosLogin;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AVV
 */
@Service
public class LoginService implements UserDetailsService{
    
     @Resource
   private UsuariosDao repo;
//    
//  @Autowired
//  @Qualifier("usuariosLogin")
  //   @Autowired
    //  private UsuariosLogin repo;
    
     @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         try {
               Usuarios user = repo.getUsuariobyUsername(username);
                  System.out.println("USERNAMEEEEEEEEEEEEEEEE333  "+user.getUsername() );
                  System.out.println("USERNAMEEEEEEEEEEEEEEEE333  "+user.getPassword());
      return new User(user.getUsername(),user.getPassword(),user.getEnabled(),user.getEnabled(),user.getEnabled(),user.getEnabled(),creargrantedlist(user.getRolidRol()));
    //  return new User(user.getUsername(),user.getPassword(),creargrantedlist(user.getRolidRol()));
         } catch (Exception e) {
               System.out.println("ERROR5 "+e);
               return null;
         }
    
    }

     public List<GrantedAuthority> creargrantedlist(Rol rol){
        List<GrantedAuthority> aut = new ArrayList<>();
        aut.add(new SimpleGrantedAuthority(rol.getRol()));
     return aut;
     
     }
}

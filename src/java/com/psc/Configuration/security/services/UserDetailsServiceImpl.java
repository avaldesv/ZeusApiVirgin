package com.psc.Configuration.security.services;

import com.psc.Dao.UsuariosDao;
import com.psc.Entity.Usuarios;
import javax.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {

     @Resource
   private UsuariosDao repo;

	@Override
	//@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            
            try {
                
                Usuarios user = repo.getUsuariobyUsername(username);
                return UserPrinciple.build(user);
            } catch (Exception e) {
                UsernameNotFoundException usernameNotFoundException = new UsernameNotFoundException("User Not Found with -> username or email : " + username);
                return null;
            }
			

		
	}
//        
//          try {
//               Usuarios user = repo.getUsuariobyUsername(username);
//                  System.out.println("USERNAMEEEEEEEEEEEEEEEE333  "+user.getUsername() );
//                  System.out.println("USERNAMEEEEEEEEEEEEEEEE333  "+user.getPassword());
//      return new User(user.getUsername(),user.getPassword(),creargrantedlist(user.getRolidRol()));
//    //  return new User(user.getUsername(),user.getPassword(),creargrantedlist(user.getRolidRol()));
//         } catch (Exception e) {
//               System.out.println("ERROR5 "+e);
//               return null;
//         }
//    
//    }
//
//     public List<GrantedAuthority> creargrantedlist(Rol rol){
//        List<GrantedAuthority> aut = new ArrayList<>();
//        aut.add(new SimpleGrantedAuthority(rol.getRol()));
//     return aut;
//     }
}
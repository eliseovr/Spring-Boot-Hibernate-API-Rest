package com.cursojava.curso.controllers;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;




@RestController
public class UsuarioController {
    @RequestMapping(value =  "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario= new Usuario();
        usuario.setId(id);
        usuario.setNombre("Eliseo");
        usuario.setApellido("Velásquez");
        usuario.setEmail("stevel58@upana.edu.gt");
        usuario.setTelefono("1234");
        return usuario;
    }

    @RequestMapping(value =  "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        Usuario usuario= new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Eliseo");
        usuario.setApellido("Velásquez");
        usuario.setEmail("stevel58@upana.edu.gt");
        usuario.setTelefono("1234");

        Usuario usuario1= new Usuario();
        usuario1.setId(345L);
        usuario1.setNombre("María");
        usuario1.setApellido("Gonzales");
        usuario1.setEmail("maria.go@upana.edu.gt");
        usuario1.setTelefono("24467");

        Usuario usuario2= new Usuario();
        usuario2.setId(11L);
        usuario2.setNombre("Gabriel");
        usuario2.setApellido("Almada");
        usuario2.setEmail("almag@upana.edu.gt");
        usuario2.setTelefono("9844");

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        return usuarios;


    }

    @RequestMapping(value =  "usuario3422")
    public Usuario editar(){
        Usuario usuario= new Usuario();
        usuario.setNombre("Eliseo");
        usuario.setApellido("Velásquez");
        usuario.setEmail("stevel58@upana.edu.gt");
        usuario.setTelefono("1234");
        return usuario;
    }




}

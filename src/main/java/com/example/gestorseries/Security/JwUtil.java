package com.example.gestorseries.Security;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CompositeTypeRegistration;
import org.springframework.stereotype.Component;

import java.util.Date;
//Spring si quieres implementar login con jwt necesitas 3 piezas importantes
//Primero necesitas la clase que hará el token que es jwutil
//segundo necesitas la clase del filtro que verifica la firma
//tercero tenemos que establecer unas cfiguraciones de ruta en security condig
@Component
public class JwUtil {
    private final String SECRET_KEY = "miClaveSuperSecreta123"; // cambiar en prod
    private final long EXPIRATION = 1000 * 60 * 60; // 1 hora
    public String generarToken(String username) {
        return Jwts.builder()
                .setSubject(username) //PARA OBTENER USUARIO
                .setIssuedAt(new Date()) //PARA OBTENER LA FECHA DE CREACIÓN
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION)) //PARA OBTENER LA FECHA DE EXPIRACIÓN
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    public String obtenerUsername(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validarToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }

}

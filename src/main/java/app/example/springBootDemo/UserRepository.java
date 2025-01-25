package app.example.springBootDemo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        // Вернем список разрешений для пользователя "admin" с паролем "password".

        if ("admin".equals(user) && "password".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return null; // Если пользователя нет, возвращаем пустой список.
    }
}


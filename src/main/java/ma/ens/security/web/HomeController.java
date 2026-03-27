package ma.ens.security.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Point d'entrée de l'application.
     * Cette méthode renvoie simplement la vue 'index.html'.
     */

    @GetMapping("/")
    public String home() {
        return "index";
    }


    /**
     * Gère l'affichage du profil après une authentification réussie.
     * @param model : Objet permettant de passer des données à la vue Thymeleaf.
     * @param user : Contient les informations (claims) récupérées depuis le jeton d'identité Google.
     */

    @GetMapping("/profile")
    public String profile(Model model, @AuthenticationPrincipal OAuth2User user) {
        model.addAttribute("name", user.getAttribute("name"));
        model.addAttribute("email", user.getAttribute("email"));
        model.addAttribute("picture", user.getAttribute("picture"));
        return "profile";
    }
}
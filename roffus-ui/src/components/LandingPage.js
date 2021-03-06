import React, { Component } from 'react';

function Landing()
    {
        document.writeln("<!DOCTYPE html>");
        document.writeln("<html>");
        document.writeln("<title>W3.CSS Template</title>");
        document.writeln("<meta charset=\"UTF-8\">");
        document.writeln("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        document.writeln("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
        document.writeln("<style>");
        document.writeln("    body {font-family: \"Times New Roman\", Georgia, Serif;}");
        document.writeln("    h1, h2, h3, h4, h5, h6 {");
        document.writeln("        font-family: \"Playfair Display\";");
        document.writeln("        letter-spacing: 5px;");
        document.writeln("    }");
        document.writeln("</style>");
        document.writeln("<body>");
        document.writeln("<!-- Navbar (sit on top) -->");
        document.writeln("<div class=\"w3-top\">");
        document.writeln("    <div class=\"w3-bar w3-white w3-padding w3-card\" style=\"letter-spacing:4px;\">");
        document.writeln("        <a href=\"#home\" class=\"w3-bar-item w3-button\">Roffus Design Room</a>");
        document.writeln("        <!-- Right-sided navbar links. Hide them on small screens -->");
        document.writeln("        <div class=\"w3-right w3-hide-small\">");
        document.writeln("            <a href=\"#inicio\" class=\"w3-bar-item w3-button\">Inicio</a>");
        document.writeln("            <a href=\"#nosotros\" class=\"w3-bar-item w3-button\">Sobre Nosotros</a>");
        document.writeln("            <a href=\"#precios\" class=\"w3-bar-item w3-button\">Precios</a>");
        document.writeln("            <a href=\"#contact\" class=\"w3-bar-item w3-button\">Contáctenos</a>");
        document.writeln("        </div>");
        document.writeln("    </div>");
        document.writeln("</div>");
        document.writeln("<!-- Header -->");
        document.writeln("<header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1600px;min-width:500px\" id=\"home\">");
        document.writeln("    <img class=\"w3-image\" src=\"https://www.yaencontre.com/noticias/wp-content/uploads/2017/05/BL_May_23.jpg\" alt=\"DesignRoom\" width=\"1600\" height=\"300\">");
        document.writeln("    <div class=\"w3-display-bottomleft w3-padding-large w3-opacity\">");
        document.writeln("        <h1 class=\"w3-xxlarge\">Diseña tu habitación</h1>");
        document.writeln("    </div>");
        document.writeln("</header>");
        document.writeln("<!-- Page content -->");
        document.writeln("<div class=\"w3-content\" style=\"max-width:1100px\">");
        document.writeln("    <!-- About Section -->");
        document.writeln("    <div class=\"w3-row w3-padding-64\" id=\"about\">");
        document.writeln("        <div class=\"w3-col m6 w3-padding-large\">");
        document.writeln("            <h1 class=\"w3-center\">Bienvenido a Roffus Design Room</h1><br>");
        document.writeln("            <p class=\"w3-large\">Si quieres decorar tu habitación con productos de distribuidores como Maestro, Sodimac y Promart, aquí podrás encontralos. Además, podrás verificar si poseen las dimensiones correctas para ir en tu habitación gracias a nuestro <span class=\"w3-tag w3-light-grey\">Modelador 2D</span> </p>");
        document.writeln("            <!-- Logueo -->");
        document.writeln("            <form class=\"login100-form validate-form\">");
        document.writeln("                <div class=\"wrap-input100 validate-input\" data-validate=\"Valid email is required: ex@abc.xyz\">");
        document.writeln("                    <input class=\"input100\" type=\"text\" name=\"email\" placeholder=\"Email\">");
        document.writeln("                    <span class=\"focus-input100\"></span>");
        document.writeln("                    <span class=\"symbol-input100\">");
        document.writeln("		<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>");
        document.writeln("		</span>");
        document.writeln("                </div>");
        document.writeln("                <div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">");
        document.writeln("                    <input class=\"input100\" type=\"password\" name=\"pass\" placeholder=\"Password\">");
        document.writeln("                    <span class=\"focus-input100\"></span>");
        document.writeln("                    <span class=\"symbol-input100\">");
        document.writeln("		<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>");
        document.writeln("		</span>");
        document.writeln("                </div>");
        document.writeln("                <div class=\"container-login100-form-btn\">");
        document.writeln("                    <button class=\"login100-form-btn\">Login");
        document.writeln("                    </button>");
        document.writeln("                </div>");
        document.writeln("                <div class=\"text-center p-t-12\">");
        document.writeln("		<span class=\"txt1\">");
        document.writeln("		Olvidó su");
        document.writeln("		</span>");
        document.writeln("                    <a class=\"txt2\" href=\"#\">");
        document.writeln("                        Username / Password?");
        document.writeln("                    </a>");
        document.writeln("                </div>");
        document.writeln("                <div class=\"text-center p-t-136\">");
        document.writeln("                    <a class=\"txt2\" href=\"#\">");
        document.writeln("                        Crear una cuenta");
        document.writeln("                        <i class=\"fa fa-long-arrow-right m-l-5\" aria-hidden=\"true\"></i>");
        document.writeln("                    </a>");
        document.writeln("                </div>");
        document.writeln("            </form>");
        document.writeln("        </div>");
        document.writeln("        <div class=\"w3-col m6 w3-padding-large w3-hide-small\">");
        document.writeln("            <img src=\"https://i.pinimg.com/564x/7d/f1/9e/7df19ee3c9eed26f9bc494efd36c63b0.jpg\" class=\"w3-round w3-image w3-opacity-min\" alt=\"Table Setting\" width=\"600\" height=\"350\">");
        document.writeln("        </div>");
        document.writeln("    </div>");
        document.writeln("    <hr>");
        document.writeln("    <!-- About Section -->");
        document.writeln("    <div class=\"w3-row w3-padding-64\" id=\"about\">");
        document.writeln("        <div class=\"w3-col m6 w3-padding-large w3-hide-small\">");
        document.writeln("            <img src=\"https://www.decoraonline.com/wp-content/uploads/comodokrone2-1024x534.jpg\" class=\"w3-round w3-image w3-opacity-min\" alt=\"Table Setting\" width=\"600\" height=\"300\">");
        document.writeln("        </div>");
        document.writeln("        <div class=\"w3-col m6 w3-padding-large\">");
        document.writeln("            <p class=\"w3-large\">Si quieres decorar tu habitación con productos de distribuidores como Maestro, Sodimac y Promart, aquí podrás encontralos. Además, podrás verificar si poseen las dimensiones correctas para ir en tu habitación gracias a nuestro <span class=\"w3-tag w3-light-grey\">Modelador 2D</span> </p>");
        document.writeln("        </div>");
        document.writeln("    </div>");
        document.writeln("    <hr>");
        document.writeln("    <!-- Prueba Logueo -->");
        document.writeln("    <!-- End page content -->");
        document.writeln("</div>");
        document.writeln("<!-- Footer -->");
        document.writeln("<footer class=\"w3-center w3-light-grey w3-padding-32\">");
        document.writeln("    <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" title=\"W3.CSS\" target=\"_blank\" class=\"w3-hover-text-green\">w3.css</a></p>");
        document.writeln("</footer>");
        document.writeln("</body>");
        document.writeln("</html>");
    }
export default Landing;
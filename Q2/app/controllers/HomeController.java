package controllers;

import play.mvc.*;
import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result popular() {

        AlaHospital alah = new AlaHospital();
        alah.save();

        AlaHospital alab = new AlaHospital();
        alab.save();

        AlaHospital alac = new AlaHospital();
        alac.save();

        Enfermeira enf1 = new Enfermeira("Ana", "00001");
        enf1.setAlah(alah);
        //enf1.save();

        Enfermeira enf2 = new Enfermeira("Julieta", "00002");
        enf2.setAlah(alab);
        enf2.save();

        Enfermeira enf3 = new Enfermeira("Joana", "00003");
        enf3.setAlah(alac);
        enf3.save();

        Enfermeira enf4 = new Enfermeira("Beatriz", "00004");
        enf4.save();

        Enfermeira enf5 = new Enfermeira("Karina", "00005");
        enf5.save();


        enf1.setChefia(enf2);
        enf1.setChefia(enf3);
        enf1.save();

        return ok("Banco Populado");
    }

}

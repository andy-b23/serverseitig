package controllers;

import models.Projekt;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static play.mvc.Results.ok;


public class ProjektController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result newProjekt(){
        Form<Projekt> projektsForm = formFactory.form(Projekt.class);
        return ok(views.html.newprojekt.render(projektsForm));
    }

    public Result list(){
        List<Projekt> projektList = Projekt.find.findList();
        return ok(views.html.projektlist.render(projektList));
    }

    public Result show(Long id){
        Projekt projekt = Projekt.find.byId(id);

        return ok(views.html.projekt.render(projekt));
    }

    public Result create(){
        Form<Projekt> projektFrom = formFactory.form(Projekt.class);
        Projekt projekt = projektFrom.bindFromRequest().get();
        projekt.save();
        return redirect(routes.ProjektController.list());
    }

    public Result delete(Long id){
        Projekt.find.byId(id).delete();
        return redirect(routes.ProjektController.list());
    }

    public Result editProjekt(Long id){
        Form<Projekt> projektForm = formFactory.form(Projekt.class).fill(Projekt.find.byId(id));
        return ok(views.html.editprojekt.render(projektForm, id));
    }

    public Result update(Long id){

        Form<Projekt> projektForm = formFactory.form(Projekt.class);
        Projekt oldProjekt = Projekt.find.byId(id);

        Projekt updatedProjekt = projektForm.bindFromRequest().get();

        oldProjekt.setProjektName(updatedProjekt.getProjektName());
        oldProjekt.save();

        return redirect(routes.ProjektController.list());
    }
}

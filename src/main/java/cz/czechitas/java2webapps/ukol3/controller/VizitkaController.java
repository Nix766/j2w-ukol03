package cz.czechitas.java2webapps.ukol3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import cz.czechitas.java2webapps.ukol3.entity.Person;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private final List<Person> seznamVizitek;

  public VizitkaController() {
    seznamVizitek = new ArrayList<Person>();
    Person person1 = new Person("Dita", "(Přikrylová) Formánková", "Václavské náměstí 837/11", "11000 Praha 1", "+420 800123456");
    person1.setEmail("dita@czechitas.cs");
    Person person2 = new Person("Šárka", "Dlouhá", "Cleverlance, a.s.", "Čáslavská 15", "13000 Praha 3", "+420 608646049", "www.cleverlance.com");
    person2.setEmail("sarkadlouha89@gmail.com");
    Person person3 = new Person("Alena", "Gottwaldová", "Na Struze 7", "11000 Praha 1", "+420 123456789");
    Person person4 = new Person("Miloš", "Chromý", "Bubenečská 282", "16000 Praha 6", "+420 987654321");

    seznamVizitek.add(person1);
    seznamVizitek.add(person2);
    seznamVizitek.add(person3);
    seznamVizitek.add(person4);
  }

  @GetMapping("/")
  public ModelAndView getSeznamVizitek() {

    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("seznamVizitek", seznamVizitek);
    return modelAndView;

  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("detailVizitky", seznamVizitek.get(id));
    return modelAndView;
  }
}

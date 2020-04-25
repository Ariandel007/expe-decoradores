package pe.roffus.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.roffus.org.model.ListaMuebles;
import pe.roffus.org.service.ListaMueblesService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/listaMuebles")
@ComponentScan
public class ListaMueblesController {
    ListaMueblesService listaMueblesService;

    @Autowired

    public ListaMueblesController(ListaMueblesService listaMueblesService) { this.listaMueblesService=listaMueblesService;    }
    @CrossOrigin
    @RequestMapping
    List<ListaMuebles> listListaMuebless(){       return listaMueblesService.listAll();    }


    @CrossOrigin
    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    ListaMuebles getListaMuebles(@PathVariable int id){        return listaMueblesService.getById(id);    }


    @CrossOrigin
    @PostMapping
    public ResponseEntity<List<ListaMuebles>> create(@RequestBody List<ListaMuebles> listaMuebles){
        List<ListaMuebles> tmp=new ArrayList<ListaMuebles>();
        for(int i=0;i<listaMuebles.size();i++){
            if(thereIsCollision(listaMuebles, listaMuebles.get(i), i)==true)
            {
                //400 error
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }

            tmp.add(listaMueblesService.insert(listaMuebles.get(i)));
        }
        //200 ok
        return ResponseEntity.ok(tmp);
    }

    //calcularemos la colsiion del array de un objeto ListaMuebles
    public boolean thereIsCollision(List<ListaMuebles> lst, ListaMuebles obj, int indexObj) {
        for (int i =0; i< lst.size(); i++)
        {
            if (i == indexObj)
            {
                continue;
            }
            else if ((lst.get(i).coordX == obj.coordX) && (lst.get(i).coordY == obj.coordY) ||
                    ( ( obj.coordX > lst.get(i).coordX && obj.coordX < lst.get(i).coordX + lst.get(i).mueble.ancho)
                            && (obj.coordY > lst.get(i).coordY && obj.coordY < lst.get(i).coordY + lst.get(i).mueble.largo)))
                return true;
        }
        return false;
    }



    @CrossOrigin
    @PutMapping
    ListaMuebles update(@RequestBody ListaMuebles listaMuebles){
        return listaMueblesService.update(listaMuebles);
    }
    @CrossOrigin
    @RequestMapping(path="/{id}",method = RequestMethod.DELETE)
    Boolean delete(@PathVariable int id){
        return listaMueblesService.delete(id);
    }
    @CrossOrigin
    @GetMapping("/pornombre")
    List<ListaMuebles> getListaMueblesXnombre(@RequestParam String nombre){        return listaMueblesService.findListaMueblesByNombre(nombre);  }

    @CrossOrigin
    @RequestMapping(path="/borrar",method = RequestMethod.DELETE)
    Boolean deleteListaMueblesByNombre(@RequestParam String nombre){
        listaMueblesService.deleteListaMueblesByNombre(nombre);
        return true;
    }


}

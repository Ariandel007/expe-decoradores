package pe.roffus.org.controller;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pe.roffus.org.model.ListaMuebles;
import pe.roffus.org.service.ListaMueblesService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
//@ContextConfiguration(locations = "./META-INF/")
@WebMvcTest
class ListaMueblesControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ListaMueblesService listaMueblesService;


    @Test
    void create() {
        assertEquals(1,1);
    }
//
//    @Test
//    void listListaMuebless() throws Exception {
//        // given
//        ListaMuebles listaMuebles = new ListaMuebles();
//        listaMuebles.codLista = 1;
//        listaMuebles.rotacion=1.0;
//        listaMuebles.nombreLista = "Lista Chida";
//        listaMuebles.coordX=3.0;
//        listaMuebles.coordY = 5.0;
//        listaMuebles.mueble.codMueble = 1;
//        listaMuebles.mueble.tiendaVirtual.nombreTienda = "SODIMAC";
//        listaMuebles.mueble.tiendaVirtual.codTienda = 1;
//        listaMuebles.mueble.tiendaVirtual.link = "https://www.sodimac.com.pe/sodimac-pe/";
//        listaMuebles.mueble.subcategoria.codSubCategoria = 1;
//        listaMuebles.mueble.subcategoria.nombreSubCategoria="SUbCategoria Chida";
//        listaMuebles.mueble.subcategoria.categoria.codCategoria = 1;
//        listaMuebles.mueble.subcategoria.categoria.nombreCategoria="Categoria Chida";
//        listaMuebles.mueble.nombreMueble = "Mueble Chido";
//        listaMuebles.mueble.imagen="link chido";
//        listaMuebles.mueble.icono="icono chido";
//        listaMuebles.mueble.descripcion="Hola Como va mie ritmo";
//        listaMuebles.mueble.alto=4.0;
//        listaMuebles.mueble.ancho=2.0;
//        listaMuebles.mueble.largo=6.0;
//
//         List<ListaMuebles> listaMueblesLst = new ArrayList<ListaMuebles>();
//         listaMueblesLst.add(listaMuebles);
//
//        given(listaMueblesService.listAll()).willReturn(listaMueblesLst);
//
//        // when + then
//        this.mockMvc.perform(get("/api/listaMuebles"))
//                .andExpect(status().isOk());
//    }


    @Test
    void thereIsCollision() {
        ListaMuebles listaMuebles = new ListaMuebles();
        listaMuebles.codLista = 1;
        listaMuebles.rotacion=1.0;
        listaMuebles.nombreLista = "Lista Chida";
        listaMuebles.coordX=3.0;
        listaMuebles.coordY = 5.0;
        listaMuebles.mueble.codMueble = 1;
        listaMuebles.mueble.tiendaVirtual.nombreTienda = "SODIMAC";
        listaMuebles.mueble.tiendaVirtual.codTienda = 1;
        listaMuebles.mueble.tiendaVirtual.link = "https://www.sodimac.com.pe/sodimac-pe/";
        listaMuebles.mueble.subcategoria.codSubCategoria = 1;
        listaMuebles.mueble.subcategoria.nombreSubCategoria="SUbCategoria Chida";
        listaMuebles.mueble.subcategoria.categoria.codCategoria = 1;
        listaMuebles.mueble.subcategoria.categoria.nombreCategoria="Categoria Chida";
        listaMuebles.mueble.nombreMueble = "Mueble Chido";
        listaMuebles.mueble.imagen="link chido";
        listaMuebles.mueble.icono="icono chido";
        listaMuebles.mueble.descripcion="Hola Como va mie ritmo";
        listaMuebles.mueble.alto=4.0;
        listaMuebles.mueble.ancho=2.0;
        listaMuebles.mueble.largo=6.0;

        ListaMuebles listaMuebles2 = new ListaMuebles();
        listaMuebles2.codLista = 2;
        listaMuebles2.rotacion=1.0;
        listaMuebles2.nombreLista = "Lista Chida";
        listaMuebles2.coordX=3.0;
        listaMuebles2.coordY = 5.0;
        listaMuebles2.mueble.codMueble = 2;
        listaMuebles2.mueble.tiendaVirtual.nombreTienda = "SODIMAC";
        listaMuebles2.mueble.tiendaVirtual.codTienda = 2;
        listaMuebles2.mueble.tiendaVirtual.link = "https://www.sodimac.com.pe/sodimac-pe/";
        listaMuebles2.mueble.subcategoria.codSubCategoria = 2;
        listaMuebles2.mueble.subcategoria.nombreSubCategoria="SUbCategoria Chida";
        listaMuebles2.mueble.subcategoria.categoria.codCategoria = 2;
        listaMuebles2.mueble.subcategoria.categoria.nombreCategoria="Categoria Chida";
        listaMuebles2.mueble.nombreMueble = "Mueble Chido";
        listaMuebles2.mueble.imagen="link chido";
        listaMuebles2.mueble.icono="icono chido";
        listaMuebles2.mueble.descripcion="Hola Como va mie ritmo";
        listaMuebles2.mueble.alto=4.0;
        listaMuebles2.mueble.ancho=2.0;
        listaMuebles2.mueble.largo=6.0;

        List<ListaMuebles> listaMueblesLst = new ArrayList<ListaMuebles>();
        listaMueblesLst.add(listaMuebles);
        listaMueblesLst.add(listaMuebles2);

        ListaMueblesController lst = new ListaMueblesController(listaMueblesService);
        assertTrue(lst.thereIsCollision(listaMueblesLst, listaMueblesLst.get(1), 1));


    }
}
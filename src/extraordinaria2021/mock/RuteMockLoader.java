/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.mock;

import extraordinaria2021.model.*;
import extraordinaria2021.view.RuteLoader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author can97
 */
class RuteMockLoader implements RuteLoader {
    @Override
    public ArrayList<PatrimonialElement> load() {
        ArrayList<PatrimonialElement> elementosPatrimoniales = new ArrayList();
        elementosPatrimoniales.add( new Busto(5, "Busto al poeta", "José Bezoya", 1999, "A pico y pala", "Caliza", "Buen estado de conservación", "Política"));
        elementosPatrimoniales.add(new Iglesia(3, "Iglesia del pueblo", "Manuel Perez", 1230, "BloqueSobreBloque", "Mármol", "Mal estado de conservación", "Gótica", true));
        elementosPatrimoniales.add(new Edificio(4, "Edificio futurista", "Ana Melián" , 2019, "Ingeniería avanzada", "Grafeno", "Buen estado de conservación", "Política", false));
        elementosPatrimoniales.add(new Estatua(2, "Estatua al político", "Santiago Iglesias", 2016, "Cincel", "Pizarra", "Excelente estado de conservación", "Política"));
        elementosPatrimoniales.add(new Graffiti(1, "Protesta por presos políticos andaluces", "Anonimo", 2019, "Graffiti sobre pared antigua", "Spray","Buen estado de conservación", "Política"));
        elementosPatrimoniales.add(new Puente(6, "Puente antiguo", "Población de la época", 1353, "Arquitectura mediaval", "Piedra y concreto", "Buen estado de conservación", "Mediaval", false));
        return elementosPatrimoniales;
    }
}

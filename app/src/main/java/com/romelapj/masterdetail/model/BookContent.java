package com.romelapj.masterdetail.model;

import com.romelapj.masterdetail.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by romelapj on 3/06/15.
 */
public class BookContent {
    public static List<BookItem> ITEMS = new ArrayList<BookItem>();
    public static Map<String, BookItem> ITEM_MAP = new HashMap<String, BookItem>();

    static {
        addItem(new BookItem("1", "Crónica de una muerte anunciada", R.mipmap.anunciada,"En un pequeño y aislado pueblo en la costa del Caribe, se casan Bayardo San Román, un hombre rico y recién llegado, y Ángela Vicario. Al celebrar su boda, los recién casados se van a su nueva casa, y allí Bayardo descubre que su esposa no es virgen. Cuando lo descubre, devuelve a Ángela Vicario a la casa de sus padres, donde su madre la muele a golpes, Ángela culpa a Santiago Nasar, un vecino del pueblo."));
        addItem(new BookItem("2", "El amor en los tiempos del cólera",R.mipmap.colera,"Es una novela del escritor colombiano Gabriel García Márquez, publicada en 1985. Narra la vida de tres personajes entre finales del siglo XIX y principios del siglo XX en Cartagena de Indias. La novela está basada en la forma en que se desarrolló la relación de los padres de García Márquez. Para escribirla se entrevistó durante varios días con sus padres, cada uno por separado, para encontrar más detalles de cómo iba a escribir la novela."));
        addItem(new BookItem("3", "Ojos de perro azul",R.mipmap.perro_azul,"Este libro se trata de un hijo de nadie que llego a ser rey del cual no se sabe como llegó al poder, pero se sabe que esta allí desde tiempos inmemorables, la historia trata de sus ambiciones de poder y de su manera de gobernar para si mismo, solo por tener el mar, de como en una época llaga a amar de verdad, mientras que en otras épocas creía solo en los amores irreales pasajeros, de como hubo un tiempo que se emocionaba con una radio novela hasta las lagrimas y ordenaba que la protagonista no muera, mientras que en un momento había matado a dos mil niños que sabían el fraude secreto con que ganaba la lotería, cuenta de como aveces es un semidiós con poder incalculable cuando otras veces llora como un perro mientras que es dominado y manejado por los que lo rodean hasta que pierde el mar."));
        addItem(new BookItem("4", "Relato de un naufrago",R.mipmap.naufrago,"La historia de cómo Velasco, un tripulante del buque militar, que había estado en Mobile, Alabama (EE.UU.) cuando el A.R.C Caldas estaba sometido a reparaciones, logró vivir durante 10 días en alta mar tras caer del mismo. Estaba solo en el medio del mar, sin comida y haciendo cálculos de cuándo iban a ir a buscarlos los aviones de rescate. El relato tuvo fuerte repercusión nacional, ya que fue por culpa de cargamentos de contrabando que se soltaron en la cubierta la razón por la cual los marinos cayeron al mar, y no por una tormenta como la Armada de Colombia denunció falsamente. La historia se publicó en veinte días consecutivos en el periódico El Espectador en 1955, para luego (en 1970) ser publicada en forma de libro."));
        addItem(new BookItem("5", "Del amor y otros demonios",R.mipmap.otros_demonios,"Obra literaria escrita por Gabriel García Márquez y publicada en el año 1994."));
    }

    private static void addItem(BookItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class BookItem {
        public String id;
        public String content;
        public int imagen;
        public String description;

        public BookItem(String id, String content,int imagen, String description) {
            this.id = id;
            this.content = content;
            this.imagen=imagen;
            this.description=description;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

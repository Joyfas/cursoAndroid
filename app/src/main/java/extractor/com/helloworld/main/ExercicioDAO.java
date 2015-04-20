package extractor.com.helloworld.main;

import java.util.ArrayList;

import extractor.com.helloworld.fragments.FragmentsActivity;
import extractor.com.helloworld.layout.frame.FrameLayoutActivity;
import extractor.com.helloworld.layout.linear.LinearLayoutActivity;
import extractor.com.helloworld.layout.relative.RelativeLayoutActivity;
import extractor.com.helloworld.layout.tab.LayoutTabActivity;
import extractor.com.helloworld.layout.table.TableLayoutActivity;
import extractor.com.helloworld.text.autocomplete.AutoCompleteActivity;
import extractor.com.helloworld.text.toast.ToastActivity;
import extractor.com.helloworld.view.grid.GridViewActivity;
import extractor.com.helloworld.view.list.ListViewActivity;
import extractor.com.helloworld.widget.buttons.ImageButtonActivity;
import extractor.com.helloworld.widget.contextmenu.ContextMenuActivity;
import extractor.com.helloworld.widget.spinners.SpinnerActivity;

public class ExercicioDAO {

    public ExercicioDAO() {}

    public ArrayList<Exercicio> getExercicios(){
        ArrayList<Exercicio> exercicios = new ArrayList<>();
        exercicios.add(new Exercicio("Linear Layout", LinearLayoutActivity.class));
        exercicios.add(new Exercicio("Relative Layout", RelativeLayoutActivity.class));
        exercicios.add(new Exercicio("Table Layout", TableLayoutActivity.class));
        exercicios.add(new Exercicio("Framge Layout", FrameLayoutActivity.class));
        exercicios.add(new Exercicio("Listview", ListViewActivity.class));
        exercicios.add(new Exercicio("Gridview", GridViewActivity.class));
        exercicios.add(new Exercicio("Tab Layout", LayoutTabActivity.class));
        exercicios.add(new Exercicio("Toast", ToastActivity.class));
        exercicios.add(new Exercicio("Autocomplete", AutoCompleteActivity.class));
        exercicios.add(new Exercicio("Fragment", FragmentsActivity.class));
        exercicios.add(new Exercicio("Button", ImageButtonActivity.class));
        exercicios.add(new Exercicio("Spinner", SpinnerActivity.class));
        exercicios.add(new Exercicio("Context Menu", ContextMenuActivity.class));
        return exercicios;
    }

}
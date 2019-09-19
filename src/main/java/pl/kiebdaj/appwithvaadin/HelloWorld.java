package pl.kiebdaj.appwithvaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class HelloWorld extends VerticalLayout {

    public HelloWorld() {
        TextField textFieldName = new TextField("What's your name?");
        Button buttonName = new Button("My name", new Icon(VaadinIcon.ALARM));
        Label labelName = new Label();
        buttonName.addClickListener(buttonClickEvent ->
        {
            labelName.setText("Hello " + textFieldName.getValue());
            add(new Image("https://media1.tenor.com/images/b29dc163c837da24078a8d9c461bd915/tenor.gif?itemid=5203221", "Nope!" ));
        });
        add(textFieldName, buttonName, labelName);
    }
}

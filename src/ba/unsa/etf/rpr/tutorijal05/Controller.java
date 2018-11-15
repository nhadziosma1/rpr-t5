package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {

    private SimpleStringProperty displej;

    private SimpleStringProperty broj1;
    private  SimpleStringProperty operator; //broj2 je u dispejlu

    public String getDisplej() {
        return displej.get();
    }

    public SimpleStringProperty displejProperty()
    {
        return displej;
    }

    public Controller()
    {
        displej = new SimpleStringProperty("0");

        operator = null;
        broj1 = null;
    }

    public void dungeOsam(ActionEvent actionEvent) {
        if(displej.get().equals("0"))
            displej.set("8");
        else
            displej.set(displej.get()+"8");
    }

    public void Devet(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("9");
        else
            displej.set(displej.get()+"9");
    }

    public void Cetiri(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("4");
        else
            displej.set(displej.get()+"4");
    }

    public void Sedam(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("7");
        else
            displej.set(displej.get()+"7");
    }

    public void Pet(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("5");
        else
            displej.set(displej.get()+"5");
    }


    public void Sest(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("6");
        else
            displej.set(displej.get()+"6");
    }

    public void Jedan(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("1");
        else
            displej.set(displej.get()+"1");
    }

    public void Dva(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("2");
        else
            displej.set(displej.get()+"2");
    }

    public void Tri(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("3");
        else
            displej.set(displej.get()+"3");
    }

    public void Oduzmi(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("-");
        else
        {
            broj1= new SimpleStringProperty(displej.get());
            operator = new SimpleStringProperty("-");
            displej.set("0");
        }
    }

    public void Plus(ActionEvent actionEvent)
    {
        broj1= new SimpleStringProperty(displej.get());
        operator = new SimpleStringProperty("+");
        displej.set("0");

    }

    public void Jednako(ActionEvent actionEvent)
    {
        if(operator == null)
            displej.get();
        else
        {
            Double br1 = Double.parseDouble(broj1.get());
            Double br2 = Double.parseDouble(displej.get());
            Double rezultat= new Double(0);

            if(operator.get().equals("-"))
                rezultat= br1-br2;
            else if(operator.get().equals("+"))
                rezultat= br1+br2;
            else if(operator.get().equals("*"))
                 rezultat=br1*br2;
            else if(operator.get().equals("/"))
                rezultat=br1/br2;
            else if(operator.get().equals("%"))
                rezultat= br1%br2;

            System.out.println(br1+" "+br2+" "+rezultat);
            displej.set(rezultat.toString());
        }
    }

    public void Nula(ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
        displej.set("0");
        else
        {
            displej.set(displej.get()+"0");
        }
    }

    public void DecTacka(ActionEvent actionEvent)
    {
        displej.set(displej.get()+".");
    }

    public void Puta(ActionEvent actionEvent)
    {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("*");

        displej.set("0");
    }

    public void Dijeli(ActionEvent actionEvent)
    {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("/");

        displej.set("0");
    }

    public void Ostatak(ActionEvent actionEvent)
    {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("%");

        displej.set("0");
    }
}

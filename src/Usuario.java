import java.text.DateFormat;
import java.util.Date;

public class Usuario {
    private Conta contaObj;
    public String name;
    private Date birth;

    Usuario (){
        setContaObj();

    }

    public void setContaObj() {
        this.contaObj = new Conta();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Conta getContaObj() {
        return contaObj;
    }

}

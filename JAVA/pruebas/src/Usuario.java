public class Usuario {
    public static void main(String[] args) {
        Usuario obj;

        obj = new Usuario("Miguel Alvarez", "1099000222", "miguel.alvarez@correo.com","29",
                "administrativa", false);
        obj.info();
    }
    // atributos
    String nombreDelUsuario;
    String identificacion;
    String email;
    String edad;
    String area;
    boolean jefe;
    double salario;

    //Metodo constructor

    public Usuario(String nombreDelUsuario, String identificacion, String email, String edad, String area, boolean jefe) {
        this.nombreDelUsuario = nombreDelUsuario;
        this.identificacion = identificacion;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.jefe = jefe;
        this.salario = this.salario();
    }
        // Metodos / Funciones

    double salario(){
        double salario, totalDevengado;
        switch (this.area.toLowerCase()){
            case "administrativa":
                totalDevengado = 3500000.0;
                if(this.jefe) {
                    totalDevengado = totalDevengado + 3000000.0;
                }
                break;
            case "desarrollo":
                totalDevengado = 4500000.0;
                if (this.jefe){
                    totalDevengado = totalDevengado + 2500000.0;
                }
                break;
            default:
                totalDevengado = 0.0;
                break;
        }
        salario = totalDevengado;
        if (totalDevengado < 4 * 908.526) {
            salario -= (totalDevengado *0.08);
        } else{
            salario -= (totalDevengado * 0.01) + (totalDevengado *0.08);
        }
        return salario;
    }

    // Salidas
    public void  info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: " + this.nombreDelUsuario);
        System.out.println("Identificacion: " + this.identificacion);
        System.out.println("Email: " + this.email);
        System.out.println("Edad: " + this.edad);
        System.out.println("Área: " + this.area);
        System.out.println("Salario: " + this.salario);
    }
}


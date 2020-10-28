import java.util.Scanner;
        
        

public class Main{
        public static final int minCodi=100;
        public static final int maxCodi=2100;
        public static final int maxId=27;
        public static final int minId=4;   
        public static final int minExperencia=0;
        public static final int maxExperencia=30;
        public static final int minParticipante=0;
        public static final int maxParticipante=3;

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
          
        int codigo,genero,participante,id,experencia,Sessió
        ;
        String sesion=" ",Genere=" ",participant=" ";
        
        
        System.out.print("Introduzca tu codigo tiene que ser entre 100 y 2100  ?:");
        codigo = sc.nextInt();
        if(codigo>minCodi && codigo <maxCodi){
            System.out.print("Introduce tu genero , si eres chica pon 1 , si eres chico pon 2 y si no quieres responder pon 3? :");
            genero=sc.nextInt();
            if(genero >= 1 && genero <= 3){
                switch(genero){
                    case 1:
                        Genere="chica";
                        break;
                    case 2:
                        Genere="chico";
                        break;
                    case 3:
                        Genere="Null";
                        break;
                }
                System.out.print("Introduce que tipo de  de participante eres , general(0),educacion(1),empresa(2) o prensa(3)? :");
                participante=sc.nextInt();
                
                    if(participante>=minParticipante && participante<=maxParticipante)
                     {
                        switch (participante) {
                            case 0:
                            participant="general"  ;  
                               break;
                           case 1:
                               participant="educacin";
                           break;
                           case 2:
                           participant="empresa";
                           break;
                           case 3:
                           participant="prensa";
                           break;
                            default:
                                break;
                        }
                        System.out.print("Es tu primera sesion?  (1)si,(2)no :");
                        Sessió=sc.nextInt();
                        if(Sessió == 1|| Sessió == 2)
                        {
                            switch (Sessió) {
                                case 1:
                                    sesion= "si";
                                    break;
                                case 2:
                                    sesion="no";
                                default:
                                    break;
                            }
                            System.out.println("Cual es tu id de sesion entre 4 y 27");
                            id=sc.nextInt();
                            if(id>=minId&&id<=maxId)
                            {
                                System.out.println("Cuanto años de experiencia tienes");
                                experencia=sc.nextInt();
                                if(experencia>=minExperencia&&experencia<=maxExperencia)
                                {
                                    System.out.println("codigo es :" + codigo);
                                    System.out.println("Genero : "+ Genere );
                                    System.out.println("Tipo: " + participant);
                                    System.out.println("Primera sesion: " + sesion );
                                    System.out.println("ID Sesion :" + id);
                                    System.out.println("Experiencia :" + experencia);
                                }else
                                {
                                    sc.close();
                                    System.out.println("ERROR");
                                }
                                
                            }else
                            {
                                sc.close();
                                System.out.println("ERROR");
                            }
                        } else
                        {
                            sc.close();
                            System.out.println("ERROR");
                        }
                    } else
                    {
                        sc.close();
                        System.out.println("ERROR");
                    }
            } else
            {
                sc.close();
                System.out.println("ERROR");
            }     
        }
        else
        {
            sc.close();
            System.out.println("ERROR");
        }
    }
}
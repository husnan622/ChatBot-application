import java.util.*;
class ChatterBot
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hai, saya adalah Chat Bot");
        
        boolean running = true;
        String input;
        
        while(running == true)
        {
            System.out.println(" ");
            input = sc.nextLine();
            
            if(input.equals("Hai"))
            {
                System.out.println("Hai juga");
            }
            
            else if(input.equals("Selamat tinggal"))
            {
                System.out.println("Semoga kita berjumpa di lain waktu");
                running = false;
            }
            
            else if(input.equals("Siapa sahabat terbaik kamu"))
            {
                System.out.println("Sahabat terbaik saya adalah Programmer yang membuat saya");
            }
            
            else
            {
               System.out.println("Maaf saya tidak mengerti apa yang anda maksud"); 
            }
        }
    }
}
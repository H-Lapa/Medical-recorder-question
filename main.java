import java.util.*;
import java.io.*;
class Main
{

    public static void main(String[] args)
    {
        execute();
        System.exit(0);
    }

    public static void execute()
    {
        final int minimum = getInt("Minimum/Danger flow number: ");
        boolean end = false;
        reading[] patientDetails = new reading[31];
        int arrayPos = 0;
        while(!end)
        {
            int day = getInt("What day of the month is it: ");

            if (day == 0)
            {
                end = true;
                break;
            }

            int flow1 = getInt("Reading of flow: ");
            int flow2 = getInt("Reading of flow: ");
            int flow3 = getInt("Reading of flow: ");

            if (flow1 <= minimum || flow2 <= minimum || flow3 <= minimum)
            {
                System.out.println("At least one of your readings is dangerously low, go to a hospital");
            }

            int peakFlow = Math.max(flow1, Math.max(flow2, flow3));

            patientDetails[arrayPos] = createReading(day, peakFlow);
            arrayPos += 1;
        }

        //here i need to add all the details to the file and print and stuff
        inputFile("patientx.txt", patientDetails, arrayPos);
        outputFile("patientx.txt");
    }

    //displays text and receives int as response to return
    public static int getInt (String txt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        int response = scanner.nextInt();
        return response;
    }

    //displays text and receives String as response to return
    public static String getString (String txt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        String response = scanner.nextLine();
        return response;
    }

    //random int prouce within range
    public static int randomInt(int bound) {
        Random r = new Random();
        return r.nextInt(bound);
    }

    public static void inputFile (String fileName, reading[] arr, int pos)
    {
        //writes into the file
        try (FileOutputStream fis = new FileOutputStream(fileName, true))
        {
            String message = "";
            for (int i = 0; i < pos; i++)
            {
                message += arr[i].day + ", " + arr[i].peakFlow + "\n";
                fis.write(message.getBytes());
                message = "";
            }

            fis.close();
        }
        catch (IOException ex)
        {
            print("Error");
        }
    }// End of Inputfile

    public static void outputFile (String fileName)
    {
        //prints the file
        try (FileInputStream fis = new FileInputStream(fileName))
        {
            int i;

            while ((i = fis.read()) != -1)
            {
                System.out.print((char) i);
            }
            print("\n");
            fis.close();
        }
        catch (IOException ex)
        {
            print("There is no leaderboard!");
        }

    }//END of Outputfile

    public static reading createReading (int day, int peakflow)
    {
        reading record = new reading();
        record.day = day;
        record.peakFlow = peakflow;
        return record;
    }

    //prints to screen in less words
    public static void print (String txt)
    {
        System.out.println(txt);
        return;
    }//END of print

}

class reading
{
    int day;
    int peakFlow;
}

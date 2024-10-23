package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Second.symark;
import Third.tymark;

public class Marks {
    int rollno;
    String name;
    int sytotal, tytotal;
    String grade;
    float per, gtotal;

    public void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the roll no:");
        rollno = Integer.parseInt(br.readLine());
        System.out.println("Enter the name:");
        name = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of objects:");
        int n = Integer.parseInt(br.readLine());
        Marks[] s = new Marks[n];
        symark[] Sy = new symark[n];
        tymark[] Ty = new tymark[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Marks();
            Sy[i] = new symark();
            Ty[i] = new tymark();

            s[i].accept();
            Sy[i].accept();
            Ty[i].accept();

            s[i].sytotal = (Sy[i].computer + Sy[i].math + Sy[i].electronics);
            s[i].tytotal = (Ty[i].theory + Ty[i].practicals);
            s[i].gtotal = (s[i].sytotal + s[i].tytotal);
            s[i].per = ((s[i].gtotal / 1200)*100); 

            if (s[i].per >= 70)
                s[i].grade = "A";
            else if (s[i].per >= 60)
                s[i].grade = "B";
            else if (s[i].per >= 40)
                s[i].grade = "Pass";
            else
                s[i].grade = "Fail";
        }

        System.out.println("Roll NO\tName\tSY Total\tTY Total\tG Total\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].rollno + "\t" + s[i].name + "\t" + s[i].sytotal + "\t" + s[i].tytotal + "\t" + s[i].gtotal + "\t" + s[i].per + "\t" + s[i].grade);
        }
    }
}
import java.util.Scanner;

public class SurveiKepuasan19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] survey = new int[10][6];
        double rata2Responden, rata2Pertanyaan;
        int totalNilai = 0;
        int totalSemua = 0;
        int[] totalPertanyaan = new int[6];
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 6) {
                System.out.print("Input survey [" + i + "][" + j + "]: ");
                survey[i][j] = input.nextInt();
                totalNilai += survey[i][j];
                totalPertanyaan[j] += survey[i][j];
                j++;
            }
            rata2Responden = totalNilai / 6.0;
            System.out.println("Rata-rata responden " + (i + 1) + " = " + rata2Responden);
            i++;
            }
            int j = 0;
             while (j < 6) {
              rata2Pertanyaan = totalPertanyaan[j] / 10.0;
              System.out.println("Rata-rata pertanyaan " + (j + 1) + " = " + rata2Pertanyaan);
                j++;
             }
        input.close();
    }
}

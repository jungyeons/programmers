public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        int answer = 0;
        float n1 = num1;
        float n2 = num2;
        float first = n1/n2;
        answer = (int)(first * 1000);
        return answer;
    }
}

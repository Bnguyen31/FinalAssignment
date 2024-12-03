//Codingbat Assignments
//Benjamin Nguyen 2024
//ITEC 2130

public class RecursionPractice {
    //displayString
    public String displayString(String str, int n) {
        if (n <= 0) {
            return "";
        }
        return str + displayString(str, n - 1);
    }
    //getMultiChar
    public String getMultiChar(char ch, int n) {
        if (n < 0) {
            return "";
        }
        return ch + getMultiChar(ch, n - 1);
    }
    //getPowerOfTen
    public long getPowerOfTen(int n) {
        if (n == 0) {
            return 1;
        }
        return 10 * getPowerOfTen(n - 1);
    }
    //factorial
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
// numberOfGloves
public int numberOfGloves(int peopleOfPlanetU101InARoom) {
    if (peopleOfPlanetU101InARoom == 0) {
        return 0;
    }
    return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
}
//getPowerOfTen (loop version)
public long getPowerOfTen(int n) {
    long result = 1;
    for (int i = 0; i < n; i++) {
        result *= 10;
    }
    return result;
}
//numberOfGloves (other version)
public int numberOfGloves(int peopleOfPlanetU101InARoom) {
    return peopleOfPlanetU101InARoom * 3;

}

//getNumberOfZerosLoops
public int getNumberOfZerosLoop(int num) {
    int count = 0;
    while (num != 0) {
        if (num % 10 == 0) {
            count++;
        }
        num /= 10;
    }
    return count;
}

//getNumberOfZerosRecursion
public int getNumberOfZerosRecursion(int num) {
    if (num == 0) {
        return 1;
    }
    if (num < 10 && num > -10) {
        return (num == 0) ? 1 : 0;
    }
    int lastDigit = num % 10;
    int count = (lastDigit == 0) ? 1 : 0;
    return count + getNumberOfZerosRecursion(num / 10);
}

}

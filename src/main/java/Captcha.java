
public class Captcha {
    int i;
    int i1;
    int i2;
    int i3;
    String str;
    String str1;
    String str2;

    public Captcha(int i, int i1, int i2, int i3) {
        this.i = i;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }

    public String getStr() {
        if (i == 1) {
            str2 = i3 + "";
            switch (i1) {
                case 1:
                    str = "ONE";
                    break;
                case 2:
                    str = "TWO";
                    break;
                case 3:
                    str = "THREE";
                    break;
                case 4:
                    str = "FOUR";
                    break;
                case 5:
                    str = "FIVE";
                    break;
                case 6:
                    str = "SIX";
                    break;
                case 7:
                    str = "SEVEN";
                    break;
                case 8:
                    str = "EIGHT";
                    break;
                case 9:
                    str = "NINE";
                    break;
            }
        }
        if (i == 2) {
            str = i1 + "";
            switch (i3) {
                case 1:
                    str2 = "ONE";
                    break;
                case 2:
                    str2 = "TWO";
                    break;
                case 3:
                    str2 = "THREE";
                    break;
                case 4:
                    str2 = "FOUR";
                    break;
                case 5:
                    str2 = "FIVE";
                    break;
                case 6:
                    str2 = "SIX";
                    break;
                case 7:
                    str2 = "SEVEN";
                    break;
                case 8:
                    str2 = "EIGHT";
                    break;
                case 9:
                    str2 = "NINE";
                    break;
            }
        }
        return str;
    }

    public String getCaptcha() {
        getStr();
        getStr1();
        return str + str1 + str2;
    }

    public String getStr1() {
        switch (i2) {
            case 1:
                str1 = "+";
                break;
            case 2:
                str1 = "-";
                break;
            case 3:
                str1 = "*";
                break;
        }
        return str1;
    }
}

package p000;
/* renamed from: W31 */
/* loaded from: classes8.dex */
public class W31 {
    /* renamed from: a */
    public static char m78888a(int i) {
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                return '2';
                            }
                            throw new IllegalArgumentException("Unknown dimension value: " + i);
                        }
                        return '1';
                    }
                    return '0';
                }
                return 'F';
            }
            return 'T';
        }
        return '*';
    }

    /* renamed from: b */
    public static int m78887b(char c) {
        char upperCase = Character.toUpperCase(c);
        if (upperCase != '*') {
            if (upperCase != 'F') {
                if (upperCase != 'T') {
                    switch (upperCase) {
                        case '0':
                            return 0;
                        case '1':
                            return 1;
                        case '2':
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown dimension symbol: " + c);
                    }
                }
                return -2;
            }
            return -1;
        }
        return -3;
    }
}

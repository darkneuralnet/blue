package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: Lx2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C34396Lx2 {
    private C34396Lx2() {
    }

    /* renamed from: a */
    public static String m96099a(String str) {
        if (C44504lS5.m27271d(str)) {
            return "Zendesk";
        }
        if (str.length() > 23) {
            return str.substring(0, 23);
        }
        return str;
    }

    /* renamed from: b */
    public static char m96098b(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        return i != 7 ? 'I' : 'A';
                    }
                    return 'E';
                }
                return 'W';
            }
            return 'D';
        }
        return 'V';
    }

    /* renamed from: c */
    public static List<String> m96097c(String str, int i) {
        int min;
        ArrayList arrayList = new ArrayList();
        if (i < 1) {
            if (!C44504lS5.m27273b(str)) {
                arrayList.add("");
                return arrayList;
            }
            arrayList.add(str);
            return arrayList;
        } else if (!C44504lS5.m27273b(str)) {
            arrayList.add("");
            return arrayList;
        } else if (str.length() < i) {
            arrayList.add(str);
            return arrayList;
        } else {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                int indexOf = str.indexOf(C44504lS5.f96220b, i2);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i2 + i);
                    arrayList.add(str.substring(i2, min));
                    if (min >= indexOf) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
            return arrayList;
        }
    }
}

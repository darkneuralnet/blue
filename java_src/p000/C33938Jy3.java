package p000;
/* renamed from: Jy3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33938Jy3 implements Comparable {

    /* renamed from: b */
    public C52053yB0[] f18865b;

    /* renamed from: c */
    public boolean f18866c;

    public C33938Jy3(C52053yB0[] c52053yB0Arr) {
        this.f18865b = c52053yB0Arr;
        this.f18866c = m99488b(c52053yB0Arr);
    }

    /* renamed from: a */
    public static int m99489a(C52053yB0[] c52053yB0Arr, boolean z, C52053yB0[] c52053yB0Arr2, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        int length2;
        boolean z3;
        boolean z4;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        if (z2) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (z) {
            i3 = c52053yB0Arr.length;
        } else {
            i3 = -1;
        }
        if (z2) {
            i4 = c52053yB0Arr2.length;
        } else {
            i4 = -1;
        }
        if (z) {
            length = 0;
        } else {
            length = c52053yB0Arr.length - 1;
        }
        if (z2) {
            length2 = 0;
        } else {
            length2 = c52053yB0Arr2.length - 1;
        }
        while (true) {
            int compareTo = c52053yB0Arr[length].compareTo(c52053yB0Arr2[length2]);
            if (compareTo != 0) {
                return compareTo;
            }
            length += i;
            length2 += i2;
            if (length == i3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (length2 == i4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 && !z4) {
                return -1;
            }
            if (!z3 && z4) {
                return 1;
            }
            if (z3 && z4) {
                return 0;
            }
        }
    }

    /* renamed from: b */
    public static boolean m99488b(C52053yB0[] c52053yB0Arr) {
        return BB0.m114283c(c52053yB0Arr) == 1;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C33938Jy3 c33938Jy3 = (C33938Jy3) obj;
        return m99489a(this.f18865b, this.f18866c, c33938Jy3.f18865b, c33938Jy3.f18866c);
    }
}

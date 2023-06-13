package p000;
/* renamed from: mq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45326mq2 {
    private C45326mq2() {
    }

    /* renamed from: a */
    public static int m24862a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 2;
                }
                throw new IllegalArgumentException("The given lens facing integer: " + i + " can not be recognized.");
            }
            return 1;
        }
        return 0;
    }
}

package p000;
/* renamed from: Ci1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32154Ci1 {

    /* renamed from: a */
    public final Object f4519a = new Object();

    /* renamed from: b */
    public final C36761Wa0 f4520b;

    /* renamed from: c */
    public int f4521c;

    public C32154Ci1(C36761Wa0 c36761Wa0, int i) {
        this.f4520b = c36761Wa0;
        this.f4521c = i;
    }

    /* renamed from: a */
    public int m111827a() {
        int i;
        synchronized (this.f4519a) {
            i = this.f4521c;
        }
        return i;
    }

    /* renamed from: b */
    public void m111826b(int i) {
        synchronized (this.f4519a) {
            this.f4521c = i;
        }
    }
}

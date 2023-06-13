package p000;
/* renamed from: zA3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52640zA3 {

    /* renamed from: a */
    public final boolean f120895a;

    /* renamed from: b */
    public boolean f120896b = false;

    public C52640zA3(C36099Te4 c36099Te4) {
        this.f120895a = c36099Te4.m83238b(C7549Sq.class) != null;
    }

    /* renamed from: a */
    public void m1725a() {
        this.f120896b = false;
    }

    /* renamed from: b */
    public void m1724b() {
        this.f120896b = true;
    }

    /* renamed from: c */
    public boolean m1723c(int i) {
        return this.f120896b && i == 0 && this.f120895a;
    }
}

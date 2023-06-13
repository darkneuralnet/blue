package p000;
/* renamed from: Rq */
/* loaded from: classes.dex */
public class C7278Rq {

    /* renamed from: a */
    public final boolean f32723a;

    /* renamed from: b */
    public final boolean f32724b;

    public C7278Rq(C36099Te4 c36099Te4) {
        boolean z;
        this.f32723a = c36099Te4.m83239a(C40987fX1.class);
        if (S21.m86079a(UD0.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f32724b = z;
    }

    /* renamed from: a */
    public int m86275a(int i) {
        if ((this.f32723a || this.f32724b) && i == 2) {
            return 1;
        }
        return i;
    }
}

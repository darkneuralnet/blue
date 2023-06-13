package p000;
/* renamed from: GL8 */
/* loaded from: classes6.dex */
public abstract class GL8 extends AF8<String> {

    /* renamed from: d */
    public final CharSequence f11714d;

    /* renamed from: e */
    public final BH8 f11715e;

    /* renamed from: f */
    public final boolean f11716f;

    /* renamed from: g */
    public int f11717g = 0;

    /* renamed from: h */
    public int f11718h;

    public GL8(SL8 sl8, CharSequence charSequence) {
        BH8 bh8;
        boolean z;
        bh8 = sl8.f33504a;
        this.f11715e = bh8;
        z = sl8.f33505b;
        this.f11716f = z;
        this.f11718h = Integer.MAX_VALUE;
        this.f11714d = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.f11718h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.f11714d.length();
        r5.f11717g = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.f11714d.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.f11718h = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r5.f11714d.subSequence(r0, r1).toString();
     */
    @Override // p000.AF8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ String mo105299a() {
        int mo78583c;
        int i = this.f11717g;
        while (true) {
            int i2 = this.f11717g;
            if (i2 != -1) {
                int mo78582d = mo78582d(i2);
                if (mo78582d == -1) {
                    mo78582d = this.f11714d.length();
                    this.f11717g = -1;
                    mo78583c = -1;
                } else {
                    mo78583c = mo78583c(mo78582d);
                    this.f11717g = mo78583c;
                }
                if (mo78583c == i) {
                    int i3 = mo78583c + 1;
                    this.f11717g = i3;
                    if (i3 > this.f11714d.length()) {
                        this.f11717g = -1;
                    }
                } else {
                    if (i < mo78582d) {
                        this.f11714d.charAt(i);
                    }
                    if (i < mo78582d) {
                        this.f11714d.charAt(mo78582d - 1);
                    }
                    if (!this.f11716f || i != mo78582d) {
                        break;
                    }
                    i = this.f11717g;
                }
            } else {
                m115953b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo78583c(int i);

    /* renamed from: d */
    public abstract int mo78582d(int i);
}

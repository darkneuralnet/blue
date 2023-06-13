package p000;
/* renamed from: yv9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52497yv9 extends AbstractC45594nH8 {

    /* renamed from: d */
    public final CharSequence f120423d;

    /* renamed from: e */
    public final A99 f120424e;

    /* renamed from: f */
    public final boolean f120425f;

    /* renamed from: g */
    public int f120426g = 0;

    /* renamed from: h */
    public int f120427h;

    public AbstractC52497yv9(Cw9 cw9, CharSequence charSequence) {
        A99 a99;
        boolean z;
        a99 = cw9.f4953a;
        this.f120424e = a99;
        z = cw9.f4954b;
        this.f120425f = z;
        this.f120427h = Integer.MAX_VALUE;
        this.f120423d = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.f120427h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.f120423d.length();
        r5.f120426g = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.f120423d.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.f120427h = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r5.f120423d.subSequence(r0, r1).toString();
     */
    @Override // p000.AbstractC45594nH8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object mo2250a() {
        int mo2249c;
        int i = this.f120426g;
        while (true) {
            int i2 = this.f120426g;
            if (i2 != -1) {
                int mo2248d = mo2248d(i2);
                if (mo2248d == -1) {
                    mo2248d = this.f120423d.length();
                    this.f120426g = -1;
                    mo2249c = -1;
                } else {
                    mo2249c = mo2249c(mo2248d);
                    this.f120426g = mo2249c;
                }
                if (mo2249c == i) {
                    int i3 = mo2249c + 1;
                    this.f120426g = i3;
                    if (i3 > this.f120423d.length()) {
                        this.f120426g = -1;
                    }
                } else {
                    if (i < mo2248d) {
                        this.f120423d.charAt(i);
                    }
                    if (i < mo2248d) {
                        this.f120423d.charAt(mo2248d - 1);
                    }
                    if (!this.f120425f || i != mo2248d) {
                        break;
                    }
                    i = this.f120426g;
                }
            } else {
                m23997b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo2249c(int i);

    /* renamed from: d */
    public abstract int mo2248d(int i);
}

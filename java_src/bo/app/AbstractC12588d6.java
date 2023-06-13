package bo.app;

import android.util.Base64;
/* renamed from: bo.app.d6 */
/* loaded from: classes.dex */
public abstract class AbstractC12588d6 implements InterfaceC13145t2 {

    /* renamed from: d */
    private static final String f58362d = C43664k20.m29433n(AbstractC12588d6.class);

    /* renamed from: a */
    private final long f58363a;

    /* renamed from: b */
    private final long f58364b;

    /* renamed from: c */
    private InterfaceC13160u1 f58365c;

    public AbstractC12588d6() {
        long m21028h = C46287oT0.m21028h();
        this.f58364b = m21028h;
        this.f58363a = m21028h / 1000;
    }

    @Override // bo.app.InterfaceC13145t2
    /* renamed from: a */
    public InterfaceC13160u1 mo62924a() {
        return this.f58365c;
    }

    @Override // bo.app.InterfaceC13145t2
    /* renamed from: b */
    public long mo62923b() {
        return this.f58363a;
    }

    @Override // bo.app.InterfaceC13145t2
    /* renamed from: e */
    public long mo62922e() {
        return this.f58364b;
    }

    /* renamed from: a */
    public String m63832a(String str) {
        if (C43318jS5.m30597g(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = f58362d;
            C43664k20.m29434m(str2, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    public AbstractC12588d6(InterfaceC13160u1 interfaceC13160u1) {
        this();
        this.f58365c = interfaceC13160u1;
    }
}

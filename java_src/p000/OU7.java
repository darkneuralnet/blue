package p000;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
/* renamed from: OU7 */
/* loaded from: classes6.dex */
public final class OU7 {

    /* renamed from: d */
    public static final String f26663d = C45710nU7.m23606a(4);

    /* renamed from: e */
    public static OU7 f26664e;

    /* renamed from: a */
    public final C38586bV7 f26665a;

    /* renamed from: b */
    public final XS7 f26666b;

    /* renamed from: c */
    public RQ8<Au9> f26667c = RQ8.m86759w();

    @VisibleForTesting
    public OU7(C38586bV7 c38586bV7, XS7 xs7) {
        this.f26666b = xs7;
        this.f26665a = c38586bV7;
    }

    /* renamed from: b */
    public static OU7 m92168b() {
        if (f26664e == null) {
            f26664e = new OU7(new C38586bV7(), new XS7());
        }
        return f26664e;
    }

    /* renamed from: a */
    public final XT7 m92169a(Context context) {
        C43896kQ8 c43896kQ8 = new C43896kQ8();
        AbstractC38578bU8<Au9> it = this.f26667c.iterator();
        while (it.hasNext()) {
            Au9 next = it.next();
            try {
                c43896kQ8.m28974a(Integer.valueOf(next.zza()), C38586bV7.m64505a(next, context, this.f26666b));
            } catch (C37984aU7 | C45108mT7 e) {
                C33384Ho7.m103418a(f26663d, e);
            }
        }
        return XT7.m76966c(c43896kQ8.m28973b(), this.f26666b.m76998e());
    }

    /* renamed from: c */
    public final void m92167c(AT7 at7) {
        this.f26667c = RQ8.m86760v(at7.mo15930a());
        this.f26666b.m76997f(at7.mo15929b());
    }
}

package p000;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: D49 */
/* loaded from: classes6.dex */
public abstract class D49<InputT, OutputT> extends U59<OutputT> {

    /* renamed from: o */
    public static final Logger f5185o = Logger.getLogger(D49.class.getName());

    /* renamed from: m */
    public XO8<? extends Mb9<? extends InputT>> f5186m;

    /* renamed from: n */
    public final boolean f5187n;

    public D49(XO8<? extends Mb9<? extends InputT>> xo8, boolean z, boolean z2) {
        super(xo8.size());
        this.f5186m = xo8;
        this.f5187n = z;
    }

    /* renamed from: M */
    public static void m110963M(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        f5185o.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    /* renamed from: N */
    public static boolean m110962N(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* renamed from: P */
    public static /* synthetic */ void m110960P(D49 d49, int i, Future future) {
        try {
            C50508va9.m8424l(future);
        } catch (ExecutionException e) {
            d49.m110964L(e.getCause());
        } catch (Throwable th) {
            d49.m110964L(th);
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m110959Q(D49 d49, XO8 xo8) {
        boolean z;
        int m81976E = d49.m81976E();
        if (m81976E >= 0) {
            z = true;
        } else {
            z = false;
        }
        C52142yK8.m3655j(z, "Less than 0 remaining futures");
        if (m81976E == 0) {
            d49.m81972I();
            d49.mo43243R();
            d49.mo43244K(2);
        }
    }

    @Override // p000.U59
    /* renamed from: J */
    public final void mo81971J(Set<Throwable> set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable mo9257a = mo9257a();
            mo9257a.getClass();
            m110962N(set, mo9257a);
        }
    }

    /* renamed from: K */
    public void mo43244K(int i) {
        this.f5186m = null;
    }

    /* renamed from: L */
    public final void m110964L(Throwable th) {
        th.getClass();
        if (this.f5187n && !m9234x(th) && m110962N(m81973H(), th)) {
            m110963M(th);
        } else if (th instanceof Error) {
            m110963M(th);
        }
    }

    /* renamed from: R */
    public abstract void mo43243R();

    /* renamed from: S */
    public final void m110958S() {
        XO8<? extends Mb9<? extends InputT>> xo8 = this.f5186m;
        xo8.getClass();
        if (xo8.isEmpty()) {
            mo43243R();
        } else if (this.f5187n) {
            AbstractC38578bU8<? extends Mb9<? extends InputT>> it = this.f5186m.iterator();
            int i = 0;
            while (it.hasNext()) {
                Mb9<? extends InputT> next = it.next();
                next.mo9243o(new RunnableC45472n49(this, next, i), EnumC44316l79.INSTANCE);
                i++;
            }
        } else {
            RunnableC50214v49 runnableC50214v49 = new RunnableC50214v49(this, null);
            AbstractC38578bU8<? extends Mb9<? extends InputT>> it2 = this.f5186m.iterator();
            while (it2.hasNext()) {
                it2.next().mo9243o(runnableC50214v49, EnumC44316l79.INSTANCE);
            }
        }
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    public final String mo9253e() {
        XO8<? extends Mb9<? extends InputT>> xo8 = this.f5186m;
        if (xo8 != null) {
            String valueOf = String.valueOf(xo8);
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.mo9253e();
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: f */
    public final void mo9252f() {
        XO8<? extends Mb9<? extends InputT>> xo8 = this.f5186m;
        boolean z = true;
        mo43244K(1);
        boolean isCancelled = isCancelled();
        if (xo8 == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean m9233y = m9233y();
            AbstractC38578bU8<? extends Mb9<? extends InputT>> it = xo8.iterator();
            while (it.hasNext()) {
                it.next().cancel(m9233y);
            }
        }
    }
}

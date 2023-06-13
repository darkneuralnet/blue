package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* renamed from: f49  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractRunnableC40728f49<I, O, F, T> extends C49069t89<O> implements Runnable {

    /* renamed from: k */
    public static final /* synthetic */ int f79408k = 0;

    /* renamed from: i */
    public Mb9<? extends I> f79409i;

    /* renamed from: j */
    public F f79410j;

    public AbstractRunnableC40728f49(Mb9<? extends I> mb9, F f) {
        mb9.getClass();
        this.f79409i = mb9;
        f.getClass();
        this.f79410j = f;
    }

    /* renamed from: D */
    public abstract T mo42125D(F f, I i) throws Exception;

    /* renamed from: E */
    public abstract void mo42124E(T t);

    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    public final String mo9253e() {
        String str;
        Mb9<? extends I> mb9 = this.f79409i;
        F f = this.f79410j;
        String mo9253e = super.mo9253e();
        if (mb9 != null) {
            String valueOf = String.valueOf(mb9);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + valueOf2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (mo9253e != null) {
            String valueOf3 = String.valueOf(str);
            if (mo9253e.length() != 0) {
                return valueOf3.concat(mo9253e);
            }
            return new String(valueOf3);
        } else {
            return null;
        }
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: f */
    public final void mo9252f() {
        m9237u(this.f79409i);
        this.f79409i = null;
        this.f79410j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Mb9<? extends I> mb9 = this.f79409i;
        F f = this.f79410j;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (mb9 == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.f79409i = null;
        if (mb9.isCancelled()) {
            mo9251g(mb9);
            return;
        }
        try {
            try {
                Object mo42125D = mo42125D(f, C50508va9.m8424l(mb9));
                this.f79410j = null;
                mo42124E(mo42125D);
            } catch (Throwable th) {
                try {
                    m9234x(th);
                } finally {
                    this.f79410j = null;
                }
            }
        } catch (Error e) {
            m9234x(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            m9234x(e2);
        } catch (ExecutionException e3) {
            m9234x(e3.getCause());
        }
    }
}

package p000;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
/* renamed from: Z29 */
/* loaded from: classes6.dex */
public abstract class Z29<V, X extends Throwable, F, T> extends C49069t89<V> implements Runnable {

    /* renamed from: i */
    public Mb9<? extends V> f47780i;

    /* renamed from: j */
    public Class<X> f47781j;

    /* renamed from: k */
    public F f47782k;

    public Z29(Mb9<? extends V> mb9, Class<X> cls, F f) {
        this.f47780i = mb9;
        this.f47781j = cls;
        this.f47782k = f;
    }

    /* renamed from: D */
    public abstract T mo73809D(F f, X x) throws Exception;

    /* renamed from: E */
    public abstract void mo73808E(T t);

    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    public final String mo9253e() {
        String str;
        Mb9<? extends V> mb9 = this.f47780i;
        Class<X> cls = this.f47781j;
        F f = this.f47782k;
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
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 29 + valueOf2.length() + valueOf3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (mo9253e != null) {
            String valueOf4 = String.valueOf(str);
            if (mo9253e.length() != 0) {
                return valueOf4.concat(mo9253e);
            }
            return new String(valueOf4);
        } else {
            return null;
        }
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: f */
    public final void mo9252f() {
        m9237u(this.f47780i);
        this.f47780i = null;
        this.f47781j = null;
        this.f47782k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        Object obj;
        Mb9<? extends V> mb9 = this.f47780i;
        Class<X> cls = this.f47781j;
        F f = this.f47782k;
        boolean z3 = true;
        if (mb9 == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (f != null) {
            z3 = false;
        }
        if (!(z3 | z4) && !isCancelled()) {
            ?? r3 = (Class<X>) false;
            this.f47780i = null;
            try {
                if (mb9 instanceof AbstractC48770se9) {
                    th = ((AbstractC48770se9) mb9).mo9257a();
                } else {
                    th = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    String valueOf = String.valueOf(mb9.getClass());
                    String valueOf2 = String.valueOf(e.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35 + valueOf2.length());
                    sb.append("Future type ");
                    sb.append(valueOf);
                    sb.append(" threw ");
                    sb.append(valueOf2);
                    sb.append(" without a cause");
                    cause = new NullPointerException(sb.toString());
                }
                th = cause;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                obj = C50508va9.m8424l(mb9);
                if (th != null) {
                    mo9235w(obj);
                    return;
                } else if (cls.isInstance(th)) {
                    try {
                        Object mo73809D = mo73809D(f, th);
                        this.f47781j = null;
                        this.f47782k = null;
                        mo73808E(mo73809D);
                        return;
                    } catch (Throwable th2) {
                        try {
                            m9234x(th2);
                            return;
                        } finally {
                            this.f47781j = null;
                            this.f47782k = null;
                        }
                    }
                } else {
                    mo9251g(mb9);
                    return;
                }
            }
            obj = null;
            if (th != null) {
            }
        }
    }
}

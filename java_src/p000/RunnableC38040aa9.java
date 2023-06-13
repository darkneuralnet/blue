package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* renamed from: aa9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC38040aa9<V> implements Runnable {

    /* renamed from: b */
    public final Future<V> f50661b;

    /* renamed from: c */
    public final M99<? super V> f50662c;

    public RunnableC38040aa9(Future<V> future, M99<? super V> m99) {
        this.f50661b = future;
        this.f50662c = m99;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable m868a;
        Future<V> future = this.f50661b;
        if ((future instanceof AbstractC48770se9) && (m868a = C52920ze9.m868a((AbstractC48770se9) future)) != null) {
            this.f50662c.zza(m868a);
            return;
        }
        try {
            this.f50662c.zzb(C50508va9.m8424l(this.f50661b));
        } catch (Error e) {
            e = e;
            this.f50662c.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.f50662c.zza(e);
        } catch (ExecutionException e3) {
            this.f50662c.zza(e3.getCause());
        }
    }

    public final String toString() {
        UI8 m39609a = C41461gJ8.m39609a(this);
        m39609a.m81641a(this.f50662c);
        return m39609a.toString();
    }
}

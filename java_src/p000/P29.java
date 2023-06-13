package p000;

import java.lang.Throwable;
/* renamed from: P29 */
/* loaded from: classes6.dex */
public final class P29<V, X extends Throwable> extends Z29<V, X, InterfaceC43713k69<? super X, ? extends V>, Mb9<? extends V>> {
    public P29(Mb9<? extends V> mb9, Class<X> cls, InterfaceC43713k69<? super X, ? extends V> interfaceC43713k69) {
        super(mb9, cls, interfaceC43713k69);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.Z29
    /* renamed from: D */
    public final /* bridge */ /* synthetic */ Object mo73809D(Object obj, Throwable th) throws Exception {
        Mb9 zza = obj.zza(th);
        C52142yK8.m3661d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", obj);
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.Z29
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void mo73808E(Object obj) {
        mo9251g(obj);
    }
}

package p000;
/* renamed from: N39 */
/* loaded from: classes6.dex */
public final class N39<I, O> extends AbstractRunnableC40728f49<I, O, InterfaceC43713k69<? super I, ? extends O>, Mb9<? extends O>> {
    public N39(Mb9<? extends I> mb9, InterfaceC43713k69<? super I, ? extends O> interfaceC43713k69) {
        super(mb9, interfaceC43713k69);
    }

    @Override // p000.AbstractRunnableC40728f49
    /* renamed from: D */
    public final /* bridge */ /* synthetic */ Object mo42125D(Object obj, Object obj2) throws Exception {
        InterfaceC43713k69 interfaceC43713k69 = (InterfaceC43713k69) obj;
        Mb9<O> zza = interfaceC43713k69.zza(obj2);
        C52142yK8.m3661d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC43713k69);
        return zza;
    }

    @Override // p000.AbstractRunnableC40728f49
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void mo42124E(Object obj) {
        mo9251g((Mb9) obj);
    }
}

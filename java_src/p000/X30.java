package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"Y30", "Z30"}, m28432d2 = {}, m28431k = 4, m28430mv = {1, 6, 0})
/* renamed from: X30 */
/* loaded from: classes8.dex */
public final class X30 {
    /* renamed from: a */
    public static final <T> InterfaceC42190hZ0<T> m77510a(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2) {
        return Z30.m73803a(zc0, coroutineContext, enumC38417bD0, function2);
    }

    /* renamed from: c */
    public static final InterfaceC52943zh2 m77508c(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return Z30.m73801c(zc0, coroutineContext, enumC38417bD0, function2);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC52943zh2 m77507d(ZC0 zc0, CoroutineContext coroutineContext, EnumC38417bD0 enumC38417bD0, Function2 function2, int i, Object obj) {
        return Z30.m73800d(zc0, coroutineContext, enumC38417bD0, function2, i, obj);
    }

    /* renamed from: e */
    public static final <T> T m77506e(CoroutineContext coroutineContext, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) Y30.m75795a(coroutineContext, function2);
    }

    /* renamed from: g */
    public static final <T> Object m77504g(CoroutineContext coroutineContext, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return Z30.m73799e(coroutineContext, function2, continuation);
    }
}

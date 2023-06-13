package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.functions.Function2;
@RestrictsSuspension
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00128&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, m28432d2 = {"LWu;", "Lg01;", "LaX3;", "pass", "LYW3;", "r0", "(LaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "x0", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Q", "LG52;", C17296a.f69688o, "()J", "size", "LxB5;", "C0", "extendedTouchPadding", "M0", "()LYW3;", "currentEvent", "LJq6;", "s", "()LJq6;", "viewConfiguration", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wu */
/* loaded from: classes.dex */
public interface InterfaceC9204Wu extends InterfaceC41273g01 {
    /* renamed from: U */
    static /* synthetic */ Object m77725U(InterfaceC9204Wu interfaceC9204Wu, EnumC38007aX3 enumC38007aX3, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                enumC38007aX3 = EnumC38007aX3.Main;
            }
            return interfaceC9204Wu.mo3401r0(enumC38007aX3, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    /* renamed from: C0 */
    default long mo3417C0() {
        return C51465xB5.f117175b.m5723b();
    }

    /* renamed from: M0 */
    YW3 mo3414M0();

    /* renamed from: Q */
    default <T> Object mo3413Q(long j, Function2<? super InterfaceC9204Wu, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(this, continuation);
    }

    /* renamed from: a */
    long mo3409a();

    /* renamed from: r0 */
    Object mo3401r0(EnumC38007aX3 enumC38007aX3, Continuation<? super YW3> continuation);

    /* renamed from: s */
    InterfaceC33869Jq6 mo3400s();

    /* renamed from: x0 */
    default <T> Object mo3396x0(long j, Function2<? super InterfaceC9204Wu, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(this, continuation);
    }
}

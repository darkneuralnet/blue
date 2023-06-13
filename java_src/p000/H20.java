package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LH20;", "LA20;", "LOs4;", "rect", "", "h", "(LOs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LC20;", "defaultParent", "<init>", "(LC20;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H20 */
/* loaded from: classes.dex */
public final class H20 extends A20 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LOs4;", "b", "()LOs4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: H20$a */
    /* loaded from: classes.dex */
    public static final class C3011a extends Lambda implements Function0<C35055Os4> {

        /* renamed from: g */
        public final /* synthetic */ C35055Os4 f12746g;

        /* renamed from: h */
        public final /* synthetic */ H20 f12747h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3011a(C35055Os4 c35055Os4, H20 h20) {
            super(0);
            this.f12746g = c35055Os4;
            this.f12747h = h20;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C35055Os4 invoke() {
            C35055Os4 c35055Os4 = this.f12746g;
            if (c35055Os4 == null) {
                InterfaceC45879nm2 m116181b = this.f12747h.m116181b();
                if (m116181b != null) {
                    return CB5.m112661c(H52.m104428c(m116181b.mo23186a()));
                }
                return null;
            }
            return c35055Os4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H20(C20 defaultParent) {
        super(defaultParent);
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
    }

    /* renamed from: h */
    public final Object m104490h(C35055Os4 c35055Os4, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        C20 m116180g = m116180g();
        InterfaceC45879nm2 m116181b = m116181b();
        if (m116181b == null) {
            return Unit.INSTANCE;
        }
        Object mo72908a = m116180g.mo72908a(m116181b, new C3011a(c35055Os4, this), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo72908a == coroutine_suspended ? mo72908a : Unit.INSTANCE;
    }
}

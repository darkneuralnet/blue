package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lw83;", "LDA3;", "LCe3;", "delta", "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lkotlin/Function1;", "performScroll", "c", "(JILkotlin/jvm/functions/Function1;)J", "Lro6;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "", DateTokenConverter.CONVERTER_KEY, "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", C17296a.f69688o, "()Z", "isInProgress", "LgV2;", "b", "()LgV2;", "effectModifier", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: w83  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50841w83 implements DA3 {

    /* renamed from: a */
    public static final C50841w83 f115405a = new C50841w83();

    private C50841w83() {
    }

    @Override // p000.DA3
    /* renamed from: a */
    public boolean mo7361a() {
        return false;
    }

    @Override // p000.DA3
    /* renamed from: b */
    public InterfaceC41563gV2 mo7360b() {
        return InterfaceC41563gV2.f82354b0;
    }

    @Override // p000.DA3
    /* renamed from: c */
    public long mo7359c(long j, int i, Function1<? super C32120Ce3, C32120Ce3> performScroll) {
        Intrinsics.checkNotNullParameter(performScroll, "performScroll");
        return performScroll.invoke(C32120Ce3.m111955d(j)).m111935x();
    }

    @Override // p000.DA3
    /* renamed from: d */
    public Object mo7358d(long j, Function2<? super C48275ro6, ? super Continuation<? super C48275ro6>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object invoke = function2.invoke(C48275ro6.m15363b(j), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
    }
}

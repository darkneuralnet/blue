package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"LEu1;", "", C17296a.f69688o, "(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "LZC0;", Action.SCOPE_ATTRIBUTE, "Lzh2;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(LEu1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LGu1;", "flow", "c", "(LGu1;LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: Yu1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C37410Yu1 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m28418f = "Collect.kt", m28417i = {}, m28416l = {50}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Yu1$a */
    /* loaded from: classes8.dex */
    public static final class C10075a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f47612h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC32730Eu1<T> f47613i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10075a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super C10075a> continuation) {
            super(2, continuation);
            this.f47613i = interfaceC32730Eu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10075a(this.f47613i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C10075a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f47612h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f47613i;
                this.f47612h = 1;
                if (C36708Vu1.m79262i(interfaceC32730Eu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final Object m74023a(InterfaceC32730Eu1<?> interfaceC32730Eu1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = interfaceC32730Eu1.collect(K93.f19190b, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final <T> Object m74022b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        InterfaceC32730Eu1 m72328b;
        Object coroutine_suspended;
        m72328b = C37644Zu1.m72328b(C36708Vu1.m79278J(interfaceC32730Eu1, function2), 0, null, 2, null);
        Object m79262i = C36708Vu1.m79262i(m72328b, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m79262i == coroutine_suspended ? m79262i : Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final <T> Object m74021c(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        C36708Vu1.m79250u(interfaceC33198Gu1);
        Object collect = interfaceC32730Eu1.collect(interfaceC33198Gu1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (collect == coroutine_suspended) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public static final <T> InterfaceC52943zh2 m74020d(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, ZC0 zc0) {
        InterfaceC52943zh2 m73800d;
        m73800d = Z30.m73800d(zc0, null, null, new C10075a(interfaceC32730Eu1, null), 3, null);
        return m73800d;
    }
}

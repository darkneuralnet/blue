package p000;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016JD\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0002\b\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28432d2 = {"LSp5;", "Lx61;", "Lv61;", "", "pixels", "", C17296a.f69688o, "LOX2;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", DateTokenConverter.CONVERTER_KEY, "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "b", "LsP5;", "Ldq5;", "LsP5;", "getScrollLogic", "()LsP5;", "scrollLogic", "LWp5;", "LWp5;", "getLatestScrollScope", "()LWp5;", "e", "(LWp5;)V", "latestScrollScope", "<init>", "(LsP5;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,579:1\n1#2:580\n*E\n"})
/* renamed from: Sp5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35965Sp5 implements InterfaceC51412x61, InterfaceC50226v61 {

    /* renamed from: a */
    public final InterfaceC48627sP5<C39992dq5> f34292a;

    /* renamed from: b */
    public InterfaceC36901Wp5 f34293b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", m28418f = "Scrollable.kt", m28417i = {}, m28416l = {476}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Sp5$a */
    /* loaded from: classes.dex */
    public static final class C7548a extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f34294h;

        /* renamed from: i */
        public /* synthetic */ Object f34295i;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> f34297k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7548a(Function2<? super InterfaceC50226v61, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C7548a> continuation) {
            super(2, continuation);
            this.f34297k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C7548a c7548a = new C7548a(this.f34297k, continuation);
            c7548a.f34295i = obj;
            return c7548a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
            return ((C7548a) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f34294h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C35965Sp5.this.m84808e((InterfaceC36901Wp5) this.f34295i);
                Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> function2 = this.f34297k;
                C35965Sp5 c35965Sp5 = C35965Sp5.this;
                this.f34294h = 1;
                if (function2.invoke(c35965Sp5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C35965Sp5(InterfaceC48627sP5<C39992dq5> scrollLogic) {
        InterfaceC36901Wp5 interfaceC36901Wp5;
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.f34292a = scrollLogic;
        interfaceC36901Wp5 = C37603Zp5.f49320a;
        this.f34293b = interfaceC36901Wp5;
    }

    @Override // p000.InterfaceC50226v61
    /* renamed from: a */
    public void mo9194a(float f) {
        C39992dq5 value = this.f34292a.getValue();
        value.m43667a(this.f34293b, value.m43651q(f), H43.f12808a.m104444a());
    }

    @Override // p000.InterfaceC51412x61
    /* renamed from: b */
    public void mo5848b(float f) {
        C39992dq5 value = this.f34292a.getValue();
        value.m43660h(value.m43651q(f));
    }

    @Override // p000.InterfaceC51412x61
    /* renamed from: d */
    public Object mo5846d(OX2 ox2, Function2<? super InterfaceC50226v61, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo11047c = this.f34292a.getValue().m43663e().mo11047c(ox2, new C7548a(function2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo11047c == coroutine_suspended ? mo11047c : Unit.INSTANCE;
    }

    /* renamed from: e */
    public final void m84808e(InterfaceC36901Wp5 interfaceC36901Wp5) {
        Intrinsics.checkNotNullParameter(interfaceC36901Wp5, "<set-?>");
        this.f34293b = interfaceC36901Wp5;
    }
}

package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"Laq5;", "", "value", "Llf;", "animationSpec", C17296a.f69688o, "(Laq5;FLlf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Tp5 */
/* loaded from: classes.dex */
public final class C36199Tp5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m28418f = "ScrollExtensions.kt", m28417i = {0}, m28416l = {40}, m28415m = "animateScrollBy", m28414n = {"previousValue"}, m28413s = {"L$0"})
    /* renamed from: Tp5$a */
    /* loaded from: classes.dex */
    public static final class C7934a extends ContinuationImpl {

        /* renamed from: h */
        public Object f36112h;

        /* renamed from: i */
        public /* synthetic */ Object f36113i;

        /* renamed from: j */
        public int f36114j;

        public C7934a(Continuation<? super C7934a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36113i = obj;
            this.f36114j |= Integer.MIN_VALUE;
            return C36199Tp5.m82953a(null, 0.0f, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m28418f = "ScrollExtensions.kt", m28417i = {}, m28416l = {41}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Tp5$b */
    /* loaded from: classes.dex */
    public static final class C7935b extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f36115h;

        /* renamed from: i */
        public /* synthetic */ Object f36116i;

        /* renamed from: j */
        public final /* synthetic */ float f36117j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC25753lf<Float> f36118k;

        /* renamed from: l */
        public final /* synthetic */ Ref.FloatRef f36119l;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "currentValue", "<anonymous parameter 1>", "", C17296a.f69688o, "(FF)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Tp5$b$a */
        /* loaded from: classes.dex */
        public static final class C7936a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Ref.FloatRef f36120g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC36901Wp5 f36121h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7936a(Ref.FloatRef floatRef, InterfaceC36901Wp5 interfaceC36901Wp5) {
                super(2);
                this.f36120g = floatRef;
                this.f36121h = interfaceC36901Wp5;
            }

            /* renamed from: a */
            public final void m82950a(float f, float f2) {
                Ref.FloatRef floatRef = this.f36120g;
                float f3 = floatRef.element;
                floatRef.element = f3 + this.f36121h.mo43646a(f - f3);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                m82950a(f.floatValue(), f2.floatValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7935b(float f, InterfaceC25753lf<Float> interfaceC25753lf, Ref.FloatRef floatRef, Continuation<? super C7935b> continuation) {
            super(2, continuation);
            this.f36117j = f;
            this.f36118k = interfaceC25753lf;
            this.f36119l = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C7935b c7935b = new C7935b(this.f36117j, this.f36118k, this.f36119l, continuation);
            c7935b.f36116i = obj;
            return c7935b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
            return ((C7935b) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f36115h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                float f = this.f36117j;
                InterfaceC25753lf<Float> interfaceC25753lf = this.f36118k;
                C7936a c7936a = new C7936a(this.f36119l, (InterfaceC36901Wp5) this.f36116i);
                this.f36115h = 1;
                if (C49876uW5.m10137e(0.0f, f, 0.0f, interfaceC25753lf, c7936a, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m82953a(InterfaceC38196aq5 interfaceC38196aq5, float f, InterfaceC25753lf<Float> interfaceC25753lf, Continuation<? super Float> continuation) {
        C7934a c7934a;
        Object coroutine_suspended;
        int i;
        Ref.FloatRef floatRef;
        if (continuation instanceof C7934a) {
            c7934a = (C7934a) continuation;
            int i2 = c7934a.f36114j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7934a.f36114j = i2 - Integer.MIN_VALUE;
                C7934a c7934a2 = c7934a;
                Object obj = c7934a2.f36113i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c7934a2.f36114j;
                if (i == 0) {
                    if (i == 1) {
                        floatRef = (Ref.FloatRef) c7934a2.f36112h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    C7935b c7935b = new C7935b(f, interfaceC25753lf, floatRef2, null);
                    c7934a2.f36112h = floatRef2;
                    c7934a2.f36114j = 1;
                    if (InterfaceC38196aq5.m65390d(interfaceC38196aq5, null, c7935b, c7934a2, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                }
                return Boxing.boxFloat(floatRef.element);
            }
        }
        c7934a = new C7934a(continuation);
        C7934a c7934a22 = c7934a;
        Object obj2 = c7934a22.f36113i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c7934a22.f36114j;
        if (i == 0) {
        }
        return Boxing.boxFloat(floatRef.element);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m82952b(InterfaceC38196aq5 interfaceC38196aq5, float f, InterfaceC25753lf interfaceC25753lf, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC25753lf = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
        }
        return m82953a(interfaceC38196aq5, f, interfaceC25753lf, continuation);
    }
}

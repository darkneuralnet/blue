package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LiX0;", "Lcu1;", "LWp5;", "", "initialVelocity", C17296a.f69688o, "(LWp5;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LjV0;", "LjV0;", "flingDecay", "LPV2;", "b", "LPV2;", "motionDurationScale", "", "c", "I", "()I", DateTokenConverter.CONVERTER_KEY, "(I)V", "lastAnimationCycleCount", "<init>", "(LjV0;LPV2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42765iX0 implements InterfaceC39436cu1 {

    /* renamed from: a */
    public final InterfaceC43340jV0<Float> f87433a;

    /* renamed from: b */
    public final PV2 f87434b;

    /* renamed from: c */
    public int f87435c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m28418f = "Scrollable.kt", m28417i = {0}, m28416l = {545}, m28415m = "invokeSuspend", m28414n = {"velocityLeft"}, m28413s = {"L$0"})
    /* renamed from: iX0$a */
    /* loaded from: classes.dex */
    public static final class C23276a extends SuspendLambda implements Function2<ZC0, Continuation<? super Float>, Object> {

        /* renamed from: h */
        public Object f87436h;

        /* renamed from: i */
        public int f87437i;

        /* renamed from: j */
        public final /* synthetic */ float f87438j;

        /* renamed from: k */
        public final /* synthetic */ C42765iX0 f87439k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC36901Wp5 f87440l;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkf;", "", "Lsf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iX0$a$a */
        /* loaded from: classes.dex */
        public static final class C23277a extends Lambda implements Function1<C25201kf<Float, C28366sf>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Ref.FloatRef f87441g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC36901Wp5 f87442h;

            /* renamed from: i */
            public final /* synthetic */ Ref.FloatRef f87443i;

            /* renamed from: j */
            public final /* synthetic */ C42765iX0 f87444j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23277a(Ref.FloatRef floatRef, InterfaceC36901Wp5 interfaceC36901Wp5, Ref.FloatRef floatRef2, C42765iX0 c42765iX0) {
                super(1);
                this.f87441g = floatRef;
                this.f87442h = interfaceC36901Wp5;
                this.f87443i = floatRef2;
                this.f87444j = c42765iX0;
            }

            /* renamed from: a */
            public final void m33845a(C25201kf<Float, C28366sf> animateDecay) {
                Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                float floatValue = animateDecay.m28697e().floatValue() - this.f87441g.element;
                float mo43646a = this.f87442h.mo43646a(floatValue);
                this.f87441g.element = animateDecay.m28697e().floatValue();
                this.f87443i.element = animateDecay.m28696f().floatValue();
                if (Math.abs(floatValue - mo43646a) > 0.5f) {
                    animateDecay.m28701a();
                }
                C42765iX0 c42765iX0 = this.f87444j;
                c42765iX0.m33846d(c42765iX0.m33847c() + 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C25201kf<Float, C28366sf> c25201kf) {
                m33845a(c25201kf);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23276a(float f, C42765iX0 c42765iX0, InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super C23276a> continuation) {
            super(2, continuation);
            this.f87438j = f;
            this.f87439k = c42765iX0;
            this.f87440l = interfaceC36901Wp5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23276a(this.f87438j, this.f87439k, this.f87440l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Float> continuation) {
            return ((C23276a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            float f;
            Ref.FloatRef floatRef;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f87437i;
            if (i != 0) {
                if (i == 1) {
                    floatRef = (Ref.FloatRef) this.f87436h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (Math.abs(this.f87438j) > 1.0f) {
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = this.f87438j;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    C26565nf m20698b = C27022of.m20698b(0.0f, this.f87438j, 0L, 0L, false, 28, null);
                    InterfaceC43340jV0 interfaceC43340jV0 = this.f87439k.f87433a;
                    C23277a c23277a = new C23277a(floatRef3, this.f87440l, floatRef2, this.f87439k);
                    this.f87436h = floatRef2;
                    this.f87437i = 1;
                    if (C49876uW5.m10134h(m20698b, interfaceC43340jV0, false, c23277a, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    f = this.f87438j;
                    return Boxing.boxFloat(f);
                }
            }
            f = floatRef.element;
            return Boxing.boxFloat(f);
        }
    }

    public C42765iX0(InterfaceC43340jV0<Float> flingDecay, PV2 motionDurationScale) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        Intrinsics.checkNotNullParameter(motionDurationScale, "motionDurationScale");
        this.f87433a = flingDecay;
        this.f87434b = motionDurationScale;
    }

    @Override // p000.InterfaceC39436cu1
    /* renamed from: a */
    public Object mo33849a(InterfaceC36901Wp5 interfaceC36901Wp5, float f, Continuation<? super Float> continuation) {
        this.f87435c = 0;
        return X30.m77504g(this.f87434b, new C23276a(f, this, interfaceC36901Wp5, null), continuation);
    }

    /* renamed from: c */
    public final int m33847c() {
        return this.f87435c;
    }

    /* renamed from: d */
    public final void m33846d(int i) {
        this.f87435c = i;
    }

    public /* synthetic */ C42765iX0(InterfaceC43340jV0 interfaceC43340jV0, PV2 pv2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC43340jV0, (i & 2) != 0 ? C37603Zp5.m72424f() : pv2);
    }
}

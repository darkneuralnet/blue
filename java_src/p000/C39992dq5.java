package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.http.StatusLine;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010(\u001a\u00020$\u0012\u0006\u0010,\u001a\u00020 \u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010<\u001a\u000209\u0012\b\u0010B\u001a\u0004\u0018\u00010=¢\u0006\u0004\bG\u0010HJ\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u0002*\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u0002*\u00020\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\n*\u00020\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0010\u001a\u00020\u0002*\u00020\u0002J\u0017\u0010\u0011\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0007J'\u0010\u0016\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0007J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\nH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0006\u0010!\u001a\u00020 J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020 R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010,\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b6\u00107R\u0017\u0010<\u001a\u0002098\u0006¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b/\u0010;R\u0019\u0010B\u001a\u0004\u0018\u00010=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020 0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010DR\u0014\u0010F\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010+\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, m28432d2 = {"Ldq5;", "", "", "LCe3;", "q", "(F)J", "m", "(J)J", "p", "(J)F", "Lro6;", "o", "n", "newValue", "r", "(JF)J", "j", "k", "LWp5;", "availableDelta", "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "(LWp5;JI)J", "scroll", "h", "initialVelocity", "", "g", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "available", "b", "", "l", "isFlinging", "i", "LEy3;", "LEy3;", "getOrientation", "()LEy3;", "orientation", "Z", "getReverseDirection", "()Z", "reverseDirection", "LsP5;", "LC43;", "c", "LsP5;", DateTokenConverter.CONVERTER_KEY, "()LsP5;", "nestedScrollDispatcher", "Laq5;", "Laq5;", "e", "()Laq5;", "scrollableState", "Lcu1;", "Lcu1;", "()Lcu1;", "flingBehavior", "LDA3;", "f", "LDA3;", "getOverscrollEffect", "()LDA3;", "overscrollEffect", "LEX2;", "LEX2;", "isNestedFlinging", "shouldDispatchOverscroll", "<init>", "(LEy3;ZLsP5;Laq5;Lcu1;LDA3;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dq5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39992dq5 {

    /* renamed from: a */
    public final EnumC32768Ey3 f77270a;

    /* renamed from: b */
    public final boolean f77271b;

    /* renamed from: c */
    public final InterfaceC48627sP5<C43> f77272c;

    /* renamed from: d */
    public final InterfaceC38196aq5 f77273d;

    /* renamed from: e */
    public final InterfaceC39436cu1 f77274e;

    /* renamed from: f */
    public final DA3 f77275f;

    /* renamed from: g */
    public final EX2<Boolean> f77276g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LCe3;", "delta", C17296a.f69688o, "(J)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dq5$a */
    /* loaded from: classes.dex */
    public static final class C19866a extends Lambda implements Function1<C32120Ce3, C32120Ce3> {

        /* renamed from: h */
        public final /* synthetic */ int f77278h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC36901Wp5 f77279i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19866a(int i, InterfaceC36901Wp5 interfaceC36901Wp5) {
            super(1);
            this.f77278h = i;
            this.f77279i = interfaceC36901Wp5;
        }

        /* renamed from: a */
        public final long m43649a(long j) {
            C43 value = C39992dq5.this.m43664d().getValue();
            long m112917d = value.m112917d(j, this.f77278h);
            long m111940s = C32120Ce3.m111940s(j, m112917d);
            C39992dq5 c39992dq5 = C39992dq5.this;
            long m43657k = c39992dq5.m43657k(c39992dq5.m43651q(this.f77279i.mo43646a(c39992dq5.m43652p(c39992dq5.m43657k(m111940s)))));
            return C32120Ce3.m111939t(C32120Ce3.m111939t(m112917d, m43657k), value.m112919b(m43657k, C32120Ce3.m111940s(m111940s, m43657k), this.f77278h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C32120Ce3 invoke(C32120Ce3 c32120Ce3) {
            return C32120Ce3.m111955d(m43649a(c32120Ce3.m111935x()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollingLogic", m28418f = "Scrollable.kt", m28417i = {0}, m28416l = {430}, m28415m = "doFlingAnimation-QWom1Mo", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"L$0"})
    /* renamed from: dq5$b */
    /* loaded from: classes.dex */
    public static final class C19867b extends ContinuationImpl {

        /* renamed from: h */
        public Object f77280h;

        /* renamed from: i */
        public /* synthetic */ Object f77281i;

        /* renamed from: k */
        public int f77283k;

        public C19867b(Continuation<? super C19867b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f77281i = obj;
            this.f77283k |= Integer.MIN_VALUE;
            return C39992dq5.this.m43666b(0L, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m28418f = "Scrollable.kt", m28417i = {}, m28416l = {442}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: dq5$c */
    /* loaded from: classes.dex */
    public static final class C19868c extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f77284h;

        /* renamed from: i */
        public Object f77285i;

        /* renamed from: j */
        public long f77286j;

        /* renamed from: k */
        public int f77287k;

        /* renamed from: l */
        public /* synthetic */ Object f77288l;

        /* renamed from: n */
        public final /* synthetic */ Ref.LongRef f77290n;

        /* renamed from: o */
        public final /* synthetic */ long f77291o;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LCe3;", "delta", C17296a.f69688o, "(J)J"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: dq5$c$a */
        /* loaded from: classes.dex */
        public static final class C19869a extends Lambda implements Function1<C32120Ce3, C32120Ce3> {

            /* renamed from: g */
            public final /* synthetic */ C39992dq5 f77292g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC36901Wp5 f77293h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19869a(C39992dq5 c39992dq5, InterfaceC36901Wp5 interfaceC36901Wp5) {
                super(1);
                this.f77292g = c39992dq5;
                this.f77293h = interfaceC36901Wp5;
            }

            /* renamed from: a */
            public final long m43647a(long j) {
                C39992dq5 c39992dq5 = this.f77292g;
                return c39992dq5.m43657k(c39992dq5.m43667a(this.f77293h, c39992dq5.m43657k(j), H43.f12808a.m104443b()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C32120Ce3 invoke(C32120Ce3 c32120Ce3) {
                return C32120Ce3.m111955d(m43647a(c32120Ce3.m111935x()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"dq5$c$b", "LWp5;", "", "pixels", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: dq5$c$b */
        /* loaded from: classes.dex */
        public static final class C19870b implements InterfaceC36901Wp5 {

            /* renamed from: a */
            public final /* synthetic */ C39992dq5 f77294a;

            /* renamed from: b */
            public final /* synthetic */ Function1<C32120Ce3, C32120Ce3> f77295b;

            /* JADX WARN: Multi-variable type inference failed */
            public C19870b(C39992dq5 c39992dq5, Function1<? super C32120Ce3, C32120Ce3> function1) {
                this.f77294a = c39992dq5;
                this.f77295b = function1;
            }

            @Override // p000.InterfaceC36901Wp5
            /* renamed from: a */
            public float mo43646a(float f) {
                C39992dq5 c39992dq5 = this.f77294a;
                return c39992dq5.m43652p(this.f77295b.invoke(C32120Ce3.m111955d(c39992dq5.m43651q(f))).m111935x());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19868c(Ref.LongRef longRef, long j, Continuation<? super C19868c> continuation) {
            super(2, continuation);
            this.f77290n = longRef;
            this.f77291o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C19868c c19868c = new C19868c(this.f77290n, this.f77291o, continuation);
            c19868c.f77288l = obj;
            return c19868c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
            return ((C19868c) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C39992dq5 c39992dq5;
            Ref.LongRef longRef;
            C39992dq5 c39992dq52;
            long j;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f77287k;
            if (i != 0) {
                if (i == 1) {
                    j = this.f77286j;
                    longRef = (Ref.LongRef) this.f77285i;
                    c39992dq5 = (C39992dq5) this.f77284h;
                    c39992dq52 = (C39992dq5) this.f77288l;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C19870b c19870b = new C19870b(C39992dq5.this, new C19869a(C39992dq5.this, (InterfaceC36901Wp5) this.f77288l));
                c39992dq5 = C39992dq5.this;
                Ref.LongRef longRef2 = this.f77290n;
                long j2 = this.f77291o;
                InterfaceC39436cu1 m43665c = c39992dq5.m43665c();
                long j3 = longRef2.element;
                float m43658j = c39992dq5.m43658j(c39992dq5.m43653o(j2));
                this.f77288l = c39992dq5;
                this.f77284h = c39992dq5;
                this.f77285i = longRef2;
                this.f77286j = j3;
                this.f77287k = 1;
                obj = m43665c.mo33849a(c19870b, m43658j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                longRef = longRef2;
                c39992dq52 = c39992dq5;
                j = j3;
            }
            longRef.element = c39992dq5.m43650r(j, c39992dq52.m43658j(((Number) obj).floatValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollingLogic", m28418f = "Scrollable.kt", m28417i = {0, 1}, m28416l = {419, StatusLine.HTTP_MISDIRECTED_REQUEST}, m28415m = "onDragStopped-sF-c-tU", m28414n = {"this", "this"}, m28413s = {"L$0", "L$0"})
    /* renamed from: dq5$d */
    /* loaded from: classes.dex */
    public static final class C19871d extends ContinuationImpl {

        /* renamed from: h */
        public Object f77296h;

        /* renamed from: i */
        public /* synthetic */ Object f77297i;

        /* renamed from: k */
        public int f77299k;

        public C19871d(Continuation<? super C19871d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f77297i = obj;
            this.f77299k |= Integer.MIN_VALUE;
            return C39992dq5.this.m43661g(0L, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lro6;", "velocity", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m28418f = "Scrollable.kt", m28417i = {0, 1, 1, 2, 2}, m28416l = {406, 408, 410}, m28415m = "invokeSuspend", m28414n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, m28413s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    /* renamed from: dq5$e */
    /* loaded from: classes.dex */
    public static final class C19872e extends SuspendLambda implements Function2<C48275ro6, Continuation<? super C48275ro6>, Object> {

        /* renamed from: h */
        public long f77300h;

        /* renamed from: i */
        public int f77301i;

        /* renamed from: j */
        public /* synthetic */ long f77302j;

        public C19872e(Continuation<? super C19872e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C19872e c19872e = new C19872e(continuation);
            c19872e.f77302j = ((C48275ro6) obj).m15350o();
            return c19872e;
        }

        /* renamed from: e */
        public final Object m43645e(long j, Continuation<? super C48275ro6> continuation) {
            return ((C19872e) create(C48275ro6.m15363b(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(C48275ro6 c48275ro6, Continuation<? super C48275ro6> continuation) {
            return m43645e(c48275ro6.m15350o(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object m112918c;
            long j;
            Object m43666b;
            long j2;
            long j3;
            long m15350o;
            Object m112920a;
            long j4;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f77301i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            long j5 = this.f77300h;
                            j4 = this.f77302j;
                            ResultKt.throwOnFailure(obj);
                            m15350o = j5;
                            m112920a = obj;
                            return C48275ro6.m15363b(C48275ro6.m15354k(j4, C48275ro6.m15354k(m15350o, ((C48275ro6) m112920a).m15350o())));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.f77300h;
                    long j6 = this.f77302j;
                    ResultKt.throwOnFailure(obj);
                    m43666b = obj;
                    j3 = j6;
                    m15350o = ((C48275ro6) m43666b).m15350o();
                    long m15354k = C48275ro6.m15354k(j2, m15350o);
                    this.f77302j = j3;
                    this.f77300h = m15350o;
                    this.f77301i = 3;
                    m112920a = C39992dq5.this.m43664d().getValue().m112920a(m15354k, m15350o, this);
                    if (m112920a != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j4 = j3;
                    return C48275ro6.m15363b(C48275ro6.m15354k(j4, C48275ro6.m15354k(m15350o, ((C48275ro6) m112920a).m15350o())));
                }
                j = this.f77302j;
                ResultKt.throwOnFailure(obj);
                m112918c = obj;
            } else {
                ResultKt.throwOnFailure(obj);
                long j7 = this.f77302j;
                this.f77302j = j7;
                this.f77301i = 1;
                m112918c = C39992dq5.this.m43664d().getValue().m112918c(j7, this);
                if (m112918c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = j7;
            }
            long m15354k2 = C48275ro6.m15354k(j, ((C48275ro6) m112918c).m15350o());
            C39992dq5 c39992dq5 = C39992dq5.this;
            this.f77302j = j;
            this.f77300h = m15354k2;
            this.f77301i = 2;
            m43666b = c39992dq5.m43666b(m15354k2, this);
            if (m43666b == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = m15354k2;
            j3 = j;
            m15350o = ((C48275ro6) m43666b).m15350o();
            long m15354k3 = C48275ro6.m15354k(j2, m15350o);
            this.f77302j = j3;
            this.f77300h = m15350o;
            this.f77301i = 3;
            m112920a = C39992dq5.this.m43664d().getValue().m112920a(m15354k3, m15350o, this);
            if (m112920a != coroutine_suspended) {
            }
        }
    }

    public C39992dq5(EnumC32768Ey3 orientation, boolean z, InterfaceC48627sP5<C43> nestedScrollDispatcher, InterfaceC38196aq5 scrollableState, InterfaceC39436cu1 flingBehavior, DA3 da3) {
        EX2<Boolean> m97025e;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.f77270a = orientation;
        this.f77271b = z;
        this.f77272c = nestedScrollDispatcher;
        this.f77273d = scrollableState;
        this.f77274e = flingBehavior;
        this.f77275f = da3;
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f77276g = m97025e;
    }

    /* renamed from: a */
    public final long m43667a(InterfaceC36901Wp5 dispatchScroll, long j, int i) {
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        long m43655m = m43655m(j);
        C19866a c19866a = new C19866a(i, dispatchScroll);
        if (this.f77275f != null && m43662f()) {
            return this.f77275f.mo7359c(m43655m, i, c19866a);
        }
        return c19866a.invoke(C32120Ce3.m111955d(m43655m)).m111935x();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43666b(long j, Continuation<? super C48275ro6> continuation) {
        C19867b c19867b;
        Object coroutine_suspended;
        int i;
        Ref.LongRef longRef;
        if (continuation instanceof C19867b) {
            c19867b = (C19867b) continuation;
            int i2 = c19867b.f77283k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c19867b.f77283k = i2 - Integer.MIN_VALUE;
                C19867b c19867b2 = c19867b;
                Object obj = c19867b2.f77281i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c19867b2.f77283k;
                if (i == 0) {
                    if (i == 1) {
                        longRef = (Ref.LongRef) c19867b2.f77280h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = j;
                    InterfaceC38196aq5 interfaceC38196aq5 = this.f77273d;
                    C19868c c19868c = new C19868c(longRef2, j, null);
                    c19867b2.f77280h = longRef2;
                    c19867b2.f77283k = 1;
                    if (InterfaceC38196aq5.m65390d(interfaceC38196aq5, null, c19868c, c19867b2, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                }
                return C48275ro6.m15363b(longRef.element);
            }
        }
        c19867b = new C19867b(continuation);
        C19867b c19867b22 = c19867b;
        Object obj2 = c19867b22.f77281i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c19867b22.f77283k;
        if (i == 0) {
        }
        return C48275ro6.m15363b(longRef.element);
    }

    /* renamed from: c */
    public final InterfaceC39436cu1 m43665c() {
        return this.f77274e;
    }

    /* renamed from: d */
    public final InterfaceC48627sP5<C43> m43664d() {
        return this.f77272c;
    }

    /* renamed from: e */
    public final InterfaceC38196aq5 m43663e() {
        return this.f77273d;
    }

    /* renamed from: f */
    public final boolean m43662f() {
        return this.f77273d.mo11049a() || this.f77273d.mo11045f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43661g(long j, Continuation<? super Unit> continuation) {
        C19871d c19871d;
        Object coroutine_suspended;
        int i;
        C39992dq5 c39992dq5;
        if (continuation instanceof C19871d) {
            c19871d = (C19871d) continuation;
            int i2 = c19871d.f77299k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c19871d.f77299k = i2 - Integer.MIN_VALUE;
                Object obj = c19871d.f77297i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c19871d.f77299k;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c39992dq5 = (C39992dq5) c19871d.f77296h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    m43659i(true);
                    long m43654n = m43654n(j);
                    C19872e c19872e = new C19872e(null);
                    if (this.f77275f != null && m43662f()) {
                        DA3 da3 = this.f77275f;
                        c19871d.f77296h = this;
                        c19871d.f77299k = 1;
                        if (da3.mo7358d(m43654n, c19872e, c19871d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        C48275ro6 m15363b = C48275ro6.m15363b(m43654n);
                        c19871d.f77296h = this;
                        c19871d.f77299k = 2;
                        if (c19872e.invoke(m15363b, c19871d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    c39992dq5 = this;
                }
                c39992dq5.m43659i(false);
                return Unit.INSTANCE;
            }
        }
        c19871d = new C19871d(continuation);
        Object obj2 = c19871d.f77297i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c19871d.f77299k;
        if (i == 0) {
        }
        c39992dq5.m43659i(false);
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public final long m43660h(long j) {
        if (this.f77273d.mo11046e()) {
            return C32120Ce3.f4427b.m111932c();
        }
        return m43651q(m43658j(this.f77273d.mo11048b(m43658j(m43652p(j)))));
    }

    /* renamed from: i */
    public final void m43659i(boolean z) {
        this.f77276g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: j */
    public final float m43658j(float f) {
        return this.f77271b ? f * (-1) : f;
    }

    /* renamed from: k */
    public final long m43657k(long j) {
        return this.f77271b ? C32120Ce3.m111938u(j, -1.0f) : j;
    }

    /* renamed from: l */
    public final boolean m43656l() {
        boolean z;
        if (!this.f77273d.mo11046e() && !this.f77276g.getValue().booleanValue()) {
            DA3 da3 = this.f77275f;
            if (da3 != null) {
                z = da3.mo7361a();
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final long m43655m(long j) {
        return this.f77270a == EnumC32768Ey3.Horizontal ? C32120Ce3.m111950i(j, 0.0f, 0.0f, 1, null) : C32120Ce3.m111950i(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: n */
    public final long m43654n(long j) {
        return this.f77270a == EnumC32768Ey3.Horizontal ? C48275ro6.m15360e(j, 0.0f, 0.0f, 1, null) : C48275ro6.m15360e(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: o */
    public final float m43653o(long j) {
        return this.f77270a == EnumC32768Ey3.Horizontal ? C48275ro6.m15357h(j) : C48275ro6.m15356i(j);
    }

    /* renamed from: p */
    public final float m43652p(long j) {
        return this.f77270a == EnumC32768Ey3.Horizontal ? C32120Ce3.m111944o(j) : C32120Ce3.m111943p(j);
    }

    /* renamed from: q */
    public final long m43651q(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C32120Ce3.f4427b.m111932c();
        }
        if (this.f77270a == EnumC32768Ey3.Horizontal) {
            return C33056Ge3.m104938a(f, 0.0f);
        }
        return C33056Ge3.m104938a(0.0f, f);
    }

    /* renamed from: r */
    public final long m43650r(long j, float f) {
        return this.f77270a == EnumC32768Ey3.Horizontal ? C48275ro6.m15360e(j, f, 0.0f, 2, null) : C48275ro6.m15360e(j, 0.0f, f, 1, null);
    }
}

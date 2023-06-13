package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b \u0010!JO\u0010\u000b\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0086@ø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LFe6;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "valueDelta", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "h", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", C17296a.f69688o, "J", "lastFrameTime", "Lsf;", "b", "Lsf;", "lastVelocity", "", "c", "Z", "isRunning", DateTokenConverter.CONVERTER_KEY, "F", "i", "()F", "j", "(F)V", "value", "<init>", "()V", "e", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fe6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32825Fe6 {

    /* renamed from: e */
    public static final C2391a f9898e = new C2391a(null);
    @Deprecated

    /* renamed from: f */
    public static final C28366sf f9899f = new C28366sf(0.0f);
    @Deprecated

    /* renamed from: g */
    public static final C50605vk6<C28366sf> f9900g = C26160mf.m25221i(0.0f, 0.0f, null, 7, null).mo12016a(C37082Xj6.m76516i(FloatCompanionObject.INSTANCE));

    /* renamed from: a */
    public long f9901a = Long.MIN_VALUE;

    /* renamed from: b */
    public C28366sf f9902b = f9899f;

    /* renamed from: c */
    public boolean f9903c;

    /* renamed from: d */
    public float f9904d;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LFe6$a;", "", "", "", "c", "Lsf;", "ZeroVector", "Lsf;", "b", "()Lsf;", "Lvk6;", "RebasableAnimationSpec", "Lvk6;", C17296a.f69688o, "()Lvk6;", "VisibilityThreshold", "F", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fe6$a */
    /* loaded from: classes.dex */
    public static final class C2391a {
        public /* synthetic */ C2391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50605vk6<C28366sf> m106778a() {
            return C32825Fe6.f9900g;
        }

        /* renamed from: b */
        public final C28366sf m106777b() {
            return C32825Fe6.f9899f;
        }

        /* renamed from: c */
        public final boolean m106776c(float f) {
            return Math.abs(f) < 0.01f;
        }

        private C2391a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m28418f = "UpdatableAnimationState.kt", m28417i = {0, 0, 0, 0, 1, 1}, m28416l = {100, 146}, m28415m = "animateToZero", m28414n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, m28413s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    /* renamed from: Fe6$b */
    /* loaded from: classes.dex */
    public static final class C2392b extends ContinuationImpl {

        /* renamed from: h */
        public Object f9905h;

        /* renamed from: i */
        public Object f9906i;

        /* renamed from: j */
        public Object f9907j;

        /* renamed from: k */
        public float f9908k;

        /* renamed from: l */
        public /* synthetic */ Object f9909l;

        /* renamed from: n */
        public int f9911n;

        public C2392b(Continuation<? super C2392b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9909l = obj;
            this.f9911n |= Integer.MIN_VALUE;
            return C32825Fe6.this.m106781h(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "frameTime", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe6$c */
    /* loaded from: classes.dex */
    public static final class C2393c extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ float f9913h;

        /* renamed from: i */
        public final /* synthetic */ Function1<Float, Unit> f9914i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2393c(float f, Function1<? super Float, Unit> function1) {
            super(1);
            this.f9913h = f;
            this.f9914i = function1;
        }

        /* renamed from: a */
        public final void m106775a(long j) {
            boolean z;
            long roundToLong;
            if (C32825Fe6.this.f9901a == Long.MIN_VALUE) {
                C32825Fe6.this.f9901a = j;
            }
            C28366sf c28366sf = new C28366sf(C32825Fe6.this.m106780i());
            if (this.f9913h == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                roundToLong = MathKt__MathJVMKt.roundToLong(((float) (j - C32825Fe6.this.f9901a)) / this.f9913h);
            } else {
                roundToLong = C32825Fe6.f9898e.m106778a().mo8207b(new C28366sf(C32825Fe6.this.m106780i()), C32825Fe6.f9898e.m106777b(), C32825Fe6.this.f9902b);
            }
            long j2 = roundToLong;
            float m13901f = C32825Fe6.f9898e.m106778a().mo6413e(j2, c28366sf, C32825Fe6.f9898e.m106777b(), C32825Fe6.this.f9902b).m13901f();
            C32825Fe6.this.f9902b = C32825Fe6.f9898e.m106778a().mo6414d(j2, c28366sf, C32825Fe6.f9898e.m106777b(), C32825Fe6.this.f9902b);
            C32825Fe6.this.f9901a = j;
            C32825Fe6.this.m106779j(m13901f);
            this.f9914i.invoke(Float.valueOf(C32825Fe6.this.m106780i() - m13901f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m106775a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe6$d */
    /* loaded from: classes.dex */
    public static final class C2394d extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function1<Float, Unit> f9916h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2394d(Function1<? super Float, Unit> function1) {
            super(1);
            this.f9916h = function1;
        }

        /* renamed from: a */
        public final void m106774a(long j) {
            float m106780i = C32825Fe6.this.m106780i();
            C32825Fe6.this.m106779j(0.0f);
            this.f9916h.invoke(Float.valueOf(m106780i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m106774a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r9 == false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a2 -> B:60:0x00a5). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m106781h(Function1<? super Float, Unit> function1, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        C2392b c2392b;
        Object coroutine_suspended;
        int i;
        float f;
        Object obj;
        C2392b c2392b2;
        Function0 function02;
        Function1<? super Float, Unit> function12;
        float f2;
        C32825Fe6 c32825Fe6;
        Function0 function03;
        boolean z;
        try {
            if (continuation instanceof C2392b) {
                c2392b = (C2392b) continuation;
                int i2 = c2392b.f9911n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2392b.f9911n = i2 - Integer.MIN_VALUE;
                    Object obj2 = c2392b.f9909l;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2392b.f9911n;
                    boolean z2 = true;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                function03 = (Function0) c2392b.f9906i;
                                C32825Fe6 c32825Fe62 = (C32825Fe6) c2392b.f9905h;
                                ResultKt.throwOnFailure(obj2);
                                function0 = c32825Fe62;
                                function03.invoke();
                                function0.f9901a = Long.MIN_VALUE;
                                function0.f9902b = f9899f;
                                function0.f9903c = false;
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f2 = c2392b.f9908k;
                        Function0 function04 = (Function0) c2392b.f9907j;
                        Function1<? super Float, Unit> function13 = (Function1) c2392b.f9906i;
                        C32825Fe6 c32825Fe63 = (C32825Fe6) c2392b.f9905h;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            c32825Fe6 = c32825Fe63;
                            C2392b c2392b3 = c2392b;
                            function02 = function04;
                            function12 = function13;
                            obj = coroutine_suspended;
                            c2392b2 = c2392b3;
                            try {
                                function02.invoke();
                                if (f2 != 0.0f) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } catch (Throwable th) {
                                th = th;
                                function0 = c32825Fe6;
                                function0.f9901a = Long.MIN_VALUE;
                                function0.f9902b = f9899f;
                                function0.f9903c = false;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            function0 = c32825Fe63;
                            function0.f9901a = Long.MIN_VALUE;
                            function0.f9902b = f9899f;
                            function0.f9903c = false;
                            throw th;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj2);
                        if (!this.f9903c) {
                            PV2 pv2 = (PV2) c2392b.getContext().get(PV2.f28583d0);
                            if (pv2 != null) {
                                f = pv2.mo40807I();
                            } else {
                                f = 1.0f;
                            }
                            this.f9903c = true;
                            obj = coroutine_suspended;
                            c2392b2 = c2392b;
                            function02 = function0;
                            function12 = function1;
                            f2 = f;
                            c32825Fe6 = this;
                            if (!f9898e.m106776c(c32825Fe6.f9904d)) {
                                C2393c c2393c = new C2393c(f2, function12);
                                c2392b2.f9905h = c32825Fe6;
                                c2392b2.f9906i = function12;
                                c2392b2.f9907j = function02;
                                c2392b2.f9908k = f2;
                                c2392b2.f9911n = 1;
                                if (JV2.m100318b(c2393c, c2392b2) == obj) {
                                    return obj;
                                }
                                function02.invoke();
                                if (f2 != 0.0f) {
                                }
                            }
                            function03 = function02;
                            C32825Fe6 c32825Fe64 = c32825Fe6;
                            Function1<? super Float, Unit> function14 = function12;
                            function0 = c32825Fe64;
                            if (Math.abs(function0.f9904d) != 0.0f) {
                                z2 = false;
                            }
                            if (!z2) {
                                C2394d c2394d = new C2394d(function14);
                                c2392b2.f9905h = function0;
                                c2392b2.f9906i = function03;
                                c2392b2.f9907j = null;
                                c2392b2.f9911n = 2;
                                function0 = function0;
                                if (JV2.m100318b(c2394d, c2392b2) == obj) {
                                    return obj;
                                }
                                function03.invoke();
                            }
                            function0.f9901a = Long.MIN_VALUE;
                            function0.f9902b = f9899f;
                            function0.f9903c = false;
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c2392b = new C2392b(continuation);
        Object obj22 = c2392b.f9909l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2392b.f9911n;
        boolean z22 = true;
    }

    /* renamed from: i */
    public final float m106780i() {
        return this.f9904d;
    }

    /* renamed from: j */
    public final void m106779j(float f) {
        this.f9904d = f;
    }
}

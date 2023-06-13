package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\fB?\b\u0007\u0012\u0006\u0010,\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150-¢\u0006\u0004\b/\u00100J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J%\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0014\u0010&\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0014\u0010)\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m28432d2 = {"LGU2;", "", "", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "c", "i", "LHU2;", "target", "", "velocity", C17296a.f69688o, "(LHU2;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(LHU2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llf;", "Llf;", "getAnimationSpec$material_release", "()Llf;", "animationSpec", "", "b", "Z", "k", "()Z", "isSkipHalfExpanded", "LtX5;", "LtX5;", "g", "()LtX5;", "swipeableState", DateTokenConverter.CONVERTER_KEY, "()LHU2;", "currentValue", "l", "isVisible", "e", "hasHalfExpandedState", "f", "()F", "lastVelocity", "j", "isAnimationRunning", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(LHU2;Llf;ZLkotlin/jvm/functions/Function1;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GU2 */
/* loaded from: classes.dex */
public final class GU2 {

    /* renamed from: d */
    public static final C2860a f11967d = new C2860a(null);

    /* renamed from: e */
    public static final int f11968e = 8;

    /* renamed from: a */
    public final InterfaceC25753lf<Float> f11969a;

    /* renamed from: b */
    public final boolean f11970b;

    /* renamed from: c */
    public final C49292tX5<HU2> f11971c;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u000f"}, m28432d2 = {"LGU2$a;", "", "Llf;", "", "animationSpec", "Lkotlin/Function1;", "LHU2;", "", "confirmValueChange", "skipHalfExpanded", "LRi5;", "LGU2;", C17296a.f69688o, "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: GU2$a */
    /* loaded from: classes.dex */
    public static final class C2860a {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LGU2;", "it", "LHU2;", C17296a.f69688o, "(LTi5;LGU2;)LHU2;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GU2$a$a */
        /* loaded from: classes.dex */
        public static final class C2861a extends Lambda implements Function2<InterfaceC36136Ti5, GU2, HU2> {

            /* renamed from: g */
            public static final C2861a f11972g = new C2861a();

            public C2861a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final HU2 invoke(InterfaceC36136Ti5 Saver, GU2 it) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m105066d();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHU2;", "it", "LGU2;", C17296a.f69688o, "(LHU2;)LGU2;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GU2$a$b */
        /* loaded from: classes.dex */
        public static final class C2862b extends Lambda implements Function1<HU2, GU2> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC25753lf<Float> f11973g;

            /* renamed from: h */
            public final /* synthetic */ Function1<HU2, Boolean> f11974h;

            /* renamed from: i */
            public final /* synthetic */ boolean f11975i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2862b(InterfaceC25753lf<Float> interfaceC25753lf, Function1<? super HU2, Boolean> function1, boolean z) {
                super(1);
                this.f11973g = interfaceC25753lf;
                this.f11974h = function1;
                this.f11975i = z;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final GU2 invoke(HU2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return FU2.m107110d(it, this.f11973g, this.f11974h, this.f11975i);
            }
        }

        public /* synthetic */ C2860a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC35668Ri5<GU2, ?> m105055a(InterfaceC25753lf<Float> animationSpec, Function1<? super HU2, Boolean> confirmValueChange, boolean z) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return C35902Si5.m85006a(C2861a.f11972g, new C2862b(animationSpec, confirmValueChange, z));
        }

        private C2860a() {
        }
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public GU2(HU2 initialValue, InterfaceC25753lf<Float> animationSpec, boolean z, Function1<? super HU2, Boolean> confirmStateChange) {
        Function2 function2;
        float f;
        boolean z2;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.f11969a = animationSpec;
        this.f11970b = z;
        function2 = FU2.f9418a;
        f = FU2.f9419b;
        this.f11971c = new C49292tX5<>(initialValue, animationSpec, confirmStateChange, function2, f, null);
        if (z) {
            if (initialValue != HU2.HalfExpanded) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m105068b(GU2 gu2, HU2 hu2, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = gu2.f11971c.m12120p();
        }
        return gu2.m105069a(hu2, f, continuation);
    }

    /* renamed from: a */
    public final Object m105069a(HU2 hu2, float f, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m12130f = this.f11971c.m12130f(hu2, f, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m12130f == coroutine_suspended ? m12130f : Unit.INSTANCE;
    }

    /* renamed from: c */
    public final Object m105067c(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        C49292tX5<HU2> c49292tX5 = this.f11971c;
        HU2 hu2 = HU2.Expanded;
        if (!c49292tX5.m12115u(hu2)) {
            return Unit.INSTANCE;
        }
        Object m105068b = m105068b(this, hu2, 0.0f, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m105068b == coroutine_suspended) {
            return m105068b;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final HU2 m105066d() {
        return this.f11971c.m12122n();
    }

    /* renamed from: e */
    public final boolean m105065e() {
        return this.f11971c.m12115u(HU2.HalfExpanded);
    }

    /* renamed from: f */
    public final float m105064f() {
        return this.f11971c.m12120p();
    }

    /* renamed from: g */
    public final C49292tX5<HU2> m105063g() {
        return this.f11971c;
    }

    /* renamed from: h */
    public final Object m105062h(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (!m105065e()) {
            return Unit.INSTANCE;
        }
        Object m105068b = m105068b(this, HU2.HalfExpanded, 0.0f, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m105068b == coroutine_suspended) {
            return m105068b;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public final Object m105061i(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m105068b = m105068b(this, HU2.Hidden, 0.0f, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m105068b == coroutine_suspended ? m105068b : Unit.INSTANCE;
    }

    /* renamed from: j */
    public final boolean m105060j() {
        return this.f11971c.m12114v();
    }

    /* renamed from: k */
    public final boolean m105059k() {
        return this.f11970b;
    }

    /* renamed from: l */
    public final boolean m105058l() {
        return this.f11971c.m12122n() != HU2.Hidden;
    }

    /* renamed from: m */
    public final Object m105057m(Continuation<? super Unit> continuation) {
        HU2 hu2;
        Object coroutine_suspended;
        if (m105065e()) {
            hu2 = HU2.HalfExpanded;
        } else {
            hu2 = HU2.Expanded;
        }
        Object m105068b = m105068b(this, hu2, 0.0f, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m105068b == coroutine_suspended) {
            return m105068b;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public final Object m105056n(HU2 hu2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m12137F = this.f11971c.m12137F(hu2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m12137F == coroutine_suspended ? m12137F : Unit.INSTANCE;
    }
}

package p000;

import androidx.compose.p003ui.draw.C11289a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C48841sm0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0000\"\u001d\u0010\u0010\u001a\u00020\f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0012\u001a\u00020\f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0011\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LCe3;", "handlePosition", "LgV2;", "modifier", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(JLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V", "b", "(LgV2;LEt0;I)V", "c", "Lk61;", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "getCursorHandleWidth", "CursorHandleWidth", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,82:1\n154#2:83\n88#3:84\n71#3:85\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n35#1:83\n36#1:84\n36#1:85\n*E\n"})
/* renamed from: zc */
/* loaded from: classes.dex */
public final class C31051zc {

    /* renamed from: a */
    public static final float f121598a;

    /* renamed from: b */
    public static final float f121599b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zc$a */
    /* loaded from: classes.dex */
    public static final class C31052a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f121600g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f121601h;

        /* renamed from: i */
        public final /* synthetic */ int f121602i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31052a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC41563gV2 interfaceC41563gV2, int i) {
            super(2);
            this.f121600g = function2;
            this.f121601h = interfaceC41563gV2;
            this.f121602i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1458480226, i, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
            }
            if (this.f121600g == null) {
                interfaceC32720Et0.mo89638F(1275643833);
                C31051zc.m1041b(this.f121601h, interfaceC32720Et0, (this.f121602i >> 3) & 14);
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(1275643903);
                this.f121600g.invoke(interfaceC32720Et0, Integer.valueOf((this.f121602i >> 6) & 14));
                interfaceC32720Et0.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zc$b */
    /* loaded from: classes.dex */
    public static final class C31053b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f121603g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f121604h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f121605i;

        /* renamed from: j */
        public final /* synthetic */ int f121606j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31053b(long j, InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f121603g = j;
            this.f121604h = interfaceC41563gV2;
            this.f121605i = function2;
            this.f121606j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C31051zc.m1042a(this.f121603g, this.f121604h, this.f121605i, interfaceC32720Et0, C47127ps4.m18626a(this.f121606j | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zc$c */
    /* loaded from: classes.dex */
    public static final class C31054c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f121607g;

        /* renamed from: h */
        public final /* synthetic */ int f121608h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31054c(InterfaceC41563gV2 interfaceC41563gV2, int i) {
            super(2);
            this.f121607g = interfaceC41563gV2;
            this.f121608h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C31051zc.m1041b(this.f121607g, interfaceC32720Et0, C47127ps4.m18626a(this.f121608h | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n76#2:83\n36#3:84\n1114#4,6:85\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n64#1:83\n66#1:84\n66#1:85,6\n*E\n"})
    /* renamed from: zc$d */
    /* loaded from: classes.dex */
    public static final class C31055d extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public static final C31055d f121609g = new C31055d();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zc$d$a */
        /* loaded from: classes.dex */
        public static final class C31056a extends Lambda implements Function1<C40166e80, H61> {

            /* renamed from: g */
            public final /* synthetic */ long f121610g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,82:1\n261#2,11:83\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n*L\n73#1:83,11\n*E\n"})
            /* renamed from: zc$d$a$a */
            /* loaded from: classes.dex */
            public static final class C31057a extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

                /* renamed from: g */
                public final /* synthetic */ float f121611g;

                /* renamed from: h */
                public final /* synthetic */ MW1 f121612h;

                /* renamed from: i */
                public final /* synthetic */ C48841sm0 f121613i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C31057a(float f, MW1 mw1, C48841sm0 c48841sm0) {
                    super(1);
                    this.f121611g = f;
                    this.f121612h = mw1;
                    this.f121613i = c48841sm0;
                }

                /* renamed from: a */
                public final void m1037a(InterfaceC42558iA0 onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.mo34387n0();
                    float f = this.f121611g;
                    MW1 mw1 = this.f121612h;
                    C48841sm0 c48841sm0 = this.f121613i;
                    C61 mo20750d0 = onDrawWithContent.mo20750d0();
                    long mo20721h = mo20750d0.mo20721h();
                    mo20750d0.mo20724a().mo25245v();
                    L61 mo20722c = mo20750d0.mo20722c();
                    L61.m97775f(mo20722c, f, 0.0f, 2, null);
                    mo20722c.mo19024e(45.0f, C32120Ce3.f4427b.m111932c());
                    I61.m102949a0(onDrawWithContent, mw1, 0L, 0.0f, null, c48841sm0, 0, 46, null);
                    mo20750d0.mo20724a().mo25251p();
                    mo20750d0.mo20723b(mo20721h);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
                    m1037a(interfaceC42558iA0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31056a(long j) {
                super(1);
                this.f121610g = j;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final H61 invoke(C40166e80 drawWithCache) {
                Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                float m5730i = C51465xB5.m5730i(drawWithCache.m43232h()) / 2.0f;
                return drawWithCache.m43235d(new C31057a(m5730i, C5037Ld.m96546e(drawWithCache, m5730i), C48841sm0.C28383a.m13699b(C48841sm0.f109227b, this.f121610g, 0, 2, null)));
            }
        }

        public C31055d() {
            super(3);
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m1039a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-2126899193);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2126899193, i, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
            }
            long m114776b = ((B26) interfaceC32720Et0.mo89572c(C26.m112949b())).m114776b();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            C47063pm0 m18747i = C47063pm0.m18747i(m114776b);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(m18747i);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C31056a(m114776b);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 mo39266t0 = composed.mo39266t0(C11289a.m68866b(c20912a, (Function1) mo89635G));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m1039a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    static {
        float m29303g = C43705k61.m29303g(25);
        f121598a = m29303g;
        f121599b = C43705k61.m29303g(C43705k61.m29303g(m29303g * 2.0f) / 2.4142137f);
    }

    /* renamed from: a */
    public static final void m1042a(long j, InterfaceC41563gV2 modifier, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-5185995);
        if ((i & 14) == 0) {
            if (mo89518u.mo89524s(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(modifier)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-5185995, i2, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            C5037Ld.m96549b(j, LE1.TopMiddle, C43575jt0.m29791b(mo89518u, -1458480226, true, new C31052a(function2, modifier, i2)), mo89518u, (i2 & 14) | 432);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C31053b(j, modifier, function2, i));
        }
    }

    /* renamed from: b */
    public static final void m1041b(InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(694251107);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(modifier)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(694251107, i, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            DN5.m110552a(m1040c(BB5.m114245x(modifier, f121599b, f121598a)), mo89518u, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C31054c(modifier, i));
        }
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m1040c(InterfaceC41563gV2 interfaceC41563gV2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        return C32486Dt0.m109807b(interfaceC41563gV2, null, C31055d.f121609g, 1, null);
    }
}

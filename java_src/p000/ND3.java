package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aA\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\u001e\u0010\u0014\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a=\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"LgV2;", "Lk61;", "start", "top", "end", "bottom", "l", "(LgV2;FFFF)LgV2;", "horizontal", "vertical", "j", "(LgV2;FF)LgV2;", "all", "i", "(LgV2;F)LgV2;", "LPD3;", "paddingValues", "h", "Lpm2;", "layoutDirection", "g", "(LPD3;Lpm2;)F", "f", C17296a.f69688o, "(F)LPD3;", "b", "(FF)LPD3;", DateTokenConverter.CONVERTER_KEY, "(FFFF)LPD3;", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n135#2:437\n135#2:442\n135#2:445\n135#2:446\n135#2:447\n155#3:438\n155#3:439\n155#3:440\n155#3:441\n155#3:443\n155#3:444\n155#3:448\n155#3:449\n155#3:450\n155#3:451\n155#3:452\n155#3:453\n155#3:454\n155#3:455\n155#3:456\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n62#1:437\n95#1:442\n123#1:445\n146#1:446\n178#1:447\n51#1:438\n52#1:439\n53#1:440\n54#1:441\n86#1:443\n87#1:444\n167#1:448\n168#1:449\n169#1:450\n170#1:451\n286#1:452\n296#1:453\n297#1:454\n298#1:455\n299#1:456\n*E\n"})
/* renamed from: ND3 */
/* loaded from: classes.dex */
public final class ND3 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n147#2,3:171\n*E\n"})
    /* renamed from: ND3$a */
    /* loaded from: classes.dex */
    public static final class C5512a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ PD3 f24292g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5512a(PD3 pd3) {
            super(1);
            this.f24292g = pd3;
        }

        /* renamed from: a */
        public final void m94179a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("padding");
            s42.m86038a().m104824a("paddingValues", this.f24292g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m94179a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n124#2,3:171\n*E\n"})
    /* renamed from: ND3$b */
    /* loaded from: classes.dex */
    public static final class C5513b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f24293g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5513b(float f) {
            super(1);
            this.f24293g = f;
        }

        /* renamed from: a */
        public final void m94178a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("padding");
            s42.m86036c(C43705k61.m29306d(this.f24293g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m94178a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n96#2,4:171\n*E\n"})
    /* renamed from: ND3$c */
    /* loaded from: classes.dex */
    public static final class C5514c extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f24294g;

        /* renamed from: h */
        public final /* synthetic */ float f24295h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5514c(float f, float f2) {
            super(1);
            this.f24294g = f;
            this.f24295h = f2;
        }

        /* renamed from: a */
        public final void m94177a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("padding");
            s42.m86038a().m104824a("horizontal", C43705k61.m29306d(this.f24294g));
            s42.m86038a().m104824a("vertical", C43705k61.m29306d(this.f24295h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m94177a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n63#2,6:171\n*E\n"})
    /* renamed from: ND3$d */
    /* loaded from: classes.dex */
    public static final class C5515d extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f24296g;

        /* renamed from: h */
        public final /* synthetic */ float f24297h;

        /* renamed from: i */
        public final /* synthetic */ float f24298i;

        /* renamed from: j */
        public final /* synthetic */ float f24299j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5515d(float f, float f2, float f3, float f4) {
            super(1);
            this.f24296g = f;
            this.f24297h = f2;
            this.f24298i = f3;
            this.f24299j = f4;
        }

        /* renamed from: a */
        public final void m94176a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("padding");
            s42.m86038a().m104824a("start", C43705k61.m29306d(this.f24296g));
            s42.m86038a().m104824a("top", C43705k61.m29306d(this.f24297h));
            s42.m86038a().m104824a("end", C43705k61.m29306d(this.f24298i));
            s42.m86038a().m104824a("bottom", C43705k61.m29306d(this.f24299j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m94176a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final PD3 m94192a(float f) {
        return new QD3(f, f, f, f, null);
    }

    /* renamed from: b */
    public static final PD3 m94191b(float f, float f2) {
        return new QD3(f, f2, f, f2, null);
    }

    /* renamed from: c */
    public static /* synthetic */ PD3 m94190c(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.m29303g(0);
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.m29303g(0);
        }
        return m94191b(f, f2);
    }

    /* renamed from: d */
    public static final PD3 m94189d(float f, float f2, float f3, float f4) {
        return new QD3(f, f2, f3, f4, null);
    }

    /* renamed from: e */
    public static /* synthetic */ PD3 m94188e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.m29303g(0);
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.m29303g(0);
        }
        if ((i & 4) != 0) {
            f3 = C43705k61.m29303g(0);
        }
        if ((i & 8) != 0) {
            f4 = C43705k61.m29303g(0);
        }
        return m94189d(f, f2, f3, f4);
    }

    /* renamed from: f */
    public static final float m94187f(PD3 pd3, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(pd3, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == EnumC47065pm2.Ltr) {
            return pd3.mo88733c(layoutDirection);
        }
        return pd3.mo88734b(layoutDirection);
    }

    /* renamed from: g */
    public static final float m94186g(PD3 pd3, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(pd3, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == EnumC47065pm2.Ltr) {
            return pd3.mo88734b(layoutDirection);
        }
        return pd3.mo88733c(layoutDirection);
    }

    /* renamed from: h */
    public static final InterfaceC41563gV2 m94185h(InterfaceC41563gV2 interfaceC41563gV2, PD3 paddingValues) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if (K32.m99301c()) {
            m99303a = new C5512a(paddingValues);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new RD3(paddingValues, m99303a));
    }

    /* renamed from: i */
    public static final InterfaceC41563gV2 m94184i(InterfaceC41563gV2 padding, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        if (K32.m99301c()) {
            m99303a = new C5513b(f);
        } else {
            m99303a = K32.m99303a();
        }
        return padding.mo39266t0(new OD3(f, f, f, f, true, m99303a, null));
    }

    /* renamed from: j */
    public static final InterfaceC41563gV2 m94183j(InterfaceC41563gV2 padding, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        if (K32.m99301c()) {
            m99303a = new C5514c(f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return padding.mo39266t0(new OD3(f, f2, f, f2, true, m99303a, null));
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC41563gV2 m94182k(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.m29303g(0);
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.m29303g(0);
        }
        return m94183j(interfaceC41563gV2, f, f2);
    }

    /* renamed from: l */
    public static final InterfaceC41563gV2 m94181l(InterfaceC41563gV2 padding, float f, float f2, float f3, float f4) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        if (K32.m99301c()) {
            m99303a = new C5515d(f, f2, f3, f4);
        } else {
            m99303a = K32.m99303a();
        }
        return padding.mo39266t0(new OD3(f, f2, f3, f4, true, m99303a, null));
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC41563gV2 m94180m(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.m29303g(0);
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.m29303g(0);
        }
        if ((i & 4) != 0) {
            f3 = C43705k61.m29303g(0);
        }
        if ((i & 8) != 0) {
            f4 = C43705k61.m29303g(0);
        }
        return m94181l(interfaceC41563gV2, f, f2, f3, f4);
    }
}

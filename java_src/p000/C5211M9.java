package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C43705k61;
import p000.OU3;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"LgV2;", "LL9;", "alignmentLine", "Lk61;", "before", "after", "e", "(LgV2;LL9;FF)LgV2;", "top", "bottom", "g", "(LgV2;FF)LgV2;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "c", "(LzO2;LL9;FFLvO2;J)LyO2;", "", DateTokenConverter.CONVERTER_KEY, "(LL9;)Z", "horizontal", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,325:1\n135#2:326\n135#2:327\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:326\n121#1:327\n*E\n"})
/* renamed from: M9 */
/* loaded from: classes.dex */
public final class C5211M9 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M9$a */
    /* loaded from: classes.dex */
    public static final class C5212a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC4750L9 f22731g;

        /* renamed from: h */
        public final /* synthetic */ float f22732h;

        /* renamed from: i */
        public final /* synthetic */ int f22733i;

        /* renamed from: j */
        public final /* synthetic */ int f22734j;

        /* renamed from: k */
        public final /* synthetic */ int f22735k;

        /* renamed from: l */
        public final /* synthetic */ OU3 f22736l;

        /* renamed from: m */
        public final /* synthetic */ int f22737m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5212a(AbstractC4750L9 abstractC4750L9, float f, int i, int i2, int i3, OU3 ou3, int i4) {
            super(1);
            this.f22731g = abstractC4750L9;
            this.f22732h = f;
            this.f22733i = i;
            this.f22734j = i2;
            this.f22735k = i3;
            this.f22736l = ou3;
            this.f22737m = i4;
        }

        /* renamed from: a */
        public final void m95679a(OU3.AbstractC6015a layout) {
            int m92226i1;
            int i;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            int i2 = 0;
            if (C5211M9.m95683d(this.f22731g)) {
                i = 0;
            } else {
                if (!C43705k61.m29301i(this.f22732h, C43705k61.f93903c.m29295c())) {
                    m92226i1 = this.f22733i;
                } else {
                    m92226i1 = (this.f22734j - this.f22735k) - this.f22736l.m92226i1();
                }
                i = m92226i1;
            }
            if (C5211M9.m95683d(this.f22731g)) {
                if (!C43705k61.m29301i(this.f22732h, C43705k61.f93903c.m29295c())) {
                    i2 = this.f22733i;
                } else {
                    i2 = (this.f22737m - this.f22735k) - this.f22736l.m92229d1();
                }
            }
            OU3.AbstractC6015a.m92205r(layout, this.f22736l, i, i2, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m95679a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n76#2,5:171\n*E\n"})
    /* renamed from: M9$b */
    /* loaded from: classes.dex */
    public static final class C5213b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC4750L9 f22738g;

        /* renamed from: h */
        public final /* synthetic */ float f22739h;

        /* renamed from: i */
        public final /* synthetic */ float f22740i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5213b(AbstractC4750L9 abstractC4750L9, float f, float f2) {
            super(1);
            this.f22738g = abstractC4750L9;
            this.f22739h = f;
            this.f22740i = f2;
        }

        /* renamed from: a */
        public final void m95678a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("paddingFrom");
            s42.m86038a().m104824a("alignmentLine", this.f22738g);
            s42.m86038a().m104824a("before", C43705k61.m29306d(this.f22739h));
            s42.m86038a().m104824a("after", C43705k61.m29306d(this.f22740i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m95678a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: c */
    public static final InterfaceC52172yO2 m95684c(InterfaceC52765zO2 interfaceC52765zO2, AbstractC4750L9 abstractC4750L9, float f, float f2, InterfaceC50393vO2 interfaceC50393vO2, long j) {
        long m28072e;
        int m92226i1;
        int m28063n;
        int i;
        int coerceIn;
        int i2;
        int coerceIn2;
        int max;
        int m92229d1;
        if (m95683d(abstractC4750L9)) {
            m28072e = C44228kz0.m28072e(j, 0, 0, 0, 0, 11, null);
        } else {
            m28072e = C44228kz0.m28072e(j, 0, 0, 0, 0, 14, null);
        }
        OU3 mo8763P0 = interfaceC50393vO2.mo8763P0(m28072e);
        int mo35854v = mo8763P0.mo35854v(abstractC4750L9);
        if (mo35854v == Integer.MIN_VALUE) {
            mo35854v = 0;
        }
        if (m95683d(abstractC4750L9)) {
            m92226i1 = mo8763P0.m92229d1();
        } else {
            m92226i1 = mo8763P0.m92226i1();
        }
        if (m95683d(abstractC4750L9)) {
            m28063n = C44228kz0.m28064m(j);
        } else {
            m28063n = C44228kz0.m28063n(j);
        }
        C43705k61.C25105a c25105a = C43705k61.f93903c;
        if (!C43705k61.m29301i(f, c25105a.m29295c())) {
            i = interfaceC52765zO2.mo3416F0(f);
        } else {
            i = 0;
        }
        int i3 = m28063n - m92226i1;
        coerceIn = RangesKt___RangesKt.coerceIn(i - mo35854v, 0, i3);
        if (!C43705k61.m29301i(f2, c25105a.m29295c())) {
            i2 = interfaceC52765zO2.mo3416F0(f2);
        } else {
            i2 = 0;
        }
        coerceIn2 = RangesKt___RangesKt.coerceIn((i2 - m92226i1) + mo35854v, 0, i3 - coerceIn);
        if (m95683d(abstractC4750L9)) {
            max = mo8763P0.m92226i1();
        } else {
            max = Math.max(mo8763P0.m92226i1() + coerceIn + coerceIn2, C44228kz0.m28061p(j));
        }
        int i4 = max;
        if (m95683d(abstractC4750L9)) {
            m92229d1 = Math.max(mo8763P0.m92229d1() + coerceIn + coerceIn2, C44228kz0.m28062o(j));
        } else {
            m92229d1 = mo8763P0.m92229d1();
        }
        int i5 = m92229d1;
        return InterfaceC52765zO2.m1430Y(interfaceC52765zO2, i4, i5, null, new C5212a(abstractC4750L9, f, coerceIn, i4, coerceIn2, mo8763P0, i5), 4, null);
    }

    /* renamed from: d */
    public static final boolean m95683d(AbstractC4750L9 abstractC4750L9) {
        return abstractC4750L9 instanceof YM1;
    }

    /* renamed from: e */
    public static final InterfaceC41563gV2 m95682e(InterfaceC41563gV2 paddingFrom, AbstractC4750L9 alignmentLine, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (K32.m99301c()) {
            m99303a = new C5213b(alignmentLine, f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return paddingFrom.mo39266t0(new C5909O9(alignmentLine, f, f2, m99303a, null));
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC41563gV2 m95681f(InterfaceC41563gV2 interfaceC41563gV2, AbstractC4750L9 abstractC4750L9, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i & 4) != 0) {
            f2 = C43705k61.f93903c.m29295c();
        }
        return m95682e(interfaceC41563gV2, abstractC4750L9, f, f2);
    }

    /* renamed from: g */
    public static final InterfaceC41563gV2 m95680g(InterfaceC41563gV2 paddingFromBaseline, float f, float f2) {
        InterfaceC41563gV2 interfaceC41563gV2;
        InterfaceC41563gV2 interfaceC41563gV22;
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        C43705k61.C25105a c25105a = C43705k61.f93903c;
        if (!C43705k61.m29301i(f, c25105a.m29295c())) {
            interfaceC41563gV2 = m95681f(InterfaceC41563gV2.f82354b0, C5482N9.m94314a(), f, 0.0f, 4, null);
        } else {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        InterfaceC41563gV2 mo39266t0 = paddingFromBaseline.mo39266t0(interfaceC41563gV2);
        if (!C43705k61.m29301i(f2, c25105a.m29295c())) {
            interfaceC41563gV22 = m95681f(InterfaceC41563gV2.f82354b0, C5482N9.m94313b(), 0.0f, f2, 2, null);
        } else {
            interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
        }
        return mo39266t0.mo39266t0(interfaceC41563gV22);
    }
}

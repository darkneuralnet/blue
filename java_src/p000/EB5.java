package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C43705k61;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)ø\u0001\u0001¢\u0006\u0004\b+\u0010,J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016R\u001d\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001d\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001d\u0010\u001d\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010!\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R!\u0010%\u001a\u00020\u0006*\u00020\"8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006-"}, m28432d2 = {"LEB5;", "LBm2;", "LT42;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "i", DateTokenConverter.CONVERTER_KEY, "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "Lk61;", "F", "minWidth", "minHeight", "maxWidth", "maxHeight", "g", "Z", "enforceIncoming", "Lg01;", C17296a.f69688o, "(Lg01;)J", "targetConstraints", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n155#2:1025\n155#2:1026\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n*L\n714#1:1025\n719#1:1026\n*E\n"})
/* renamed from: EB5 */
/* loaded from: classes.dex */
public final class EB5 extends T42 implements InterfaceC31957Bm2 {

    /* renamed from: c */
    public final float f7083c;

    /* renamed from: d */
    public final float f7084d;

    /* renamed from: e */
    public final float f7085e;

    /* renamed from: f */
    public final float f7086f;

    /* renamed from: g */
    public final boolean f7087g;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EB5$a */
    /* loaded from: classes.dex */
    public static final class C1756a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f7088g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1756a(OU3 ou3) {
            super(1);
            this.f7088g = ou3;
        }

        /* renamed from: a */
        public final void m109308a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92205r(layout, this.f7088g, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m109308a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ EB5(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r5 != Integer.MAX_VALUE) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m109309a(InterfaceC41273g01 interfaceC41273g01) {
        int i;
        int i2;
        int i3;
        int coerceAtMost;
        int coerceAtLeast;
        int coerceAtMost2;
        Comparable coerceAtLeast2;
        Comparable coerceAtLeast3;
        float f = this.f7085e;
        C43705k61.C25105a c25105a = C43705k61.f93903c;
        int i4 = 0;
        if (!C43705k61.m29301i(f, c25105a.m29295c())) {
            coerceAtLeast3 = RangesKt___RangesKt.coerceAtLeast(C43705k61.m29306d(this.f7085e), C43705k61.m29306d(C43705k61.m29303g(0)));
            i = interfaceC41273g01.mo3416F0(((C43705k61) coerceAtLeast3).m29298l());
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!C43705k61.m29301i(this.f7086f, c25105a.m29295c())) {
            coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(C43705k61.m29306d(this.f7086f), C43705k61.m29306d(C43705k61.m29303g(0)));
            i2 = interfaceC41273g01.mo3416F0(((C43705k61) coerceAtLeast2).m29298l());
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (!C43705k61.m29301i(this.f7083c, c25105a.m29295c())) {
            coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(interfaceC41273g01.mo3416F0(this.f7083c), i);
            i3 = RangesKt___RangesKt.coerceAtLeast(coerceAtMost2, 0);
        }
        i3 = 0;
        if (!C43705k61.m29301i(this.f7084d, c25105a.m29295c())) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(interfaceC41273g01.mo3416F0(this.f7084d), i2);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(coerceAtMost, 0);
            if (coerceAtLeast != Integer.MAX_VALUE) {
                i4 = coerceAtLeast;
            }
        }
        return C46007nz0.m22043a(i3, i, i4, i2);
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: c */
    public int mo44975c(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m109309a = m109309a(z62);
        if (C44228kz0.m28065l(m109309a)) {
            return C44228kz0.m28063n(m109309a);
        }
        return C46007nz0.m22037g(m109309a, measurable.mo77399p0(i));
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: d */
    public int mo44974d(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m109309a = m109309a(z62);
        if (C44228kz0.m28066k(m109309a)) {
            return C44228kz0.m28064m(m109309a);
        }
        return C46007nz0.m22038f(m109309a, measurable.mo77402B(i));
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: e */
    public int mo44973e(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m109309a = m109309a(z62);
        if (C44228kz0.m28066k(m109309a)) {
            return C44228kz0.m28064m(m109309a);
        }
        return C46007nz0.m22038f(m109309a, measurable.mo77400g0(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EB5)) {
            return false;
        }
        EB5 eb5 = (EB5) obj;
        if (!C43705k61.m29301i(this.f7083c, eb5.f7083c) || !C43705k61.m29301i(this.f7084d, eb5.f7084d) || !C43705k61.m29301i(this.f7085e, eb5.f7085e) || !C43705k61.m29301i(this.f7086f, eb5.f7086f) || this.f7087g != eb5.f7087g) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        int coerceAtMost;
        int coerceAtLeast;
        int coerceAtMost2;
        int coerceAtLeast2;
        long m22043a;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m109309a = m109309a(measure);
        if (this.f7087g) {
            m22043a = C46007nz0.m22039e(j, m109309a);
        } else {
            float f = this.f7083c;
            C43705k61.C25105a c25105a = C43705k61.f93903c;
            if (C43705k61.m29301i(f, c25105a.m29295c())) {
                coerceAtMost = RangesKt___RangesKt.coerceAtMost(C44228kz0.m28061p(j), C44228kz0.m28063n(m109309a));
            } else {
                coerceAtMost = C44228kz0.m28061p(m109309a);
            }
            if (C43705k61.m29301i(this.f7085e, c25105a.m29295c())) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(C44228kz0.m28063n(j), C44228kz0.m28061p(m109309a));
            } else {
                coerceAtLeast = C44228kz0.m28063n(m109309a);
            }
            if (C43705k61.m29301i(this.f7084d, c25105a.m29295c())) {
                coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(C44228kz0.m28062o(j), C44228kz0.m28064m(m109309a));
            } else {
                coerceAtMost2 = C44228kz0.m28062o(m109309a);
            }
            if (C43705k61.m29301i(this.f7086f, c25105a.m29295c())) {
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(C44228kz0.m28064m(j), C44228kz0.m28062o(m109309a));
            } else {
                coerceAtLeast2 = C44228kz0.m28064m(m109309a);
            }
            m22043a = C46007nz0.m22043a(coerceAtMost, coerceAtLeast, coerceAtMost2, coerceAtLeast2);
        }
        OU3 mo8763P0 = measurable.mo8763P0(m22043a);
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C1756a(mo8763P0), 4, null);
    }

    public int hashCode() {
        return ((((((C43705k61.m29300j(this.f7083c) * 31) + C43705k61.m29300j(this.f7084d)) * 31) + C43705k61.m29300j(this.f7085e)) * 31) + C43705k61.m29300j(this.f7086f)) * 31;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: i */
    public int mo21011i(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m109309a = m109309a(z62);
        if (C44228kz0.m28065l(m109309a)) {
            return C44228kz0.m28063n(m109309a);
        }
        return C46007nz0.m22037g(m109309a, measurable.mo77398t0(i));
    }

    public /* synthetic */ EB5(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C43705k61.f93903c.m29295c() : f, (i & 2) != 0 ? C43705k61.f93903c.m29295c() : f2, (i & 4) != 0 ? C43705k61.f93903c.m29295c() : f3, (i & 8) != 0 ? C43705k61.f93903c.m29295c() : f4, z, function1, null);
    }

    public EB5(float f, float f2, float f3, float f4, boolean z, Function1<? super S42, Unit> function1) {
        super(function1);
        this.f7083c = f;
        this.f7084d = f2;
        this.f7085e = f3;
        this.f7086f = f4;
        this.f7087g = z;
    }
}

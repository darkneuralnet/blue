package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"LCl1;", "LBm2;", "LT42;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lm41;", "c", "Lm41;", "direction", "", DateTokenConverter.CONVERTER_KEY, "F", "fraction", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(Lm41;FLkotlin/jvm/functions/Function1;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32181Cl1 extends T42 implements InterfaceC31957Bm2 {

    /* renamed from: c */
    public final EnumC44871m41 f4628c;

    /* renamed from: d */
    public final float f4629d;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cl1$a */
    /* loaded from: classes.dex */
    public static final class C1169a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f4630g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1169a(OU3 ou3) {
            super(1);
            this.f4630g = ou3;
        }

        /* renamed from: a */
        public final void m111745a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92205r(layout, this.f4630g, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m111745a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32181Cl1(EnumC44871m41 direction, float f, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4628c = direction;
        this.f4629d = f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C32181Cl1) {
            C32181Cl1 c32181Cl1 = (C32181Cl1) obj;
            if (this.f4628c == c32181Cl1.f4628c) {
                return (this.f4629d > c32181Cl1.f4629d ? 1 : (this.f4629d == c32181Cl1.f4629d ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        int m28061p;
        int m28063n;
        int m28064m;
        int i;
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (C44228kz0.m28067j(j) && this.f4628c != EnumC44871m41.Vertical) {
            roundToInt2 = MathKt__MathJVMKt.roundToInt(C44228kz0.m28063n(j) * this.f4629d);
            m28061p = RangesKt___RangesKt.coerceIn(roundToInt2, C44228kz0.m28061p(j), C44228kz0.m28063n(j));
            m28063n = m28061p;
        } else {
            m28061p = C44228kz0.m28061p(j);
            m28063n = C44228kz0.m28063n(j);
        }
        if (C44228kz0.m28068i(j) && this.f4628c != EnumC44871m41.Horizontal) {
            roundToInt = MathKt__MathJVMKt.roundToInt(C44228kz0.m28064m(j) * this.f4629d);
            i = RangesKt___RangesKt.coerceIn(roundToInt, C44228kz0.m28062o(j), C44228kz0.m28064m(j));
            m28064m = i;
        } else {
            int m28062o = C44228kz0.m28062o(j);
            m28064m = C44228kz0.m28064m(j);
            i = m28062o;
        }
        OU3 mo8763P0 = measurable.mo8763P0(C46007nz0.m22043a(m28061p, m28063n, i, m28064m));
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C1169a(mo8763P0), 4, null);
    }

    public int hashCode() {
        return (this.f4628c.hashCode() * 31) + Float.hashCode(this.f4629d);
    }
}

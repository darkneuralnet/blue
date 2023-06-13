package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0010ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0015\u001a\u00020\u00108\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, m28432d2 = {"LqU2;", "LBm2;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lo61;", "b", "J", "getSize-MYxV2XQ", "()J", "size", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qU2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47484qU2 implements InterfaceC31957Bm2 {

    /* renamed from: b */
    public final long f105331b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qU2$a */
    /* loaded from: classes.dex */
    public static final class C27607a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f105332g;

        /* renamed from: h */
        public final /* synthetic */ OU3 f105333h;

        /* renamed from: i */
        public final /* synthetic */ int f105334i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27607a(int i, OU3 ou3, int i2) {
            super(1);
            this.f105332g = i;
            this.f105333h = ou3;
            this.f105334i = i2;
        }

        /* renamed from: a */
        public final void m17486a(OU3.AbstractC6015a layout) {
            int roundToInt;
            int roundToInt2;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            roundToInt = MathKt__MathJVMKt.roundToInt((this.f105332g - this.f105333h.m92226i1()) / 2.0f);
            roundToInt2 = MathKt__MathJVMKt.roundToInt((this.f105334i - this.f105333h.m92229d1()) / 2.0f);
            OU3.AbstractC6015a.m92209n(layout, this.f105333h, roundToInt, roundToInt2, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m17486a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C47484qU2(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(Object obj) {
        C47484qU2 c47484qU2;
        if (obj instanceof C47484qU2) {
            c47484qU2 = (C47484qU2) obj;
        } else {
            c47484qU2 = null;
        }
        if (c47484qU2 == null) {
            return false;
        }
        return C46077o61.m21790f(this.f105331b, c47484qU2.f105331b);
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(j);
        int max = Math.max(mo8763P0.m92226i1(), measure.mo3416F0(C46077o61.m21788h(this.f105331b)));
        int max2 = Math.max(mo8763P0.m92229d1(), measure.mo3416F0(C46077o61.m21789g(this.f105331b)));
        return InterfaceC52765zO2.m1430Y(measure, max, max2, null, new C27607a(max, mo8763P0, max2), 4, null);
    }

    public int hashCode() {
        return C46077o61.m21787i(this.f105331b);
    }

    public C47484qU2(long j) {
        this.f105331b = j;
    }
}

package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"LjI6;", "LBm2;", "LT42;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "toString", "", "c", "F", "zIndex", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FLkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jI6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43229jI6 extends T42 implements InterfaceC31957Bm2 {

    /* renamed from: c */
    public final float f92495c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI6$a */
    /* loaded from: classes.dex */
    public static final class C24802a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f92496g;

        /* renamed from: h */
        public final /* synthetic */ C43229jI6 f92497h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24802a(OU3 ou3, C43229jI6 c43229jI6) {
            super(1);
            this.f92496g = ou3;
            this.f92497h = c43229jI6;
        }

        /* renamed from: a */
        public final void m30811a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.m92210m(this.f92496g, 0, 0, this.f92497h.f92495c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m30811a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43229jI6(float f, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f92495c = f;
    }

    public boolean equals(Object obj) {
        C43229jI6 c43229jI6;
        if (obj instanceof C43229jI6) {
            c43229jI6 = (C43229jI6) obj;
        } else {
            c43229jI6 = null;
        }
        if (c43229jI6 == null || this.f92495c != c43229jI6.f92495c) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(j);
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C24802a(mo8763P0, this), 4, null);
    }

    public int hashCode() {
        return Float.hashCode(this.f92495c);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f92495c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

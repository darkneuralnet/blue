package p000;

import androidx.compose.p003ui.graphics.InterfaceC11328c;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0018\u0010\u0016J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R3\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LQW;", "LDm2;", "LgV2$c;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", "toString", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "", "Lkotlin/ExtensionFunctionType;", "l", "Lkotlin/jvm/functions/Function1;", "e0", "()Lkotlin/jvm/functions/Function1;", "f0", "(Lkotlin/jvm/functions/Function1;)V", "layerBlock", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QW */
/* loaded from: classes.dex */
public final class C6785QW extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC32425Dm2 {

    /* renamed from: l */
    public Function1<? super InterfaceC11328c, Unit> f30450l;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QW$a */
    /* loaded from: classes.dex */
    public static final class C6786a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f30451g;

        /* renamed from: h */
        public final /* synthetic */ C6785QW f30452h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6786a(OU3 ou3, C6785QW c6785qw) {
            super(1);
            this.f30451g = ou3;
            this.f30452h = c6785qw;
        }

        /* renamed from: a */
        public final void m88454a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92197z(layout, this.f30451g, 0, 0, 0.0f, this.f30452h.m88456e0(), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m88454a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    public C6785QW(Function1<? super InterfaceC11328c, Unit> layerBlock) {
        Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
        this.f30450l = layerBlock;
    }

    /* renamed from: e0 */
    public final Function1<InterfaceC11328c, Unit> m88456e0() {
        return this.f30450l;
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo21524f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(j);
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C6786a(mo8763P0, this), 4, null);
    }

    /* renamed from: f0 */
    public final void m88455f0(Function1<? super InterfaceC11328c, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f30450l = function1;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f30450l + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"LEN5;", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "<init>", "()V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EN5 */
/* loaded from: classes.dex */
public final class EN5 implements InterfaceC51579xO2 {

    /* renamed from: a */
    public static final EN5 f7389a = new EN5();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EN5$a */
    /* loaded from: classes.dex */
    public static final class C1815a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public static final C1815a f7390g = new C1815a();

        public C1815a() {
            super(1);
        }

        /* renamed from: a */
        public final void m109057a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m109057a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    private EN5() {
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: a */
    public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
        int i;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int i2 = 0;
        if (C44228kz0.m28065l(j)) {
            i = C44228kz0.m28063n(j);
        } else {
            i = 0;
        }
        if (C44228kz0.m28066k(j)) {
            i2 = C44228kz0.m28064m(j);
        }
        return InterfaceC52765zO2.m1430Y(measure, i, i2, null, C1815a.f7390g, 4, null);
    }
}

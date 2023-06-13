package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"Llo$d;", "horizontalArrangement", "LK9$c;", "verticalAlignment", "LxO2;", C17296a.f69688o, "(Llo$d;LK9$c;LEt0;I)LxO2;", "LxO2;", "getDefaultRowMeasurePolicy", "()LxO2;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,272:1\n75#2:273\n76#2,11:275\n89#2:302\n76#3:274\n460#4,16:286\n50#4:303\n49#4:304\n1057#5,6:305\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n80#1:273\n80#1:275,11\n80#1:302\n80#1:274\n80#1:286,16\n109#1:303\n109#1:304\n109#1:305,6\n*E\n"})
/* renamed from: Yc5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37252Yc5 {

    /* renamed from: a */
    public static final InterfaceC51579xO2 f46074a;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "totalSize", "", "size", "Lpm2;", "layoutDirection", "Lg01;", "density", "outPosition", "", C17296a.f69688o, "(I[ILpm2;Lg01;[I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt$DefaultRowMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
    /* renamed from: Yc5$a */
    /* loaded from: classes.dex */
    public static final class C9820a extends Lambda implements Function5<Integer, int[], EnumC47065pm2, InterfaceC41273g01, int[], Unit> {

        /* renamed from: g */
        public static final C9820a f46075g = new C9820a();

        public C9820a() {
            super(5);
        }

        /* renamed from: a */
        public final void m74812a(int i, int[] size, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density, int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            C25777lo.f96729a.m26803f().mo26794b(density, i, size, layoutDirection, outPosition);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, EnumC47065pm2 enumC47065pm2, InterfaceC41273g01 interfaceC41273g01, int[] iArr2) {
            m74812a(num.intValue(), iArr, enumC47065pm2, interfaceC41273g01, iArr2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yc5$b */
    /* loaded from: classes.dex */
    public static final class C9821b extends Lambda implements Function5<Integer, int[], EnumC47065pm2, InterfaceC41273g01, int[], Unit> {

        /* renamed from: g */
        public final /* synthetic */ C25777lo.InterfaceC25781d f46076g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9821b(C25777lo.InterfaceC25781d interfaceC25781d) {
            super(5);
            this.f46076g = interfaceC25781d;
        }

        /* renamed from: a */
        public final void m74811a(int i, int[] size, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density, int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            this.f46076g.mo26794b(density, i, size, layoutDirection, outPosition);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, EnumC47065pm2 enumC47065pm2, InterfaceC41273g01 interfaceC41273g01, int[] iArr2) {
            m74811a(num.intValue(), iArr, enumC47065pm2, interfaceC41273g01, iArr2);
            return Unit.INSTANCE;
        }
    }

    static {
        EnumC35701Rm2 enumC35701Rm2 = EnumC35701Rm2.Horizontal;
        float mo26793a = C25777lo.f96729a.m26803f().mo26793a();
        QE0 m88711b = QE0.f30070a.m88711b(InterfaceC4360K9.f19170a.m99135k());
        f46074a = C36316Uc5.m81235r(enumC35701Rm2, C9820a.f46075g, mo26793a, DB5.Wrap, m88711b);
    }

    @PublishedApi
    /* renamed from: a */
    public static final InterfaceC51579xO2 m74813a(C25777lo.InterfaceC25781d horizontalArrangement, InterfaceC4360K9.InterfaceC4363c verticalAlignment, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC51579xO2 interfaceC51579xO2;
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        interfaceC32720Et0.mo89638F(-837807694);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:102)");
        }
        if (Intrinsics.areEqual(horizontalArrangement, C25777lo.f96729a.m26803f()) && Intrinsics.areEqual(verticalAlignment, InterfaceC4360K9.f19170a.m99135k())) {
            interfaceC51579xO2 = f46074a;
        } else {
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(horizontalArrangement) | interfaceC32720Et0.mo89539n(verticalAlignment);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                EnumC35701Rm2 enumC35701Rm2 = EnumC35701Rm2.Horizontal;
                float mo26793a = horizontalArrangement.mo26793a();
                QE0 m88711b = QE0.f30070a.m88711b(verticalAlignment);
                mo89635G = C36316Uc5.m81235r(enumC35701Rm2, new C9821b(horizontalArrangement), mo26793a, DB5.Wrap, m88711b);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            interfaceC51579xO2 = (InterfaceC51579xO2) mo89635G;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC51579xO2;
    }
}

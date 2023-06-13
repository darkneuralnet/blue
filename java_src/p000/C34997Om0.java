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
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"Llo$l;", "verticalArrangement", "LK9$b;", "horizontalAlignment", "LxO2;", C17296a.f69688o, "(Llo$l;LK9$b;LEt0;I)LxO2;", "LxO2;", "getDefaultColumnMeasurePolicy", "()LxO2;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n75#2:251\n76#2,11:253\n89#2:280\n76#3:252\n460#4,16:264\n50#4:281\n49#4:282\n1057#5,6:283\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n79#1:251\n79#1:253,11\n79#1:280\n79#1:252\n79#1:264,16\n105#1:281\n105#1:282\n105#1:283,6\n*E\n"})
/* renamed from: Om0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34997Om0 {

    /* renamed from: a */
    public static final InterfaceC51579xO2 f27207a;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "totalSize", "", "size", "Lpm2;", "<anonymous parameter 2>", "Lg01;", "density", "outPosition", "", C17296a.f69688o, "(I[ILpm2;Lg01;[I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$DefaultColumnMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
    /* renamed from: Om0$a */
    /* loaded from: classes.dex */
    public static final class C6109a extends Lambda implements Function5<Integer, int[], EnumC47065pm2, InterfaceC41273g01, int[], Unit> {

        /* renamed from: g */
        public static final C6109a f27208g = new C6109a();

        public C6109a() {
            super(5);
        }

        /* renamed from: a */
        public final void m91545a(int i, int[] size, EnumC47065pm2 enumC47065pm2, InterfaceC41273g01 density, int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(enumC47065pm2, "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            C25777lo.f96729a.m26802g().mo26792c(density, i, size, outPosition);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, EnumC47065pm2 enumC47065pm2, InterfaceC41273g01 interfaceC41273g01, int[] iArr2) {
            m91545a(num.intValue(), iArr, enumC47065pm2, interfaceC41273g01, iArr2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$columnMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
    /* renamed from: Om0$b */
    /* loaded from: classes.dex */
    public static final class C6110b extends Lambda implements Function5<Integer, int[], EnumC47065pm2, InterfaceC41273g01, int[], Unit> {

        /* renamed from: g */
        public final /* synthetic */ C25777lo.InterfaceC25789l f27209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6110b(C25777lo.InterfaceC25789l interfaceC25789l) {
            super(5);
            this.f27209g = interfaceC25789l;
        }

        /* renamed from: a */
        public final void m91544a(int i, int[] size, EnumC47065pm2 enumC47065pm2, InterfaceC41273g01 density, int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(enumC47065pm2, "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            this.f27209g.mo26792c(density, i, size, outPosition);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, EnumC47065pm2 enumC47065pm2, InterfaceC41273g01 interfaceC41273g01, int[] iArr2) {
            m91544a(num.intValue(), iArr, enumC47065pm2, interfaceC41273g01, iArr2);
            return Unit.INSTANCE;
        }
    }

    static {
        EnumC35701Rm2 enumC35701Rm2 = EnumC35701Rm2.Vertical;
        float mo26793a = C25777lo.f96729a.m26802g().mo26793a();
        QE0 m88712a = QE0.f30070a.m88712a(InterfaceC4360K9.f19170a.m99136j());
        f27207a = C36316Uc5.m81235r(enumC35701Rm2, C6109a.f27208g, mo26793a, DB5.Wrap, m88712a);
    }

    @PublishedApi
    /* renamed from: a */
    public static final InterfaceC51579xO2 m91546a(C25777lo.InterfaceC25789l verticalArrangement, InterfaceC4360K9.InterfaceC4362b horizontalAlignment, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC51579xO2 interfaceC51579xO2;
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        interfaceC32720Et0.mo89638F(1089876336);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:98)");
        }
        if (Intrinsics.areEqual(verticalArrangement, C25777lo.f96729a.m26802g()) && Intrinsics.areEqual(horizontalAlignment, InterfaceC4360K9.f19170a.m99136j())) {
            interfaceC51579xO2 = f27207a;
        } else {
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(verticalArrangement) | interfaceC32720Et0.mo89539n(horizontalAlignment);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                EnumC35701Rm2 enumC35701Rm2 = EnumC35701Rm2.Vertical;
                float mo26793a = verticalArrangement.mo26793a();
                QE0 m88712a = QE0.f30070a.m88712a(horizontalAlignment);
                mo89635G = C36316Uc5.m81235r(enumC35701Rm2, new C6110b(verticalArrangement), mo26793a, DB5.Wrap, m88712a);
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

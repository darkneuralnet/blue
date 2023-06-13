package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.OU3;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, m28432d2 = {"LzO2;", "LZ62;", "", "width", "height", "", "LL9;", "alignmentLines", "Lkotlin/Function1;", "LOU3$a;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "LyO2;", "O0", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC52765zO2 extends Z62 {

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"zO2$a", "LyO2;", "", "c", "", C17296a.f69688o, "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "LL9;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "alignmentLines", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n+ 2 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,61:1\n360#2,15:62\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n*L\n52#1:62,15\n*E\n"})
    /* renamed from: zO2$a */
    /* loaded from: classes.dex */
    public static final class C30995a implements InterfaceC52172yO2 {

        /* renamed from: a */
        public final int f121280a;

        /* renamed from: b */
        public final int f121281b;

        /* renamed from: c */
        public final Map<AbstractC4750L9, Integer> f121282c;

        /* renamed from: d */
        public final /* synthetic */ int f121283d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC52765zO2 f121284e;

        /* renamed from: f */
        public final /* synthetic */ Function1<OU3.AbstractC6015a, Unit> f121285f;

        /* JADX WARN: Multi-variable type inference failed */
        public C30995a(int i, int i2, Map<AbstractC4750L9, Integer> map, InterfaceC52765zO2 interfaceC52765zO2, Function1<? super OU3.AbstractC6015a, Unit> function1) {
            this.f121283d = i;
            this.f121284e = interfaceC52765zO2;
            this.f121285f = function1;
            this.f121280a = i;
            this.f121281b = i2;
            this.f121282c = map;
        }

        @Override // p000.InterfaceC52172yO2
        /* renamed from: c */
        public void mo1429c() {
            SC2 sc2;
            OU3.AbstractC6015a.C6016a c6016a = OU3.AbstractC6015a.f26640a;
            int i = this.f121283d;
            EnumC47065pm2 layoutDirection = this.f121284e.getLayoutDirection();
            InterfaceC52765zO2 interfaceC52765zO2 = this.f121284e;
            if (interfaceC52765zO2 instanceof SC2) {
                sc2 = (SC2) interfaceC52765zO2;
            } else {
                sc2 = null;
            }
            Function1<OU3.AbstractC6015a, Unit> function1 = this.f121285f;
            InterfaceC45879nm2 m92215f = OU3.AbstractC6015a.m92215f();
            int m92194E = OU3.AbstractC6015a.C6016a.m92194E(c6016a);
            EnumC47065pm2 m92195D = OU3.AbstractC6015a.C6016a.m92195D(c6016a);
            C34999Om2 m92220a = OU3.AbstractC6015a.m92220a();
            OU3.AbstractC6015a.m92212i(i);
            OU3.AbstractC6015a.m92213h(layoutDirection);
            boolean m92196C = OU3.AbstractC6015a.C6016a.m92196C(c6016a, sc2);
            function1.invoke(c6016a);
            if (sc2 != null) {
                sc2.m85842z1(m92196C);
            }
            OU3.AbstractC6015a.m92212i(m92194E);
            OU3.AbstractC6015a.m92213h(m92195D);
            OU3.AbstractC6015a.m92211j(m92215f);
            OU3.AbstractC6015a.m92214g(m92220a);
        }

        @Override // p000.InterfaceC52172yO2
        /* renamed from: d */
        public Map<AbstractC4750L9, Integer> mo1428d() {
            return this.f121282c;
        }

        @Override // p000.InterfaceC52172yO2
        public int getHeight() {
            return this.f121281b;
        }

        @Override // p000.InterfaceC52172yO2
        public int getWidth() {
            return this.f121280a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    static /* synthetic */ InterfaceC52172yO2 m1430Y(InterfaceC52765zO2 interfaceC52765zO2, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = MapsKt__MapsKt.emptyMap();
            }
            return interfaceC52765zO2.mo1431O0(i, i2, map, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    /* renamed from: O0 */
    default InterfaceC52172yO2 mo1431O0(int i, int i2, Map<AbstractC4750L9, Integer> alignmentLines, Function1<? super OU3.AbstractC6015a, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return new C30995a(i, i2, alignmentLines, this, placementBlock);
    }
}

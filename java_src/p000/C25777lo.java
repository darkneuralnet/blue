package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004#)\u0011\u0015B\t\b\u0002¢\u0006\u0004\b8\u0010\u001dJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0010J/\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0010J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0010R \u0010\u001e\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001bR \u0010(\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R \u0010,\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b+\u0010\u001d\u001a\u0004\b*\u0010&R \u00100\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010-\u0012\u0004\b/\u0010\u001d\u001a\u0004\b\u0018\u0010.R \u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010-\u0012\u0004\b1\u0010\u001d\u001a\u0004\b)\u0010.R \u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010-\u0012\u0004\b3\u0010\u001d\u001a\u0004\b#\u0010.R \u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010-\u0012\u0004\b6\u0010\u001d\u001a\u0004\b5\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, m28432d2 = {"Llo;", "", "Lk61;", "space", "Llo$e;", "n", "(F)Llo$e;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "j", "(I[I[IZ)V", "i", "([I[IZ)V", "h", "m", "l", "k", "Llo$d;", "b", "Llo$d;", "f", "()Llo$d;", "getStart$annotations", "()V", "Start", "c", "getEnd$annotations", "End", "Llo$l;", DateTokenConverter.CONVERTER_KEY, "Llo$l;", "g", "()Llo$l;", "getTop$annotations", "Top", "e", C17296a.f69688o, "getBottom$annotations", "Bottom", "Llo$e;", "()Llo$e;", "getCenter$annotations", "Center", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "<init>", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#1,2:715\n703#1,5:720\n700#1,2:725\n703#1,5:730\n700#1,2:738\n703#1,5:743\n700#1,2:751\n703#1,5:756\n700#1,2:764\n703#1,5:769\n700#1,2:777\n703#1,5:782\n155#2:710\n155#2:711\n13032#3,3:712\n13674#3,3:717\n13674#3,3:727\n13032#3,3:735\n13674#3,3:740\n13032#3,3:748\n13674#3,3:753\n13032#3,3:761\n13674#3,3:766\n13032#3,3:774\n13674#3,3:779\n13674#3,3:787\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n618#1:715,2\n618#1:720,5\n626#1:725,2\n626#1:730,5\n640#1:738,2\n640#1:743,5\n655#1:751,2\n655#1:756,5\n674#1:764,2\n674#1:769,5\n693#1:777,2\n693#1:782,5\n354#1:710\n366#1:711\n616#1:712,3\n618#1:717,3\n626#1:727,3\n638#1:735,3\n640#1:740,3\n652#1:748,3\n655#1:753,3\n667#1:761,3\n674#1:766,3\n686#1:774,3\n693#1:779,3\n701#1:787,3\n*E\n"})
/* renamed from: lo */
/* loaded from: classes.dex */
public final class C25777lo {

    /* renamed from: a */
    public static final C25777lo f96729a = new C25777lo();

    /* renamed from: b */
    public static final InterfaceC25781d f96730b = new C25787j();

    /* renamed from: c */
    public static final InterfaceC25781d f96731c = new C25780c();

    /* renamed from: d */
    public static final InterfaceC25789l f96732d = new C25788k();

    /* renamed from: e */
    public static final InterfaceC25789l f96733e = new C25778a();

    /* renamed from: f */
    public static final InterfaceC25782e f96734f = new C25779b();

    /* renamed from: g */
    public static final InterfaceC25782e f96735g = new C25785h();

    /* renamed from: h */
    public static final InterfaceC25782e f96736h = new C25784g();

    /* renamed from: i */
    public static final InterfaceC25782e f96737i = new C25783f();

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m28432d2 = {"lo$a", "Llo$l;", "Lg01;", "", "totalSize", "", "sizes", "outPositions", "", "c", "", "toString", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: lo$a */
    /* loaded from: classes.dex */
    public static final class C25778a implements InterfaceC25789l {
        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            C25777lo.f96729a.m26799j(i, sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    @Metadata(m28433d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"lo$b", "Llo$e;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "c", "", "toString", "Lk61;", C17296a.f69688o, "F", "()F", "spacing", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n190#1:710\n*E\n"})
    /* renamed from: lo$b */
    /* loaded from: classes.dex */
    public static final class C25779b implements InterfaceC25782e {

        /* renamed from: a */
        public final float f96738a = C43705k61.m29303g(0);

        @Override // p000.C25777lo.InterfaceC25781d, p000.C25777lo.InterfaceC25789l
        /* renamed from: a */
        public float mo26793a() {
            return this.f96738a;
        }

        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == EnumC47065pm2.Ltr) {
                C25777lo.f96729a.m26801h(i, sizes, outPositions, false);
            } else {
                C25777lo.f96729a.m26801h(i, sizes, outPositions, true);
            }
        }

        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            C25777lo.f96729a.m26801h(i, sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m28432d2 = {"lo$c", "Llo$d;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "", "toString", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: lo$c */
    /* loaded from: classes.dex */
    public static final class C25780c implements InterfaceC25781d {
        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == EnumC47065pm2.Ltr) {
                C25777lo.f96729a.m26799j(i, sizes, outPositions, false);
            } else {
                C25777lo.f96729a.m26800i(sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&R\u001d\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, m28432d2 = {"Llo$d;", "", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "Lk61;", C17296a.f69688o, "()F", "spacing", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:710\n*E\n"})
    /* renamed from: lo$d */
    /* loaded from: classes.dex */
    public interface InterfaceC25781d {
        /* renamed from: a */
        default float mo26793a() {
            return C43705k61.m29303g(0);
        }

        /* renamed from: b */
        void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] iArr, EnumC47065pm2 enumC47065pm2, int[] iArr2);
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, m28432d2 = {"Llo$e;", "Llo$d;", "Llo$l;", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n107#1:710\n*E\n"})
    /* renamed from: lo$e */
    /* loaded from: classes.dex */
    public interface InterfaceC25782e extends InterfaceC25781d, InterfaceC25789l {
    }

    @Metadata(m28433d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"lo$f", "Llo$e;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "c", "", "toString", "Lk61;", C17296a.f69688o, "F", "()F", "spacing", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n278#1:710\n*E\n"})
    /* renamed from: lo$f */
    /* loaded from: classes.dex */
    public static final class C25783f implements InterfaceC25782e {

        /* renamed from: a */
        public final float f96739a = C43705k61.m29303g(0);

        @Override // p000.C25777lo.InterfaceC25781d, p000.C25777lo.InterfaceC25789l
        /* renamed from: a */
        public float mo26793a() {
            return this.f96739a;
        }

        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == EnumC47065pm2.Ltr) {
                C25777lo.f96729a.m26798k(i, sizes, outPositions, false);
            } else {
                C25777lo.f96729a.m26798k(i, sizes, outPositions, true);
            }
        }

        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            C25777lo.f96729a.m26798k(i, sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @Metadata(m28433d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"lo$g", "Llo$e;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "c", "", "toString", "Lk61;", C17296a.f69688o, "F", "()F", "spacing", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n*L\n248#1:710\n*E\n"})
    /* renamed from: lo$g */
    /* loaded from: classes.dex */
    public static final class C25784g implements InterfaceC25782e {

        /* renamed from: a */
        public final float f96740a = C43705k61.m29303g(0);

        @Override // p000.C25777lo.InterfaceC25781d, p000.C25777lo.InterfaceC25789l
        /* renamed from: a */
        public float mo26793a() {
            return this.f96740a;
        }

        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == EnumC47065pm2.Ltr) {
                C25777lo.f96729a.m26797l(i, sizes, outPositions, false);
            } else {
                C25777lo.f96729a.m26797l(i, sizes, outPositions, true);
            }
        }

        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            C25777lo.f96729a.m26797l(i, sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @Metadata(m28433d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"lo$h", "Llo$e;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "c", "", "toString", "Lk61;", C17296a.f69688o, "F", "()F", "spacing", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n*L\n219#1:710\n*E\n"})
    /* renamed from: lo$h */
    /* loaded from: classes.dex */
    public static final class C25785h implements InterfaceC25782e {

        /* renamed from: a */
        public final float f96741a = C43705k61.m29303g(0);

        @Override // p000.C25777lo.InterfaceC25781d, p000.C25777lo.InterfaceC25789l
        /* renamed from: a */
        public float mo26793a() {
            return this.f96741a;
        }

        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == EnumC47065pm2.Ltr) {
                C25777lo.f96729a.m26796m(i, sizes, outPositions, false);
            } else {
                C25777lo.f96729a.m26796m(i, sizes, outPositions, true);
            }
        }

        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            C25777lo.f96729a.m26796m(i, sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b%\u0010&J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R \u0010\u0019\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R#\u0010$\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m28432d2 = {"Llo$i;", "Llo$e;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "c", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lk61;", C17296a.f69688o, "F", "getSpace-D9Ej5fM", "()F", "space", "Z", "getRtlMirror", "()Z", "rtlMirror", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "alignment", DateTokenConverter.CONVERTER_KEY, "spacing", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#2,2:710\n703#2,5:715\n13674#3,3:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n585#1:710,2\n585#1:715,5\n585#1:712,3\n*E\n"})
    /* renamed from: lo$i */
    /* loaded from: classes.dex */
    public static final class C25786i implements InterfaceC25782e {

        /* renamed from: a */
        public final float f96742a;

        /* renamed from: b */
        public final boolean f96743b;

        /* renamed from: c */
        public final Function2<Integer, EnumC47065pm2, Integer> f96744c;

        /* renamed from: d */
        public final float f96745d;

        public /* synthetic */ C25786i(float f, boolean z, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, function2);
        }

        @Override // p000.C25777lo.InterfaceC25781d, p000.C25777lo.InterfaceC25789l
        /* renamed from: a */
        public float mo26793a() {
            return this.f96745d;
        }

        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            boolean z;
            boolean z2;
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (sizes.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            int mo3416F0 = interfaceC41273g01.mo3416F0(this.f96742a);
            if (this.f96743b && layoutDirection == EnumC47065pm2.Rtl) {
                z2 = true;
            } else {
                z2 = false;
            }
            C25777lo c25777lo = C25777lo.f96729a;
            if (!z2) {
                int length = sizes.length;
                int i4 = 0;
                i2 = 0;
                i3 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = sizes[i4];
                    int min = Math.min(i2, i - i6);
                    outPositions[i5] = min;
                    int min2 = Math.min(mo3416F0, (i - min) - i6);
                    int i7 = outPositions[i5] + i6 + min2;
                    i4++;
                    i5++;
                    i3 = min2;
                    i2 = i7;
                }
            } else {
                i2 = 0;
                i3 = 0;
                for (int length2 = sizes.length - 1; -1 < length2; length2--) {
                    int i8 = sizes[length2];
                    int min3 = Math.min(i2, i - i8);
                    outPositions[length2] = min3;
                    i3 = Math.min(mo3416F0, (i - min3) - i8);
                    i2 = outPositions[length2] + i8 + i3;
                }
            }
            int i9 = i2 - i3;
            Function2<Integer, EnumC47065pm2, Integer> function2 = this.f96744c;
            if (function2 != null && i9 < i) {
                int intValue = function2.invoke(Integer.valueOf(i - i9), layoutDirection).intValue();
                int length3 = outPositions.length;
                for (int i10 = 0; i10 < length3; i10++) {
                    outPositions[i10] = outPositions[i10] + intValue;
                }
            }
        }

        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            mo26794b(interfaceC41273g01, i, sizes, EnumC47065pm2.Ltr, outPositions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C25786i) {
                C25786i c25786i = (C25786i) obj;
                return C43705k61.m29301i(this.f96742a, c25786i.f96742a) && this.f96743b == c25786i.f96743b && Intrinsics.areEqual(this.f96744c, c25786i.f96744c);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int m29300j = C43705k61.m29300j(this.f96742a) * 31;
            boolean z = this.f96743b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (m29300j + i) * 31;
            Function2<Integer, EnumC47065pm2, Integer> function2 = this.f96744c;
            return i2 + (function2 == null ? 0 : function2.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f96743b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) C43705k61.m29299k(this.f96742a));
            sb.append(", ");
            sb.append(this.f96744c);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C25786i(float f, boolean z, Function2<? super Integer, ? super EnumC47065pm2, Integer> function2) {
            this.f96742a = f;
            this.f96743b = z;
            this.f96744c = function2;
            this.f96745d = f;
        }
    }

    @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m28432d2 = {"lo$j", "Llo$d;", "Lg01;", "", "totalSize", "", "sizes", "Lpm2;", "layoutDirection", "outPositions", "", "b", "", "toString", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: lo$j */
    /* loaded from: classes.dex */
    public static final class C25787j implements InterfaceC25781d {
        @Override // p000.C25777lo.InterfaceC25781d
        /* renamed from: b */
        public void mo26794b(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, EnumC47065pm2 layoutDirection, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == EnumC47065pm2.Ltr) {
                C25777lo.f96729a.m26800i(sizes, outPositions, false);
            } else {
                C25777lo.f96729a.m26799j(i, sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m28432d2 = {"lo$k", "Llo$l;", "Lg01;", "", "totalSize", "", "sizes", "outPositions", "", "c", "", "toString", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: lo$k */
    /* loaded from: classes.dex */
    public static final class C25788k implements InterfaceC25789l {
        @Override // p000.C25777lo.InterfaceC25789l
        /* renamed from: c */
        public void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] sizes, int[] outPositions) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            C25777lo.f96729a.m26800i(sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001d\u0010\r\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, m28432d2 = {"Llo$l;", "", "Lg01;", "", "totalSize", "", "sizes", "outPositions", "", "c", "Lk61;", C17296a.f69688o, "()F", "spacing", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n79#1:710\n*E\n"})
    /* renamed from: lo$l */
    /* loaded from: classes.dex */
    public interface InterfaceC25789l {
        /* renamed from: a */
        default float mo26793a() {
            return C43705k61.m29303g(0);
        }

        /* renamed from: c */
        void mo26792c(InterfaceC41273g01 interfaceC41273g01, int i, int[] iArr, int[] iArr2);
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "size", "Lpm2;", "layoutDirection", C17296a.f69688o, "(ILpm2;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lo$m */
    /* loaded from: classes.dex */
    public static final class C25790m extends Lambda implements Function2<Integer, EnumC47065pm2, Integer> {

        /* renamed from: g */
        public static final C25790m f96746g = new C25790m();

        public C25790m() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m26791a(int i, EnumC47065pm2 layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return Integer.valueOf(InterfaceC4360K9.f19170a.m99136j().mo99131a(0, i, layoutDirection));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, EnumC47065pm2 enumC47065pm2) {
            return m26791a(num.intValue(), enumC47065pm2);
        }
    }

    private C25777lo() {
    }

    /* renamed from: a */
    public final InterfaceC25789l m26808a() {
        return f96733e;
    }

    /* renamed from: b */
    public final InterfaceC25782e m26807b() {
        return f96734f;
    }

    /* renamed from: c */
    public final InterfaceC25781d m26806c() {
        return f96731c;
    }

    /* renamed from: d */
    public final InterfaceC25782e m26805d() {
        return f96736h;
    }

    /* renamed from: e */
    public final InterfaceC25782e m26804e() {
        return f96735g;
    }

    /* renamed from: f */
    public final InterfaceC25781d m26803f() {
        return f96730b;
    }

    /* renamed from: g */
    public final InterfaceC25789l m26802g() {
        return f96732d;
    }

    /* renamed from: h */
    public final void m26801h(int i, int[] size, int[] outPosition, boolean z) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f = (i - i3) / 2;
        if (!z) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f);
                outPosition[i5] = roundToInt2;
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = size[length2];
                roundToInt = MathKt__MathJVMKt.roundToInt(f);
                outPosition[length2] = roundToInt;
                f += i7;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void m26800i(int[] size, int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i = 0;
        if (!z) {
            int length = size.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = size[i];
                outPosition[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i5 = size[length2];
                outPosition[length2] = i;
                i += i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void m26799j(int i, int[] size, int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = size.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                outPosition[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = size[length2];
                outPosition[length2] = i5;
                i5 += i8;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m26798k(int i, int[] size, int[] outPosition, boolean z) {
        boolean z2;
        float f;
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        if (size.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            f = (i - i3) / size.length;
        } else {
            f = 0.0f;
        }
        float f2 = f / 2;
        if (!z) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f2);
                outPosition[i5] = roundToInt2;
                f2 += i6 + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i7 = size[length2];
            roundToInt = MathKt__MathJVMKt.roundToInt(f2);
            outPosition[length2] = roundToInt;
            f2 += i7 + f;
        }
    }

    /* renamed from: l */
    public final void m26797l(int i, int[] size, int[] outPosition, boolean z) {
        float f;
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f2 = 0.0f;
        if (size.length > 1) {
            f = (i - i3) / (size.length - 1);
        } else {
            f = 0.0f;
        }
        if (!z) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f2);
                outPosition[i5] = roundToInt2;
                f2 += i6 + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i7 = size[length2];
            roundToInt = MathKt__MathJVMKt.roundToInt(f2);
            outPosition[length2] = roundToInt;
            f2 += i7 + f;
        }
    }

    /* renamed from: m */
    public final void m26796m(int i, int[] size, int[] outPosition, boolean z) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (i - i3) / (size.length + 1);
        if (!z) {
            int length2 = size.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = size[i2];
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f);
                outPosition[i5] = roundToInt2;
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = size.length - 1; -1 < length3; length3--) {
            int i7 = size[length3];
            roundToInt = MathKt__MathJVMKt.roundToInt(f2);
            outPosition[length3] = roundToInt;
            f2 += i7 + length;
        }
    }

    /* renamed from: n */
    public final InterfaceC25782e m26795n(float f) {
        return new C25786i(f, true, C25790m.f96746g, null);
    }
}

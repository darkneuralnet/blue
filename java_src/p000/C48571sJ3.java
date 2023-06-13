package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC46793pJ3;
@Metadata(m28433d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002<\nB\u0007¢\u0006\u0004\b^\u0010_J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0011\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0013\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0015\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0019\u001a\u00020\u0002*\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u001b\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u001d\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u001f\u001a\u00020\u0002*\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010!\u001a\u00020\u0002*\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010#\u001a\u00020\u0002*\u00020\"2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010'\u001a\u00020\u0002*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010)\u001a\u00020\u0002*\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010-\u001a\u00020\u0002*\u00020,2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u00100\u001a\u00020\u0002*\u00020.2\u0006\u0010/\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u00102\u001a\u00020\u0002*\u0002012\u0006\u0010/\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u00104\u001a\u00020\u0002*\u0002032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u00106\u001a\u00020\u0002*\u0002052\u0006\u0010\r\u001a\u00020\fH\u0002JX\u0010@\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u0002072\u0006\u0010\n\u001a\u0002072\u0006\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020%H\u0002JX\u0010G\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u0002072\u0006\u0010<\u001a\u0002072\u0006\u0010\n\u001a\u0002072\u0006\u0010C\u001a\u0002072\u0006\u0010D\u001a\u0002072\u0006\u0010=\u001a\u0002072\u0006\u0010E\u001a\u0002072\u0006\u0010F\u001a\u000207H\u0002J\u0018\u0010<\u001a\u00020\u00022\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0002J\u0018\u0010N\u001a\u00020L2\u0006\u00102\u001a\u00020\u00042\u0006\u0010M\u001a\u00020LH\u0002J\u0010\u0010O\u001a\u00020J2\u0006\u00102\u001a\u00020\u0004H\u0002J \u0010Q\u001a\u00020J2\u0006\u0010P\u001a\u00020J2\u0006\u0010E\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0002J \u0010T\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010E\u001a\u00020L2\u0006\u0010S\u001a\u00020RH\u0002J\f\u0010U\u001a\u000207*\u000207H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010YR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010YR\u0014\u0010\\\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010YR\u0014\u0010]\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010Y¨\u0006`"}, m28432d2 = {"LsJ3;", "", "", "e", "", "pathData", "p", "", "LpJ3;", "nodes", "b", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LcJ3;", "target", "D", "f", "LpJ3$n;", "x", "LpJ3$f;", "n", "LpJ3$m;", "w", "LpJ3$e;", "m", "LpJ3$l;", "v", "LpJ3$d;", "l", "LpJ3$r;", "B", "LpJ3$s;", "F", "LpJ3$k;", "u", "LpJ3$c;", "h", "LpJ3$p;", "", "prevIsCurve", "z", "LpJ3$h;", "r", "LpJ3$o;", "y", "LpJ3$g;", "q", "LpJ3$q;", "prevIsQuad", "A", "LpJ3$i;", "s", "LpJ3$j;", "t", "LpJ3$a;", "c", "", "x0", "y0", "x1", "y1", C17296a.f69688o, "theta", "isMoreThanHalf", "isPositiveArc", "i", "cx", "cy", "e1x", "e1y", "start", "sweep", DateTokenConverter.CONVERTER_KEY, "", "cmd", "", "args", "", "end", "o", "k", "original", "g", "LsJ3$a;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "j", "E", "", "Ljava/util/List;", "LsJ3$b;", "LsJ3$b;", "currentPoint", "ctrlPoint", "segmentPoint", "reflectiveCtrlPoint", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,645:1\n107#2:646\n79#2,22:647\n33#3,6:669\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n81#1:646\n81#1:647,22\n112#1:669,6\n*E\n"})
/* renamed from: sJ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48571sJ3 {

    /* renamed from: a */
    public final List<AbstractC46793pJ3> f108586a = new ArrayList();

    /* renamed from: b */
    public final C28259b f108587b = new C28259b(0.0f, 0.0f, 3, null);

    /* renamed from: c */
    public final C28259b f108588c = new C28259b(0.0f, 0.0f, 3, null);

    /* renamed from: d */
    public final C28259b f108589d = new C28259b(0.0f, 0.0f, 3, null);

    /* renamed from: e */
    public final C28259b f108590e = new C28259b(0.0f, 0.0f, 3, null);

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LsJ3$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "I", "()I", "c", "(I)V", "endPosition", "b", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "endWithNegativeOrDot", "<init>", "(IZ)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sJ3$a */
    /* loaded from: classes.dex */
    public static final class C28258a {

        /* renamed from: a */
        public int f108591a;

        /* renamed from: b */
        public boolean f108592b;

        public C28258a() {
            this(0, false, 3, null);
        }

        /* renamed from: a */
        public final int m14413a() {
            return this.f108591a;
        }

        /* renamed from: b */
        public final boolean m14412b() {
            return this.f108592b;
        }

        /* renamed from: c */
        public final void m14411c(int i) {
            this.f108591a = i;
        }

        /* renamed from: d */
        public final void m14410d(boolean z) {
            this.f108592b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C28258a) {
                C28258a c28258a = (C28258a) obj;
                return this.f108591a == c28258a.f108591a && this.f108592b == c28258a.f108592b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.f108591a) * 31;
            boolean z = this.f108592b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.f108591a + ", endWithNegativeOrDot=" + this.f108592b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C28258a(int i, boolean z) {
            this.f108591a = i;
            this.f108592b = z;
        }

        public /* synthetic */ C28258a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LsJ3$b;", "", "", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "()F", DateTokenConverter.CONVERTER_KEY, "(F)V", "x", "b", "e", "y", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sJ3$b */
    /* loaded from: classes.dex */
    public static final class C28259b {

        /* renamed from: a */
        public float f108593a;

        /* renamed from: b */
        public float f108594b;

        public C28259b() {
            this(0.0f, 0.0f, 3, null);
        }

        /* renamed from: a */
        public final float m14409a() {
            return this.f108593a;
        }

        /* renamed from: b */
        public final float m14408b() {
            return this.f108594b;
        }

        /* renamed from: c */
        public final void m14407c() {
            this.f108593a = 0.0f;
            this.f108594b = 0.0f;
        }

        /* renamed from: d */
        public final void m14406d(float f) {
            this.f108593a = f;
        }

        /* renamed from: e */
        public final void m14405e(float f) {
            this.f108594b = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C28259b) {
                C28259b c28259b = (C28259b) obj;
                return Float.compare(this.f108593a, c28259b.f108593a) == 0 && Float.compare(this.f108594b, c28259b.f108594b) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f108593a) * 31) + Float.hashCode(this.f108594b);
        }

        public String toString() {
            return "PathPoint(x=" + this.f108593a + ", y=" + this.f108594b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C28259b(float f, float f2) {
            this.f108593a = f;
            this.f108594b = f2;
        }

        public /* synthetic */ C28259b(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    /* renamed from: A */
    public final void m14445A(AbstractC46793pJ3.C27268q c27268q, boolean z, InterfaceC39067cJ3 interfaceC39067cJ3) {
        if (z) {
            this.f108590e.m14406d(this.f108587b.m14409a() - this.f108588c.m14409a());
            this.f108590e.m14405e(this.f108587b.m14408b() - this.f108588c.m14408b());
        } else {
            this.f108590e.m14407c();
        }
        interfaceC39067cJ3.mo20786d(this.f108590e.m14409a(), this.f108590e.m14408b(), c27268q.m19474c(), c27268q.m19473d());
        this.f108588c.m14406d(this.f108587b.m14409a() + this.f108590e.m14409a());
        this.f108588c.m14405e(this.f108587b.m14408b() + this.f108590e.m14408b());
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27268q.m19474c());
        C28259b c28259b2 = this.f108587b;
        c28259b2.m14405e(c28259b2.m14408b() + c27268q.m19473d());
    }

    /* renamed from: B */
    public final void m14444B(AbstractC46793pJ3.C27269r c27269r, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20775p(0.0f, c27269r.m19472c());
        C28259b c28259b = this.f108587b;
        c28259b.m14405e(c28259b.m14408b() + c27269r.m19472c());
    }

    /* renamed from: C */
    public final List<AbstractC46793pJ3> m14443C() {
        return this.f108586a;
    }

    /* renamed from: D */
    public final InterfaceC39067cJ3 m14442D(InterfaceC39067cJ3 target) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.reset();
        this.f108587b.m14407c();
        this.f108588c.m14407c();
        this.f108589d.m14407c();
        this.f108590e.m14407c();
        List<AbstractC46793pJ3> list = this.f108586a;
        int size = list.size();
        AbstractC46793pJ3 abstractC46793pJ3 = null;
        int i = 0;
        while (i < size) {
            AbstractC46793pJ3 abstractC46793pJ32 = list.get(i);
            if (abstractC46793pJ3 == null) {
                abstractC46793pJ3 = abstractC46793pJ32;
            }
            if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27253b) {
                m14434f(target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27265n) {
                m14416x((AbstractC46793pJ3.C27265n) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27257f) {
                m14426n((AbstractC46793pJ3.C27257f) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27264m) {
                m14417w((AbstractC46793pJ3.C27264m) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27256e) {
                m14427m((AbstractC46793pJ3.C27256e) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27263l) {
                m14418v((AbstractC46793pJ3.C27263l) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27255d) {
                m14428l((AbstractC46793pJ3.C27255d) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27269r) {
                m14444B((AbstractC46793pJ3.C27269r) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27270s) {
                m14440F((AbstractC46793pJ3.C27270s) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27262k) {
                m14419u((AbstractC46793pJ3.C27262k) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27254c) {
                m14432h((AbstractC46793pJ3.C27254c) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27267p) {
                Intrinsics.checkNotNull(abstractC46793pJ3);
                m14414z((AbstractC46793pJ3.C27267p) abstractC46793pJ32, abstractC46793pJ3.m19530a(), target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27259h) {
                Intrinsics.checkNotNull(abstractC46793pJ3);
                m14422r((AbstractC46793pJ3.C27259h) abstractC46793pJ32, abstractC46793pJ3.m19530a(), target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27266o) {
                m14415y((AbstractC46793pJ3.C27266o) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27258g) {
                m14423q((AbstractC46793pJ3.C27258g) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27268q) {
                Intrinsics.checkNotNull(abstractC46793pJ3);
                m14445A((AbstractC46793pJ3.C27268q) abstractC46793pJ32, abstractC46793pJ3.m19529b(), target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27260i) {
                Intrinsics.checkNotNull(abstractC46793pJ3);
                m14421s((AbstractC46793pJ3.C27260i) abstractC46793pJ32, abstractC46793pJ3.m19529b(), target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27261j) {
                m14420t((AbstractC46793pJ3.C27261j) abstractC46793pJ32, target);
            } else if (abstractC46793pJ32 instanceof AbstractC46793pJ3.C27252a) {
                m14437c((AbstractC46793pJ3.C27252a) abstractC46793pJ32, target);
            }
            i++;
            abstractC46793pJ3 = abstractC46793pJ32;
        }
        return target;
    }

    /* renamed from: E */
    public final double m14441E(double d) {
        return (d / 180) * 3.141592653589793d;
    }

    /* renamed from: F */
    public final void m14440F(AbstractC46793pJ3.C27270s c27270s, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20780k(this.f108587b.m14409a(), c27270s.m19471c());
        this.f108587b.m14405e(c27270s.m19471c());
    }

    /* renamed from: a */
    public final void m14439a(char c, float[] fArr) {
        this.f108586a.addAll(C47386qJ3.m17630a(c, fArr));
    }

    /* renamed from: b */
    public final C48571sJ3 m14438b(List<? extends AbstractC46793pJ3> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.f108586a.addAll(nodes);
        return this;
    }

    /* renamed from: c */
    public final void m14437c(AbstractC46793pJ3.C27252a c27252a, InterfaceC39067cJ3 interfaceC39067cJ3) {
        m14431i(interfaceC39067cJ3, this.f108587b.m14409a(), this.f108587b.m14408b(), c27252a.m19528c(), c27252a.m19527d(), c27252a.m19526e(), c27252a.m19524g(), c27252a.m19525f(), c27252a.m19523h(), c27252a.m19522i());
        this.f108587b.m14406d(c27252a.m19528c());
        this.f108587b.m14405e(c27252a.m19527d());
        this.f108588c.m14406d(this.f108587b.m14409a());
        this.f108588c.m14405e(this.f108587b.m14408b());
    }

    /* renamed from: d */
    public final void m14436d(InterfaceC39067cJ3 interfaceC39067cJ3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < ceil) {
            double d25 = d24 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d24;
            double tan = Math.tan(d30 / 2);
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            interfaceC39067cJ3.mo20776o((float) (d20 + (d22 * sin4)), (float) (d23 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            cos = cos;
            ceil = i2;
            d23 = d27;
            d10 = d3;
        }
    }

    /* renamed from: e */
    public final void m14435e() {
        this.f108586a.clear();
    }

    /* renamed from: f */
    public final void m14434f(InterfaceC39067cJ3 interfaceC39067cJ3) {
        this.f108587b.m14406d(this.f108589d.m14409a());
        this.f108587b.m14405e(this.f108589d.m14408b());
        this.f108588c.m14406d(this.f108589d.m14409a());
        this.f108588c.m14405e(this.f108589d.m14408b());
        interfaceC39067cJ3.close();
        interfaceC39067cJ3.mo20781j(this.f108587b.m14409a(), this.f108587b.m14408b());
    }

    /* renamed from: g */
    public final float[] m14433g(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                float[] fArr2 = new float[i3];
                ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, i, min + i);
                return fArr2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public final void m14432h(AbstractC46793pJ3.C27254c c27254c, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20776o(c27254c.m19521c(), c27254c.m19518f(), c27254c.m19520d(), c27254c.m19517g(), c27254c.m19519e(), c27254c.m19516h());
        this.f108588c.m14406d(c27254c.m19520d());
        this.f108588c.m14405e(c27254c.m19517g());
        this.f108587b.m14406d(c27254c.m19519e());
        this.f108587b.m14405e(c27254c.m19516h());
    }

    /* renamed from: i */
    public final void m14431i(InterfaceC39067cJ3 interfaceC39067cJ3, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        boolean z3;
        double d8;
        double d9;
        boolean z4;
        double m14441E = m14441E(d7);
        double cos = Math.cos(m14441E);
        double sin = Math.sin(m14441E);
        double d10 = ((d * cos) + (d2 * sin)) / d5;
        double d11 = (((-d) * sin) + (d2 * cos)) / d6;
        double d12 = ((d3 * cos) + (d4 * sin)) / d5;
        double d13 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        double d16 = 2;
        double d17 = (d10 + d12) / d16;
        double d18 = (d11 + d13) / d16;
        double d19 = (d14 * d14) + (d15 * d15);
        if (d19 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            m14431i(interfaceC39067cJ3, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d14 * sqrt2;
        double d22 = sqrt2 * d15;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double atan2 = Math.atan2(d11 - d9, d10 - d8);
        double atan22 = Math.atan2(d13 - d9, d12 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 != z4) {
            if (i > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        m14436d(interfaceC39067cJ3, (d23 * cos) - (d24 * sin), (d23 * sin) + (d24 * cos), d5, d6, d, d2, m14441E, atan2, atan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 ?: BREAK  , SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14430j(String str, int i, C28258a c28258a) {
        boolean z;
        boolean z2;
        c28258a.m14410d(false);
        int i2 = i;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == ' ' || charAt == ',') {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (charAt == '-') {
                    if (i2 != i && !z3) {
                        c28258a.m14410d(true);
                    }
                    z3 = false;
                } else if (charAt == '.') {
                    if (!z4) {
                        z3 = false;
                        z4 = true;
                    } else {
                        c28258a.m14410d(true);
                    }
                } else {
                    if (charAt == 'e' || charAt == 'E') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z3 = true;
                    }
                    z3 = false;
                }
                if (!z5) {
                    break;
                }
                i2++;
            }
            z3 = false;
            z5 = true;
            if (!z5) {
            }
        }
        c28258a.m14411c(i2);
    }

    /* renamed from: k */
    public final float[] m14429k(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            float[] fArr = new float[str.length()];
            C28258a c28258a = new C28258a(0, false, 3, null);
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m14430j(str, i, c28258a);
                int m14413a = c28258a.m14413a();
                if (i < m14413a) {
                    String substring = str.substring(i, m14413a);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    fArr[i2] = Float.parseFloat(substring);
                    i2++;
                }
                if (c28258a.m14412b()) {
                    i = m14413a;
                } else {
                    i = m14413a + 1;
                }
            }
            return m14433g(fArr, 0, i2);
        }
        return new float[0];
    }

    /* renamed from: l */
    public final void m14428l(AbstractC46793pJ3.C27255d c27255d, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20780k(c27255d.m19515c(), this.f108587b.m14408b());
        this.f108587b.m14406d(c27255d.m19515c());
    }

    /* renamed from: m */
    public final void m14427m(AbstractC46793pJ3.C27256e c27256e, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20780k(c27256e.m19514c(), c27256e.m19513d());
        this.f108587b.m14406d(c27256e.m19514c());
        this.f108587b.m14405e(c27256e.m19513d());
    }

    /* renamed from: n */
    public final void m14426n(AbstractC46793pJ3.C27257f c27257f, InterfaceC39067cJ3 interfaceC39067cJ3) {
        this.f108587b.m14406d(c27257f.m19512c());
        this.f108587b.m14405e(c27257f.m19511d());
        interfaceC39067cJ3.mo20781j(c27257f.m19512c(), c27257f.m19511d());
        this.f108589d.m14406d(this.f108587b.m14409a());
        this.f108589d.m14405e(this.f108587b.m14408b());
    }

    /* renamed from: o */
    public final int m14425o(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: p */
    public final C48571sJ3 m14424p(String pathData) {
        boolean z;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.f108586a.clear();
        int i2 = 0;
        int i3 = 1;
        while (i3 < pathData.length()) {
            int m14425o = m14425o(pathData, i3);
            String substring = pathData.substring(i2, m14425o);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length) {
                if (!z3) {
                    i = i4;
                } else {
                    i = length;
                }
                if (Intrinsics.compare((int) substring.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i4++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i4, length + 1).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m14439a(obj.charAt(0), m14429k(obj));
            }
            i2 = m14425o;
            i3 = m14425o + 1;
        }
        if (i3 - i2 == 1 && i2 < pathData.length()) {
            m14439a(pathData.charAt(i2), new float[0]);
        }
        return this;
    }

    /* renamed from: q */
    public final void m14423q(AbstractC46793pJ3.C27258g c27258g, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20778m(c27258g.m19510c(), c27258g.m19508e(), c27258g.m19509d(), c27258g.m19507f());
        this.f108588c.m14406d(c27258g.m19510c());
        this.f108588c.m14405e(c27258g.m19508e());
        this.f108587b.m14406d(c27258g.m19509d());
        this.f108587b.m14405e(c27258g.m19507f());
    }

    /* renamed from: r */
    public final void m14422r(AbstractC46793pJ3.C27259h c27259h, boolean z, InterfaceC39067cJ3 interfaceC39067cJ3) {
        if (z) {
            float f = 2;
            this.f108590e.m14406d((this.f108587b.m14409a() * f) - this.f108588c.m14409a());
            this.f108590e.m14405e((f * this.f108587b.m14408b()) - this.f108588c.m14408b());
        } else {
            this.f108590e.m14406d(this.f108587b.m14409a());
            this.f108590e.m14405e(this.f108587b.m14408b());
        }
        interfaceC39067cJ3.mo20776o(this.f108590e.m14409a(), this.f108590e.m14408b(), c27259h.m19506c(), c27259h.m19504e(), c27259h.m19505d(), c27259h.m19503f());
        this.f108588c.m14406d(c27259h.m19506c());
        this.f108588c.m14405e(c27259h.m19504e());
        this.f108587b.m14406d(c27259h.m19505d());
        this.f108587b.m14405e(c27259h.m19503f());
    }

    /* renamed from: s */
    public final void m14421s(AbstractC46793pJ3.C27260i c27260i, boolean z, InterfaceC39067cJ3 interfaceC39067cJ3) {
        if (z) {
            float f = 2;
            this.f108590e.m14406d((this.f108587b.m14409a() * f) - this.f108588c.m14409a());
            this.f108590e.m14405e((f * this.f108587b.m14408b()) - this.f108588c.m14408b());
        } else {
            this.f108590e.m14406d(this.f108587b.m14409a());
            this.f108590e.m14405e(this.f108587b.m14408b());
        }
        interfaceC39067cJ3.mo20778m(this.f108590e.m14409a(), this.f108590e.m14408b(), c27260i.m19502c(), c27260i.m19501d());
        this.f108588c.m14406d(this.f108590e.m14409a());
        this.f108588c.m14405e(this.f108590e.m14408b());
        this.f108587b.m14406d(c27260i.m19502c());
        this.f108587b.m14405e(c27260i.m19501d());
    }

    /* renamed from: t */
    public final void m14420t(AbstractC46793pJ3.C27261j c27261j, InterfaceC39067cJ3 interfaceC39067cJ3) {
        float m19500c = c27261j.m19500c() + this.f108587b.m14409a();
        float m19499d = c27261j.m19499d() + this.f108587b.m14408b();
        m14431i(interfaceC39067cJ3, this.f108587b.m14409a(), this.f108587b.m14408b(), m19500c, m19499d, c27261j.m19498e(), c27261j.m19496g(), c27261j.m19497f(), c27261j.m19495h(), c27261j.m19494i());
        this.f108587b.m14406d(m19500c);
        this.f108587b.m14405e(m19499d);
        this.f108588c.m14406d(this.f108587b.m14409a());
        this.f108588c.m14405e(this.f108587b.m14408b());
    }

    /* renamed from: u */
    public final void m14419u(AbstractC46793pJ3.C27262k c27262k, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20788b(c27262k.m19493c(), c27262k.m19490f(), c27262k.m19492d(), c27262k.m19489g(), c27262k.m19491e(), c27262k.m19488h());
        this.f108588c.m14406d(this.f108587b.m14409a() + c27262k.m19492d());
        this.f108588c.m14405e(this.f108587b.m14408b() + c27262k.m19489g());
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27262k.m19491e());
        C28259b c28259b2 = this.f108587b;
        c28259b2.m14405e(c28259b2.m14408b() + c27262k.m19488h());
    }

    /* renamed from: v */
    public final void m14418v(AbstractC46793pJ3.C27263l c27263l, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20775p(c27263l.m19487c(), 0.0f);
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27263l.m19487c());
    }

    /* renamed from: w */
    public final void m14417w(AbstractC46793pJ3.C27264m c27264m, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20775p(c27264m.m19486c(), c27264m.m19485d());
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27264m.m19486c());
        C28259b c28259b2 = this.f108587b;
        c28259b2.m14405e(c28259b2.m14408b() + c27264m.m19485d());
    }

    /* renamed from: x */
    public final void m14416x(AbstractC46793pJ3.C27265n c27265n, InterfaceC39067cJ3 interfaceC39067cJ3) {
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27265n.m19484c());
        C28259b c28259b2 = this.f108587b;
        c28259b2.m14405e(c28259b2.m14408b() + c27265n.m19483d());
        interfaceC39067cJ3.mo20789a(c27265n.m19484c(), c27265n.m19483d());
        this.f108589d.m14406d(this.f108587b.m14409a());
        this.f108589d.m14405e(this.f108587b.m14408b());
    }

    /* renamed from: y */
    public final void m14415y(AbstractC46793pJ3.C27266o c27266o, InterfaceC39067cJ3 interfaceC39067cJ3) {
        interfaceC39067cJ3.mo20786d(c27266o.m19482c(), c27266o.m19480e(), c27266o.m19481d(), c27266o.m19479f());
        this.f108588c.m14406d(this.f108587b.m14409a() + c27266o.m19482c());
        this.f108588c.m14405e(this.f108587b.m14408b() + c27266o.m19480e());
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27266o.m19481d());
        C28259b c28259b2 = this.f108587b;
        c28259b2.m14405e(c28259b2.m14408b() + c27266o.m19479f());
    }

    /* renamed from: z */
    public final void m14414z(AbstractC46793pJ3.C27267p c27267p, boolean z, InterfaceC39067cJ3 interfaceC39067cJ3) {
        if (z) {
            this.f108590e.m14406d(this.f108587b.m14409a() - this.f108588c.m14409a());
            this.f108590e.m14405e(this.f108587b.m14408b() - this.f108588c.m14408b());
        } else {
            this.f108590e.m14407c();
        }
        interfaceC39067cJ3.mo20788b(this.f108590e.m14409a(), this.f108590e.m14408b(), c27267p.m19478c(), c27267p.m19476e(), c27267p.m19477d(), c27267p.m19475f());
        this.f108588c.m14406d(this.f108587b.m14409a() + c27267p.m19478c());
        this.f108588c.m14405e(this.f108587b.m14408b() + c27267p.m19476e());
        C28259b c28259b = this.f108587b;
        c28259b.m14406d(c28259b.m14409a() + c27267p.m19477d());
        C28259b c28259b2 = this.f108587b;
        c28259b2.m14405e(c28259b2.m14408b() + c27267p.m19475f());
    }
}

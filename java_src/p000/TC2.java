package p000;

import androidx.compose.p003ui.graphics.InterfaceC11328c;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34999Om2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\bh\u0010iJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ@\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\u0002\b\u0011H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\bH\u0014J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R(\u0010>\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u0002088PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010g\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006j"}, m28432d2 = {"LTC2;", "LvO2;", "LSC2;", "LL9;", "alignmentLine", "", "E1", "(LL9;)I", "", "y1", "()V", "LA52;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "j1", "(JFLkotlin/jvm/functions/Function1;)V", AbstractC3831J1.f16564d, "height", "p0", "t0", "width", "g0", "B", "LH83;", "h", "LH83;", "G1", "()LH83;", "coordinator", "LXC2;", "i", "LXC2;", "I1", "()LXC2;", "lookaheadScope", "j", "J", "u1", "()J", "K1", "(J)V", "", "k", "Ljava/util/Map;", "oldAlignmentLines", "LVC2;", "l", "LVC2;", "H1", "()LVC2;", "lookaheadLayoutCoordinates", "LyO2;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "m", "LyO2;", "L1", "(LyO2;)V", "_measureResult", "n", "F1", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "o1", "()LSC2;", "child", "", "q1", "()Z", "hasMeasureResult", "s1", "()LyO2;", "measureResult", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "b", "()F", "density", "R0", "fontScale", "t1", "parent", "LJm2;", "r1", "()LJm2;", "layoutNode", "Lnm2;", "p1", "()Lnm2;", "coordinates", "LQ9;", "D1", "()LQ9;", "alignmentLinesOwner", "", "c", "()Ljava/lang/Object;", "parentData", "<init>", "(LH83;LXC2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n1#2:208\n360#3,15:209\n86#4:224\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n160#1:209,15\n201#1:224\n*E\n"})
/* renamed from: TC2 */
/* loaded from: classes.dex */
public abstract class TC2 extends SC2 implements InterfaceC50393vO2 {

    /* renamed from: h */
    public final H83 f34897h;

    /* renamed from: i */
    public final XC2 f34898i;

    /* renamed from: j */
    public long f34899j;

    /* renamed from: k */
    public Map<AbstractC4750L9, Integer> f34900k;

    /* renamed from: l */
    public final VC2 f34901l;

    /* renamed from: m */
    public InterfaceC52172yO2 f34902m;

    /* renamed from: n */
    public final Map<AbstractC4750L9, Integer> f34903n;

    public TC2(H83 coordinator, XC2 lookaheadScope) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(lookaheadScope, "lookaheadScope");
        this.f34897h = coordinator;
        this.f34898i = lookaheadScope;
        this.f34899j = A52.f130b.m116106a();
        this.f34901l = new VC2(this);
        this.f34903n = new LinkedHashMap();
    }

    /* renamed from: B1 */
    public static final /* synthetic */ void m84236B1(TC2 tc2, long j) {
        tc2.m92223m1(j);
    }

    /* renamed from: C1 */
    public static final /* synthetic */ void m84235C1(TC2 tc2, InterfaceC52172yO2 interfaceC52172yO2) {
        tc2.m84226L1(interfaceC52172yO2);
    }

    /* renamed from: B */
    public int mo77402B(int i) {
        H83 m104310i2 = this.f34897h.m104310i2();
        Intrinsics.checkNotNull(m104310i2);
        TC2 m104314d2 = m104310i2.m104314d2();
        Intrinsics.checkNotNull(m104314d2);
        return m104314d2.mo77402B(i);
    }

    /* renamed from: D1 */
    public InterfaceC6687Q9 m84234D1() {
        InterfaceC6687Q9 m91509t = this.f34897h.mo84222r1().m99796X().m91509t();
        Intrinsics.checkNotNull(m91509t);
        return m91509t;
    }

    /* renamed from: E1 */
    public final int m84233E1(AbstractC4750L9 alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = this.f34903n.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: F1 */
    public final Map<AbstractC4750L9, Integer> m84232F1() {
        return this.f34903n;
    }

    /* renamed from: G1 */
    public final H83 m84231G1() {
        return this.f34897h;
    }

    /* renamed from: H1 */
    public final VC2 m84230H1() {
        return this.f34901l;
    }

    /* renamed from: I1 */
    public final XC2 m84229I1() {
        return this.f34898i;
    }

    /* renamed from: J1 */
    public void mo84228J1() {
        InterfaceC45879nm2 interfaceC45879nm2;
        int mo92191l;
        EnumC47065pm2 mo92192k;
        C34999Om2 c34999Om2;
        boolean m92193F;
        OU3.AbstractC6015a.C6016a c6016a = OU3.AbstractC6015a.f26640a;
        int width = mo84221s1().getWidth();
        EnumC47065pm2 layoutDirection = this.f34897h.getLayoutDirection();
        interfaceC45879nm2 = OU3.AbstractC6015a.f26643d;
        mo92191l = c6016a.mo92191l();
        mo92192k = c6016a.mo92192k();
        c34999Om2 = OU3.AbstractC6015a.f26644e;
        OU3.AbstractC6015a.f26642c = width;
        OU3.AbstractC6015a.f26641b = layoutDirection;
        m92193F = c6016a.m92193F(this);
        mo84221s1().mo1429c();
        m85842z1(m92193F);
        OU3.AbstractC6015a.f26642c = mo92191l;
        OU3.AbstractC6015a.f26641b = mo92192k;
        OU3.AbstractC6015a.f26643d = interfaceC45879nm2;
        OU3.AbstractC6015a.f26644e = c34999Om2;
    }

    /* renamed from: K1 */
    public void m84227K1(long j) {
        this.f34899j = j;
    }

    /* renamed from: L1 */
    public final void m84226L1(InterfaceC52172yO2 interfaceC52172yO2) {
        Unit unit;
        boolean z;
        if (interfaceC52172yO2 != null) {
            m92224l1(H52.m104430a(interfaceC52172yO2.getWidth(), interfaceC52172yO2.getHeight()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m92224l1(G52.f10893b.m105825a());
        }
        if (!Intrinsics.areEqual(this.f34902m, interfaceC52172yO2) && interfaceC52172yO2 != null) {
            Map<AbstractC4750L9, Integer> map = this.f34900k;
            if (map != null && !map.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if ((!z || (!interfaceC52172yO2.mo1428d().isEmpty())) && !Intrinsics.areEqual(interfaceC52172yO2.mo1428d(), this.f34900k)) {
                m84234D1().mo88870d().m90689m();
                Map map2 = this.f34900k;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f34900k = map2;
                }
                map2.clear();
                map2.putAll(interfaceC52172yO2.mo1428d());
            }
        }
        this.f34902m = interfaceC52172yO2;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f34897h.mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f34897h.mo3408b();
    }

    @Override // p000.AO2, p000.X62
    /* renamed from: c */
    public Object mo77401c() {
        return this.f34897h.mo77401c();
    }

    /* renamed from: g0 */
    public int mo77400g0(int i) {
        H83 m104310i2 = this.f34897h.m104310i2();
        Intrinsics.checkNotNull(m104310i2);
        TC2 m104314d2 = m104310i2.m104314d2();
        Intrinsics.checkNotNull(m104314d2);
        return m104314d2.mo77400g0(i);
    }

    @Override // p000.Z62
    public EnumC47065pm2 getLayoutDirection() {
        return this.f34897h.getLayoutDirection();
    }

    @Override // p000.OU3
    /* renamed from: j1 */
    public final void mo35855j1(long j, float f, Function1<? super InterfaceC11328c, Unit> function1) {
        if (!A52.m116112i(mo84219u1(), j)) {
            m84227K1(j);
            C34999Om2.C6111a m91506w = mo84222r1().m99796X().m91506w();
            if (m91506w != null) {
                m91506w.m91490u1();
            }
            m85845v1(this.f34897h);
        }
        if (m85843x1()) {
            return;
        }
        mo84228J1();
    }

    @Override // p000.SC2
    /* renamed from: o1 */
    public SC2 mo84225o1() {
        H83 m104310i2 = this.f34897h.m104310i2();
        if (m104310i2 != null) {
            return m104310i2.m104314d2();
        }
        return null;
    }

    /* renamed from: p0 */
    public int mo77399p0(int i) {
        H83 m104310i2 = this.f34897h.m104310i2();
        Intrinsics.checkNotNull(m104310i2);
        TC2 m104314d2 = m104310i2.m104314d2();
        Intrinsics.checkNotNull(m104314d2);
        return m104314d2.mo77399p0(i);
    }

    @Override // p000.SC2
    /* renamed from: p1 */
    public InterfaceC45879nm2 mo84224p1() {
        return this.f34901l;
    }

    @Override // p000.SC2
    /* renamed from: q1 */
    public boolean mo84223q1() {
        return this.f34902m != null;
    }

    @Override // p000.SC2
    /* renamed from: r1 */
    public C33829Jm2 mo84222r1() {
        return this.f34897h.mo84222r1();
    }

    @Override // p000.SC2
    /* renamed from: s1 */
    public InterfaceC52172yO2 mo84221s1() {
        InterfaceC52172yO2 interfaceC52172yO2 = this.f34902m;
        if (interfaceC52172yO2 != null) {
            return interfaceC52172yO2;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    /* renamed from: t0 */
    public int mo77398t0(int i) {
        H83 m104310i2 = this.f34897h.m104310i2();
        Intrinsics.checkNotNull(m104310i2);
        TC2 m104314d2 = m104310i2.m104314d2();
        Intrinsics.checkNotNull(m104314d2);
        return m104314d2.mo77398t0(i);
    }

    @Override // p000.SC2
    /* renamed from: t1 */
    public SC2 mo84220t1() {
        H83 m104309j2 = this.f34897h.m104309j2();
        if (m104309j2 != null) {
            return m104309j2.m104314d2();
        }
        return null;
    }

    @Override // p000.SC2
    /* renamed from: u1 */
    public long mo84219u1() {
        return this.f34899j;
    }

    @Override // p000.SC2
    /* renamed from: y1 */
    public void mo84218y1() {
        mo35855j1(mo84219u1(), 0.0f, null);
    }
}

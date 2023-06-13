package androidx.compose.p003ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p003ui.platform.C11381f;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0002\u001a \u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\bH\u0002\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000bH\u0002\u001a\f\u0010\u0011\u001a\u00020\u0005*\u00020\u000bH\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\u0018\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017*\u00020\u0016H\u0000\u001a\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0000\"\u001e\u0010#\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \"\u0018\u0010%\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 \"\u0018\u0010'\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 \"\u0018\u0010)\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 \"\u001a\u0010,\u001a\u0004\u0018\u00010\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0018\u0010.\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010 \"\u0018\u00100\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010 \"\u0018\u00102\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010 ¨\u00063"}, m28432d2 = {"", "that", "LQh3;", "E", "it", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LJm2;", "Lkotlin/Function1;", "selector", "q", "Lis5;", "n", "Landroidx/compose/ui/platform/f$h;", "oldNode", "D", "v", "o", "LK1;", "", LegacyRepairType.OTHER_KEY, "m", "Lls5;", "", "", "Lks5;", "r", "", "LVp5;", "id", "p", "B", "(Lis5;)Z", "isVisible$annotations", "(Lis5;)V", "isVisible", "x", "isPassword", "A", "isTextField", "y", "isRtl", "w", "(Lis5;)Ljava/lang/Boolean;", "isContainer", "t", "hasCollectionInfo", "z", "isScrollable", "u", "semanticsNodeIsStructurallySignificant", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3169:1\n1#2:3170\n*E\n"})
/* renamed from: androidx.compose.ui.platform.g */
/* loaded from: classes.dex */
public final class C11409g {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.g$a */
    /* loaded from: classes.dex */
    public static final class C11410a extends Lambda implements Function1<C33829Jm2, Boolean> {

        /* renamed from: g */
        public static final C11410a f53333g = new C11410a();

        public C11410a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C33829Jm2 it) {
            C38809bs5 c38809bs5;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC41791gs5 m29803i = C43570js5.m29803i(it);
            if (m29803i != null) {
                c38809bs5 = C42384hs5.m35683a(m29803i);
            } else {
                c38809bs5 = null;
            }
            boolean z2 = true;
            if (c38809bs5 != null && c38809bs5.m62254s()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !c38809bs5.m62260c(C38216as5.f56452a.m65351t())) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: A */
    public static final boolean m68362A(C42977is5 c42977is5) {
        return c42977is5.m31721t().m62260c(C38216as5.f56452a.m65351t());
    }

    /* renamed from: B */
    public static final boolean m68361B(C42977is5 c42977is5) {
        return (c42977is5.m31718w() || c42977is5.m31721t().m62260c(C45349ms5.f98933a.m24808l())) ? false : true;
    }

    /* renamed from: C */
    public static final boolean m68360C(InterfaceC35423Qh3<Float> interfaceC35423Qh3, InterfaceC35423Qh3<Float> interfaceC35423Qh32) {
        return (interfaceC35423Qh3.isEmpty() || interfaceC35423Qh32.isEmpty() || Math.max(interfaceC35423Qh3.getStart().floatValue(), interfaceC35423Qh32.getStart().floatValue()) >= Math.min(interfaceC35423Qh3.getEndExclusive().floatValue(), interfaceC35423Qh32.getEndExclusive().floatValue())) ? false : true;
    }

    /* renamed from: D */
    public static final boolean m68359D(C42977is5 c42977is5, C11381f.C11390h c11390h) {
        Iterator<Map.Entry<? extends C48314rs5<?>, ? extends Object>> it = c11390h.m68377c().iterator();
        while (it.hasNext()) {
            if (!c42977is5.m31731j().m62260c(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public static final InterfaceC35423Qh3<Float> m68358E(float f, float f2) {
        return new C35189Ph3(f, f2);
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m68357a(C4297K1 c4297k1, Object obj) {
        return m68345m(c4297k1, obj);
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m68356b(C42977is5 c42977is5) {
        return m68344n(c42977is5);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m68355c(C42977is5 c42977is5) {
        return m68343o(c42977is5);
    }

    /* renamed from: d */
    public static final /* synthetic */ C33829Jm2 m68354d(C33829Jm2 c33829Jm2, Function1 function1) {
        return m68341q(c33829Jm2, function1);
    }

    /* renamed from: e */
    public static final /* synthetic */ boolean m68353e(C42977is5 c42977is5) {
        return m68337u(c42977is5);
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m68352f(C42977is5 c42977is5) {
        return m68336v(c42977is5);
    }

    /* renamed from: g */
    public static final /* synthetic */ boolean m68351g(C42977is5 c42977is5) {
        return m68334x(c42977is5);
    }

    /* renamed from: h */
    public static final /* synthetic */ boolean m68350h(C42977is5 c42977is5) {
        return m68333y(c42977is5);
    }

    /* renamed from: i */
    public static final /* synthetic */ boolean m68349i(C42977is5 c42977is5) {
        return m68362A(c42977is5);
    }

    /* renamed from: j */
    public static final /* synthetic */ boolean m68348j(C42977is5 c42977is5) {
        return m68361B(c42977is5);
    }

    /* renamed from: k */
    public static final /* synthetic */ boolean m68347k(InterfaceC35423Qh3 interfaceC35423Qh3, InterfaceC35423Qh3 interfaceC35423Qh32) {
        return m68360C(interfaceC35423Qh3, interfaceC35423Qh32);
    }

    /* renamed from: l */
    public static final /* synthetic */ boolean m68346l(C42977is5 c42977is5, C11381f.C11390h c11390h) {
        return m68359D(c42977is5, c11390h);
    }

    /* renamed from: m */
    public static final boolean m68345m(C4297K1<?> c4297k1, Object obj) {
        if (c4297k1 == obj) {
            return true;
        }
        if (!(obj instanceof C4297K1)) {
            return false;
        }
        C4297K1 c4297k12 = (C4297K1) obj;
        if (!Intrinsics.areEqual(c4297k1.m99356b(), c4297k12.m99356b())) {
            return false;
        }
        if (c4297k1.m99357a() == null && c4297k12.m99357a() != null) {
            return false;
        }
        if (c4297k1.m99357a() == null || c4297k12.m99357a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m68344n(C42977is5 c42977is5) {
        return C39420cs5.m44940a(c42977is5.m31731j(), C45349ms5.f98933a.m24816d()) == null;
    }

    /* renamed from: o */
    public static final boolean m68343o(C42977is5 c42977is5) {
        boolean z;
        C38809bs5 m35683a;
        if (m68362A(c42977is5) && !Intrinsics.areEqual(C39420cs5.m44940a(c42977is5.m31721t(), C45349ms5.f98933a.m24813g()), Boolean.TRUE)) {
            return true;
        }
        C33829Jm2 m68341q = m68341q(c42977is5.m31728m(), C11410a.f53333g);
        if (m68341q != null) {
            InterfaceC41791gs5 m29803i = C43570js5.m29803i(m68341q);
            if (m29803i != null && (m35683a = C42384hs5.m35683a(m29803i)) != null) {
                z = Intrinsics.areEqual(C39420cs5.m44940a(m35683a, C45349ms5.f98933a.m24813g()), Boolean.TRUE);
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static final C36667Vp5 m68342p(List<C36667Vp5> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).m79389d() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: q */
    public static final C33829Jm2 m68341q(C33829Jm2 c33829Jm2, Function1<? super C33829Jm2, Boolean> function1) {
        for (C33829Jm2 m99756p0 = c33829Jm2.m99756p0(); m99756p0 != null; m99756p0 = m99756p0.m99756p0()) {
            if (function1.invoke(m99756p0).booleanValue()) {
                return m99756p0;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static final Map<Integer, C44163ks5> m68340r(C44756ls5 c44756ls5) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(c44756ls5, "<this>");
        C42977is5 m26718a = c44756ls5.m26718a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (m26718a.m31728m().mo8156n() && m26718a.m31728m().m99822J0()) {
            Region region = new Region();
            C35055Os4 m31735f = m26718a.m31735f();
            roundToInt = MathKt__MathJVMKt.roundToInt(m31735f.m91258i());
            roundToInt2 = MathKt__MathJVMKt.roundToInt(m31735f.m91255l());
            roundToInt3 = MathKt__MathJVMKt.roundToInt(m31735f.m91257j());
            roundToInt4 = MathKt__MathJVMKt.roundToInt(m31735f.m91262e());
            region.set(new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4));
            m68339s(region, m26718a, linkedHashMap, m26718a);
        }
        return linkedHashMap;
    }

    /* renamed from: s */
    public static final void m68339s(Region region, C42977is5 c42977is5, Map<Integer, C44163ks5> map, C42977is5 c42977is52) {
        boolean z;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        int m31730k;
        C35055Os4 c35055Os4;
        int roundToInt5;
        int roundToInt6;
        int roundToInt7;
        int roundToInt8;
        InterfaceC50621vm2 m31729l;
        boolean z2 = false;
        if (c42977is52.m31728m().mo8156n() && c42977is52.m31728m().m99822J0()) {
            z = false;
        } else {
            z = true;
        }
        if (!region.isEmpty() || c42977is52.m31730k() == c42977is5.m31730k()) {
            if (!z || c42977is52.m31720u()) {
                roundToInt = MathKt__MathJVMKt.roundToInt(c42977is52.m31722s().m91258i());
                roundToInt2 = MathKt__MathJVMKt.roundToInt(c42977is52.m31722s().m91255l());
                roundToInt3 = MathKt__MathJVMKt.roundToInt(c42977is52.m31722s().m91257j());
                roundToInt4 = MathKt__MathJVMKt.roundToInt(c42977is52.m31722s().m91262e());
                Rect rect = new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
                Region region2 = new Region();
                region2.set(rect);
                if (c42977is52.m31730k() == c42977is5.m31730k()) {
                    m31730k = -1;
                } else {
                    m31730k = c42977is52.m31730k();
                }
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer valueOf = Integer.valueOf(m31730k);
                    Rect bounds = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                    map.put(valueOf, new C44163ks5(c42977is52, bounds));
                    List<C42977is5> m31724q = c42977is52.m31724q();
                    for (int size = m31724q.size() - 1; -1 < size; size--) {
                        m68339s(region, c42977is5, map, m31724q.get(size));
                    }
                    region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
                } else if (c42977is52.m31720u()) {
                    C42977is5 m31726o = c42977is52.m31726o();
                    if (m31726o != null && (m31729l = m31726o.m31729l()) != null && m31729l.mo8156n()) {
                        z2 = true;
                    }
                    if (z2) {
                        c35055Os4 = m31726o.m31735f();
                    } else {
                        c35055Os4 = new C35055Os4(0.0f, 0.0f, 10.0f, 10.0f);
                    }
                    Integer valueOf2 = Integer.valueOf(m31730k);
                    roundToInt5 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91258i());
                    roundToInt6 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91255l());
                    roundToInt7 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91257j());
                    roundToInt8 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91262e());
                    map.put(valueOf2, new C44163ks5(c42977is52, new Rect(roundToInt5, roundToInt6, roundToInt7, roundToInt8)));
                } else if (m31730k == -1) {
                    Integer valueOf3 = Integer.valueOf(m31730k);
                    Rect bounds2 = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                    map.put(valueOf3, new C44163ks5(c42977is52, bounds2));
                }
            }
        }
    }

    /* renamed from: t */
    public static final boolean m68338t(C42977is5 c42977is5) {
        return c42977is5.m31731j().m62260c(C45349ms5.f98933a.m24819a());
    }

    /* renamed from: u */
    public static final boolean m68337u(C42977is5 c42977is5) {
        if (Intrinsics.areEqual(m68335w(c42977is5), Boolean.FALSE)) {
            return false;
        }
        if (!Intrinsics.areEqual(m68335w(c42977is5), Boolean.TRUE) && !m68338t(c42977is5) && !m68332z(c42977is5)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static final boolean m68336v(C42977is5 c42977is5) {
        return c42977is5.m31731j().m62260c(C45349ms5.f98933a.m24803q());
    }

    /* renamed from: w */
    public static final Boolean m68335w(C42977is5 c42977is5) {
        return (Boolean) C39420cs5.m44940a(c42977is5.m31731j(), C45349ms5.f98933a.m24807m());
    }

    /* renamed from: x */
    public static final boolean m68334x(C42977is5 c42977is5) {
        return c42977is5.m31731j().m62260c(C45349ms5.f98933a.m24802r());
    }

    /* renamed from: y */
    public static final boolean m68333y(C42977is5 c42977is5) {
        return c42977is5.m31729l().getLayoutDirection() == EnumC47065pm2.Rtl;
    }

    /* renamed from: z */
    public static final boolean m68332z(C42977is5 c42977is5) {
        return c42977is5.m31731j().m62260c(C38216as5.f56452a.m65355p());
    }
}

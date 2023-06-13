package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0014\u0010\n\u001a\u00020\u0006*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H$J\u0006\u0010\u000b\u001a\u00020\u0002J\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u0002J!\u0010\u0011\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010)\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010-\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u00100\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\"\u00103\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u0018\u00104\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u00109\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010;\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010<\u0082\u0001\u0002@A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, m28432d2 = {"LP9;", "", "", "o", "", "LL9;", "", "h", "LH83;", "alignmentLine", "i", "n", "p", "()V", "m", "LCe3;", "position", DateTokenConverter.CONVERTER_KEY, "(LH83;J)J", "initialPosition", "initialCoordinator", "c", "LQ9;", C17296a.f69688o, "LQ9;", "f", "()LQ9;", "alignmentLinesOwner", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(LH83;)Ljava/util/Map;", "alignmentLinesMap", "<init>", "(LQ9;)V", "LKm2;", "LRC2;", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P9 */
/* loaded from: classes.dex */
public abstract class AbstractC6277P9 {

    /* renamed from: a */
    public final InterfaceC6687Q9 f27974a;

    /* renamed from: b */
    public boolean f27975b;

    /* renamed from: c */
    public boolean f27976c;

    /* renamed from: d */
    public boolean f27977d;

    /* renamed from: e */
    public boolean f27978e;

    /* renamed from: f */
    public boolean f27979f;

    /* renamed from: g */
    public boolean f27980g;

    /* renamed from: h */
    public InterfaceC6687Q9 f27981h;

    /* renamed from: i */
    public final Map<AbstractC4750L9, Integer> f27982i;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "childOwner", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n215#2,2:247\n1855#3,2:249\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:247,2\n170#1:249,2\n*E\n"})
    /* renamed from: P9$a */
    /* loaded from: classes.dex */
    public static final class C6278a extends Lambda implements Function1<InterfaceC6687Q9, Unit> {
        public C6278a() {
            super(1);
        }

        /* renamed from: a */
        public final void m90680a(InterfaceC6687Q9 childOwner) {
            Intrinsics.checkNotNullParameter(childOwner, "childOwner");
            if (!childOwner.mo88869n()) {
                return;
            }
            if (childOwner.mo88870d().m90694g()) {
                childOwner.mo88872S();
            }
            Map map = childOwner.mo88870d().f27982i;
            AbstractC6277P9 abstractC6277P9 = AbstractC6277P9.this;
            for (Map.Entry entry : map.entrySet()) {
                abstractC6277P9.m90696c((AbstractC4750L9) entry.getKey(), ((Number) entry.getValue()).intValue(), childOwner.mo88867o0());
            }
            H83 m104309j2 = childOwner.mo88867o0().m104309j2();
            Intrinsics.checkNotNull(m104309j2);
            while (!Intrinsics.areEqual(m104309j2, AbstractC6277P9.this.m90695f().mo88867o0())) {
                Set<AbstractC4750L9> keySet = AbstractC6277P9.this.mo87203e(m104309j2).keySet();
                AbstractC6277P9 abstractC6277P92 = AbstractC6277P9.this;
                for (AbstractC4750L9 abstractC4750L9 : keySet) {
                    abstractC6277P92.m90696c(abstractC4750L9, abstractC6277P92.mo87202i(m104309j2, abstractC4750L9), m104309j2);
                }
                m104309j2 = m104309j2.m104309j2();
                Intrinsics.checkNotNull(m104309j2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
            m90680a(interfaceC6687Q9);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AbstractC6277P9(InterfaceC6687Q9 interfaceC6687Q9, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6687Q9);
    }

    /* renamed from: c */
    public final void m90696c(AbstractC4750L9 abstractC4750L9, int i, H83 h83) {
        Object value;
        float f = i;
        long m104938a = C33056Ge3.m104938a(f, f);
        while (true) {
            m104938a = mo87204d(h83, m104938a);
            h83 = h83.m104309j2();
            Intrinsics.checkNotNull(h83);
            if (Intrinsics.areEqual(h83, this.f27974a.mo88867o0())) {
                break;
            } else if (mo87203e(h83).containsKey(abstractC4750L9)) {
                float mo87202i = mo87202i(h83, abstractC4750L9);
                m104938a = C33056Ge3.m104938a(mo87202i, mo87202i);
            }
        }
        int roundToInt = abstractC4750L9 instanceof YM1 ? MathKt__MathJVMKt.roundToInt(C32120Ce3.m111943p(m104938a)) : MathKt__MathJVMKt.roundToInt(C32120Ce3.m111944o(m104938a));
        Map<AbstractC4750L9, Integer> map = this.f27982i;
        if (map.containsKey(abstractC4750L9)) {
            value = MapsKt__MapsKt.getValue(this.f27982i, abstractC4750L9);
            roundToInt = C5482N9.m94312c(abstractC4750L9, ((Number) value).intValue(), roundToInt);
        }
        map.put(abstractC4750L9, Integer.valueOf(roundToInt));
    }

    /* renamed from: d */
    public abstract long mo87204d(H83 h83, long j);

    /* renamed from: e */
    public abstract Map<AbstractC4750L9, Integer> mo87203e(H83 h83);

    /* renamed from: f */
    public final InterfaceC6687Q9 m90695f() {
        return this.f27974a;
    }

    /* renamed from: g */
    public final boolean m90694g() {
        return this.f27975b;
    }

    /* renamed from: h */
    public final Map<AbstractC4750L9, Integer> m90693h() {
        return this.f27982i;
    }

    /* renamed from: i */
    public abstract int mo87202i(H83 h83, AbstractC4750L9 abstractC4750L9);

    /* renamed from: j */
    public final boolean m90692j() {
        if (!this.f27976c && !this.f27978e && !this.f27979f && !this.f27980g) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m90691k() {
        m90687o();
        if (this.f27981h != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m90690l() {
        return this.f27977d;
    }

    /* renamed from: m */
    public final void m90689m() {
        this.f27975b = true;
        InterfaceC6687Q9 mo88873C = this.f27974a.mo88873C();
        if (mo88873C == null) {
            return;
        }
        if (this.f27976c) {
            mo88873C.mo88874A();
        } else if (this.f27978e || this.f27977d) {
            mo88873C.requestLayout();
        }
        if (this.f27979f) {
            this.f27974a.mo88874A();
        }
        if (this.f27980g) {
            mo88873C.requestLayout();
        }
        mo88873C.mo88870d().m90689m();
    }

    /* renamed from: n */
    public final void m90688n() {
        this.f27982i.clear();
        this.f27974a.mo88871Y0(new C6278a());
        this.f27982i.putAll(mo87203e(this.f27974a.mo88867o0()));
        this.f27975b = false;
    }

    /* renamed from: o */
    public final void m90687o() {
        InterfaceC6687Q9 interfaceC6687Q9;
        AbstractC6277P9 mo88870d;
        AbstractC6277P9 mo88870d2;
        if (m90692j()) {
            interfaceC6687Q9 = this.f27974a;
        } else {
            InterfaceC6687Q9 mo88873C = this.f27974a.mo88873C();
            if (mo88873C == null) {
                return;
            }
            interfaceC6687Q9 = mo88873C.mo88870d().f27981h;
            if (interfaceC6687Q9 == null || !interfaceC6687Q9.mo88870d().m90692j()) {
                InterfaceC6687Q9 interfaceC6687Q92 = this.f27981h;
                if (interfaceC6687Q92 != null && !interfaceC6687Q92.mo88870d().m90692j()) {
                    InterfaceC6687Q9 mo88873C2 = interfaceC6687Q92.mo88873C();
                    if (mo88873C2 != null && (mo88870d2 = mo88873C2.mo88870d()) != null) {
                        mo88870d2.m90687o();
                    }
                    InterfaceC6687Q9 mo88873C3 = interfaceC6687Q92.mo88873C();
                    if (mo88873C3 != null && (mo88870d = mo88873C3.mo88870d()) != null) {
                        interfaceC6687Q9 = mo88870d.f27981h;
                    } else {
                        interfaceC6687Q9 = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.f27981h = interfaceC6687Q9;
    }

    /* renamed from: p */
    public final void m90686p() {
        this.f27975b = true;
        this.f27976c = false;
        this.f27978e = false;
        this.f27977d = false;
        this.f27979f = false;
        this.f27980g = false;
        this.f27981h = null;
    }

    /* renamed from: q */
    public final void m90685q(boolean z) {
        this.f27978e = z;
    }

    /* renamed from: r */
    public final void m90684r(boolean z) {
        this.f27980g = z;
    }

    /* renamed from: s */
    public final void m90683s(boolean z) {
        this.f27979f = z;
    }

    /* renamed from: t */
    public final void m90682t(boolean z) {
        this.f27977d = z;
    }

    /* renamed from: u */
    public final void m90681u(boolean z) {
        this.f27976c = z;
    }

    public AbstractC6277P9(InterfaceC6687Q9 interfaceC6687Q9) {
        this.f27974a = interfaceC6687Q9;
        this.f27975b = true;
        this.f27982i = new HashMap();
    }
}

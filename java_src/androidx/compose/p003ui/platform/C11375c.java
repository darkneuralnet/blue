package androidx.compose.p003ui.platform;

import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m28432d2 = {"Landroidx/compose/ui/platform/c;", "LO1;", "", Entry.TYPE_TEXT, "Li26;", "layoutResult", "Lis5;", "node", "", "j", "", "current", "", C17296a.f69688o, "b", "lineNumber", "LUL4;", "direction", "i", "c", "Li26;", DateTokenConverter.CONVERTER_KEY, "Lis5;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "<init>", "()V", "f", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.c */
/* loaded from: classes.dex */
public final class C11375c extends AbstractC5805O1 {

    /* renamed from: h */
    public static C11375c f53250h;

    /* renamed from: c */
    public C42484i26 f53253c;

    /* renamed from: d */
    public C42977is5 f53254d;

    /* renamed from: e */
    public Rect f53255e;

    /* renamed from: f */
    public static final C11376a f53248f = new C11376a(null);

    /* renamed from: g */
    public static final int f53249g = 8;

    /* renamed from: i */
    public static final UL4 f53251i = UL4.Rtl;

    /* renamed from: j */
    public static final UL4 f53252j = UL4.Ltr;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Landroidx/compose/ui/platform/c$a;", "", "Landroidx/compose/ui/platform/c;", C17296a.f69688o, "LUL4;", "DirectionEnd", "LUL4;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/c;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.c$a */
    /* loaded from: classes.dex */
    public static final class C11376a {
        public /* synthetic */ C11376a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11375c m68478a() {
            if (C11375c.f53250h == null) {
                C11375c.f53250h = new C11375c(null);
            }
            C11375c c11375c = C11375c.f53250h;
            Intrinsics.checkNotNull(c11375c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c11375c;
        }

        private C11376a() {
        }
    }

    public /* synthetic */ C11375c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: a */
    public int[] mo68472a(int i) {
        int roundToInt;
        int coerceAtLeast;
        int m34595m;
        C42484i26 c42484i26 = null;
        if (m93013d().length() <= 0 || i >= m93013d().length()) {
            return null;
        }
        try {
            C42977is5 c42977is5 = this.f53254d;
            if (c42977is5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("node");
                c42977is5 = null;
            }
            roundToInt = MathKt__MathJVMKt.roundToInt(c42977is5.m31735f().m91259h());
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0, i);
            C42484i26 c42484i262 = this.f53253c;
            if (c42484i262 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i262 = null;
            }
            int m34592p = c42484i262.m34592p(coerceAtLeast);
            C42484i26 c42484i263 = this.f53253c;
            if (c42484i263 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i263 = null;
            }
            float m34587u = c42484i263.m34587u(m34592p) + roundToInt;
            C42484i26 c42484i264 = this.f53253c;
            if (c42484i264 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i264 = null;
            }
            C42484i26 c42484i265 = this.f53253c;
            if (c42484i265 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i265 = null;
            }
            if (m34587u < c42484i264.m34587u(c42484i265.m34595m() - 1)) {
                C42484i26 c42484i266 = this.f53253c;
                if (c42484i266 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    c42484i26 = c42484i266;
                }
                m34595m = c42484i26.m34591q(m34587u);
            } else {
                C42484i26 c42484i267 = this.f53253c;
                if (c42484i267 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    c42484i26 = c42484i267;
                }
                m34595m = c42484i26.m34595m();
            }
            return m93014c(coerceAtLeast, m68480i(m34595m - 1, f53252j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: b */
    public int[] mo68471b(int i) {
        int roundToInt;
        int coerceAtMost;
        int i2;
        C42484i26 c42484i26 = null;
        if (m93013d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            C42977is5 c42977is5 = this.f53254d;
            if (c42977is5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("node");
                c42977is5 = null;
            }
            roundToInt = MathKt__MathJVMKt.roundToInt(c42977is5.m31735f().m91259h());
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(m93013d().length(), i);
            C42484i26 c42484i262 = this.f53253c;
            if (c42484i262 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i262 = null;
            }
            int m34592p = c42484i262.m34592p(coerceAtMost);
            C42484i26 c42484i263 = this.f53253c;
            if (c42484i263 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i263 = null;
            }
            float m34587u = c42484i263.m34587u(m34592p) - roundToInt;
            if (m34587u > 0.0f) {
                C42484i26 c42484i264 = this.f53253c;
                if (c42484i264 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    c42484i26 = c42484i264;
                }
                i2 = c42484i26.m34591q(m34587u);
            } else {
                i2 = 0;
            }
            if (coerceAtMost == m93013d().length() && i2 < m34592p) {
                i2++;
            }
            return m93014c(m68480i(i2, f53251i), coerceAtMost);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final int m68480i(int i, UL4 ul4) {
        C42484i26 c42484i26 = this.f53253c;
        C42484i26 c42484i262 = null;
        if (c42484i26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i26 = null;
        }
        int m34588t = c42484i26.m34588t(i);
        C42484i26 c42484i263 = this.f53253c;
        if (c42484i263 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i263 = null;
        }
        if (ul4 != c42484i263.m34584x(m34588t)) {
            C42484i26 c42484i264 = this.f53253c;
            if (c42484i264 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                c42484i262 = c42484i264;
            }
            return c42484i262.m34588t(i);
        }
        C42484i26 c42484i265 = this.f53253c;
        if (c42484i265 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i265 = null;
        }
        return C42484i26.m34593o(c42484i265, i, false, 2, null) - 1;
    }

    /* renamed from: j */
    public final void m68479j(String text, C42484i26 layoutResult, C42977is5 node) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
        Intrinsics.checkNotNullParameter(node, "node");
        m93012f(text);
        this.f53253c = layoutResult;
        this.f53254d = node;
    }

    private C11375c() {
        this.f53255e = new Rect();
    }
}

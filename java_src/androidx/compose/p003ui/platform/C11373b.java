package androidx.compose.p003ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Landroidx/compose/ui/platform/b;", "LO1;", "", Entry.TYPE_TEXT, "Li26;", "layoutResult", "", "j", "", "current", "", C17296a.f69688o, "b", "lineNumber", "LUL4;", "direction", "i", "c", "Li26;", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.b */
/* loaded from: classes.dex */
public final class C11373b extends AbstractC5805O1 {

    /* renamed from: f */
    public static C11373b f53244f;

    /* renamed from: c */
    public C42484i26 f53247c;

    /* renamed from: d */
    public static final C11374a f53242d = new C11374a(null);

    /* renamed from: e */
    public static final int f53243e = 8;

    /* renamed from: g */
    public static final UL4 f53245g = UL4.Rtl;

    /* renamed from: h */
    public static final UL4 f53246h = UL4.Ltr;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Landroidx/compose/ui/platform/b$a;", "", "Landroidx/compose/ui/platform/b;", C17296a.f69688o, "LUL4;", "DirectionEnd", "LUL4;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.b$a */
    /* loaded from: classes.dex */
    public static final class C11374a {
        public /* synthetic */ C11374a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11373b m68483a() {
            if (C11373b.f53244f == null) {
                C11373b.f53244f = new C11373b(null);
            }
            C11373b c11373b = C11373b.f53244f;
            Intrinsics.checkNotNull(c11373b, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c11373b;
        }

        private C11374a() {
        }
    }

    public /* synthetic */ C11373b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: a */
    public int[] mo68472a(int i) {
        int i2;
        if (m93013d().length() <= 0 || i >= m93013d().length()) {
            return null;
        }
        if (i < 0) {
            C42484i26 c42484i26 = this.f53247c;
            if (c42484i26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i26 = null;
            }
            i2 = c42484i26.m34592p(0);
        } else {
            C42484i26 c42484i262 = this.f53247c;
            if (c42484i262 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i262 = null;
            }
            int m34592p = c42484i262.m34592p(i);
            if (m68485i(m34592p, f53245g) == i) {
                i2 = m34592p;
            } else {
                i2 = m34592p + 1;
            }
        }
        C42484i26 c42484i263 = this.f53247c;
        if (c42484i263 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i263 = null;
        }
        if (i2 >= c42484i263.m34595m()) {
            return null;
        }
        return m93014c(m68485i(i2, f53245g), m68485i(i2, f53246h) + 1);
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: b */
    public int[] mo68471b(int i) {
        int i2;
        if (m93013d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > m93013d().length()) {
            C42484i26 c42484i26 = this.f53247c;
            if (c42484i26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i26 = null;
            }
            i2 = c42484i26.m34592p(m93013d().length());
        } else {
            C42484i26 c42484i262 = this.f53247c;
            if (c42484i262 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                c42484i262 = null;
            }
            int m34592p = c42484i262.m34592p(i);
            if (m68485i(m34592p, f53246h) + 1 == i) {
                i2 = m34592p;
            } else {
                i2 = m34592p - 1;
            }
        }
        if (i2 < 0) {
            return null;
        }
        return m93014c(m68485i(i2, f53245g), m68485i(i2, f53246h) + 1);
    }

    /* renamed from: i */
    public final int m68485i(int i, UL4 ul4) {
        C42484i26 c42484i26 = this.f53247c;
        C42484i26 c42484i262 = null;
        if (c42484i26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i26 = null;
        }
        int m34588t = c42484i26.m34588t(i);
        C42484i26 c42484i263 = this.f53247c;
        if (c42484i263 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i263 = null;
        }
        if (ul4 != c42484i263.m34584x(m34588t)) {
            C42484i26 c42484i264 = this.f53247c;
            if (c42484i264 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                c42484i262 = c42484i264;
            }
            return c42484i262.m34588t(i);
        }
        C42484i26 c42484i265 = this.f53247c;
        if (c42484i265 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            c42484i265 = null;
        }
        return C42484i26.m34593o(c42484i265, i, false, 2, null) - 1;
    }

    /* renamed from: j */
    public final void m68484j(String text, C42484i26 layoutResult) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
        m93012f(text);
        this.f53247c = layoutResult;
    }

    private C11373b() {
    }
}

package androidx.compose.p003ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Landroidx/compose/ui/platform/e;", "LO1;", "", Entry.TYPE_TEXT, "", "e", "", "current", "", C17296a.f69688o, "b", "Ljava/util/Locale;", "locale", "l", "index", "", "k", "i", "j", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.e */
/* loaded from: classes.dex */
public final class C11379e extends AbstractC5805O1 {

    /* renamed from: d */
    public static final C11380a f53258d = new C11380a(null);

    /* renamed from: e */
    public static final int f53259e = 8;

    /* renamed from: f */
    public static C11379e f53260f;

    /* renamed from: c */
    public BreakIterator f53261c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Landroidx/compose/ui/platform/e$a;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/e;", C17296a.f69688o, "instance", "Landroidx/compose/ui/platform/e;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e$a */
    /* loaded from: classes.dex */
    public static final class C11380a {
        public /* synthetic */ C11380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11379e m68463a(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            if (C11379e.f53260f == null) {
                C11379e.f53260f = new C11379e(locale, null);
            }
            C11379e c11379e = C11379e.f53260f;
            Intrinsics.checkNotNull(c11379e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c11379e;
        }

        private C11380a() {
        }
    }

    public /* synthetic */ C11379e(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: a */
    public int[] mo68472a(int i) {
        if (m93013d().length() <= 0 || i >= m93013d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!m68466j(i) && !m68465k(i)) {
            BreakIterator breakIterator = this.f53261c;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f53261c;
        if (breakIterator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !m68467i(following)) {
            return null;
        }
        return m93014c(i, following);
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: b */
    public int[] mo68471b(int i) {
        int length = m93013d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !m68466j(i - 1) && !m68467i(i)) {
            BreakIterator breakIterator = this.f53261c;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f53261c;
        if (breakIterator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding == -1 || !m68465k(preceding)) {
            return null;
        }
        return m93014c(preceding, i);
    }

    @Override // p000.AbstractC5805O1
    /* renamed from: e */
    public void mo68470e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        super.mo68470e(text);
        BreakIterator breakIterator = this.f53261c;
        if (breakIterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }

    /* renamed from: i */
    public final boolean m68467i(int i) {
        if (i > 0 && m68466j(i - 1) && (i == m93013d().length() || !m68466j(i))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m68466j(int i) {
        if (i >= 0 && i < m93013d().length()) {
            return Character.isLetterOrDigit(m93013d().codePointAt(i));
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m68465k(int i) {
        if (m68466j(i) && (i == 0 || !m68466j(i - 1))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m68464l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.f53261c = wordInstance;
    }

    public C11379e(Locale locale) {
        m68464l(locale);
    }
}

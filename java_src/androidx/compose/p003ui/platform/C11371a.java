package androidx.compose.p003ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Landroidx/compose/ui/platform/a;", "LO1;", "", Entry.TYPE_TEXT, "", "e", "", "current", "", C17296a.f69688o, "b", "Ljava/util/Locale;", "locale", "i", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.a */
/* loaded from: classes.dex */
public class C11371a extends AbstractC5805O1 {

    /* renamed from: d */
    public static final C11372a f53238d = new C11372a(null);

    /* renamed from: e */
    public static final int f53239e = 8;

    /* renamed from: f */
    public static C11371a f53240f;

    /* renamed from: c */
    public BreakIterator f53241c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Landroidx/compose/ui/platform/a$a;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/a;", C17296a.f69688o, "instance", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.a$a */
    /* loaded from: classes.dex */
    public static final class C11372a {
        public /* synthetic */ C11372a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11371a m68488a(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            if (C11371a.f53240f == null) {
                C11371a.f53240f = new C11371a(locale, null);
            }
            C11371a c11371a = C11371a.f53240f;
            Intrinsics.checkNotNull(c11371a, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c11371a;
        }

        private C11372a() {
        }
    }

    public /* synthetic */ C11371a(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    @Override // p000.InterfaceC6230P1
    /* renamed from: a */
    public int[] mo68472a(int i) {
        int length = m93013d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f53241c;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f53241c;
                if (breakIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } else {
                BreakIterator breakIterator3 = this.f53241c;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i);
                if (following == -1) {
                    return null;
                }
                return m93014c(i, following);
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f53241c;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f53241c;
                if (breakIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } else {
                BreakIterator breakIterator3 = this.f53241c;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return m93014c(preceding, i);
            }
        } while (i != -1);
        return null;
    }

    @Override // p000.AbstractC5805O1
    /* renamed from: e */
    public void mo68470e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        super.mo68470e(text);
        BreakIterator breakIterator = this.f53241c;
        if (breakIterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }

    /* renamed from: i */
    public final void m68489i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(locale)");
        this.f53241c = characterInstance;
    }

    public C11371a(Locale locale) {
        m68489i(locale);
    }
}

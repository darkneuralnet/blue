package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"LBC6;", "", "", "offset", "b", C17296a.f69688o, "LCC6;", "LCC6;", "wordIterator", "Ljava/util/Locale;", "locale", "", Entry.TYPE_TEXT, "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BC6 */
/* loaded from: classes.dex */
public final class BC6 {

    /* renamed from: a */
    public final CC6 f2029a;

    public BC6(Locale locale, CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f2029a = new CC6(text, 0, text.length(), locale);
    }

    /* renamed from: a */
    public final int m114216a(int i) {
        int m112631d;
        if (this.f2029a.m112626i(this.f2029a.m112621n(i))) {
            m112631d = this.f2029a.m112628g(i);
        } else {
            m112631d = this.f2029a.m112631d(i);
        }
        if (m112631d != -1) {
            return m112631d;
        }
        return i;
    }

    /* renamed from: b */
    public final int m114215b(int i) {
        int m112630e;
        if (this.f2029a.m112624k(this.f2029a.m112620o(i))) {
            m112630e = this.f2029a.m112629f(i);
        } else {
            m112630e = this.f2029a.m112630e(i);
        }
        if (m112630e != -1) {
            return m112630e;
        }
        return i;
    }
}

package p000;

import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\t"}, m28432d2 = {"LDv2;", "", "Ljava/util/Locale;", "locale", "", "b", C17296a.f69688o, "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Dv2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32506Dv2 {

    /* renamed from: a */
    public static final C32506Dv2 f6572a = new C32506Dv2();

    private C32506Dv2() {
    }

    /* renamed from: a */
    public final Locale m109701a(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Locale forLanguageTag = Locale.forLanguageTag(locale);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(locale)");
        return forLanguageTag;
    }

    /* renamed from: b */
    public final String m109700b(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String languageTag = locale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "locale.toLanguageTag()");
        return languageTag;
    }
}

package p000;

import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, m28432d2 = {"LYc;", "LBV3;", "", C17296a.f69688o, "Ljava/util/Locale;", "Ljava/util/Locale;", "c", "()Ljava/util/Locale;", "javaLocale", "b", "()Ljava/lang/String;", "language", "getRegion", "region", "<init>", "(Ljava/util/Locale;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yc */
/* loaded from: classes.dex */
public final class C9819Yc implements BV3 {

    /* renamed from: a */
    public final Locale f46070a;

    public C9819Yc(Locale javaLocale) {
        Intrinsics.checkNotNullParameter(javaLocale, "javaLocale");
        this.f46070a = javaLocale;
    }

    @Override // p000.BV3
    /* renamed from: a */
    public String mo74817a() {
        String languageTag = this.f46070a.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    @Override // p000.BV3
    /* renamed from: b */
    public String mo74816b() {
        String language = this.f46070a.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "javaLocale.language");
        return language;
    }

    /* renamed from: c */
    public final Locale m74815c() {
        return this.f46070a;
    }

    @Override // p000.BV3
    public String getRegion() {
        String country = this.f46070a.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "javaLocale.country");
        return country;
    }
}

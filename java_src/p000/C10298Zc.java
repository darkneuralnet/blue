package p000;

import android.os.LocaleList;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LZc;", "LCV3;", "", "languageTag", "LBV3;", "b", "Landroid/os/LocaleList;", C17296a.f69688o, "Landroid/os/LocaleList;", "lastPlatformLocaleList", "Luv2;", "Luv2;", "lastLocaleList", "LRX5;", "c", "LRX5;", "lock", "()Luv2;", "current", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zc */
/* loaded from: classes.dex */
public final class C10298Zc implements CV3 {

    /* renamed from: a */
    public LocaleList f48833a;

    /* renamed from: b */
    public C50119uv2 f48834b;

    /* renamed from: c */
    public final RX5 f48835c = CX5.m112154a();

    @Override // p000.CV3
    /* renamed from: a */
    public C50119uv2 mo72857a() {
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault()");
        synchronized (this.f48835c) {
            C50119uv2 c50119uv2 = this.f48834b;
            if (c50119uv2 != null && localeList == this.f48833a) {
                return c50119uv2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Locale locale = localeList.get(i);
                Intrinsics.checkNotNullExpressionValue(locale, "platformLocaleList[position]");
                arrayList.add(new C47748qv2(new C9819Yc(locale)));
            }
            C50119uv2 c50119uv22 = new C50119uv2(arrayList);
            this.f48833a = localeList;
            this.f48834b = c50119uv22;
            return c50119uv22;
        }
    }

    @Override // p000.CV3
    /* renamed from: b */
    public BV3 mo72856b(String languageTag) {
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(languageTag)");
        return new C9819Yc(forLanguageTag);
    }
}

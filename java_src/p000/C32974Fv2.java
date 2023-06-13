package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Fv2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32974Fv2 {
    /* renamed from: a */
    public static final String m106250a() {
        List split$default;
        String m7765i = C50711vv2.m7769e().m7765i();
        Intrinsics.checkNotNullExpressionValue(m7765i, "getDefault().toLanguageTags()");
        split$default = StringsKt__StringsKt.split$default((CharSequence) m7765i, new String[]{","}, false, 0, 6, (Object) null);
        return (String) split$default.get(0);
    }

    /* renamed from: b */
    public static final String m106249b() {
        boolean contains$default;
        String replaceFirst$default;
        C50711vv2 m7769e = C50711vv2.m7769e();
        Intrinsics.checkNotNullExpressionValue(m7769e, "getDefault()");
        if (m7769e.m7767g()) {
            return "";
        }
        String m7765i = m7769e.m7765i();
        Intrinsics.checkNotNullExpressionValue(m7765i, "localeList.toLanguageTags()");
        String str = null;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) m7765i, (CharSequence) ",", false, 2, (Object) null);
        if (contains$default) {
            Locale m7771c = m7769e.m7771c(0);
            if (m7771c != null) {
                str = m7771c.getLanguage();
            }
            replaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(m7765i, ",", "," + str + ",", false, 4, (Object) null);
            return replaceFirst$default;
        }
        Locale m7771c2 = m7769e.m7771c(0);
        if (m7771c2 != null) {
            str = m7771c2.getLanguage();
        }
        return m7765i + "," + str;
    }
}

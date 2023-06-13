package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¨\u0006\u0006"}, m28432d2 = {"LDf$a;", "", "id", "alternateText", "", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: M22 */
/* loaded from: classes.dex */
public final class M22 {
    /* renamed from: a */
    public static final void m95987a(C1577Df.C1578a c1578a, String id, String alternateText) {
        boolean z;
        Intrinsics.checkNotNullParameter(c1578a, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alternateText, "alternateText");
        if (alternateText.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1578a.m110036k("androidx.compose.foundation.text.inlineContent", id);
            c1578a.m110038i(alternateText);
            c1578a.m110037j();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    /* renamed from: b */
    public static /* synthetic */ void m95986b(C1577Df.C1578a c1578a, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "�";
        }
        m95987a(c1578a, str, str2);
    }
}

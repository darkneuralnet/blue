package p000;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, m28432d2 = {"Landroid/content/Context;", "", "res", "", "value", "", C17296a.f69688o, "ownedbirds_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: RL */
/* loaded from: classes3.dex */
public final class C7150RL {
    /* renamed from: a */
    public static final CharSequence m86842a(Context context, int i, String value) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = context.getString(i, value);
        Intrinsics.checkNotNullExpressionValue(string, "getString(res, value)");
        Spanned fromHtml = Html.fromHtml(string, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(html, 0)");
        return fromHtml;
    }
}

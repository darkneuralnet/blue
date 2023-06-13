package p000;

import android.content.Context;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m28432d2 = {"Landroid/content/Context;", "", C17296a.f69688o, "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: UN2 */
/* loaded from: classes2.dex */
public final class UN2 {
    /* renamed from: a */
    public static final boolean m81572a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }
}

package p000;

import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¨\u0006\u0002"}, m28432d2 = {"Landroid/content/Context;", C17296a.f69688o, "mlkit-scanner_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: KE2 */
/* loaded from: classes3.dex */
public final class KE2 {
    /* renamed from: a */
    public static final Context m99060a(Context context) {
        if (!(context instanceof LifecycleOwner)) {
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "context.baseContext");
                return m99060a(baseContext);
            }
            return null;
        }
        return context;
    }
}

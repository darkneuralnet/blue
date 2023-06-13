package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LS40;", "LrE;", "", "error", "Lio/reactivex/F;", "", "LH6;", "i", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S40 */
/* loaded from: classes3.dex */
public final class S40 extends AbstractC27883rE {

    /* renamed from: a */
    public final Context f33102a;

    public S40(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33102a = context;
    }

    /* renamed from: n */
    public static final List m86043n(S40 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = C48193rg4.ic_filled_issue_triangle;
        String string = this$0.f33102a.getString(C45871nl4.service_center_status_failure_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…r_status_failure_message)");
        return this$0.m16197k(new DQ5(i, string));
    }

    /* renamed from: i */
    public final AbstractC23442F<List<C3023H6>> m86045i(Throwable th) {
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: R40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m86043n;
                m86043n = S40.m86043n(S40.this);
                return m86043n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…er(headerViewModel)\n    }");
        return m33161E;
    }
}

package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LKL3;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "e", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KL3 */
/* loaded from: classes2.dex */
public final class KL3 extends AbstractC5751Ny {

    /* renamed from: d */
    public static final KL3 f19452d = new KL3();

    /* renamed from: e */
    public static final Integer f19453e = null;

    private KL3() {
        super(null);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return f19453e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.payment_method_change_declined_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_change_declined_message)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.payment_method_change_declined_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…od_change_declined_title)");
        return string;
    }
}
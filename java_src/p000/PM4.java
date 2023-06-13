package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LPM4;", "Lo12;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PM4 */
/* loaded from: classes2.dex */
public final class PM4 extends AbstractC46028o12 {

    /* renamed from: a */
    public static final PM4 f28348a = new PM4();

    private PM4() {
        super(null);
    }

    @Override // p000.AbstractC46028o12
    /* renamed from: a */
    public CharSequence mo21979a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.restarting_bluetooth);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.restarting_bluetooth)");
        return string;
    }
}

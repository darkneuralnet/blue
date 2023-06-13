package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lmx2;", "Llz;", "LKQ5;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: mx2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45396mx2 extends AbstractC25837lz {

    /* renamed from: b */
    public static final C45396mx2 f99107b = new C45396mx2();

    private C45396mx2() {
        super(null);
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: a */
    public boolean mo5819a(KQ5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (KQ5.m98894l(data, 0, new IntRange(1, 2), 1, null) && data.m98892n(0) && data.m98893m(1)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: b */
    public void mo5818b(Context context, KQ5 data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        P10.getInstance(context).logCustomEvent(String.valueOf(data.m98898h()), data.m98904b(1));
    }
}

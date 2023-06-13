package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LWh3;", "Llz;", "LKQ5;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Wh3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36827Wh3 extends AbstractC25837lz {

    /* renamed from: b */
    public static final C36827Wh3 f41537b = new C36827Wh3();

    private C36827Wh3() {
        super(null);
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: a */
    public boolean mo5819a(KQ5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (KQ5.m98894l(data, 1, null, 2, null) && data.m98892n(0)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: b */
    public void mo5818b(Context context, KQ5 data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String valueOf = String.valueOf(data.m98898h());
        InterfaceC39721dO1 m65097a = C38310b20.f56803a.m65097a();
        C32132Cf6 mo44325b = m65097a.mo44325b(valueOf, null, true, data.m98899g());
        if (mo44325b != null) {
            m65097a.mo44324c(context, mo44325b);
        }
    }
}

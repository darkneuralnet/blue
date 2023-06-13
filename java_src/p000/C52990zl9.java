package p000;

import android.os.Bundle;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
/* renamed from: zl9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52990zl9 extends AbstractC46389od9<Bundle> {
    public C52990zl9(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // p000.AbstractC46389od9
    /* renamed from: a */
    public final void mo450a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(MessageExtension.FIELD_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m20760d(bundle2);
    }

    @Override // p000.AbstractC46389od9
    /* renamed from: b */
    public final boolean mo449b() {
        return false;
    }
}

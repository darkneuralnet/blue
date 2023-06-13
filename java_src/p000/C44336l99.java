package p000;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;
/* renamed from: l99  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44336l99 extends AbstractC46389od9<Void> {
    public C44336l99(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // p000.AbstractC46389od9
    /* renamed from: a */
    public final void mo450a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m20760d(null);
        } else {
            m20761c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    @Override // p000.AbstractC46389od9
    /* renamed from: b */
    public final boolean mo449b() {
        return true;
    }
}

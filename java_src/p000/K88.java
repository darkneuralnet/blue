package p000;

import android.content.Context;
/* renamed from: K88 */
/* loaded from: classes6.dex */
public final class K88 {

    /* renamed from: a */
    public final Context f19168a;

    /* renamed from: b */
    public final C48157rc8 f19169b = new C48157rc8();

    public /* synthetic */ K88(Context context, C49661u88 c49661u88) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        C32368Df8.m110018a(z, "Context cannot be null", new Object[0]);
        this.f19168a = context.getApplicationContext();
    }

    /* renamed from: b */
    public final Z88 m99149b() {
        return new Z88(this, null);
    }
}

package p000;

import android.content.Context;
/* renamed from: tt8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49512tt8 implements DN8 {

    /* renamed from: a */
    public Context f111346a;

    private C49512tt8() {
    }

    public /* synthetic */ C49512tt8(C48849sm8 c48849sm8) {
    }

    /* renamed from: a */
    public final C49512tt8 m11253a(Context context) {
        context.getClass();
        this.f111346a = context;
        return this;
    }

    @Override // p000.DN8
    public final C38461bH8 zzb() {
        Context context = this.f111346a;
        if (context != null) {
            return new C38461bH8(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}

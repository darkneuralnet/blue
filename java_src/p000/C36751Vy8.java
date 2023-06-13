package p000;

import android.util.Log;
/* renamed from: Vy8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36751Vy8 extends AbstractC44354lB8 {
    public C36751Vy8(C35824Rz8 c35824Rz8, String str, Long l, boolean z) {
        super(c35824Rz8, str, l, true, null);
    }

    @Override // p000.AbstractC44354lB8
    /* renamed from: a */
    public final /* synthetic */ Object mo11116a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f95703b;
            Log.e("PhenotypeFlag", "Invalid long value for " + str + ": " + ((String) obj));
            return null;
        }
    }
}

package p000;

import android.util.Log;
/* renamed from: tz8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49572tz8 extends AbstractC44354lB8 {
    public C49572tz8(C35824Rz8 c35824Rz8, String str, Double d, boolean z) {
        super(c35824Rz8, "measurement.test.double_flag", d, true, null);
    }

    @Override // p000.AbstractC44354lB8
    /* renamed from: a */
    public final /* synthetic */ Object mo11116a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f95703b;
            Log.e("PhenotypeFlag", "Invalid double value for " + str + ": " + ((String) obj));
            return null;
        }
    }
}

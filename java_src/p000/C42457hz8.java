package p000;

import android.util.Log;
/* renamed from: hz8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42457hz8 extends AbstractC44354lB8 {
    public C42457hz8(C35824Rz8 c35824Rz8, String str, Boolean bool, boolean z) {
        super(c35824Rz8, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC44354lB8
    /* renamed from: a */
    public final /* synthetic */ Object mo11116a(Object obj) {
        if (C35770Rt8.f32809c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C35770Rt8.f32810d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String str = this.f95703b;
        Log.e("PhenotypeFlag", "Invalid boolean value for " + str + ": " + ((String) obj));
        return null;
    }
}

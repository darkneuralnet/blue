package p000;

import android.net.Uri;
/* renamed from: Hv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33448Hv8 {

    /* renamed from: a */
    public final NA5 f14188a;

    public C33448Hv8(NA5 na5) {
        this.f14188a = na5;
    }

    /* renamed from: a */
    public final String m103222a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        NA5 na5 = (NA5) this.f14188a.get(uri.toString());
        if (na5 == null) {
            return null;
        }
        return (String) na5.get("".concat(str3));
    }
}

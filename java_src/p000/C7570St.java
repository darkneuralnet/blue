package p000;

import android.net.Uri;
/* renamed from: St */
/* loaded from: classes.dex */
public final class C7570St extends AbstractC40782fA3 {

    /* renamed from: a */
    public final Uri f34395a;

    public C7570St(Uri uri) {
        if (uri != null) {
            this.f34395a = uri;
            return;
        }
        throw new NullPointerException("Null outputUri");
    }

    @Override // p000.AbstractC40782fA3
    /* renamed from: a */
    public Uri mo41783a() {
        return this.f34395a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC40782fA3) {
            return this.f34395a.equals(((AbstractC40782fA3) obj).mo41783a());
        }
        return false;
    }

    public int hashCode() {
        return this.f34395a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f34395a + "}";
    }
}

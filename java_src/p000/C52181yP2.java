package p000;

import android.os.Build;
import android.text.TextUtils;
/* renamed from: yP2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52181yP2 {

    /* renamed from: a */
    public InterfaceC52774zP2 f119485a;

    public C52181yP2(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f119485a = new CP2(str, i, i2);
                    return;
                } else {
                    this.f119485a = new DP2(str, i, i2);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52181yP2)) {
            return false;
        }
        return this.f119485a.equals(((C52181yP2) obj).f119485a);
    }

    public int hashCode() {
        return this.f119485a.hashCode();
    }
}

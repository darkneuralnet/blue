package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import java.util.Set;
import p000.AbstractC34139Ku6;
/* renamed from: xu */
/* loaded from: classes6.dex */
public final class C30337xu extends AbstractC34139Ku6 {

    /* renamed from: a */
    public final boolean f118314a;

    /* renamed from: b */
    public final MlKitException f118315b;

    /* renamed from: c */
    public final Set f118316c;

    public C30337xu(boolean z, MlKitException mlKitException, Set set) {
        this.f118314a = z;
        this.f118315b = mlKitException;
        if (set == null) {
            throw new NullPointerException("Null errors");
        }
        this.f118316c = set;
    }

    @Override // p000.AbstractC34139Ku6
    @KeepForSdk
    /* renamed from: a */
    public Set<AbstractC34139Ku6.AbstractC4613a> mo4502a() {
        return this.f118316c;
    }

    @Override // p000.AbstractC34139Ku6
    @KeepForSdk
    /* renamed from: b */
    public MlKitException mo4501b() {
        return this.f118315b;
    }

    @Override // p000.AbstractC34139Ku6
    @KeepForSdk
    /* renamed from: c */
    public boolean mo4500c() {
        return this.f118314a;
    }

    public final boolean equals(Object obj) {
        MlKitException mlKitException;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC34139Ku6) {
            AbstractC34139Ku6 abstractC34139Ku6 = (AbstractC34139Ku6) obj;
            if (this.f118314a == abstractC34139Ku6.mo4500c() && ((mlKitException = this.f118315b) != null ? mlKitException.equals(abstractC34139Ku6.mo4501b()) : abstractC34139Ku6.mo4501b() == null) && this.f118316c.equals(abstractC34139Ku6.mo4502a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        if (true != this.f118314a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i2 = (i ^ 1000003) * 1000003;
        MlKitException mlKitException = this.f118315b;
        if (mlKitException == null) {
            hashCode = 0;
        } else {
            hashCode = mlKitException.hashCode();
        }
        return ((i2 ^ hashCode) * 1000003) ^ this.f118316c.hashCode();
    }

    public final String toString() {
        boolean z = this.f118314a;
        String valueOf = String.valueOf(this.f118315b);
        String obj = this.f118316c.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 50 + obj.length());
        sb.append("VkpStatus{success=");
        sb.append(z);
        sb.append(", mlKitException=");
        sb.append(valueOf);
        sb.append(", errors=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}

package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
/* renamed from: wu */
/* loaded from: classes6.dex */
public final class C29991wu extends AbstractC33905Ju6 {

    /* renamed from: a */
    public final AbstractC34139Ku6 f116788a;

    /* renamed from: b */
    public final List f116789b;

    /* renamed from: c */
    public final List f116790c;

    /* renamed from: d */
    public final boolean f116791d;

    /* renamed from: e */
    public final Boolean f116792e;

    public C29991wu(AbstractC34139Ku6 abstractC34139Ku6, List list, List list2, boolean z, Boolean bool) {
        if (abstractC34139Ku6 != null) {
            this.f116788a = abstractC34139Ku6;
            if (list != null) {
                this.f116789b = list;
                if (list2 != null) {
                    this.f116790c = list2;
                    this.f116791d = z;
                    this.f116792e = bool;
                    return;
                }
                throw new NullPointerException("Null getImageLabels");
            }
            throw new NullPointerException("Null getDetectedObjects");
        }
        throw new NullPointerException("Null getStatus");
    }

    @Override // p000.AbstractC33905Ju6
    @KeepForSdk
    /* renamed from: a */
    public List<AbstractC32969Fu6> mo6143a() {
        return this.f116789b;
    }

    @Override // p000.AbstractC33905Ju6
    @KeepForSdk
    /* renamed from: b */
    public List<AbstractC33203Gu6> mo6142b() {
        return this.f116790c;
    }

    @Override // p000.AbstractC33905Ju6
    @KeepForSdk
    /* renamed from: c */
    public AbstractC34139Ku6 mo6141c() {
        return this.f116788a;
    }

    @Override // p000.AbstractC33905Ju6
    @KeepForSdk
    /* renamed from: d */
    public Boolean mo6140d() {
        return this.f116792e;
    }

    @Override // p000.AbstractC33905Ju6
    @KeepForSdk
    /* renamed from: e */
    public boolean mo6139e() {
        return this.f116791d;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC33905Ju6) {
            AbstractC33905Ju6 abstractC33905Ju6 = (AbstractC33905Ju6) obj;
            if (this.f116788a.equals(abstractC33905Ju6.mo6141c()) && this.f116789b.equals(abstractC33905Ju6.mo6143a()) && this.f116790c.equals(abstractC33905Ju6.mo6142b()) && this.f116791d == abstractC33905Ju6.mo6139e() && ((bool = this.f116792e) != null ? bool.equals(abstractC33905Ju6.mo6140d()) : abstractC33905Ju6.mo6140d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = (((((this.f116788a.hashCode() ^ 1000003) * 1000003) ^ this.f116789b.hashCode()) * 1000003) ^ this.f116790c.hashCode()) * 1000003;
        if (true != this.f116791d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        Boolean bool = this.f116792e;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return i2 ^ hashCode;
    }

    public final String toString() {
        String obj = this.f116788a.toString();
        String obj2 = this.f116789b.toString();
        String obj3 = this.f116790c.toString();
        boolean z = this.f116791d;
        String valueOf = String.valueOf(this.f116792e);
        StringBuilder sb = new StringBuilder(obj.length() + 98 + obj2.length() + obj3.length() + valueOf.length());
        sb.append("VkpResults{getStatus=");
        sb.append(obj);
        sb.append(", getDetectedObjects=");
        sb.append(obj2);
        sb.append(", getImageLabels=");
        sb.append(obj3);
        sb.append(", isFromColdCall=");
        sb.append(z);
        sb.append(", isAccelerated=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

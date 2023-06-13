package p000;

import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
/* renamed from: uu */
/* loaded from: classes6.dex */
public final class C29330uu extends AbstractC32969Fu6 {

    /* renamed from: a */
    public final Rect f113171a;

    /* renamed from: b */
    public final Integer f113172b;

    /* renamed from: c */
    public final List f113173c;

    public C29330uu(Rect rect, Integer num, List list) {
        this.f113171a = rect;
        this.f113172b = num;
        if (list == null) {
            throw new NullPointerException("Null labels");
        }
        this.f113173c = list;
    }

    @Override // p000.AbstractC32969Fu6
    @KeepForSdk
    /* renamed from: a */
    public Rect mo9542a() {
        return this.f113171a;
    }

    @Override // p000.AbstractC32969Fu6
    @KeepForSdk
    /* renamed from: b */
    public List<AbstractC33203Gu6> mo9541b() {
        return this.f113173c;
    }

    @Override // p000.AbstractC32969Fu6
    @KeepForSdk
    /* renamed from: c */
    public Integer mo9540c() {
        return this.f113172b;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC32969Fu6) {
            AbstractC32969Fu6 abstractC32969Fu6 = (AbstractC32969Fu6) obj;
            if (this.f113171a.equals(abstractC32969Fu6.mo9542a()) && ((num = this.f113172b) != null ? num.equals(abstractC32969Fu6.mo9540c()) : abstractC32969Fu6.mo9540c() == null) && this.f113173c.equals(abstractC32969Fu6.mo9541b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f113171a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f113172b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f113173c.hashCode();
    }

    public final String toString() {
        String obj = this.f113171a.toString();
        String valueOf = String.valueOf(this.f113172b);
        String obj2 = this.f113173c.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 53 + valueOf.length() + obj2.length());
        sb.append("VkpDetectedObject{boundingBox=");
        sb.append(obj);
        sb.append(", trackingId=");
        sb.append(valueOf);
        sb.append(", labels=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}

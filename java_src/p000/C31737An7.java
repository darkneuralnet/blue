package p000;
/* renamed from: An7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31737An7 extends AbstractC52415yn7 {

    /* renamed from: a */
    public final RJ7 f1087a;

    /* renamed from: b */
    public final C37894aK7 f1088b;

    public C31737An7(RJ7 rj7, C37894aK7 c37894aK7) {
        if (rj7 != null) {
            this.f1087a = rj7;
            if (c37894aK7 != null) {
                this.f1088b = c37894aK7;
                return;
            }
            throw new NullPointerException("Null NNAPIInfo");
        }
        throw new NullPointerException("Null deviceInfo");
    }

    @Override // p000.AbstractC52415yn7
    /* renamed from: a */
    public final RJ7 mo2581a() {
        return this.f1087a;
    }

    @Override // p000.AbstractC52415yn7
    /* renamed from: b */
    public final C37894aK7 mo2580b() {
        return this.f1088b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC52415yn7) {
            AbstractC52415yn7 abstractC52415yn7 = (AbstractC52415yn7) obj;
            if (this.f1087a.equals(abstractC52415yn7.mo2581a()) && this.f1088b.equals(abstractC52415yn7.mo2580b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1087a.hashCode() ^ 1000003) * 1000003) ^ this.f1088b.hashCode();
    }

    public final String toString() {
        String obj = this.f1087a.toString();
        String obj2 = this.f1088b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 42 + obj2.length());
        sb.append("AndroidSystemInfo{deviceInfo=");
        sb.append(obj);
        sb.append(", NNAPIInfo=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}

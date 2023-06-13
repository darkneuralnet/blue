package p000;

import android.util.Size;
import android.view.Surface;
/* renamed from: Tt */
/* loaded from: classes.dex */
public final class C8138Tt extends AbstractC42561iA3 {

    /* renamed from: a */
    public final Surface f36403a;

    /* renamed from: b */
    public final Size f36404b;

    /* renamed from: c */
    public final int f36405c;

    public C8138Tt(Surface surface, Size size, int i) {
        if (surface != null) {
            this.f36403a = surface;
            if (size != null) {
                this.f36404b = size;
                this.f36405c = i;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }

    @Override // p000.AbstractC42561iA3
    /* renamed from: b */
    public int mo34385b() {
        return this.f36405c;
    }

    @Override // p000.AbstractC42561iA3
    /* renamed from: c */
    public Size mo34384c() {
        return this.f36404b;
    }

    @Override // p000.AbstractC42561iA3
    /* renamed from: d */
    public Surface mo34383d() {
        return this.f36403a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC42561iA3)) {
            return false;
        }
        AbstractC42561iA3 abstractC42561iA3 = (AbstractC42561iA3) obj;
        if (this.f36403a.equals(abstractC42561iA3.mo34383d()) && this.f36404b.equals(abstractC42561iA3.mo34384c()) && this.f36405c == abstractC42561iA3.mo34385b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f36403a.hashCode() ^ 1000003) * 1000003) ^ this.f36404b.hashCode()) * 1000003) ^ this.f36405c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f36403a + ", size=" + this.f36404b + ", imageFormat=" + this.f36405c + "}";
    }
}

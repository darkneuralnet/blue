package p000;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import p000.YV5;
/* renamed from: mu */
/* loaded from: classes.dex */
public final class C26287mu extends YV5.AbstractC9796d {

    /* renamed from: a */
    public final UUID f99002a;

    /* renamed from: b */
    public final int f99003b;

    /* renamed from: c */
    public final int f99004c;

    /* renamed from: d */
    public final Rect f99005d;

    /* renamed from: e */
    public final Size f99006e;

    /* renamed from: f */
    public final int f99007f;

    /* renamed from: g */
    public final boolean f99008g;

    public C26287mu(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid != null) {
            this.f99002a = uuid;
            this.f99003b = i;
            this.f99004c = i2;
            if (rect != null) {
                this.f99005d = rect;
                if (size != null) {
                    this.f99006e = size;
                    this.f99007f = i3;
                    this.f99008g = z;
                    return;
                }
                throw new NullPointerException("Null size");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null uuid");
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: a */
    public Rect mo24740a() {
        return this.f99005d;
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: b */
    public int mo24739b() {
        return this.f99004c;
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: c */
    public boolean mo24738c() {
        return this.f99008g;
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: d */
    public int mo24737d() {
        return this.f99007f;
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: e */
    public Size mo24736e() {
        return this.f99006e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof YV5.AbstractC9796d)) {
            return false;
        }
        YV5.AbstractC9796d abstractC9796d = (YV5.AbstractC9796d) obj;
        if (this.f99002a.equals(abstractC9796d.mo24734g()) && this.f99003b == abstractC9796d.mo24735f() && this.f99004c == abstractC9796d.mo24739b() && this.f99005d.equals(abstractC9796d.mo24740a()) && this.f99006e.equals(abstractC9796d.mo24736e()) && this.f99007f == abstractC9796d.mo24737d() && this.f99008g == abstractC9796d.mo24738c()) {
            return true;
        }
        return false;
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: f */
    public int mo24735f() {
        return this.f99003b;
    }

    @Override // p000.YV5.AbstractC9796d
    /* renamed from: g */
    public UUID mo24734g() {
        return this.f99002a;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((this.f99002a.hashCode() ^ 1000003) * 1000003) ^ this.f99003b) * 1000003) ^ this.f99004c) * 1000003) ^ this.f99005d.hashCode()) * 1000003) ^ this.f99006e.hashCode()) * 1000003) ^ this.f99007f) * 1000003;
        if (this.f99008g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OutConfig{uuid=" + this.f99002a + ", targets=" + this.f99003b + ", format=" + this.f99004c + ", cropRect=" + this.f99005d + ", size=" + this.f99006e + ", rotationDegrees=" + this.f99007f + ", mirroring=" + this.f99008g + "}";
    }
}

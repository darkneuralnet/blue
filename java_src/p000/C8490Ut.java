package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
/* renamed from: Ut */
/* loaded from: classes.dex */
public final class C8490Ut<T> extends MD3<T> {

    /* renamed from: a */
    public final T f38208a;

    /* renamed from: b */
    public final C36357Uh1 f38209b;

    /* renamed from: c */
    public final int f38210c;

    /* renamed from: d */
    public final Size f38211d;

    /* renamed from: e */
    public final Rect f38212e;

    /* renamed from: f */
    public final int f38213f;

    /* renamed from: g */
    public final Matrix f38214g;

    /* renamed from: h */
    public final InterfaceC51685xa0 f38215h;

    public C8490Ut(T t, C36357Uh1 c36357Uh1, int i, Size size, Rect rect, int i2, Matrix matrix, InterfaceC51685xa0 interfaceC51685xa0) {
        if (t != null) {
            this.f38208a = t;
            this.f38209b = c36357Uh1;
            this.f38210c = i;
            if (size != null) {
                this.f38211d = size;
                if (rect != null) {
                    this.f38212e = rect;
                    this.f38213f = i2;
                    if (matrix != null) {
                        this.f38214g = matrix;
                        if (interfaceC51685xa0 != null) {
                            this.f38215h = interfaceC51685xa0;
                            return;
                        }
                        throw new NullPointerException("Null cameraCaptureResult");
                    }
                    throw new NullPointerException("Null sensorToBufferTransform");
                }
                throw new NullPointerException("Null cropRect");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null data");
    }

    @Override // p000.MD3
    /* renamed from: a */
    public InterfaceC51685xa0 mo80668a() {
        return this.f38215h;
    }

    @Override // p000.MD3
    /* renamed from: b */
    public Rect mo80667b() {
        return this.f38212e;
    }

    @Override // p000.MD3
    /* renamed from: c */
    public T mo80666c() {
        return this.f38208a;
    }

    @Override // p000.MD3
    /* renamed from: d */
    public C36357Uh1 mo80665d() {
        return this.f38209b;
    }

    @Override // p000.MD3
    /* renamed from: e */
    public int mo80664e() {
        return this.f38210c;
    }

    public boolean equals(Object obj) {
        C36357Uh1 c36357Uh1;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MD3)) {
            return false;
        }
        MD3 md3 = (MD3) obj;
        if (this.f38208a.equals(md3.mo80666c()) && ((c36357Uh1 = this.f38209b) != null ? c36357Uh1.equals(md3.mo80665d()) : md3.mo80665d() == null) && this.f38210c == md3.mo80664e() && this.f38211d.equals(md3.mo80661h()) && this.f38212e.equals(md3.mo80667b()) && this.f38213f == md3.mo80663f() && this.f38214g.equals(md3.mo80662g()) && this.f38215h.equals(md3.mo80668a())) {
            return true;
        }
        return false;
    }

    @Override // p000.MD3
    /* renamed from: f */
    public int mo80663f() {
        return this.f38213f;
    }

    @Override // p000.MD3
    /* renamed from: g */
    public Matrix mo80662g() {
        return this.f38214g;
    }

    @Override // p000.MD3
    /* renamed from: h */
    public Size mo80661h() {
        return this.f38211d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f38208a.hashCode() ^ 1000003) * 1000003;
        C36357Uh1 c36357Uh1 = this.f38209b;
        if (c36357Uh1 == null) {
            hashCode = 0;
        } else {
            hashCode = c36357Uh1.hashCode();
        }
        return ((((((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f38210c) * 1000003) ^ this.f38211d.hashCode()) * 1000003) ^ this.f38212e.hashCode()) * 1000003) ^ this.f38213f) * 1000003) ^ this.f38214g.hashCode()) * 1000003) ^ this.f38215h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f38208a + ", exif=" + this.f38209b + ", format=" + this.f38210c + ", size=" + this.f38211d + ", cropRect=" + this.f38212e + ", rotationDegrees=" + this.f38213f + ", sensorToBufferTransform=" + this.f38214g + ", cameraCaptureResult=" + this.f38215h + "}";
    }
}

package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C11164h;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: ou */
/* loaded from: classes.dex */
public final class C27101ou extends JY5 {

    /* renamed from: b */
    public final Executor f102731b;

    /* renamed from: c */
    public final C11164h.AbstractC11178l f102732c;

    /* renamed from: d */
    public final C11164h.InterfaceC11179m f102733d;

    /* renamed from: e */
    public final C11164h.C11180n f102734e;

    /* renamed from: f */
    public final Rect f102735f;

    /* renamed from: g */
    public final Matrix f102736g;

    /* renamed from: h */
    public final int f102737h;

    /* renamed from: i */
    public final int f102738i;

    /* renamed from: j */
    public final int f102739j;

    /* renamed from: k */
    public final List<AbstractC46943pa0> f102740k;

    public C27101ou(Executor executor, C11164h.AbstractC11178l abstractC11178l, C11164h.InterfaceC11179m interfaceC11179m, C11164h.C11180n c11180n, Rect rect, Matrix matrix, int i, int i2, int i3, List<AbstractC46943pa0> list) {
        if (executor != null) {
            this.f102731b = executor;
            this.f102732c = abstractC11178l;
            this.f102733d = interfaceC11179m;
            this.f102734e = c11180n;
            if (rect != null) {
                this.f102735f = rect;
                if (matrix != null) {
                    this.f102736g = matrix;
                    this.f102737h = i;
                    this.f102738i = i2;
                    this.f102739j = i3;
                    if (list != null) {
                        this.f102740k = list;
                        return;
                    }
                    throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null appExecutor");
    }

    @Override // p000.JY5
    /* renamed from: e */
    public Executor mo20325e() {
        return this.f102731b;
    }

    public boolean equals(Object obj) {
        C11164h.AbstractC11178l abstractC11178l;
        C11164h.InterfaceC11179m interfaceC11179m;
        C11164h.C11180n c11180n;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JY5)) {
            return false;
        }
        JY5 jy5 = (JY5) obj;
        if (this.f102731b.equals(jy5.mo20325e()) && ((abstractC11178l = this.f102732c) != null ? abstractC11178l.equals(jy5.mo20322h()) : jy5.mo20322h() == null) && ((interfaceC11179m = this.f102733d) != null ? interfaceC11179m.equals(jy5.mo20320j()) : jy5.mo20320j() == null) && ((c11180n = this.f102734e) != null ? c11180n.equals(jy5.mo20319k()) : jy5.mo20319k() == null) && this.f102735f.equals(jy5.mo20323g()) && this.f102736g.equals(jy5.mo20317m()) && this.f102737h == jy5.mo20318l() && this.f102738i == jy5.mo20321i() && this.f102739j == jy5.mo20324f() && this.f102740k.equals(jy5.mo20316n())) {
            return true;
        }
        return false;
    }

    @Override // p000.JY5
    /* renamed from: f */
    public int mo20324f() {
        return this.f102739j;
    }

    @Override // p000.JY5
    /* renamed from: g */
    public Rect mo20323g() {
        return this.f102735f;
    }

    @Override // p000.JY5
    /* renamed from: h */
    public C11164h.AbstractC11178l mo20322h() {
        return this.f102732c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f102731b.hashCode() ^ 1000003) * 1000003;
        C11164h.AbstractC11178l abstractC11178l = this.f102732c;
        int i = 0;
        if (abstractC11178l == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC11178l.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        C11164h.InterfaceC11179m interfaceC11179m = this.f102733d;
        if (interfaceC11179m == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC11179m.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        C11164h.C11180n c11180n = this.f102734e;
        if (c11180n != null) {
            i = c11180n.hashCode();
        }
        return ((((((((((((i3 ^ i) * 1000003) ^ this.f102735f.hashCode()) * 1000003) ^ this.f102736g.hashCode()) * 1000003) ^ this.f102737h) * 1000003) ^ this.f102738i) * 1000003) ^ this.f102739j) * 1000003) ^ this.f102740k.hashCode();
    }

    @Override // p000.JY5
    /* renamed from: i */
    public int mo20321i() {
        return this.f102738i;
    }

    @Override // p000.JY5
    /* renamed from: j */
    public C11164h.InterfaceC11179m mo20320j() {
        return this.f102733d;
    }

    @Override // p000.JY5
    /* renamed from: k */
    public C11164h.C11180n mo20319k() {
        return this.f102734e;
    }

    @Override // p000.JY5
    /* renamed from: l */
    public int mo20318l() {
        return this.f102737h;
    }

    @Override // p000.JY5
    /* renamed from: m */
    public Matrix mo20317m() {
        return this.f102736g;
    }

    @Override // p000.JY5
    /* renamed from: n */
    public List<AbstractC46943pa0> mo20316n() {
        return this.f102740k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f102731b + ", inMemoryCallback=" + this.f102732c + ", onDiskCallback=" + this.f102733d + ", outputFileOptions=" + this.f102734e + ", cropRect=" + this.f102735f + ", sensorToBufferTransform=" + this.f102736g + ", rotationDegrees=" + this.f102737h + ", jpegQuality=" + this.f102738i + ", captureMode=" + this.f102739j + ", sessionConfigCameraCaptureCallbacks=" + this.f102740k + "}";
    }
}

package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.filament.Stream;
import com.google.android.filament.Texture;
/* renamed from: Qi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35430Qi1 {

    /* renamed from: a */
    public final SurfaceTexture f30775a;

    /* renamed from: b */
    public final Surface f30776b;

    /* renamed from: c */
    public Texture f30777c;

    /* renamed from: d */
    public Stream f30778d;

    public C35430Qi1() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        this.f30775a = surfaceTexture;
        this.f30776b = new Surface(surfaceTexture);
        m88163e(C50423vR5.m8644a(new Stream.Builder().stream(surfaceTexture)));
    }

    /* renamed from: a */
    public Stream m88167a() {
        return (Stream) DZ3.m110174c(this.f30778d);
    }

    /* renamed from: b */
    public Texture m88166b() {
        return (Texture) DZ3.m110174c(this.f30777c);
    }

    /* renamed from: c */
    public Surface m88165c() {
        return (Surface) DZ3.m110174c(this.f30776b);
    }

    /* renamed from: d */
    public SurfaceTexture m88164d() {
        return (SurfaceTexture) DZ3.m110174c(this.f30775a);
    }

    /* renamed from: e */
    public final void m88163e(Stream stream) {
        if (this.f30777c == null) {
            this.f30778d = stream;
            Texture m43308a = C40122e36.m43308a(new Texture.Builder().sampler(Texture.Sampler.SAMPLER_EXTERNAL).format(Texture.InternalFormat.RGB8));
            this.f30777c = m43308a;
            C40122e36.m43306c(m43308a, stream);
            return;
        }
        throw new AssertionError("Stream was initialized twice");
    }
}

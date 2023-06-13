package p000;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.C11148a;
import androidx.camera.core.InterfaceC11183i;
import java.util.concurrent.Executor;
import p000.KX1;
/* renamed from: Tc */
/* loaded from: classes.dex */
public class C7888Tc implements KX1 {

    /* renamed from: a */
    public final ImageReader f35746a;

    /* renamed from: b */
    public final Object f35747b = new Object();

    /* renamed from: c */
    public boolean f35748c = true;

    public C7888Tc(ImageReader imageReader) {
        this.f35746a = imageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m83343k(KX1.InterfaceC4462a interfaceC4462a) {
        interfaceC4462a.mo12500a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m83342l(Executor executor, final KX1.InterfaceC4462a interfaceC4462a, ImageReader imageReader) {
        synchronized (this.f35747b) {
            if (!this.f35748c) {
                executor.execute(new Runnable() { // from class: Sc
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7888Tc.this.m83343k(interfaceC4462a);
                    }
                });
            }
        }
    }

    @Override // p000.KX1
    /* renamed from: a */
    public Surface mo69137a() {
        Surface surface;
        synchronized (this.f35747b) {
            surface = this.f35746a.getSurface();
        }
        return surface;
    }

    @Override // p000.KX1
    /* renamed from: b */
    public int mo69136b() {
        int imageFormat;
        synchronized (this.f35747b) {
            imageFormat = this.f35746a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // p000.KX1
    /* renamed from: c */
    public int mo69135c() {
        int maxImages;
        synchronized (this.f35747b) {
            maxImages = this.f35746a.getMaxImages();
        }
        return maxImages;
    }

    @Override // p000.KX1
    public void close() {
        synchronized (this.f35747b) {
            this.f35746a.close();
        }
    }

    @Override // p000.KX1
    /* renamed from: d */
    public void mo69134d(final KX1.InterfaceC4462a interfaceC4462a, final Executor executor) {
        synchronized (this.f35747b) {
            this.f35748c = false;
            this.f35746a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: Rc
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C7888Tc.this.m83342l(executor, interfaceC4462a, imageReader);
                }
            }, XG2.m77163a());
        }
    }

    @Override // p000.KX1
    /* renamed from: e */
    public InterfaceC11183i mo69133e() {
        Image image;
        synchronized (this.f35747b) {
            try {
                image = this.f35746a.acquireNextImage();
            } catch (RuntimeException e) {
                if (m83344j(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new C11148a(image);
        }
    }

    @Override // p000.KX1
    /* renamed from: g */
    public InterfaceC11183i mo69131g() {
        Image image;
        synchronized (this.f35747b) {
            try {
                image = this.f35746a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (m83344j(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new C11148a(image);
        }
    }

    @Override // p000.KX1
    public int getHeight() {
        int height;
        synchronized (this.f35747b) {
            height = this.f35746a.getHeight();
        }
        return height;
    }

    @Override // p000.KX1
    public int getWidth() {
        int width;
        synchronized (this.f35747b) {
            width = this.f35746a.getWidth();
        }
        return width;
    }

    @Override // p000.KX1
    /* renamed from: h */
    public void mo69130h() {
        synchronized (this.f35747b) {
            this.f35748c = true;
            this.f35746a.setOnImageAvailableListener(null, null);
        }
    }

    /* renamed from: j */
    public final boolean m83344j(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}

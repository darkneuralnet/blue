package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C11234k;
import androidx.camera.core.C11242n;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000.InterfaceC45179mb5;
import p000.KX1;
/* renamed from: wJ6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50945wJ6 implements InterfaceC48574sJ6 {

    /* renamed from: a */
    public final C36761Wa0 f115789a;

    /* renamed from: b */
    public final C52131yJ6 f115790b;

    /* renamed from: c */
    public boolean f115791c = false;

    /* renamed from: d */
    public boolean f115792d = false;

    /* renamed from: e */
    public boolean f115793e;

    /* renamed from: f */
    public boolean f115794f;

    /* renamed from: g */
    public C11242n f115795g;

    /* renamed from: h */
    public AbstractC46943pa0 f115796h;

    /* renamed from: i */
    public DeferrableSurface f115797i;

    /* renamed from: j */
    public ImageWriter f115798j;

    /* renamed from: wJ6$a */
    /* loaded from: classes.dex */
    public class C29860a extends CameraCaptureSession.StateCallback {
        public C29860a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                C50945wJ6.this.f115798j = DY1.m110263c(inputSurface, 1);
            }
        }
    }

    public C50945wJ6(C36761Wa0 c36761Wa0) {
        this.f115793e = false;
        this.f115794f = false;
        this.f115789a = c36761Wa0;
        this.f115793e = C52724zJ6.m1539a(c36761Wa0, 4);
        this.f115794f = S21.m86079a(C51538xJ6.class) != null;
        this.f115790b = new C52131yJ6(3, new InterfaceC45179mb5.InterfaceC26138a() { // from class: vJ6
            @Override // p000.InterfaceC45179mb5.InterfaceC26138a
            /* renamed from: a */
            public final void mo8906a(Object obj) {
                ((InterfaceC11183i) obj).close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m7006m(KX1 kx1) {
        try {
            InterfaceC11183i mo69131g = kx1.mo69131g();
            if (mo69131g != null) {
                this.f115790b.m3674c(mo69131g);
            }
        } catch (IllegalStateException e) {
            C33928Jx2.m99531c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: a */
    public void mo7018a(C11213q.C11215b c11215b) {
        m7009j();
        if (this.f115791c || this.f115794f) {
            return;
        }
        Map<Integer, Size> m7008k = m7008k(this.f115789a);
        if (this.f115793e && !m7008k.isEmpty() && m7008k.containsKey(34) && m7007l(this.f115789a, 34)) {
            Size size = m7008k.get(34);
            C11234k c11234k = new C11234k(size.getWidth(), size.getHeight(), 34, 9);
            this.f115796h = c11234k.m69183n();
            this.f115795g = new C11242n(c11234k);
            c11234k.mo69134d(new KX1.InterfaceC4462a() { // from class: tJ6
                @Override // p000.KX1.InterfaceC4462a
                /* renamed from: a */
                public final void mo12500a(KX1 kx1) {
                    C50945wJ6.this.m7006m(kx1);
                }
            }, C31631Ac0.m115447c());
            NY1 ny1 = new NY1(this.f115795g.mo69137a(), new Size(this.f115795g.getWidth(), this.f115795g.getHeight()), 34);
            this.f115797i = ny1;
            C11242n c11242n = this.f115795g;
            ListenableFuture<Void> m69464i = ny1.m69464i();
            Objects.requireNonNull(c11242n);
            m69464i.addListener(new RunnableC49760uJ6(c11242n), C31631Ac0.m115446d());
            c11215b.m69333k(this.f115797i);
            c11215b.m69340d(this.f115796h);
            c11215b.m69334j(new C29860a());
            c11215b.m69324t(new InputConfiguration(this.f115795g.getWidth(), this.f115795g.getHeight(), this.f115795g.mo69136b()));
        }
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: b */
    public boolean mo7017b() {
        return this.f115791c;
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: c */
    public void mo7016c(boolean z) {
        this.f115792d = z;
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: d */
    public void mo7015d(boolean z) {
        this.f115791c = z;
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: e */
    public InterfaceC11183i mo7014e() {
        try {
            return this.f115790b.mo6312a();
        } catch (NoSuchElementException unused) {
            C33928Jx2.m99531c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: f */
    public boolean mo7013f(InterfaceC11183i interfaceC11183i) {
        Image mo69479k3 = interfaceC11183i.mo69479k3();
        ImageWriter imageWriter = this.f115798j;
        if (imageWriter != null && mo69479k3 != null) {
            try {
                DY1.m110262d(imageWriter, mo69479k3);
                return true;
            } catch (IllegalStateException e) {
                C33928Jx2.m99531c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
            }
        }
        return false;
    }

    @Override // p000.InterfaceC48574sJ6
    /* renamed from: g */
    public boolean mo7012g() {
        return this.f115792d;
    }

    /* renamed from: j */
    public final void m7009j() {
        C52131yJ6 c52131yJ6 = this.f115790b;
        while (!c52131yJ6.isEmpty()) {
            c52131yJ6.mo6312a().close();
        }
        DeferrableSurface deferrableSurface = this.f115797i;
        if (deferrableSurface != null) {
            C11242n c11242n = this.f115795g;
            if (c11242n != null) {
                deferrableSurface.m69464i().addListener(new RunnableC49760uJ6(c11242n), C31631Ac0.m115446d());
                this.f115795g = null;
            }
            deferrableSurface.m69470c();
            this.f115797i = null;
        }
        ImageWriter imageWriter = this.f115798j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f115798j = null;
        }
    }

    /* renamed from: k */
    public final Map<Integer, Size> m7008k(C36761Wa0 c36761Wa0) {
        StreamConfigurationMap streamConfigurationMap;
        int[] inputFormats;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c36761Wa0.m78176a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            C33928Jx2.m99531c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap != null && streamConfigurationMap.getInputFormats() != null) {
            HashMap hashMap = new HashMap();
            for (int i : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new C36194Tp0(true));
                    hashMap.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
            return hashMap;
        }
        return new HashMap();
    }

    /* renamed from: l */
    public final boolean m7007l(C36761Wa0 c36761Wa0, int i) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c36761Wa0.m78176a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i)) == null) {
            return false;
        }
        for (int i2 : validOutputFormatsForInput) {
            if (i2 == 256) {
                return true;
            }
        }
        return false;
    }
}

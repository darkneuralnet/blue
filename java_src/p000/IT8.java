package p000;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: IT8 */
/* loaded from: classes6.dex */
public final class IT8 implements InterfaceC41443gH8 {

    /* renamed from: h */
    public static final DR7 f15740h = DR7.m110446o("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a */
    public boolean f15741a;

    /* renamed from: b */
    public boolean f15742b;

    /* renamed from: c */
    public boolean f15743c;

    /* renamed from: d */
    public final Context f15744d;

    /* renamed from: e */
    public final C9555Xx f15745e;

    /* renamed from: f */
    public final C40559en9 f15746f;

    /* renamed from: g */
    public C46519oq9 f15747g;

    public IT8(Context context, C9555Xx c9555Xx, C40559en9 c40559en9) {
        this.f15744d = context;
        this.f15745e = c9555Xx;
        this.f15746f = c40559en9;
    }

    /* renamed from: b */
    public static boolean m102058b(Context context) {
        if (DynamiteModule.m51595a(context, ModuleDescriptor.MODULE_ID) > 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC41443gH8
    /* renamed from: a */
    public final List mo39690a(C41304g32 c41304g32) throws MlKitException {
        if (this.f15747g == null) {
            zzc();
        }
        C46519oq9 c46519oq9 = (C46519oq9) Preconditions.checkNotNull(this.f15747g);
        if (!this.f15741a) {
            try {
                c46519oq9.zze();
                this.f15741a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int m40237l = c41304g32.m40237l();
        if (c41304g32.m40242g() == 35) {
            m40237l = ((Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j()))[0].getRowStride();
        }
        try {
            List<zzsm> m20461f5 = c46519oq9.m20461f5(C48704sY1.m14056b().m14057a(c41304g32), new zztf(c41304g32.m40242g(), m40237l, c41304g32.m40241h(), C48871sp0.m13606a(c41304g32.m40238k()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zzsm zzsmVar : m20461f5) {
                arrayList.add(new C0774Bx(new HN8(zzsmVar), c41304g32.m40243f()));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e2);
        }
    }

    /* renamed from: c */
    public final C46519oq9 m102057c(DynamiteModule.InterfaceC17483a interfaceC17483a, String str, String str2) throws DynamiteModule.LoadingException, RemoteException {
        return AbstractBinderC50076uq9.m9657c5(DynamiteModule.m51591e(this.f15744d, interfaceC17483a, str).m51592d(str2)).mo4562V2(BinderC36557Vd3.m79636e5(this.f15744d), new zzso(this.f15745e.m76030a(), this.f15745e.m76028c()));
    }

    @Override // p000.InterfaceC41443gH8
    public final void zzb() {
        C46519oq9 c46519oq9 = this.f15747g;
        if (c46519oq9 != null) {
            try {
                c46519oq9.m20460g5();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.f15747g = null;
            this.f15741a = false;
        }
    }

    @Override // p000.InterfaceC41443gH8
    public final boolean zzc() throws MlKitException {
        if (this.f15747g != null) {
            return this.f15742b;
        }
        if (m102058b(this.f15744d)) {
            this.f15742b = true;
            try {
                this.f15747g = m102057c(DynamiteModule.f70339c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e2);
            }
        } else {
            this.f15742b = false;
            if (!C45407my3.m24612a(this.f15744d, f15740h)) {
                if (!this.f15743c) {
                    C45407my3.m24609d(this.f15744d, DR7.m110446o("barcode", "tflite_dynamite"));
                    this.f15743c = true;
                }
                CC7.m112614e(this.f15746f, G59.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f15747g = m102057c(DynamiteModule.f70338b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e3) {
                CC7.m112614e(this.f15746f, G59.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        CC7.m112614e(this.f15746f, G59.NO_ERROR);
        return this.f15742b;
    }
}

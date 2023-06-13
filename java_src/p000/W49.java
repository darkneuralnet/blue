package p000;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: W49 */
/* loaded from: classes6.dex */
public final class W49 implements InterfaceC41443gH8 {

    /* renamed from: a */
    public boolean f40385a;

    /* renamed from: b */
    public final Context f40386b;

    /* renamed from: c */
    public final zzad f40387c;

    /* renamed from: d */
    public final C40559en9 f40388d;

    /* renamed from: e */
    public C50014uk7 f40389e;

    public W49(Context context, C9555Xx c9555Xx, C40559en9 c40559en9) {
        zzad zzadVar = new zzad();
        this.f40387c = zzadVar;
        this.f40386b = context;
        zzadVar.f70574b = c9555Xx.m76030a();
        this.f40388d = c40559en9;
    }

    @Override // p000.InterfaceC41443gH8
    /* renamed from: a */
    public final List mo39690a(C41304g32 c41304g32) throws MlKitException {
        zzq[] m9802g5;
        if (this.f40389e == null) {
            zzc();
        }
        C50014uk7 c50014uk7 = this.f40389e;
        if (c50014uk7 != null) {
            C50014uk7 c50014uk72 = (C50014uk7) Preconditions.checkNotNull(c50014uk7);
            zzaj zzajVar = new zzaj(c41304g32.m40237l(), c41304g32.m40241h(), 0, 0L, C48871sp0.m13606a(c41304g32.m40238k()));
            try {
                int m40242g = c41304g32.m40242g();
                if (m40242g != -1) {
                    if (m40242g != 17) {
                        if (m40242g != 35) {
                            if (m40242g == 842094169) {
                                m9802g5 = c50014uk72.m9803f5(BinderC36557Vd3.m79636e5(C46917pX1.m19142g().m19144e(c41304g32, false)), zzajVar);
                            } else {
                                throw new MlKitException("Unsupported image format: " + c41304g32.m40242g(), 3);
                            }
                        } else {
                            Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j());
                            zzajVar.f70576b = planeArr[0].getRowStride();
                            m9802g5 = c50014uk72.m9803f5(BinderC36557Vd3.m79636e5(planeArr[0].getBuffer()), zzajVar);
                        }
                    } else {
                        m9802g5 = c50014uk72.m9803f5(BinderC36557Vd3.m79636e5(c41304g32.m40244e()), zzajVar);
                    }
                } else {
                    m9802g5 = c50014uk72.m9802g5(BinderC36557Vd3.m79636e5(c41304g32.m40245d()), zzajVar);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq zzqVar : m9802g5) {
                    arrayList.add(new C0774Bx(new C51684xZ8(zzqVar), c41304g32.m40243f()));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to detect with legacy barcode detector", 13, e);
            }
        }
        throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
    }

    @Override // p000.InterfaceC41443gH8
    public final void zzb() {
        C50014uk7 c50014uk7 = this.f40389e;
        if (c50014uk7 != null) {
            try {
                c50014uk7.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.f40389e = null;
        }
    }

    @Override // p000.InterfaceC41443gH8
    public final boolean zzc() throws MlKitException {
        if (this.f40389e != null) {
            return false;
        }
        try {
            C50014uk7 mo18787U = AbstractBinderC45291mm7.m25022c5(DynamiteModule.m51591e(this.f40386b, DynamiteModule.f70338b, "com.google.android.gms.vision.dynamite").m51592d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo18787U(BinderC36557Vd3.m79636e5(this.f40386b), this.f40387c);
            this.f40389e = mo18787U;
            if (mo18787U == null && !this.f40385a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                C45407my3.m24610c(this.f40386b, "barcode");
                this.f40385a = true;
                CC7.m112614e(this.f40388d, G59.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            CC7.m112614e(this.f40388d, G59.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }
}

package p000;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: zZ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52870zZ8 implements GC7 {

    /* renamed from: a */
    public boolean f121548a;

    /* renamed from: b */
    public final Context f121549b;

    /* renamed from: c */
    public final C42290hj1 f121550c;

    /* renamed from: d */
    public final int f121551d;

    /* renamed from: e */
    public final C51993y49 f121552e;

    /* renamed from: f */
    public LG8 f121553f;

    /* renamed from: g */
    public LG8 f121554g;

    public C52870zZ8(Context context, C42290hj1 c42290hj1, C51993y49 c51993y49) {
        this.f121549b = context;
        this.f121550c = c42290hj1;
        this.f121551d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.f121552e = c51993y49;
    }

    /* renamed from: b */
    public static int m1091b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Invalid classification type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    /* renamed from: c */
    public static int m1090c(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid landmark type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    /* renamed from: d */
    public static int m1089d(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(30);
            sb.append("Invalid mode type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    @Override // p000.GC7
    /* renamed from: a */
    public final Pair mo1092a(C41304g32 c41304g32) throws MlKitException {
        List list;
        if (this.f121553f == null && this.f121554g == null) {
            zzd();
        }
        LG8 lg8 = this.f121553f;
        if (lg8 == null && this.f121554g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List list2 = null;
        if (lg8 != null) {
            list = m1088e(lg8, c41304g32);
            if (!this.f121550c.m35948g()) {
                C31792At8.m114980k(list);
            }
        } else {
            list = null;
        }
        LG8 lg82 = this.f121554g;
        if (lg82 != null) {
            list2 = m1088e(lg82, c41304g32);
            C31792At8.m114980k(list2);
        }
        return new Pair(list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5 A[LOOP:0: B:12:0x00a3->B:13:0x00a5, LOOP_END] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m1088e(LG8 lg8, C41304g32 c41304g32) throws MlKitException {
        zzf[] m97425f5;
        try {
            zzp zzpVar = new zzp(c41304g32.m40237l(), c41304g32.m40241h(), 0, SystemClock.elapsedRealtime(), C48871sp0.m13606a(c41304g32.m40238k()));
            if (c41304g32.m40242g() == 35) {
                try {
                    if (this.f121551d >= 201500000) {
                        Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j());
                        m97425f5 = lg8.m97424g5(BinderC36557Vd3.m79636e5(planeArr[0].getBuffer()), BinderC36557Vd3.m79636e5(planeArr[1].getBuffer()), BinderC36557Vd3.m79636e5(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
                        ArrayList arrayList = new ArrayList();
                        for (zzf zzfVar : m97425f5) {
                            arrayList.add(new C39919dj1(zzfVar, c41304g32.m40243f()));
                        }
                        return arrayList;
                    }
                } catch (RemoteException e) {
                    e = e;
                    throw new MlKitException("Failed to detect with legacy face detector", 13, e);
                }
            }
            m97425f5 = lg8.m97425f5(BinderC36557Vd3.m79636e5(C46917pX1.m19142g().m19144e(c41304g32, false)), zzpVar);
            ArrayList arrayList2 = new ArrayList();
            while (r12 < r3) {
            }
            return arrayList2;
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Override // p000.GC7
    public final void zzb() {
        LG8 lg8 = this.f121553f;
        if (lg8 != null) {
            try {
                lg8.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.f121553f = null;
        }
        LG8 lg82 = this.f121554g;
        if (lg82 != null) {
            try {
                lg82.zzd();
            } catch (RemoteException e2) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e2);
            }
            this.f121554g = null;
        }
    }

    @Override // p000.GC7
    public final boolean zzd() throws MlKitException {
        if (this.f121553f != null || this.f121554g != null) {
            return false;
        }
        try {
            InterfaceC41012fZ8 m15921c5 = AbstractBinderC48074rT8.m15921c5(DynamiteModule.m51591e(this.f121549b, DynamiteModule.f70338b, "com.google.android.gms.vision.dynamite").m51592d("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            WO1 m79636e5 = BinderC36557Vd3.m79636e5(this.f121549b);
            if (this.f121550c.m35952c() == 2) {
                if (this.f121554g == null) {
                    this.f121554g = m15921c5.mo19360J4(m79636e5, new zzh(2, 2, 0, true, false, this.f121550c.m35954a()));
                }
                if ((this.f121550c.m35951d() == 2 || this.f121550c.m35953b() == 2 || this.f121550c.m35950e() == 2) && this.f121553f == null) {
                    this.f121553f = m15921c5.mo19360J4(m79636e5, new zzh(m1089d(this.f121550c.m35950e()), m1090c(this.f121550c.m35951d()), m1091b(this.f121550c.m35953b()), false, this.f121550c.m35948g(), this.f121550c.m35954a()));
                }
            } else if (this.f121553f == null) {
                this.f121553f = m15921c5.mo19360J4(m79636e5, new zzh(m1089d(this.f121550c.m35950e()), m1090c(this.f121550c.m35951d()), m1091b(this.f121550c.m35953b()), false, this.f121550c.m35948g(), this.f121550c.m35954a()));
            }
            if (this.f121553f == null && this.f121554g == null && !this.f121548a) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                C45407my3.m24610c(this.f121549b, "barcode");
                this.f121548a = true;
            }
            C42036hH8.m36558c(this.f121552e, false, ZN8.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy face detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }
}

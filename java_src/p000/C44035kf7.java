package p000;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.zznn;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zznt;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: kf7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44035kf7 implements GC7 {

    /* renamed from: a */
    public final Context f94755a;

    /* renamed from: b */
    public final C42290hj1 f94756b;

    /* renamed from: c */
    public boolean f94757c;

    /* renamed from: d */
    public boolean f94758d;

    /* renamed from: e */
    public boolean f94759e;

    /* renamed from: f */
    public final C51993y49 f94760f;

    /* renamed from: g */
    public C46105o89 f94761g;

    /* renamed from: h */
    public C46105o89 f94762h;

    public C44035kf7(Context context, C42290hj1 c42290hj1, C51993y49 c51993y49) {
        this.f94755a = context;
        this.f94756b = c42290hj1;
        this.f94760f = c51993y49;
    }

    /* renamed from: b */
    public static boolean m28660b(Context context) {
        if (DynamiteModule.m51595a(context, ModuleDescriptor.MODULE_ID) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static List m28656f(C46105o89 c46105o89, C41304g32 c41304g32) throws MlKitException {
        if (c41304g32.m40242g() == -1) {
            c41304g32 = C41304g32.m40248a(C46917pX1.m19142g().m19144e(c41304g32, false), c41304g32.m40237l(), c41304g32.m40241h(), c41304g32.m40238k(), 17);
        }
        try {
            List<zznt> m21724f5 = c46105o89.m21724f5(C48704sY1.m14056b().m14057a(c41304g32), new zznn(c41304g32.m40242g(), c41304g32.m40237l(), c41304g32.m40241h(), C48871sp0.m13606a(c41304g32.m40238k()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zznt zzntVar : m21724f5) {
                arrayList.add(new C39919dj1(zzntVar, c41304g32.m40243f()));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to run face detector.", 13, e);
        }
    }

    @Override // p000.GC7
    /* renamed from: a */
    public final Pair mo1092a(C41304g32 c41304g32) throws MlKitException {
        List list;
        if (this.f94762h == null && this.f94761g == null) {
            zzd();
        }
        if (!this.f94757c) {
            try {
                C46105o89 c46105o89 = this.f94762h;
                if (c46105o89 != null) {
                    c46105o89.zze();
                }
                C46105o89 c46105o892 = this.f94761g;
                if (c46105o892 != null) {
                    c46105o892.zze();
                }
                this.f94757c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init face detector.", 13, e);
            }
        }
        C46105o89 c46105o893 = this.f94762h;
        List list2 = null;
        if (c46105o893 != null) {
            list = m28656f(c46105o893, c41304g32);
            if (!this.f94756b.m35948g()) {
                C31792At8.m114980k(list);
            }
        } else {
            list = null;
        }
        C46105o89 c46105o894 = this.f94761g;
        if (c46105o894 != null) {
            list2 = m28656f(c46105o894, c41304g32);
            C31792At8.m114980k(list2);
        }
        return new Pair(list, list2);
    }

    /* renamed from: c */
    public final C46105o89 m28659c(DynamiteModule.InterfaceC17483a interfaceC17483a, String str, String str2, zznr zznrVar) throws DynamiteModule.LoadingException, RemoteException {
        return E89.m109344c5(DynamiteModule.m51591e(this.f94755a, interfaceC17483a, str).m51592d(str2)).mo7355U0(BinderC36557Vd3.m79636e5(this.f94755a), zznrVar);
    }

    /* renamed from: d */
    public final void m28658d() throws DynamiteModule.LoadingException, RemoteException {
        if (this.f94756b.m35952c() == 2) {
            if (this.f94761g == null) {
                this.f94761g = m28657e(new zznr(this.f94756b.m35950e(), 1, 1, 2, false, this.f94756b.m35954a()));
            }
            if ((this.f94756b.m35951d() == 2 || this.f94756b.m35953b() == 2 || this.f94756b.m35950e() == 2) && this.f94762h == null) {
                this.f94762h = m28657e(new zznr(this.f94756b.m35950e(), this.f94756b.m35951d(), this.f94756b.m35953b(), 1, this.f94756b.m35948g(), this.f94756b.m35954a()));
            }
        } else if (this.f94762h == null) {
            this.f94762h = m28657e(new zznr(this.f94756b.m35950e(), this.f94756b.m35951d(), this.f94756b.m35953b(), 1, this.f94756b.m35948g(), this.f94756b.m35954a()));
        }
    }

    /* renamed from: e */
    public final C46105o89 m28657e(zznr zznrVar) throws DynamiteModule.LoadingException, RemoteException {
        if (this.f94758d) {
            return m28659c(DynamiteModule.f70339c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zznrVar);
        }
        return m28659c(DynamiteModule.f70338b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zznrVar);
    }

    @Override // p000.GC7
    public final void zzb() {
        try {
            C46105o89 c46105o89 = this.f94762h;
            if (c46105o89 != null) {
                c46105o89.m21723g5();
                this.f94762h = null;
            }
            C46105o89 c46105o892 = this.f94761g;
            if (c46105o892 != null) {
                c46105o892.m21723g5();
                this.f94761g = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.f94757c = false;
    }

    @Override // p000.GC7
    public final boolean zzd() throws MlKitException {
        if (this.f94762h == null && this.f94761g == null) {
            if (DynamiteModule.m51595a(this.f94755a, ModuleDescriptor.MODULE_ID) > 0) {
                this.f94758d = true;
                try {
                    m28658d();
                } catch (RemoteException e) {
                    throw new MlKitException("Failed to create thick face detector.", 13, e);
                } catch (DynamiteModule.LoadingException e2) {
                    throw new MlKitException("Failed to load the bundled face module.", 13, e2);
                }
            } else {
                this.f94758d = false;
                try {
                    m28658d();
                } catch (RemoteException e3) {
                    C42036hH8.m36558c(this.f94760f, this.f94758d, ZN8.OPTIONAL_MODULE_INIT_ERROR);
                    throw new MlKitException("Failed to create thin face detector.", 13, e3);
                } catch (DynamiteModule.LoadingException unused) {
                    if (!this.f94759e) {
                        C45407my3.m24610c(this.f94755a, "face");
                        this.f94759e = true;
                    }
                    C42036hH8.m36558c(this.f94760f, this.f94758d, ZN8.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14);
                }
            }
            C42036hH8.m36558c(this.f94760f, this.f94758d, ZN8.NO_ERROR);
            return this.f94758d;
        }
        return this.f94758d;
    }
}

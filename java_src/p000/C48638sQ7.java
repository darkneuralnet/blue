package p000;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsi;
import com.google.mlkit.common.MlKitException;
/* renamed from: sQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48638sQ7 implements KT8 {

    /* renamed from: a */
    public final Context f108766a;

    /* renamed from: b */
    public final InterfaceC51377x26 f108767b;

    /* renamed from: c */
    public boolean f108768c;

    /* renamed from: d */
    public boolean f108769d;

    /* renamed from: e */
    public final C45293mm9 f108770e;

    /* renamed from: f */
    public C43534jo9 f108771f;

    public C48638sQ7(Context context, InterfaceC51377x26 interfaceC51377x26, C45293mm9 c45293mm9) {
        this.f108766a = context;
        this.f108767b = interfaceC51377x26;
        this.f108770e = c45293mm9;
    }

    /* renamed from: b */
    public static zzsi m14217b(InterfaceC51377x26 interfaceC51377x26, String str) {
        int i;
        String mo5909c = interfaceC51377x26.mo5909c();
        String mo5905g = interfaceC51377x26.mo5905g();
        switch (interfaceC51377x26.mo5906f()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            default:
                i = 1;
                break;
        }
        return new zzsi(mo5909c, mo5905g, str, true, i - 1, interfaceC51377x26.mo5907e());
    }

    @Override // p000.KT8
    /* renamed from: a */
    public final C46615p06 mo14218a(C41304g32 c41304g32) throws MlKitException {
        if (this.f108771f == null) {
            zzb();
        }
        C43534jo9 c43534jo9 = (C43534jo9) Preconditions.checkNotNull(this.f108771f);
        if (!this.f108768c) {
            try {
                c43534jo9.zze();
                this.f108768c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f108767b.mo5910b())), 13, e);
            }
        }
        try {
            return new C46615p06(c43534jo9.m29886f5(C48704sY1.m14056b().m14057a(c41304g32), new zzrr(c41304g32.m40242g(), c41304g32.m40237l(), c41304g32.m40241h(), C48871sp0.m13606a(c41304g32.m40238k()), SystemClock.elapsedRealtime())), c41304g32.m40243f());
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f108767b.mo5910b())), 13, e2);
        }
    }

    @Override // p000.KT8
    public final void zzb() throws MlKitException {
        String str;
        C43534jo9 mo4601t0;
        if (this.f108771f == null) {
            try {
                InterfaceC51377x26 interfaceC51377x26 = this.f108767b;
                boolean z = interfaceC51377x26 instanceof JC7;
                if (z) {
                    str = ((JC7) interfaceC51377x26).zza();
                } else {
                    str = null;
                }
                if (this.f108767b.mo5908d()) {
                    mo4601t0 = AbstractBinderC48870so9.m13612c5(DynamiteModule.m51591e(this.f108766a, DynamiteModule.f70339c, this.f108767b.mo5903i()).m51592d("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).mo4601t0(BinderC36557Vd3.m79636e5(this.f108766a), m14217b(this.f108767b, str));
                } else if (z) {
                    mo4601t0 = Zn9.m72485c5(DynamiteModule.m51591e(this.f108766a, DynamiteModule.f70338b, this.f108767b.mo5903i()).m51592d("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).mo42535t3(BinderC36557Vd3.m79636e5(this.f108766a), null, m14217b(this.f108767b, str));
                } else {
                    InterfaceC51834xo9 m13612c5 = AbstractBinderC48870so9.m13612c5(DynamiteModule.m51591e(this.f108766a, DynamiteModule.f70338b, this.f108767b.mo5903i()).m51592d("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                    if (this.f108767b.mo5906f() == 1) {
                        mo4601t0 = m13612c5.mo4602M3(BinderC36557Vd3.m79636e5(this.f108766a));
                    } else {
                        mo4601t0 = m13612c5.mo4601t0(BinderC36557Vd3.m79636e5(this.f108766a), m14217b(this.f108767b, str));
                    }
                }
                this.f108771f = mo4601t0;
                C37204Xx2.m76024b(this.f108770e, this.f108767b.mo5908d(), V39.NO_ERROR);
            } catch (RemoteException e) {
                C37204Xx2.m76024b(this.f108770e, this.f108767b.mo5908d(), V39.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f108767b.mo5910b())), 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                C37204Xx2.m76024b(this.f108770e, this.f108767b.mo5908d(), V39.OPTIONAL_MODULE_NOT_AVAILABLE);
                if (!this.f108767b.mo5908d()) {
                    if (!this.f108769d) {
                        C45407my3.m24608e(this.f108766a, C44856m26.m26457a(this.f108767b));
                        this.f108769d = true;
                    }
                    throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.f108767b.mo5910b(), e2.getMessage()), 13, e2);
            }
        }
    }

    @Override // p000.KT8
    public final void zzc() {
        C43534jo9 c43534jo9 = this.f108771f;
        if (c43534jo9 != null) {
            try {
                c43534jo9.m29885g5();
            } catch (RemoteException e) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.f108767b.mo5910b())), e);
            }
            this.f108771f = null;
        }
        this.f108768c = false;
    }
}

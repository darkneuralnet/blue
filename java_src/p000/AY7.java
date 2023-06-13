package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;
/* renamed from: AY7 */
/* loaded from: classes6.dex */
public final class AY7 implements KT8 {

    /* renamed from: a */
    public final Context f783a;

    /* renamed from: b */
    public final zzp f784b = new zzp(null);

    /* renamed from: c */
    public boolean f785c;

    /* renamed from: d */
    public C41804gt8 f786d;

    public AY7(Context context) {
        this.f783a = context;
    }

    @Override // p000.KT8
    /* renamed from: a */
    public final C46615p06 mo14218a(C41304g32 c41304g32) throws MlKitException {
        Bitmap m19143f;
        int i;
        if (this.f786d == null) {
            zzb();
        }
        if (this.f786d != null) {
            if (c41304g32.m40242g() == -1) {
                m19143f = c41304g32.m40245d();
                i = C48871sp0.m13606a(c41304g32.m40238k());
            } else {
                m19143f = C46917pX1.m19142g().m19143f(c41304g32);
                i = 0;
            }
            try {
                return C42629iH8.m34242a(((C41804gt8) Preconditions.checkNotNull(this.f786d)).m37359f5(BinderC36557Vd3.m79636e5(m19143f), new zzd(c41304g32.m40237l(), c41304g32.m40241h(), 0, 0L, i)), c41304g32.m40243f());
            } catch (RemoteException e) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    @Override // p000.KT8
    public final void zzb() throws MlKitException {
        if (this.f786d == null) {
            try {
                C41804gt8 mo14249w1 = OG8.m92580c5(DynamiteModule.m51591e(this.f783a, DynamiteModule.f70338b, "com.google.android.gms.vision.dynamite").m51592d("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).mo14249w1(BinderC36557Vd3.m79636e5(this.f783a), this.f784b);
                this.f786d = mo14249w1;
                if (mo14249w1 == null && !this.f785c) {
                    Log.d("LegacyTextDelegate", "Request OCR optional module download.");
                    C45407my3.m24610c(this.f783a, "ocr");
                    this.f785c = true;
                }
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
    }

    @Override // p000.KT8
    public final void zzc() {
        C41804gt8 c41804gt8 = this.f786d;
        if (c41804gt8 != null) {
            try {
                c41804gt8.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
            }
            this.f786d = null;
        }
    }
}

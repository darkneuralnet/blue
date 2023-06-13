package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom;
/* renamed from: vQ6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC50415vQ6 extends O77 {

    /* renamed from: a */
    public final Context f114050a;

    /* renamed from: b */
    public final String f114051b;

    /* renamed from: c */
    public final String f114052c;

    /* renamed from: d */
    public final String f114053d;

    /* renamed from: e */
    public C46656p47 f114054e;

    public BinderC50415vQ6(Context context, String str, String str2, String str3) {
        this.f114050a = context;
        this.f114051b = str;
        this.f114052c = str2;
        this.f114053d = str3;
    }

    @Override // p000.P77
    /* renamed from: b0 */
    public final zbom mo8686b0(WO1 wo1, zbnz zbnzVar) throws RemoteException {
        C46656p47 c46656p47 = this.f114054e;
        if (c46656p47 != null) {
            AbstractC42535i77 m19989b = ((C46656p47) Preconditions.checkNotNull(c46656p47)).m19989b(wo1, zbnzVar, true);
            L77 mo6846c = m19989b.mo6846c();
            if (mo6846c.m97680e()) {
                return m19989b.mo6847b();
            }
            throw ((Throwable) mo6846c.mo20901b().mo4153a());
        }
        throw new RemoteException("Process is started without initiation.");
    }

    @Override // p000.P77
    /* renamed from: y */
    public final zbf[] mo8685y(WO1 wo1, zbnz zbnzVar) throws RemoteException {
        throw new RemoteException("#recognizeBitmap should not be triggered from text thick client.");
    }

    @Override // p000.P77
    public final void zbc() throws RemoteException {
        String str;
        if (this.f114054e == null) {
            System.loadLibrary("mlkit_google_ocr_pipeline");
            String str2 = this.f114053d;
            if (str2 != null && !str2.isEmpty()) {
                str = this.f114053d;
            } else {
                str = "";
            }
            C46656p47 m19990a = C46656p47.m19990a(this.f114050a, AbstractC34373Lu6.m96206a(this.f114051b, this.f114052c, str).mo14000a());
            this.f114054e = m19990a;
            L77 m19988c = m19990a.m19988c();
            if (!m19988c.m97680e()) {
                throw ((Throwable) m19988c.mo20901b().mo4153a());
            }
        }
    }

    @Override // p000.P77
    public final void zbd() {
        C46656p47 c46656p47 = this.f114054e;
        if (c46656p47 != null) {
            c46656p47.m19987d();
            this.f114054e = null;
        }
    }
}

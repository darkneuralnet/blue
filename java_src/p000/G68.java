package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* renamed from: G68 */
/* loaded from: classes6.dex */
public final class G68 extends AbstractC34072Kn2 {

    /* renamed from: b */
    public final C52226yU2 f10982b;

    public G68(C52226yU2 c52226yU2) {
        this.f10982b = c52226yU2;
    }

    @Override // p000.AbstractC34072Kn2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11764a(Object obj) {
        GC7 c44035kf7;
        C42290hj1 c42290hj1 = (C42290hj1) obj;
        Context m3452b = this.f10982b.m3452b();
        C51993y49 m99216b = K69.m99216b(C42036hH8.m36559b());
        if (!C44035kf7.m28660b(m3452b) && GoogleApiAvailabilityLight.getInstance().getApkVersion(m3452b) < 204500000) {
            c44035kf7 = new C52870zZ8(m3452b, c42290hj1, m99216b);
        } else {
            c44035kf7 = new C44035kf7(m3452b, c42290hj1, m99216b);
        }
        return new C31792At8(K69.m99216b(C42036hH8.m36559b()), c42290hj1, c44035kf7);
    }
}

package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* renamed from: OM6 */
/* loaded from: classes6.dex */
public final class OM6 {

    /* renamed from: c */
    public static final C42061hK6 f26439c = new C42061hK6("PatchSliceTaskHandler");

    /* renamed from: a */
    public final HK6 f26440a;

    /* renamed from: b */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f26441b;

    public OM6(HK6 hk6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6) {
        this.f26440a = hk6;
        this.f26441b = interfaceC46230oM6;
    }

    /* renamed from: a */
    public final void m92370a(NM6 nm6) {
        File m103998t = this.f26440a.m103998t(nm6.f110336b, nm6.f24486c, nm6.f24487d);
        File file = new File(this.f26440a.m103997u(nm6.f110336b, nm6.f24486c, nm6.f24487d), nm6.f24491h);
        try {
            InputStream inputStream = nm6.f24493j;
            if (nm6.f24490g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            LK6 lk6 = new LK6(m103998t, file);
            File m103996v = this.f26440a.m103996v(nm6.f110336b, nm6.f24488e, nm6.f24489f, nm6.f24491h);
            if (!m103996v.exists()) {
                m103996v.mkdirs();
            }
            QM6 qm6 = new QM6(this.f26440a, nm6.f110336b, nm6.f24488e, nm6.f24489f, nm6.f24491h);
            C46814pL6.m19447l(lk6, inputStream, new C50963wL6(m103996v, qm6), nm6.f24492i);
            qm6.m88590d(0);
            inputStream.close();
            f26439c.m36535d("Patching and extraction finished for slice %s of pack %s.", nm6.f24491h, nm6.f110336b);
            this.f26441b.m21257a().mo10449b(nm6.f110335a, nm6.f110336b, nm6.f24491h, 0);
            try {
                nm6.f24493j.close();
            } catch (IOException unused) {
                f26439c.m36534e("Could not close file for slice %s of pack %s.", nm6.f24491h, nm6.f110336b);
            }
        } catch (IOException e) {
            f26439c.m36537b("IOException during patching %s.", e.getMessage());
            throw new C49185tL6(String.format("Error patching slice %s of pack %s.", nm6.f24491h, nm6.f110336b), e, nm6.f110335a);
        }
    }
}

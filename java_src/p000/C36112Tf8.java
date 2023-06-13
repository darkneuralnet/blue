package p000;

import com.google.android.gms.internal.recaptcha.zzew;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: Tf8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36112Tf8 implements InterfaceC52615z78<File> {

    /* renamed from: b */
    public static final AtomicInteger f35841b = new AtomicInteger();

    /* renamed from: a */
    public boolean f35842a = false;

    private C36112Tf8() {
    }

    /* renamed from: b */
    public static C36112Tf8 m83221b() {
        return new C36112Tf8();
    }

    @Override // p000.InterfaceC52615z78
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ File mo1770a(C43722k78 c43722k78) throws IOException {
        if (this.f35842a) {
            if (!c43722k78.m29260e()) {
                return c43722k78.m29263b().mo19074c(c43722k78.m29264a());
            }
            throw new zzew("Short circuit would skip transforms.");
        }
        C36085Tc8 m83269a = C36085Tc8.m83269a(C42267hg8.m36099c(c43722k78));
        try {
            if (m83269a.m83268b() instanceof InterfaceC35608Rb8) {
                File zza = ((InterfaceC35608Rb8) m83269a.m83268b()).zza();
                m83269a.close();
                return zza;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            try {
                m83269a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final C36112Tf8 m83220c() {
        this.f35842a = true;
        return this;
    }
}

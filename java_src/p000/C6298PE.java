package p000;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* renamed from: PE */
/* loaded from: classes.dex */
public class C6298PE implements InterfaceC49646u73 {
    @Deprecated

    /* renamed from: a */
    public final JN1 f28138a;

    /* renamed from: b */
    public final AbstractC4752LA f28139b;

    /* renamed from: c */
    public final C47272q70 f28140c;

    public C6298PE(AbstractC4752LA abstractC4752LA) {
        this(abstractC4752LA, new C47272q70(4096));
    }

    @Override // p000.InterfaceC49646u73
    /* renamed from: a */
    public O73 mo10844a(AbstractC45006mI4<?> abstractC45006mI4) throws VolleyError {
        IOException iOException;
        GN1 gn1;
        byte[] bArr;
        GN1 mo85619a;
        int m105187d;
        List<AH1> m105188c;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                mo85619a = this.f28139b.mo85619a(abstractC45006mI4, EN1.m109103c(abstractC45006mI4.getCacheEntry()));
                try {
                    m105187d = mo85619a.m105187d();
                    m105188c = mo85619a.m105188c();
                    break;
                } catch (IOException e) {
                    bArr = null;
                    gn1 = mo85619a;
                    iOException = e;
                }
            } catch (IOException e2) {
                iOException = e2;
                gn1 = null;
                bArr = null;
            }
            U73.m81942a(abstractC45006mI4, U73.m81938e(abstractC45006mI4, iOException, elapsedRealtime, gn1, bArr));
        }
        if (m105187d == 304) {
            return U73.m81941b(abstractC45006mI4, SystemClock.elapsedRealtime() - elapsedRealtime, m105188c);
        }
        InputStream m105190a = mo85619a.m105190a();
        if (m105190a != null) {
            bArr2 = U73.m81940c(m105190a, mo85619a.m105189b(), this.f28140c);
        } else {
            bArr2 = new byte[0];
        }
        U73.m81939d(SystemClock.elapsedRealtime() - elapsedRealtime, abstractC45006mI4, bArr2, m105187d);
        if (m105187d >= 200 && m105187d <= 299) {
            return new O73(m105187d, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, m105188c);
        }
        throw new IOException();
    }

    public C6298PE(AbstractC4752LA abstractC4752LA, C47272q70 c47272q70) {
        this.f28139b = abstractC4752LA;
        this.f28138a = abstractC4752LA;
        this.f28140c = c47272q70;
    }
}

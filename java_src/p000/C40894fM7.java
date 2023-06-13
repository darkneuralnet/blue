package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzbi;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* renamed from: fM7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40894fM7 {

    /* renamed from: e */
    public static final ExecutorService f79973e = C40328eP7.f78379b;

    /* renamed from: a */
    public final Context f79974a;

    /* renamed from: b */
    public final DV7 f79975b;

    /* renamed from: c */
    public final C45063mO7 f79976c;

    /* renamed from: d */
    public final C39763dS7 f79977d;

    public C40894fM7(Context context) {
        DV7 m86681a = RV7.m86681a();
        C45063mO7 m25667a = C45063mO7.m25667a(context);
        C39763dS7 m44247a = C39763dS7.m44247a(context);
        this.f79974a = context;
        this.f79975b = m86681a;
        this.f79976c = m25667a;
        this.f79977d = m44247a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m41494d(InterfaceC52948zh7 interfaceC52948zh7, Status status) {
        try {
            interfaceC52948zh7.mo537B(status, null);
        } catch (RemoteException e) {
            C33384Ho7.m103418a("RecaptchaOPExecute", e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Mb9 m41497a(final RecaptchaHandle recaptchaHandle, String str, RecaptchaAction recaptchaAction, long j, Map map, XT7 xt7, final String str2) throws Exception {
        String recaptchaAction2 = recaptchaAction.toString();
        String m50550E = recaptchaAction.m50550E();
        CI7 ci7 = new CI7(C40328eP7.m42894a(), f79973e, C46559ou9.m20284x());
        Et9 m28167y = C44187ku9.m28167y();
        m28167y.m108227C(str);
        m28167y.m108228B(recaptchaAction2);
        m28167y.m108222J(j);
        m28167y.m108223I(m50550E);
        m28167y.m108224H(str2);
        m28167y.m108221y(map);
        m28167y.m108225G(true);
        m28167y.m108229A(xt7.mo76968a());
        m28167y.m108226D(xt7.mo76967b());
        return C50508va9.m8426j(ci7.m112365a(m28167y.m64021q()), new YH8() { // from class: EK7
            @Override // p000.YH8
            public final Object zza(Object obj) {
                return C40894fM7.this.m41495c(recaptchaHandle, str2, (C46559ou9) obj);
            }
        }, Hc9.m103649b());
    }

    /* renamed from: b */
    public final /* synthetic */ Mb9 m41496b(final RecaptchaAction recaptchaAction, OU7 ou7, final RecaptchaHandle recaptchaHandle, C47230q28 c47230q28) throws Exception {
        final String m18270C = c47230q28.m18270C();
        Kr9 zza = this.f79975b.zza();
        C41805gt9.m37357b(zza);
        final long m86089a = S19.m86089a(S19.m86088b(zza.m98219x(), 1000L), zza.m98220w() / 1000000);
        List<String> m18269D = c47230q28.m18269D();
        Bundle m50548u = recaptchaAction.m50548u();
        final HashMap hashMap = new HashMap();
        for (String str : m50548u.keySet()) {
            if (m18269D.contains(str)) {
                Object obj = m50548u.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else {
                    throw new zzbi("Only string values are allowed as an additional arg in RecaptchaAction");
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
                sb.append("AdditionalArgs key[ \"");
                sb.append(str);
                sb.append("\" ] is not accepted by reCATPCHA server");
                throw new zzbi(sb.toString());
            }
        }
        final XT7 m92169a = ou7.m92169a(this.f79974a);
        return C50508va9.m8425k(this.f79977d.m44246b(recaptchaHandle.m50544v(), recaptchaHandle.m50545u()), new InterfaceC43713k69() { // from class: kL7
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj2) {
                return C40894fM7.this.m41497a(recaptchaHandle, m18270C, recaptchaAction, m86089a, hashMap, m92169a, (String) obj2);
            }
        }, f79973e);
    }

    /* renamed from: c */
    public final /* synthetic */ String m41495c(RecaptchaHandle recaptchaHandle, String str, C46559ou9 c46559ou9) {
        this.f79977d.m44244d(recaptchaHandle.m50544v(), recaptchaHandle.m50545u(), str, "RecaptchaOPExecute");
        return c46559ou9.m20283y();
    }

    /* renamed from: e */
    public final void m41493e(InterfaceC52948zh7 interfaceC52948zh7, final RecaptchaHandle recaptchaHandle, final RecaptchaAction recaptchaAction, final OU7 ou7) {
        Mb9 m8433c = C50508va9.m8433c(this.f79976c.m25665c(recaptchaHandle.m50544v(), recaptchaHandle.m50545u(), ou7), Exception.class, KD8.m99067c(C52743zL7.f121121a), Hc9.m103649b());
        InterfaceC43713k69 m99067c = KD8.m99067c(new InterfaceC43713k69() { // from class: UK7
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj) {
                return C40894fM7.this.m41496b(recaptchaAction, ou7, recaptchaHandle, (C47230q28) obj);
            }
        });
        ExecutorService executorService = f79973e;
        C50508va9.m8423m(C50508va9.m8425k(m8433c, m99067c, executorService), new PL7(this, interfaceC52948zh7), executorService);
    }
}

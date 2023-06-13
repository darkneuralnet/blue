package p000;

import android.os.Build;
/* renamed from: zn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53008zn7 {
    /* renamed from: a */
    public static final AbstractC52415yn7 m423a() {
        NJ7 m92413E = OJ7.m92413E();
        m92413E.m94056r(Build.VERSION.SDK);
        m92413E.m94057q(Build.TYPE);
        m92413E.m94058p(Build.ID);
        m92413E.m94055t(Build.VERSION.PREVIEW_SDK_INT);
        QJ7 m86963E = RJ7.m86963E();
        m86963E.m88657p((OJ7) m92413E.mo42381i());
        TJ7 m81635D = UJ7.m81635D();
        m81635D.m83814q(Build.DEVICE);
        m81635D.m83816A(Build.PRODUCT);
        m81635D.m83812t(Build.MODEL);
        m81635D.m83813r(Build.MANUFACTURER);
        m81635D.m83815p(Build.BRAND);
        m86963E.m88656q((UJ7) m81635D.mo42381i());
        m86963E.m88655r(C44560lY7.m27161a().m86150F());
        RJ7 rj7 = (RJ7) m86963E.mo42381i();
        C33483Hz7 m27160b = C44560lY7.m27160b();
        ZJ7 m71655D = C37894aK7.m71655D();
        for (C33249Gz7 c33249Gz7 : m27160b.m103091F()) {
            WJ7 m77132E = XJ7.m77132E();
            m77132E.m78596p(c33249Gz7.m104520F());
            m77132E.m78594r(c33249Gz7.m104519G());
            m77132E.m78595q((int) c33249Gz7.m104522D());
            m71655D.m73314p((XJ7) m77132E.mo42381i());
        }
        return new C31737An7(rj7, (C37894aK7) m71655D.mo42381i());
    }
}

package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
/* renamed from: vC8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC50291vC8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ boolean f113689b;

    /* renamed from: c */
    public final /* synthetic */ Uri f113690c;

    /* renamed from: d */
    public final /* synthetic */ String f113691d;

    /* renamed from: e */
    public final /* synthetic */ String f113692e;

    /* renamed from: f */
    public final /* synthetic */ GC8 f113693f;

    public RunnableC50291vC8(GC8 gc8, boolean z, Uri uri, String str, String str2) {
        this.f113693f = gc8;
        this.f113689b = z;
        this.f113690c = uri;
        this.f113691d = str;
        this.f113692e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: RuntimeException -> 0x0190, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0190, blocks: (B:3:0x0011, B:32:0x00a3, B:34:0x00c1, B:37:0x00ce, B:39:0x00d4, B:40:0x00e9, B:41:0x00f5, B:44:0x00fd, B:48:0x0125, B:50:0x0143, B:49:0x0132, B:52:0x014b, B:54:0x0151, B:56:0x0157, B:58:0x015d, B:60:0x0163, B:62:0x016b, B:64:0x0173, B:66:0x0179, B:68:0x0180, B:7:0x003f, B:9:0x0045, B:11:0x004b, B:13:0x0051, B:15:0x0057, B:17:0x005f, B:19:0x0067, B:22:0x0071, B:26:0x007c, B:27:0x008a, B:29:0x009a), top: B:73:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[Catch: RuntimeException -> 0x0190, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0190, blocks: (B:3:0x0011, B:32:0x00a3, B:34:0x00c1, B:37:0x00ce, B:39:0x00d4, B:40:0x00e9, B:41:0x00f5, B:44:0x00fd, B:48:0x0125, B:50:0x0143, B:49:0x0132, B:52:0x014b, B:54:0x0151, B:56:0x0157, B:58:0x015d, B:60:0x0163, B:62:0x016b, B:64:0x0173, B:66:0x0179, B:68:0x0180, B:7:0x003f, B:9:0x0045, B:11:0x004b, B:13:0x0051, B:15:0x0057, B:17:0x005f, B:19:0x0067, B:22:0x0071, B:26:0x007c, B:27:0x008a, B:29:0x009a), top: B:73:0x0011 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle m92045v0;
        GC8 gc8 = this.f113693f;
        boolean z = this.f113689b;
        Uri uri = this.f113690c;
        String str = this.f113691d;
        String str2 = this.f113692e;
        gc8.f11140b.mo19953e();
        try {
            OW8 m89776N = gc8.f11140b.f100966a.m89776N();
            C39336cl9.m60894b();
            C41723gl7 m89751w = gc8.f11140b.f100966a.m89751w();
            L88 l88 = C37795a98.f50006x0;
            boolean m37502y = m89751w.m37502y(null, l88);
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                    if (m37502y && str2.contains("sfmc_id")) {
                        m37502y = true;
                    }
                    m89776N.f100966a.mo22258a().m106894n().m42708a("Activity created with data 'referrer' without required params");
                }
                m92045v0 = m89776N.m92045v0(Uri.parse("https://google.com/search?".concat(str2)), m37502y);
                if (m92045v0 != null) {
                    m92045v0.putString("_cis", "referrer");
                }
                if (z) {
                    OW8 m89776N2 = gc8.f11140b.f100966a.m89776N();
                    C39336cl9.m60894b();
                    Bundle m92045v02 = m89776N2.m92045v0(uri, gc8.f11140b.f100966a.m89751w().m37502y(null, l88));
                    if (m92045v02 != null) {
                        m92045v02.putString("_cis", "intent");
                        if (!m92045v02.containsKey("gclid") && m92045v0 != null && m92045v0.containsKey("gclid")) {
                            m92045v02.putString("_cer", String.format("gclid=%s", m92045v0.getString("gclid")));
                        }
                        gc8.f11140b.m87157r(str, "_cmp", m92045v02);
                        gc8.f11140b.f31684n.m101679a(str, m92045v02);
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    gc8.f11140b.f100966a.mo22258a().m106894n().m42707b("Activity created with referrer", str2);
                    if (gc8.f11140b.f100966a.m89751w().m37502y(null, C37795a98.f49964c0)) {
                        if (m92045v0 != null) {
                            gc8.f11140b.m87157r(str, "_cmp", m92045v0);
                            gc8.f11140b.f31684n.m101679a(str, m92045v0);
                        } else {
                            gc8.f11140b.f100966a.mo22258a().m106894n().m42707b("Referrer does not contain valid parameters", str2);
                        }
                        gc8.f11140b.m87185K("auto", "_ldl", null, true);
                        return;
                    } else if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                        if (!TextUtils.isEmpty(str2)) {
                            gc8.f11140b.m87185K("auto", "_ldl", str2, true);
                            return;
                        }
                        return;
                    } else {
                        gc8.f11140b.f100966a.mo22258a().m106894n().m42708a("Activity created with data 'referrer' without required params");
                        return;
                    }
                }
                return;
            }
            m92045v0 = null;
            if (z) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            gc8.f11140b.f100966a.mo22258a().m106893o().m42707b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}

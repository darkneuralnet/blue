package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.HashMap;
/* renamed from: xS8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51621xS8 extends IR8 {
    public C51621xS8(C42162hV8 c42162hV8) {
        super(c42162hV8);
    }

    /* renamed from: f */
    public final C40356eS8 m5241f(String str) {
        String str2;
        Wl9.m77848b();
        C40356eS8 c40356eS8 = null;
        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49996s0)) {
            this.f100966a.mo22258a().m106889s().m42708a("sgtm feature flag enabled.");
            C47141pt8 m11672R = this.f15489b.m36300W().m11672R(str);
            if (m11672R == null) {
                return new C40356eS8(m5240g(str));
            }
            if (m11672R.m18501O()) {
                this.f100966a.mo22258a().m106889s().m42708a("sgtm upload enabled in manifest.");
                C32143Cg8 m91567q = this.f15489b.m36296a0().m91567q(m11672R.m18472i0());
                if (m91567q != null) {
                    String m111890K = m91567q.m111890K();
                    if (!TextUtils.isEmpty(m111890K)) {
                        String m111891J = m91567q.m111891J();
                        C40448ec8 m106889s = this.f100966a.mo22258a().m106889s();
                        if (true != TextUtils.isEmpty(m111891J)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        m106889s.m42706c("sgtm configured with upload_url, server_info", m111890K, str2);
                        if (TextUtils.isEmpty(m111891J)) {
                            this.f100966a.mo22259C();
                            c40356eS8 = new C40356eS8(m111890K);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", m111891J);
                            c40356eS8 = new C40356eS8(m111890K, hashMap);
                        }
                    }
                }
            }
            if (c40356eS8 != null) {
                return c40356eS8;
            }
        }
        return new C40356eS8(m5240g(str));
    }

    /* renamed from: g */
    public final String m5240g(String str) {
        String m91564t = this.f15489b.m36296a0().m91564t(str);
        if (!TextUtils.isEmpty(m91564t)) {
            Uri parse = Uri.parse((String) C37795a98.f49995s.m97658a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            buildUpon.authority(m91564t + InstructionFileId.DOT + authority);
            return buildUpon.build().toString();
        }
        return (String) C37795a98.f49995s.m97658a(null);
    }
}

package p000;

import android.os.Bundle;
import android.text.TextUtils;
/* renamed from: fU8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40967fU8 implements DW8 {

    /* renamed from: a */
    public final /* synthetic */ C42162hV8 f80211a;

    public C40967fU8(C42162hV8 c42162hV8) {
        this.f80211a = c42162hV8;
    }

    @Override // p000.DW8
    /* renamed from: a */
    public final void mo41290a(String str, String str2, Bundle bundle) {
        C35248Pn8 c35248Pn8;
        C35248Pn8 c35248Pn82;
        if (TextUtils.isEmpty(str)) {
            C42162hV8 c42162hV8 = this.f80211a;
            c35248Pn8 = c42162hV8.f85319l;
            if (c35248Pn8 != null) {
                c35248Pn82 = c42162hV8.f85319l;
                c35248Pn82.mo22258a().m106893o().m42707b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f80211a.mo22257c().m43695w(new RunnableC39782dU8(this, str, "_err", bundle));
    }
}

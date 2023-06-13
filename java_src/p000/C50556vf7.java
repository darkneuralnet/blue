package p000;

import android.net.Uri;
import java.util.Map;
/* renamed from: vf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50556vf7 extends Thread {

    /* renamed from: b */
    public final /* synthetic */ Map f114464b;

    public C50556vf7(C25919m8 c25919m8, Map map) {
        this.f114464b = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f114464b;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        AQ7.m115789a(buildUpon.build().toString());
    }
}

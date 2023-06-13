package p000;

import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;
/* renamed from: yp */
/* loaded from: classes.dex */
public abstract class AbstractC30706yp implements InterfaceC49918ub1 {
    @Override // p000.InterfaceC49918ub1
    /* renamed from: a */
    public abstract String mo2555a();

    @Override // p000.InterfaceC49918ub1
    /* renamed from: c */
    public MediaFormat mo2554c() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(mo2555a(), m2550g(), m2552e());
        createAudioFormat.setInteger("bitrate", m2553d());
        if (m2551f() != -1) {
            if (mo2555a().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", m2551f());
            } else {
                createAudioFormat.setInteger(Scopes.PROFILE, m2551f());
            }
        }
        return createAudioFormat;
    }

    /* renamed from: d */
    public abstract int m2553d();

    /* renamed from: e */
    public abstract int m2552e();

    /* renamed from: f */
    public abstract int m2551f();

    /* renamed from: g */
    public abstract int m2550g();
}

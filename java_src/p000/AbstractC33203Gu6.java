package p000;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* renamed from: Gu6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33203Gu6 {
    /* renamed from: e */
    public static AbstractC33203Gu6 m104598e(C33889Js8 c33889Js8) {
        String m99605H = c33889Js8.m99605H();
        if (TextUtils.isEmpty(m99605H)) {
            m99605H = c33889Js8.m99606G();
        }
        return new C29697vu(c33889Js8.m99606G(), m99605H, c33889Js8.m99609D(), c33889Js8.m99608E());
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract String mo7806a();

    @KeepForSdk
    /* renamed from: b */
    public abstract int mo7805b();

    @KeepForSdk
    /* renamed from: c */
    public abstract float mo7804c();

    @KeepForSdk
    /* renamed from: d */
    public abstract String mo7803d();
}

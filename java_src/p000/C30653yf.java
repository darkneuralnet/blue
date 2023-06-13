package p000;

import android.content.ContentResolver;
import android.provider.Settings;
/* renamed from: yf */
/* loaded from: classes6.dex */
public class C30653yf {
    /* renamed from: a */
    public float m3038a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}

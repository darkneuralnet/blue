package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
/* renamed from: Yy5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37450Yy5 implements InterfaceC47055pl2 {

    /* renamed from: a */
    public final SharedPreferences.Editor f47700a;

    /* renamed from: b */
    public final String f47701b;

    public C37450Yy5(Context context, String str, String str2) {
        if (str != null) {
            this.f47701b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f47700a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f47700a = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // p000.InterfaceC47055pl2
    /* renamed from: a */
    public void mo18796a(C35844Sc1 c35844Sc1) throws IOException {
        if (this.f47700a.putString(this.f47701b, ML1.m95434b(c35844Sc1.mo47795e())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }

    @Override // p000.InterfaceC47055pl2
    /* renamed from: b */
    public void mo18795b(C44090kl2 c44090kl2) throws IOException {
        if (this.f47700a.putString(this.f47701b, ML1.m95434b(c44090kl2.mo47795e())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}

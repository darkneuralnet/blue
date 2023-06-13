package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: cR5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39141cR5 {

    /* renamed from: a */
    public final SharedPreferences f60674a;

    public C39141cR5(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        this.f60674a = context.getSharedPreferences(String.format("com.google.firebase.appcheck.debug.store.%s", str), 0);
    }

    /* renamed from: a */
    public String m61308a() {
        return this.f60674a.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
    }

    /* renamed from: b */
    public void m61307b(String str) {
        this.f60674a.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", str).apply();
    }
}

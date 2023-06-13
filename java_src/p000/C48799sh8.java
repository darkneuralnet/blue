package p000;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: sh8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48799sh8 {

    /* renamed from: a */
    public final String f109129a;

    /* renamed from: b */
    public boolean f109130b;

    /* renamed from: c */
    public String f109131c;

    /* renamed from: d */
    public final /* synthetic */ C33556Ih8 f109132d;

    public C48799sh8(C33556Ih8 c33556Ih8, String str, String str2) {
        this.f109132d = c33556Ih8;
        Preconditions.checkNotEmpty(str);
        this.f109129a = str;
    }

    /* renamed from: a */
    public final String m13820a() {
        if (!this.f109130b) {
            this.f109130b = true;
            this.f109131c = this.f109132d.m101802l().getString(this.f109129a, null);
        }
        return this.f109131c;
    }

    /* renamed from: b */
    public final void m13819b(String str) {
        SharedPreferences.Editor edit = this.f109132d.m101802l().edit();
        edit.putString(this.f109129a, str);
        edit.apply();
        this.f109131c = str;
    }
}

package p000;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: Vf8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36580Vf8 {

    /* renamed from: a */
    public final String f39429a;

    /* renamed from: b */
    public final boolean f39430b;

    /* renamed from: c */
    public boolean f39431c;

    /* renamed from: d */
    public boolean f39432d;

    /* renamed from: e */
    public final /* synthetic */ C33556Ih8 f39433e;

    public C36580Vf8(C33556Ih8 c33556Ih8, String str, boolean z) {
        this.f39433e = c33556Ih8;
        Preconditions.checkNotEmpty(str);
        this.f39429a = str;
        this.f39430b = z;
    }

    /* renamed from: a */
    public final void m79589a(boolean z) {
        SharedPreferences.Editor edit = this.f39433e.m101802l().edit();
        edit.putBoolean(this.f39429a, z);
        edit.apply();
        this.f39432d = z;
    }

    /* renamed from: b */
    public final boolean m79588b() {
        if (!this.f39431c) {
            this.f39431c = true;
            this.f39432d = this.f39433e.m101802l().getBoolean(this.f39429a, this.f39430b);
        }
        return this.f39432d;
    }
}

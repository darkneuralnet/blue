package p000;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: zg8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52939zg8 {

    /* renamed from: a */
    public final String f122071a;

    /* renamed from: b */
    public final long f122072b;

    /* renamed from: c */
    public boolean f122073c;

    /* renamed from: d */
    public long f122074d;

    /* renamed from: e */
    public final /* synthetic */ C33556Ih8 f122075e;

    public C52939zg8(C33556Ih8 c33556Ih8, String str, long j) {
        this.f122075e = c33556Ih8;
        Preconditions.checkNotEmpty(str);
        this.f122071a = str;
        this.f122072b = j;
    }

    /* renamed from: a */
    public final long m564a() {
        if (!this.f122073c) {
            this.f122073c = true;
            this.f122074d = this.f122075e.m101802l().getLong(this.f122071a, this.f122072b);
        }
        return this.f122074d;
    }

    /* renamed from: b */
    public final void m563b(long j) {
        SharedPreferences.Editor edit = this.f122075e.m101802l().edit();
        edit.putLong(this.f122071a, j);
        edit.apply();
        this.f122074d = j;
    }
}

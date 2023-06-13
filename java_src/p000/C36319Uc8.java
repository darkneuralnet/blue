package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
/* renamed from: Uc8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36319Uc8 {

    /* renamed from: a */
    public final String f37690a;

    /* renamed from: b */
    public final String f37691b;

    /* renamed from: c */
    public final long f37692c;

    /* renamed from: d */
    public final Bundle f37693d;

    public C36319Uc8(String str, String str2, Bundle bundle, long j) {
        this.f37690a = str;
        this.f37691b = str2;
        this.f37693d = bundle;
        this.f37692c = j;
    }

    /* renamed from: b */
    public static C36319Uc8 m81227b(zzaw zzawVar) {
        return new C36319Uc8(zzawVar.f71529b, zzawVar.f71531d, zzawVar.f71530c.m50583u(), zzawVar.f71532e);
    }

    /* renamed from: a */
    public final zzaw m81228a() {
        return new zzaw(this.f37690a, new zzau(new Bundle(this.f37693d)), this.f37691b, this.f37692c);
    }

    public final String toString() {
        String str = this.f37691b;
        String str2 = this.f37690a;
        String obj = this.f37693d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}

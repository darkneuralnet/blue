package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: eh8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40498eh8 {

    /* renamed from: a */
    public final String f78699a;

    /* renamed from: b */
    public final String f78700b;

    /* renamed from: c */
    public final String f78701c;

    /* renamed from: d */
    public final long f78702d;

    /* renamed from: e */
    public final /* synthetic */ C33556Ih8 f78703e;

    public /* synthetic */ C40498eh8(C33556Ih8 c33556Ih8, String str, long j, C34951Og8 c34951Og8) {
        boolean z;
        this.f78703e = c33556Ih8;
        Preconditions.checkNotEmpty("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f78699a = "health_monitor:start";
        this.f78700b = "health_monitor:count";
        this.f78701c = "health_monitor:value";
        this.f78702d = j;
    }

    /* renamed from: a */
    public final Pair m42620a() {
        long abs;
        this.f78703e.mo19953e();
        this.f78703e.mo19953e();
        long m42618c = m42618c();
        if (m42618c == 0) {
            m42617d();
            abs = 0;
        } else {
            abs = Math.abs(m42618c - this.f78703e.f100966a.mo22260A().currentTimeMillis());
        }
        long j = this.f78702d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            m42617d();
            return null;
        }
        String string = this.f78703e.m101802l().getString(this.f78701c, null);
        long j2 = this.f78703e.m101802l().getLong(this.f78700b, 0L);
        m42617d();
        if (string != null && j2 > 0) {
            return new Pair(string, Long.valueOf(j2));
        }
        return C33556Ih8.f16063y;
    }

    /* renamed from: b */
    public final void m42619b(String str, long j) {
        this.f78703e.mo19953e();
        if (m42618c() == 0) {
            m42617d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f78703e.m101802l().getLong(this.f78700b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f78703e.m101802l().edit();
            edit.putString(this.f78701c, str);
            edit.putLong(this.f78700b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f78703e.f100966a.m89776N().m92054r().nextLong() & LongCompanionObject.MAX_VALUE;
        long j3 = j2 + 1;
        long j4 = LongCompanionObject.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f78703e.m101802l().edit();
        if (nextLong < j4) {
            edit2.putString(this.f78701c, str);
        }
        edit2.putLong(this.f78700b, j3);
        edit2.apply();
    }

    /* renamed from: c */
    public final long m42618c() {
        return this.f78703e.m101802l().getLong(this.f78699a, 0L);
    }

    /* renamed from: d */
    public final void m42617d() {
        this.f78703e.mo19953e();
        long currentTimeMillis = this.f78703e.f100966a.mo22260A().currentTimeMillis();
        SharedPreferences.Editor edit = this.f78703e.m101802l().edit();
        edit.remove(this.f78700b);
        edit.remove(this.f78701c);
        edit.putLong(this.f78699a, currentTimeMillis);
        edit.apply();
    }
}

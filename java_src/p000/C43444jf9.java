package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: jf9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43444jf9 {

    /* renamed from: a */
    public final Te9 f93118a;

    /* renamed from: b */
    public final Boolean f93119b;

    /* renamed from: c */
    public final String f93120c;

    public /* synthetic */ C43444jf9(Me9 me9, C38683bf9 c38683bf9) {
        Te9 te9;
        te9 = me9.f23361a;
        this.f93118a = te9;
        this.f93119b = null;
        this.f93120c = null;
    }

    @KY7(zza = 3)
    /* renamed from: a */
    public final Te9 m30127a() {
        return this.f93118a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C43444jf9) && Objects.equal(this.f93118a, ((C43444jf9) obj).f93118a) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f93118a, null, null);
    }
}

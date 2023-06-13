package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LjJ6;", "", "", "fillColor", "", "isVisible", "isClickable", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "I", "b", "()I", "Z", "c", "()Z", "<init>", "(IZZ)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jJ6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43238jJ6 {

    /* renamed from: a */
    public final int f92541a;

    /* renamed from: b */
    public final boolean f92542b;

    /* renamed from: c */
    public final boolean f92543c;

    public C43238jJ6(int i, boolean z, boolean z2) {
        this.f92541a = i;
        this.f92542b = z;
        this.f92543c = z2;
    }

    public static /* synthetic */ C43238jJ6 copy$default(C43238jJ6 c43238jJ6, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c43238jJ6.f92541a;
        }
        if ((i2 & 2) != 0) {
            z = c43238jJ6.f92542b;
        }
        if ((i2 & 4) != 0) {
            z2 = c43238jJ6.f92543c;
        }
        return c43238jJ6.m30790a(i, z, z2);
    }

    /* renamed from: a */
    public final C43238jJ6 m30790a(int i, boolean z, boolean z2) {
        return new C43238jJ6(i, z, z2);
    }

    /* renamed from: b */
    public final int m30789b() {
        return this.f92541a;
    }

    /* renamed from: c */
    public final boolean m30788c() {
        return this.f92542b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43238jJ6) {
            C43238jJ6 c43238jJ6 = (C43238jJ6) obj;
            return this.f92541a == c43238jJ6.f92541a && this.f92542b == c43238jJ6.f92542b && this.f92543c == c43238jJ6.f92543c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f92541a) * 31;
        boolean z = this.f92542b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f92543c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        int i = this.f92541a;
        boolean z = this.f92542b;
        boolean z2 = this.f92543c;
        return "ZoomBehaviorCharacteristics(fillColor=" + i + ", isVisible=" + z + ", isClickable=" + z2 + ")";
    }
}

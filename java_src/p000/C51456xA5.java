package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LxA5;", "LEu4;", "", "enabled", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51456xA5 implements InterfaceC32733Eu4 {

    /* renamed from: a */
    public final boolean f117166a;

    public C51456xA5(boolean z) {
        this.f117166a = z;
    }

    public static /* synthetic */ C51456xA5 copy$default(C51456xA5 c51456xA5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c51456xA5.f117166a;
        }
        return c51456xA5.m5757a(z);
    }

    /* renamed from: a */
    public final C51456xA5 m5757a(boolean z) {
        return new C51456xA5(z);
    }

    /* renamed from: b */
    public final boolean m5756b() {
        return this.f117166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C51456xA5) && this.f117166a == ((C51456xA5) obj).f117166a;
    }

    public int hashCode() {
        boolean z = this.f117166a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f117166a;
        return "ShowSwipeRefresh(enabled=" + z + ")";
    }
}

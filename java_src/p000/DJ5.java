package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LDJ5;", "", "", "success", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "getSuccess", "()Z", "<init>", "(Z)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DJ5 */
/* loaded from: classes4.dex */
public final class DJ5 {

    /* renamed from: a */
    public final boolean f5520a;

    public DJ5(boolean z) {
        this.f5520a = z;
    }

    public static /* synthetic */ DJ5 copy$default(DJ5 dj5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dj5.f5520a;
        }
        return dj5.m110577a(z);
    }

    /* renamed from: a */
    public final DJ5 m110577a(boolean z) {
        return new DJ5(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DJ5) && this.f5520a == ((DJ5) obj).f5520a;
    }

    public int hashCode() {
        boolean z = this.f5520a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f5520a;
        return "SmartlockNokeDataInsertedResponse(success=" + z + ")";
    }
}
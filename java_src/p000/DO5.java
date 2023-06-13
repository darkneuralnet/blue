package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LDO5;", "Lk02;", "", "birdId", "skuOrderId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DO5 */
/* loaded from: classes3.dex */
public final class DO5 extends AbstractC43646k02 {

    /* renamed from: a */
    public final String f5589a;

    /* renamed from: b */
    public final String f5590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DO5(String str, String skuOrderId) {
        super(null);
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        this.f5589a = str;
        this.f5590b = skuOrderId;
    }

    public static /* synthetic */ DO5 copy$default(DO5 do5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = do5.f5589a;
        }
        if ((i & 2) != 0) {
            str2 = do5.f5590b;
        }
        return do5.m110546a(str, str2);
    }

    /* renamed from: a */
    public final DO5 m110546a(String str, String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        return new DO5(str, skuOrderId);
    }

    /* renamed from: b */
    public final String m110545b() {
        return this.f5589a;
    }

    /* renamed from: c */
    public final String m110544c() {
        return this.f5590b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DO5) {
            DO5 do5 = (DO5) obj;
            return Intrinsics.areEqual(this.f5589a, do5.f5589a) && Intrinsics.areEqual(this.f5590b, do5.f5590b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5589a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f5590b.hashCode();
    }

    public String toString() {
        String str = this.f5589a;
        String str2 = this.f5590b;
        return "Start(birdId=" + str + ", skuOrderId=" + str2 + ")";
    }
}

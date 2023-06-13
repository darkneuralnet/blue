package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireInventoryPart;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LDI3;", "", "Lco/bird/android/model/wire/WireInventoryPart;", "part", "", "quantity", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireInventoryPart;", "b", "()Lco/bird/android/model/wire/WireInventoryPart;", "I", "c", "()I", "<init>", "(Lco/bird/android/model/wire/WireInventoryPart;I)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DI3 */
/* loaded from: classes3.dex */
public final class DI3 {

    /* renamed from: a */
    public final WireInventoryPart f5498a;

    /* renamed from: b */
    public final int f5499b;

    public DI3(WireInventoryPart part, int i) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.f5498a = part;
        this.f5499b = i;
    }

    public static /* synthetic */ DI3 copy$default(DI3 di3, WireInventoryPart wireInventoryPart, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            wireInventoryPart = di3.f5498a;
        }
        if ((i2 & 2) != 0) {
            i = di3.f5499b;
        }
        return di3.m110602a(wireInventoryPart, i);
    }

    /* renamed from: a */
    public final DI3 m110602a(WireInventoryPart part, int i) {
        Intrinsics.checkNotNullParameter(part, "part");
        return new DI3(part, i);
    }

    /* renamed from: b */
    public final WireInventoryPart m110601b() {
        return this.f5498a;
    }

    /* renamed from: c */
    public final int m110600c() {
        return this.f5499b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DI3) {
            DI3 di3 = (DI3) obj;
            return Intrinsics.areEqual(this.f5498a, di3.f5498a) && this.f5499b == di3.f5499b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f5498a.hashCode() * 31) + Integer.hashCode(this.f5499b);
    }

    public String toString() {
        WireInventoryPart wireInventoryPart = this.f5498a;
        int i = this.f5499b;
        return "PartViewModel(part=" + wireInventoryPart + ", quantity=" + i + ")";
    }
}

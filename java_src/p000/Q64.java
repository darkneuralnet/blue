package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.ScrapOrderView;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b#\u0010$JE\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u0013\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"LQ64;", "LFo5;", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "scrapOrders", "", "scannedCount", "", "loading", "", "warehouse", "", "error", DateTokenConverter.CONVERTER_KEY, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "c", "()I", "Z", "getLoading", "()Z", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "<init>", "(Ljava/util/List;IZLjava/lang/String;Ljava/lang/Throwable;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q64 */
/* loaded from: classes3.dex */
public final class Q64 implements InterfaceC32914Fo5 {

    /* renamed from: a */
    public final List<ScrapOrderView> f29837a;

    /* renamed from: b */
    public final int f29838b;

    /* renamed from: c */
    public final boolean f29839c;

    /* renamed from: d */
    public final String f29840d;

    /* renamed from: e */
    public final Throwable f29841e;

    public Q64() {
        this(null, 0, false, null, null, 31, null);
    }

    public static /* synthetic */ Q64 copy$default(Q64 q64, List list, int i, boolean z, String str, Throwable th, int i2, Object obj) {
        List<ScrapOrderView> list2 = list;
        if ((i2 & 1) != 0) {
            list2 = q64.f29837a;
        }
        if ((i2 & 2) != 0) {
            i = q64.f29838b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = q64.f29839c;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str = q64.f29840d;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            th = q64.f29841e;
        }
        return q64.m88910d(list2, i3, z2, str2, th);
    }

    @Override // p000.InterfaceC32914Fo5
    /* renamed from: a */
    public String mo64186a() {
        return this.f29840d;
    }

    @Override // p000.InterfaceC32914Fo5
    /* renamed from: b */
    public List<ScrapOrderView> mo64185b() {
        return this.f29837a;
    }

    @Override // p000.InterfaceC32914Fo5
    /* renamed from: c */
    public int mo64184c() {
        return this.f29838b;
    }

    /* renamed from: d */
    public final Q64 m88910d(List<ScrapOrderView> scrapOrders, int i, boolean z, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(scrapOrders, "scrapOrders");
        return new Q64(scrapOrders, i, z, str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q64) {
            Q64 q64 = (Q64) obj;
            return Intrinsics.areEqual(this.f29837a, q64.f29837a) && this.f29838b == q64.f29838b && this.f29839c == q64.f29839c && Intrinsics.areEqual(this.f29840d, q64.f29840d) && Intrinsics.areEqual(this.f29841e, q64.f29841e);
        }
        return false;
    }

    @Override // p000.InterfaceC32914Fo5
    public Throwable getError() {
        return this.f29841e;
    }

    @Override // p000.InterfaceC32914Fo5
    public boolean getLoading() {
        return this.f29839c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f29837a.hashCode() * 31) + Integer.hashCode(this.f29838b)) * 31;
        boolean z = this.f29839c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f29840d;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.f29841e;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        List<ScrapOrderView> list = this.f29837a;
        int i = this.f29838b;
        boolean z = this.f29839c;
        String str = this.f29840d;
        Throwable th = this.f29841e;
        return "ProcessScrapOrderSuccess(scrapOrders=" + list + ", scannedCount=" + i + ", loading=" + z + ", warehouse=" + str + ", error=" + th + ")";
    }

    public Q64(List<ScrapOrderView> scrapOrders, int i, boolean z, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(scrapOrders, "scrapOrders");
        this.f29837a = scrapOrders;
        this.f29838b = i;
        this.f29839c = z;
        this.f29840d = str;
        this.f29841e = th;
    }

    public /* synthetic */ Q64(List list, int i, boolean z, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z : false, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : th);
    }
}

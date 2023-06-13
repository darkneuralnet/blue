package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001b"}, m28432d2 = {"LXl2;", "", "", "id", "locationLabel", "LHQ5;", "statusViewModel", "etaStatus", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getLocationLabel", "c", "LHQ5;", "getStatusViewModel", "()LHQ5;", DateTokenConverter.CONVERTER_KEY, "getEtaStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;LHQ5;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37096Xl2 {

    /* renamed from: a */
    public final String f43882a;

    /* renamed from: b */
    public final String f43883b;

    /* renamed from: c */
    public final HQ5 f43884c;

    /* renamed from: d */
    public final String f43885d;

    public C37096Xl2(String id, String locationLabel, HQ5 statusViewModel, String etaStatus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(locationLabel, "locationLabel");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        Intrinsics.checkNotNullParameter(etaStatus, "etaStatus");
        this.f43882a = id;
        this.f43883b = locationLabel;
        this.f43884c = statusViewModel;
        this.f43885d = etaStatus;
    }

    public static /* synthetic */ C37096Xl2 copy$default(C37096Xl2 c37096Xl2, String str, String str2, HQ5 hq5, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c37096Xl2.f43882a;
        }
        if ((i & 2) != 0) {
            str2 = c37096Xl2.f43883b;
        }
        if ((i & 4) != 0) {
            hq5 = c37096Xl2.f43884c;
        }
        if ((i & 8) != 0) {
            str3 = c37096Xl2.f43885d;
        }
        return c37096Xl2.m76374a(str, str2, hq5, str3);
    }

    /* renamed from: a */
    public final C37096Xl2 m76374a(String id, String locationLabel, HQ5 statusViewModel, String etaStatus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(locationLabel, "locationLabel");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        Intrinsics.checkNotNullParameter(etaStatus, "etaStatus");
        return new C37096Xl2(id, locationLabel, statusViewModel, etaStatus);
    }

    /* renamed from: b */
    public final String m76373b() {
        return this.f43882a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37096Xl2) {
            C37096Xl2 c37096Xl2 = (C37096Xl2) obj;
            return Intrinsics.areEqual(this.f43882a, c37096Xl2.f43882a) && Intrinsics.areEqual(this.f43883b, c37096Xl2.f43883b) && Intrinsics.areEqual(this.f43884c, c37096Xl2.f43884c) && Intrinsics.areEqual(this.f43885d, c37096Xl2.f43885d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f43882a.hashCode() * 31) + this.f43883b.hashCode()) * 31) + this.f43884c.hashCode()) * 31) + this.f43885d.hashCode();
    }

    public String toString() {
        String str = this.f43882a;
        String str2 = this.f43883b;
        HQ5 hq5 = this.f43884c;
        String str3 = this.f43885d;
        return "LandingContainerOrderViewModel(id=" + str + ", locationLabel=" + str2 + ", statusViewModel=" + hq5 + ", etaStatus=" + str3 + ")";
    }
}

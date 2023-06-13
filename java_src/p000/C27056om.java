package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lom;", "Lev2;", "", "localAddress", "", "LfN1;", "", "hostsEnabled", "", "hostPorts", DateTokenConverter.CONVERTER_KEY, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: om */
/* loaded from: classes3.dex */
public final class C27056om implements InterfaceC40632ev2 {

    /* renamed from: a */
    public final String f102458a;

    /* renamed from: b */
    public final Map<EnumC40897fN1, Boolean> f102459b;

    /* renamed from: c */
    public final Map<EnumC40897fN1, Integer> f102460c;

    public C27056om() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27056om copy$default(C27056om c27056om, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c27056om.f102458a;
        }
        if ((i & 2) != 0) {
            map = c27056om.f102459b;
        }
        if ((i & 4) != 0) {
            map2 = c27056om.f102460c;
        }
        return c27056om.m20526d(str, map, map2);
    }

    @Override // p000.InterfaceC40632ev2
    /* renamed from: a */
    public String mo20529a() {
        return this.f102458a;
    }

    @Override // p000.InterfaceC40632ev2
    /* renamed from: b */
    public Map<EnumC40897fN1, Boolean> mo20528b() {
        return this.f102459b;
    }

    @Override // p000.InterfaceC40632ev2
    /* renamed from: c */
    public Map<EnumC40897fN1, Integer> mo20527c() {
        return this.f102460c;
    }

    /* renamed from: d */
    public final C27056om m20526d(String str, Map<EnumC40897fN1, Boolean> hostsEnabled, Map<EnumC40897fN1, Integer> hostPorts) {
        Intrinsics.checkNotNullParameter(hostsEnabled, "hostsEnabled");
        Intrinsics.checkNotNullParameter(hostPorts, "hostPorts");
        return new C27056om(str, hostsEnabled, hostPorts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27056om) {
            C27056om c27056om = (C27056om) obj;
            return Intrinsics.areEqual(this.f102458a, c27056om.f102458a) && Intrinsics.areEqual(this.f102459b, c27056om.f102459b) && Intrinsics.areEqual(this.f102460c, c27056om.f102460c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f102458a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f102459b.hashCode()) * 31) + this.f102460c.hashCode();
    }

    public String toString() {
        String str = this.f102458a;
        Map<EnumC40897fN1, Boolean> map = this.f102459b;
        Map<EnumC40897fN1, Integer> map2 = this.f102460c;
        return "ApplyChanges(localAddress=" + str + ", hostsEnabled=" + map + ", hostPorts=" + map2 + ")";
    }

    public C27056om(String str, Map<EnumC40897fN1, Boolean> hostsEnabled, Map<EnumC40897fN1, Integer> hostPorts) {
        Intrinsics.checkNotNullParameter(hostsEnabled, "hostsEnabled");
        Intrinsics.checkNotNullParameter(hostPorts, "hostPorts");
        this.f102458a = str;
        this.f102459b = hostsEnabled;
        this.f102460c = hostPorts;
    }

    public /* synthetic */ C27056om(String str, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 4) != 0 ? MapsKt__MapsKt.emptyMap() : map2);
    }
}

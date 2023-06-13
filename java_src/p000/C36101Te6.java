package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LTe6;", "Lev2;", "", "localAddress", "", "LfN1;", "", "hostsEnabled", "", "hostPorts", DateTokenConverter.CONVERTER_KEY, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Te6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36101Te6 implements InterfaceC40632ev2 {

    /* renamed from: a */
    public final String f35821a;

    /* renamed from: b */
    public final Map<EnumC40897fN1, Boolean> f35822b;

    /* renamed from: c */
    public final Map<EnumC40897fN1, Integer> f35823c;

    public C36101Te6() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36101Te6 copy$default(C36101Te6 c36101Te6, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c36101Te6.f35821a;
        }
        if ((i & 2) != 0) {
            map = c36101Te6.f35822b;
        }
        if ((i & 4) != 0) {
            map2 = c36101Te6.f35823c;
        }
        return c36101Te6.m83234d(str, map, map2);
    }

    @Override // p000.InterfaceC40632ev2
    /* renamed from: a */
    public String mo20529a() {
        return this.f35821a;
    }

    @Override // p000.InterfaceC40632ev2
    /* renamed from: b */
    public Map<EnumC40897fN1, Boolean> mo20528b() {
        return this.f35822b;
    }

    @Override // p000.InterfaceC40632ev2
    /* renamed from: c */
    public Map<EnumC40897fN1, Integer> mo20527c() {
        return this.f35823c;
    }

    /* renamed from: d */
    public final C36101Te6 m83234d(String str, Map<EnumC40897fN1, Boolean> hostsEnabled, Map<EnumC40897fN1, Integer> hostPorts) {
        Intrinsics.checkNotNullParameter(hostsEnabled, "hostsEnabled");
        Intrinsics.checkNotNullParameter(hostPorts, "hostPorts");
        return new C36101Te6(str, hostsEnabled, hostPorts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36101Te6) {
            C36101Te6 c36101Te6 = (C36101Te6) obj;
            return Intrinsics.areEqual(this.f35821a, c36101Te6.f35821a) && Intrinsics.areEqual(this.f35822b, c36101Te6.f35822b) && Intrinsics.areEqual(this.f35823c, c36101Te6.f35823c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f35821a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f35822b.hashCode()) * 31) + this.f35823c.hashCode();
    }

    public String toString() {
        String str = this.f35821a;
        Map<EnumC40897fN1, Boolean> map = this.f35822b;
        Map<EnumC40897fN1, Integer> map2 = this.f35823c;
        return "UpdateUi(localAddress=" + str + ", hostsEnabled=" + map + ", hostPorts=" + map2 + ")";
    }

    public C36101Te6(String str, Map<EnumC40897fN1, Boolean> hostsEnabled, Map<EnumC40897fN1, Integer> hostPorts) {
        Intrinsics.checkNotNullParameter(hostsEnabled, "hostsEnabled");
        Intrinsics.checkNotNullParameter(hostPorts, "hostPorts");
        this.f35821a = str;
        this.f35822b = hostsEnabled;
        this.f35823c = hostPorts;
    }

    public /* synthetic */ C36101Te6(String str, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 4) != 0 ? MapsKt__MapsKt.emptyMap() : map2);
    }
}

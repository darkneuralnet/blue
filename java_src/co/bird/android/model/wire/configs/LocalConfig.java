package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireAlert;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/configs/LocalConfig;", "", "alerts", "", "Lco/bird/android/model/wire/WireAlert;", "name", "", "weatherAlert", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getAlerts", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getWeatherAlert", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocalConfig {
    @JsonProperty("alerts")
    @InterfaceC41208ft5("alerts")
    private final List<WireAlert> alerts;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("weather_alert")
    @InterfaceC41208ft5("weather_alert")
    private final boolean weatherAlert;

    public LocalConfig() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalConfig copy$default(LocalConfig localConfig, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = localConfig.alerts;
        }
        if ((i & 2) != 0) {
            str = localConfig.name;
        }
        if ((i & 4) != 0) {
            z = localConfig.weatherAlert;
        }
        return localConfig.copy(list, str, z);
    }

    public final List<WireAlert> component1() {
        return this.alerts;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.weatherAlert;
    }

    public final LocalConfig copy(List<WireAlert> list, String str, boolean z) {
        return new LocalConfig(list, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalConfig) {
            LocalConfig localConfig = (LocalConfig) obj;
            return Intrinsics.areEqual(this.alerts, localConfig.alerts) && Intrinsics.areEqual(this.name, localConfig.name) && this.weatherAlert == localConfig.weatherAlert;
        }
        return false;
    }

    public final List<WireAlert> getAlerts() {
        return this.alerts;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getWeatherAlert() {
        return this.weatherAlert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<WireAlert> list = this.alerts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.weatherAlert;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        List<WireAlert> list = this.alerts;
        String str = this.name;
        boolean z = this.weatherAlert;
        return "LocalConfig(alerts=" + list + ", name=" + str + ", weatherAlert=" + z + ")";
    }

    public LocalConfig(List<WireAlert> list, String str, boolean z) {
        this.alerts = list;
        this.name = str;
        this.weatherAlert = z;
    }

    public /* synthetic */ LocalConfig(List list, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }
}

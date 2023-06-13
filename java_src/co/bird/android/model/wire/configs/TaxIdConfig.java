package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/configs/TaxIdConfig;", "", "name", "", "mask", "(Ljava/lang/String;Ljava/lang/String;)V", "getMask", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaxIdConfig {
    @JsonProperty("mask")
    @InterfaceC41208ft5("mask")
    private final String mask;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    public TaxIdConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ TaxIdConfig copy$default(TaxIdConfig taxIdConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxIdConfig.name;
        }
        if ((i & 2) != 0) {
            str2 = taxIdConfig.mask;
        }
        return taxIdConfig.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mask;
    }

    public final TaxIdConfig copy(String name, String mask) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mask, "mask");
        return new TaxIdConfig(name, mask);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaxIdConfig) {
            TaxIdConfig taxIdConfig = (TaxIdConfig) obj;
            return Intrinsics.areEqual(this.name, taxIdConfig.name) && Intrinsics.areEqual(this.mask, taxIdConfig.mask);
        }
        return false;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.mask.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.mask;
        return "TaxIdConfig(name=" + str + ", mask=" + str2 + ")";
    }

    public TaxIdConfig(String name, String mask) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.name = name;
        this.mask = mask;
    }

    public /* synthetic */ TaxIdConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "SSN" : str, (i & 2) != 0 ? "XXX-XX-XXXX" : str2);
    }
}

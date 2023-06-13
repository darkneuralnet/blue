package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/configs/GovTechConfig;", "", "communityModeMaxPhotosInput", "", "enableBackgroundImageUploads", "", "(IZ)V", "getCommunityModeMaxPhotosInput", "()I", "getEnableBackgroundImageUploads", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GovTechConfig {
    @JsonProperty("community_mode_max_photos_input")
    @InterfaceC41208ft5("community_mode_max_photos_input")
    private final int communityModeMaxPhotosInput;
    @JsonProperty("enable_background_image_uploads")
    @InterfaceC41208ft5("enable_background_image_uploads")
    private final boolean enableBackgroundImageUploads;

    public GovTechConfig() {
        this(0, false, 3, null);
    }

    public static /* synthetic */ GovTechConfig copy$default(GovTechConfig govTechConfig, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = govTechConfig.communityModeMaxPhotosInput;
        }
        if ((i2 & 2) != 0) {
            z = govTechConfig.enableBackgroundImageUploads;
        }
        return govTechConfig.copy(i, z);
    }

    public final int component1() {
        return this.communityModeMaxPhotosInput;
    }

    public final boolean component2() {
        return this.enableBackgroundImageUploads;
    }

    public final GovTechConfig copy(int i, boolean z) {
        return new GovTechConfig(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GovTechConfig) {
            GovTechConfig govTechConfig = (GovTechConfig) obj;
            return this.communityModeMaxPhotosInput == govTechConfig.communityModeMaxPhotosInput && this.enableBackgroundImageUploads == govTechConfig.enableBackgroundImageUploads;
        }
        return false;
    }

    public final int getCommunityModeMaxPhotosInput() {
        return this.communityModeMaxPhotosInput;
    }

    public final boolean getEnableBackgroundImageUploads() {
        return this.enableBackgroundImageUploads;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.communityModeMaxPhotosInput) * 31;
        boolean z = this.enableBackgroundImageUploads;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.communityModeMaxPhotosInput;
        boolean z = this.enableBackgroundImageUploads;
        return "GovTechConfig(communityModeMaxPhotosInput=" + i + ", enableBackgroundImageUploads=" + z + ")";
    }

    public GovTechConfig(int i, boolean z) {
        this.communityModeMaxPhotosInput = i;
        this.enableBackgroundImageUploads = z;
    }

    public /* synthetic */ GovTechConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? false : z);
    }
}

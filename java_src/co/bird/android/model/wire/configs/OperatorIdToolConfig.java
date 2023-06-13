package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\bK\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0002\u0010%J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020#HÆ\u0003J\t\u0010c\u001a\u00020#HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003JÓ\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#HÆ\u0001J\u0013\u0010k\u001a\u00020\u00032\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020#HÖ\u0001J\t\u0010n\u001a\u00020oHÖ\u0001R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*¨\u0006p"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorIdToolConfig;", "", "enabled", "", "enableDissociateQr", "enableDissociateLicense", "enableDissociateAnyBrain", "enableDissociateHandlebar", "enableDissociateHelmet", "enableDissociateGermanLicense", "enableDissociateIsraelLicense", "enableDissociateOneCode", "enableDissociateBatterySerial", "enableDissociateUsCaPlate", "enableDissociateMotor", "enableDissociatePcm", "enableDissociatePhysicalLockSticker", "enableDissociateBeacon", "enableAssociateQr", "enableAssociateLicense", "enableAssociateBrain", "enableAssociateHandlebar", "enableAssociateHelmet", "enableAssociateGermanLicense", "enableAssociateIsraelLicense", "enableAssociateOneCode", "enableAssociateBatterySerial", "enableAssociateUsCaPlate", "enableAssociateMotor", "enableAssociatePcm", "enableAssociatePhysicalLockSticker", "enableAssociateBeacon", "enableAssociateAnyBrain", "enableQcSync", "b2BrainSwapMinRssiSetRentalMode", "", "brainSwapTimeoutSeconds", "(ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZII)V", "getB2BrainSwapMinRssiSetRentalMode", "()I", "getBrainSwapTimeoutSeconds", "getEnableAssociateAnyBrain", "()Z", "getEnableAssociateBatterySerial", "getEnableAssociateBeacon", "getEnableAssociateBrain", "getEnableAssociateGermanLicense", "getEnableAssociateHandlebar", "getEnableAssociateHelmet", "getEnableAssociateIsraelLicense", "getEnableAssociateLicense", "getEnableAssociateMotor", "getEnableAssociateOneCode", "getEnableAssociatePcm", "getEnableAssociatePhysicalLockSticker", "getEnableAssociateQr", "getEnableAssociateUsCaPlate", "getEnableDissociateAnyBrain", "getEnableDissociateBatterySerial", "getEnableDissociateBeacon", "getEnableDissociateGermanLicense", "getEnableDissociateHandlebar", "getEnableDissociateHelmet", "getEnableDissociateIsraelLicense", "getEnableDissociateLicense", "getEnableDissociateMotor", "getEnableDissociateOneCode", "getEnableDissociatePcm", "getEnableDissociatePhysicalLockSticker", "getEnableDissociateQr", "getEnableDissociateUsCaPlate", "getEnableQcSync", "getEnabled", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorIdToolConfig {
    @JsonProperty("b2_brain_swap_min_rssi_set_rental_mode")
    @InterfaceC41208ft5("b2_brain_swap_min_rssi_set_rental_mode")
    private final int b2BrainSwapMinRssiSetRentalMode;
    @JsonProperty("brain_swap_timeout_seconds")
    @InterfaceC41208ft5("brain_swap_timeout_seconds")
    private final int brainSwapTimeoutSeconds;
    @JsonProperty("enable_associate_any_brain")
    @InterfaceC41208ft5("enable_associate_any_brain")
    private final boolean enableAssociateAnyBrain;
    @JsonProperty("enable_associate_battery_serial")
    @InterfaceC41208ft5("enable_associate_battery_serial")
    private final boolean enableAssociateBatterySerial;
    @JsonProperty("enable_associate_beacon")
    @InterfaceC41208ft5("enable_associate_beacon")
    private final boolean enableAssociateBeacon;
    @JsonProperty("enable_associate_brain")
    @InterfaceC41208ft5("enable_associate_brain")
    private final boolean enableAssociateBrain;
    @JsonProperty("enable_associate_german_license")
    @InterfaceC41208ft5("enable_associate_german_license")
    private final boolean enableAssociateGermanLicense;
    @JsonProperty("enable_associate_handlebar")
    @InterfaceC41208ft5("enable_associate_handlebar")
    private final boolean enableAssociateHandlebar;
    @JsonProperty("enable_associate_helmet")
    @InterfaceC41208ft5("enable_associate_helmet")
    private final boolean enableAssociateHelmet;
    @JsonProperty("enable_associate_israel_license")
    @InterfaceC41208ft5("enable_associate_israel_license")
    private final boolean enableAssociateIsraelLicense;
    @JsonProperty("enable_associate_license")
    @InterfaceC41208ft5("enable_associate_license")
    private final boolean enableAssociateLicense;
    @JsonProperty("enable_associate_motor")
    @InterfaceC41208ft5("enable_associate_motor")
    private final boolean enableAssociateMotor;
    @JsonProperty("enable_associate_one_code")
    @InterfaceC41208ft5("enable_associate_one_code")
    private final boolean enableAssociateOneCode;
    @JsonProperty("enable_associate_pcm")
    @InterfaceC41208ft5("enable_associate_pcm")
    private final boolean enableAssociatePcm;
    @JsonProperty("enable_associate_physical_lock_sticker")
    @InterfaceC41208ft5("enable_associate_physical_lock_sticker")
    private final boolean enableAssociatePhysicalLockSticker;
    @JsonProperty("enable_associate_qr")
    @InterfaceC41208ft5("enable_associate_qr")
    private final boolean enableAssociateQr;
    @JsonProperty("enable_associate_us_ca_plate")
    @InterfaceC41208ft5("enable_associate_us_ca_plate")
    private final boolean enableAssociateUsCaPlate;
    @JsonProperty("enable_dissociate_any_brain")
    @InterfaceC41208ft5("enable_dissociate_any_brain")
    private final boolean enableDissociateAnyBrain;
    @JsonProperty("enable_dissociate_battery_serial")
    @InterfaceC41208ft5("enable_dissociate_battery_serial")
    private final boolean enableDissociateBatterySerial;
    @JsonProperty("enable_dissociate_beacon")
    @InterfaceC41208ft5("enable_dissociate_beacon")
    private final boolean enableDissociateBeacon;
    @JsonProperty("enable_dissociate_german_license")
    @InterfaceC41208ft5("enable_dissociate_german_license")
    private final boolean enableDissociateGermanLicense;
    @JsonProperty("enable_dissociate_handlebar")
    @InterfaceC41208ft5("enable_dissociate_handlebar")
    private final boolean enableDissociateHandlebar;
    @JsonProperty("enable_dissociate_helmet")
    @InterfaceC41208ft5("enable_dissociate_helmet")
    private final boolean enableDissociateHelmet;
    @JsonProperty("enable_dissociate_israel_license")
    @InterfaceC41208ft5("enable_dissociate_israel_license")
    private final boolean enableDissociateIsraelLicense;
    @JsonProperty("enable_dissociate_license")
    @InterfaceC41208ft5("enable_dissociate_license")
    private final boolean enableDissociateLicense;
    @JsonProperty("enable_dissociate_motor")
    @InterfaceC41208ft5("enable_dissociate_motor")
    private final boolean enableDissociateMotor;
    @JsonProperty("enable_dissociate_one_code")
    @InterfaceC41208ft5("enable_dissociate_one_code")
    private final boolean enableDissociateOneCode;
    @JsonProperty("enable_dissociate_pcm")
    @InterfaceC41208ft5("enable_dissociate_pcm")
    private final boolean enableDissociatePcm;
    @JsonProperty("enable_dissociate_physical_lock_sticker")
    @InterfaceC41208ft5("enable_dissociate_physical_lock_sticker")
    private final boolean enableDissociatePhysicalLockSticker;
    @JsonProperty("enable_dissociate_qr")
    @InterfaceC41208ft5("enable_dissociate_qr")
    private final boolean enableDissociateQr;
    @JsonProperty("enable_dissociate_us_ca_plate")
    @InterfaceC41208ft5("enable_dissociate_us_ca_plate")
    private final boolean enableDissociateUsCaPlate;
    @JsonProperty("enable_qc_sync")
    @InterfaceC41208ft5("enable_qc_sync")
    private final boolean enableQcSync;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;

    public OperatorIdToolConfig() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, -1, 1, null);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component10() {
        return this.enableDissociateBatterySerial;
    }

    public final boolean component11() {
        return this.enableDissociateUsCaPlate;
    }

    public final boolean component12() {
        return this.enableDissociateMotor;
    }

    public final boolean component13() {
        return this.enableDissociatePcm;
    }

    public final boolean component14() {
        return this.enableDissociatePhysicalLockSticker;
    }

    public final boolean component15() {
        return this.enableDissociateBeacon;
    }

    public final boolean component16() {
        return this.enableAssociateQr;
    }

    public final boolean component17() {
        return this.enableAssociateLicense;
    }

    public final boolean component18() {
        return this.enableAssociateBrain;
    }

    public final boolean component19() {
        return this.enableAssociateHandlebar;
    }

    public final boolean component2() {
        return this.enableDissociateQr;
    }

    public final boolean component20() {
        return this.enableAssociateHelmet;
    }

    public final boolean component21() {
        return this.enableAssociateGermanLicense;
    }

    public final boolean component22() {
        return this.enableAssociateIsraelLicense;
    }

    public final boolean component23() {
        return this.enableAssociateOneCode;
    }

    public final boolean component24() {
        return this.enableAssociateBatterySerial;
    }

    public final boolean component25() {
        return this.enableAssociateUsCaPlate;
    }

    public final boolean component26() {
        return this.enableAssociateMotor;
    }

    public final boolean component27() {
        return this.enableAssociatePcm;
    }

    public final boolean component28() {
        return this.enableAssociatePhysicalLockSticker;
    }

    public final boolean component29() {
        return this.enableAssociateBeacon;
    }

    public final boolean component3() {
        return this.enableDissociateLicense;
    }

    public final boolean component30() {
        return this.enableAssociateAnyBrain;
    }

    public final boolean component31() {
        return this.enableQcSync;
    }

    public final int component32() {
        return this.b2BrainSwapMinRssiSetRentalMode;
    }

    public final int component33() {
        return this.brainSwapTimeoutSeconds;
    }

    public final boolean component4() {
        return this.enableDissociateAnyBrain;
    }

    public final boolean component5() {
        return this.enableDissociateHandlebar;
    }

    public final boolean component6() {
        return this.enableDissociateHelmet;
    }

    public final boolean component7() {
        return this.enableDissociateGermanLicense;
    }

    public final boolean component8() {
        return this.enableDissociateIsraelLicense;
    }

    public final boolean component9() {
        return this.enableDissociateOneCode;
    }

    public final OperatorIdToolConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i, int i2) {
        return new OperatorIdToolConfig(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorIdToolConfig) {
            OperatorIdToolConfig operatorIdToolConfig = (OperatorIdToolConfig) obj;
            return this.enabled == operatorIdToolConfig.enabled && this.enableDissociateQr == operatorIdToolConfig.enableDissociateQr && this.enableDissociateLicense == operatorIdToolConfig.enableDissociateLicense && this.enableDissociateAnyBrain == operatorIdToolConfig.enableDissociateAnyBrain && this.enableDissociateHandlebar == operatorIdToolConfig.enableDissociateHandlebar && this.enableDissociateHelmet == operatorIdToolConfig.enableDissociateHelmet && this.enableDissociateGermanLicense == operatorIdToolConfig.enableDissociateGermanLicense && this.enableDissociateIsraelLicense == operatorIdToolConfig.enableDissociateIsraelLicense && this.enableDissociateOneCode == operatorIdToolConfig.enableDissociateOneCode && this.enableDissociateBatterySerial == operatorIdToolConfig.enableDissociateBatterySerial && this.enableDissociateUsCaPlate == operatorIdToolConfig.enableDissociateUsCaPlate && this.enableDissociateMotor == operatorIdToolConfig.enableDissociateMotor && this.enableDissociatePcm == operatorIdToolConfig.enableDissociatePcm && this.enableDissociatePhysicalLockSticker == operatorIdToolConfig.enableDissociatePhysicalLockSticker && this.enableDissociateBeacon == operatorIdToolConfig.enableDissociateBeacon && this.enableAssociateQr == operatorIdToolConfig.enableAssociateQr && this.enableAssociateLicense == operatorIdToolConfig.enableAssociateLicense && this.enableAssociateBrain == operatorIdToolConfig.enableAssociateBrain && this.enableAssociateHandlebar == operatorIdToolConfig.enableAssociateHandlebar && this.enableAssociateHelmet == operatorIdToolConfig.enableAssociateHelmet && this.enableAssociateGermanLicense == operatorIdToolConfig.enableAssociateGermanLicense && this.enableAssociateIsraelLicense == operatorIdToolConfig.enableAssociateIsraelLicense && this.enableAssociateOneCode == operatorIdToolConfig.enableAssociateOneCode && this.enableAssociateBatterySerial == operatorIdToolConfig.enableAssociateBatterySerial && this.enableAssociateUsCaPlate == operatorIdToolConfig.enableAssociateUsCaPlate && this.enableAssociateMotor == operatorIdToolConfig.enableAssociateMotor && this.enableAssociatePcm == operatorIdToolConfig.enableAssociatePcm && this.enableAssociatePhysicalLockSticker == operatorIdToolConfig.enableAssociatePhysicalLockSticker && this.enableAssociateBeacon == operatorIdToolConfig.enableAssociateBeacon && this.enableAssociateAnyBrain == operatorIdToolConfig.enableAssociateAnyBrain && this.enableQcSync == operatorIdToolConfig.enableQcSync && this.b2BrainSwapMinRssiSetRentalMode == operatorIdToolConfig.b2BrainSwapMinRssiSetRentalMode && this.brainSwapTimeoutSeconds == operatorIdToolConfig.brainSwapTimeoutSeconds;
        }
        return false;
    }

    public final int getB2BrainSwapMinRssiSetRentalMode() {
        return this.b2BrainSwapMinRssiSetRentalMode;
    }

    public final int getBrainSwapTimeoutSeconds() {
        return this.brainSwapTimeoutSeconds;
    }

    public final boolean getEnableAssociateAnyBrain() {
        return this.enableAssociateAnyBrain;
    }

    public final boolean getEnableAssociateBatterySerial() {
        return this.enableAssociateBatterySerial;
    }

    public final boolean getEnableAssociateBeacon() {
        return this.enableAssociateBeacon;
    }

    public final boolean getEnableAssociateBrain() {
        return this.enableAssociateBrain;
    }

    public final boolean getEnableAssociateGermanLicense() {
        return this.enableAssociateGermanLicense;
    }

    public final boolean getEnableAssociateHandlebar() {
        return this.enableAssociateHandlebar;
    }

    public final boolean getEnableAssociateHelmet() {
        return this.enableAssociateHelmet;
    }

    public final boolean getEnableAssociateIsraelLicense() {
        return this.enableAssociateIsraelLicense;
    }

    public final boolean getEnableAssociateLicense() {
        return this.enableAssociateLicense;
    }

    public final boolean getEnableAssociateMotor() {
        return this.enableAssociateMotor;
    }

    public final boolean getEnableAssociateOneCode() {
        return this.enableAssociateOneCode;
    }

    public final boolean getEnableAssociatePcm() {
        return this.enableAssociatePcm;
    }

    public final boolean getEnableAssociatePhysicalLockSticker() {
        return this.enableAssociatePhysicalLockSticker;
    }

    public final boolean getEnableAssociateQr() {
        return this.enableAssociateQr;
    }

    public final boolean getEnableAssociateUsCaPlate() {
        return this.enableAssociateUsCaPlate;
    }

    public final boolean getEnableDissociateAnyBrain() {
        return this.enableDissociateAnyBrain;
    }

    public final boolean getEnableDissociateBatterySerial() {
        return this.enableDissociateBatterySerial;
    }

    public final boolean getEnableDissociateBeacon() {
        return this.enableDissociateBeacon;
    }

    public final boolean getEnableDissociateGermanLicense() {
        return this.enableDissociateGermanLicense;
    }

    public final boolean getEnableDissociateHandlebar() {
        return this.enableDissociateHandlebar;
    }

    public final boolean getEnableDissociateHelmet() {
        return this.enableDissociateHelmet;
    }

    public final boolean getEnableDissociateIsraelLicense() {
        return this.enableDissociateIsraelLicense;
    }

    public final boolean getEnableDissociateLicense() {
        return this.enableDissociateLicense;
    }

    public final boolean getEnableDissociateMotor() {
        return this.enableDissociateMotor;
    }

    public final boolean getEnableDissociateOneCode() {
        return this.enableDissociateOneCode;
    }

    public final boolean getEnableDissociatePcm() {
        return this.enableDissociatePcm;
    }

    public final boolean getEnableDissociatePhysicalLockSticker() {
        return this.enableDissociatePhysicalLockSticker;
    }

    public final boolean getEnableDissociateQr() {
        return this.enableDissociateQr;
    }

    public final boolean getEnableDissociateUsCaPlate() {
        return this.enableDissociateUsCaPlate;
    }

    public final boolean getEnableQcSync() {
        return this.enableQcSync;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableDissociateQr;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableDissociateLicense;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableDissociateAnyBrain;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableDissociateHandlebar;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.enableDissociateHelmet;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.enableDissociateGermanLicense;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r27 = this.enableDissociateIsraelLicense;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r28 = this.enableDissociateOneCode;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r29 = this.enableDissociateBatterySerial;
        int i18 = r29;
        if (r29 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        ?? r210 = this.enableDissociateUsCaPlate;
        int i20 = r210;
        if (r210 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        ?? r211 = this.enableDissociateMotor;
        int i22 = r211;
        if (r211 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        ?? r212 = this.enableDissociatePcm;
        int i24 = r212;
        if (r212 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        ?? r213 = this.enableDissociatePhysicalLockSticker;
        int i26 = r213;
        if (r213 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        ?? r214 = this.enableDissociateBeacon;
        int i28 = r214;
        if (r214 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        ?? r215 = this.enableAssociateQr;
        int i30 = r215;
        if (r215 != 0) {
            i30 = 1;
        }
        int i31 = (i29 + i30) * 31;
        ?? r216 = this.enableAssociateLicense;
        int i32 = r216;
        if (r216 != 0) {
            i32 = 1;
        }
        int i33 = (i31 + i32) * 31;
        ?? r217 = this.enableAssociateBrain;
        int i34 = r217;
        if (r217 != 0) {
            i34 = 1;
        }
        int i35 = (i33 + i34) * 31;
        ?? r218 = this.enableAssociateHandlebar;
        int i36 = r218;
        if (r218 != 0) {
            i36 = 1;
        }
        int i37 = (i35 + i36) * 31;
        ?? r219 = this.enableAssociateHelmet;
        int i38 = r219;
        if (r219 != 0) {
            i38 = 1;
        }
        int i39 = (i37 + i38) * 31;
        ?? r220 = this.enableAssociateGermanLicense;
        int i40 = r220;
        if (r220 != 0) {
            i40 = 1;
        }
        int i41 = (i39 + i40) * 31;
        ?? r221 = this.enableAssociateIsraelLicense;
        int i42 = r221;
        if (r221 != 0) {
            i42 = 1;
        }
        int i43 = (i41 + i42) * 31;
        ?? r222 = this.enableAssociateOneCode;
        int i44 = r222;
        if (r222 != 0) {
            i44 = 1;
        }
        int i45 = (i43 + i44) * 31;
        ?? r223 = this.enableAssociateBatterySerial;
        int i46 = r223;
        if (r223 != 0) {
            i46 = 1;
        }
        int i47 = (i45 + i46) * 31;
        ?? r224 = this.enableAssociateUsCaPlate;
        int i48 = r224;
        if (r224 != 0) {
            i48 = 1;
        }
        int i49 = (i47 + i48) * 31;
        ?? r225 = this.enableAssociateMotor;
        int i50 = r225;
        if (r225 != 0) {
            i50 = 1;
        }
        int i51 = (i49 + i50) * 31;
        ?? r226 = this.enableAssociatePcm;
        int i52 = r226;
        if (r226 != 0) {
            i52 = 1;
        }
        int i53 = (i51 + i52) * 31;
        ?? r227 = this.enableAssociatePhysicalLockSticker;
        int i54 = r227;
        if (r227 != 0) {
            i54 = 1;
        }
        int i55 = (i53 + i54) * 31;
        ?? r228 = this.enableAssociateBeacon;
        int i56 = r228;
        if (r228 != 0) {
            i56 = 1;
        }
        int i57 = (i55 + i56) * 31;
        ?? r229 = this.enableAssociateAnyBrain;
        int i58 = r229;
        if (r229 != 0) {
            i58 = 1;
        }
        int i59 = (i57 + i58) * 31;
        boolean z2 = this.enableQcSync;
        return ((((i59 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.b2BrainSwapMinRssiSetRentalMode)) * 31) + Integer.hashCode(this.brainSwapTimeoutSeconds);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enableDissociateQr;
        boolean z3 = this.enableDissociateLicense;
        boolean z4 = this.enableDissociateAnyBrain;
        boolean z5 = this.enableDissociateHandlebar;
        boolean z6 = this.enableDissociateHelmet;
        boolean z7 = this.enableDissociateGermanLicense;
        boolean z8 = this.enableDissociateIsraelLicense;
        boolean z9 = this.enableDissociateOneCode;
        boolean z10 = this.enableDissociateBatterySerial;
        boolean z11 = this.enableDissociateUsCaPlate;
        boolean z12 = this.enableDissociateMotor;
        boolean z13 = this.enableDissociatePcm;
        boolean z14 = this.enableDissociatePhysicalLockSticker;
        boolean z15 = this.enableDissociateBeacon;
        boolean z16 = this.enableAssociateQr;
        boolean z17 = this.enableAssociateLicense;
        boolean z18 = this.enableAssociateBrain;
        boolean z19 = this.enableAssociateHandlebar;
        boolean z20 = this.enableAssociateHelmet;
        boolean z21 = this.enableAssociateGermanLicense;
        boolean z22 = this.enableAssociateIsraelLicense;
        boolean z23 = this.enableAssociateOneCode;
        boolean z24 = this.enableAssociateBatterySerial;
        boolean z25 = this.enableAssociateUsCaPlate;
        boolean z26 = this.enableAssociateMotor;
        boolean z27 = this.enableAssociatePcm;
        boolean z28 = this.enableAssociatePhysicalLockSticker;
        boolean z29 = this.enableAssociateBeacon;
        boolean z30 = this.enableAssociateAnyBrain;
        boolean z31 = this.enableQcSync;
        int i = this.b2BrainSwapMinRssiSetRentalMode;
        int i2 = this.brainSwapTimeoutSeconds;
        return "OperatorIdToolConfig(enabled=" + z + ", enableDissociateQr=" + z2 + ", enableDissociateLicense=" + z3 + ", enableDissociateAnyBrain=" + z4 + ", enableDissociateHandlebar=" + z5 + ", enableDissociateHelmet=" + z6 + ", enableDissociateGermanLicense=" + z7 + ", enableDissociateIsraelLicense=" + z8 + ", enableDissociateOneCode=" + z9 + ", enableDissociateBatterySerial=" + z10 + ", enableDissociateUsCaPlate=" + z11 + ", enableDissociateMotor=" + z12 + ", enableDissociatePcm=" + z13 + ", enableDissociatePhysicalLockSticker=" + z14 + ", enableDissociateBeacon=" + z15 + ", enableAssociateQr=" + z16 + ", enableAssociateLicense=" + z17 + ", enableAssociateBrain=" + z18 + ", enableAssociateHandlebar=" + z19 + ", enableAssociateHelmet=" + z20 + ", enableAssociateGermanLicense=" + z21 + ", enableAssociateIsraelLicense=" + z22 + ", enableAssociateOneCode=" + z23 + ", enableAssociateBatterySerial=" + z24 + ", enableAssociateUsCaPlate=" + z25 + ", enableAssociateMotor=" + z26 + ", enableAssociatePcm=" + z27 + ", enableAssociatePhysicalLockSticker=" + z28 + ", enableAssociateBeacon=" + z29 + ", enableAssociateAnyBrain=" + z30 + ", enableQcSync=" + z31 + ", b2BrainSwapMinRssiSetRentalMode=" + i + ", brainSwapTimeoutSeconds=" + i2 + ")";
    }

    public OperatorIdToolConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i, int i2) {
        this.enabled = z;
        this.enableDissociateQr = z2;
        this.enableDissociateLicense = z3;
        this.enableDissociateAnyBrain = z4;
        this.enableDissociateHandlebar = z5;
        this.enableDissociateHelmet = z6;
        this.enableDissociateGermanLicense = z7;
        this.enableDissociateIsraelLicense = z8;
        this.enableDissociateOneCode = z9;
        this.enableDissociateBatterySerial = z10;
        this.enableDissociateUsCaPlate = z11;
        this.enableDissociateMotor = z12;
        this.enableDissociatePcm = z13;
        this.enableDissociatePhysicalLockSticker = z14;
        this.enableDissociateBeacon = z15;
        this.enableAssociateQr = z16;
        this.enableAssociateLicense = z17;
        this.enableAssociateBrain = z18;
        this.enableAssociateHandlebar = z19;
        this.enableAssociateHelmet = z20;
        this.enableAssociateGermanLicense = z21;
        this.enableAssociateIsraelLicense = z22;
        this.enableAssociateOneCode = z23;
        this.enableAssociateBatterySerial = z24;
        this.enableAssociateUsCaPlate = z25;
        this.enableAssociateMotor = z26;
        this.enableAssociatePcm = z27;
        this.enableAssociatePhysicalLockSticker = z28;
        this.enableAssociateBeacon = z29;
        this.enableAssociateAnyBrain = z30;
        this.enableQcSync = z31;
        this.b2BrainSwapMinRssiSetRentalMode = i;
        this.brainSwapTimeoutSeconds = i2;
    }

    public /* synthetic */ OperatorIdToolConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? false : z7, (i3 & 128) != 0 ? false : z8, (i3 & 256) != 0 ? false : z9, (i3 & 512) != 0 ? false : z10, (i3 & 1024) != 0 ? false : z11, (i3 & 2048) != 0 ? false : z12, (i3 & 4096) != 0 ? false : z13, (i3 & 8192) != 0 ? false : z14, (i3 & 16384) != 0 ? false : z15, (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z16, (i3 & 65536) != 0 ? false : z17, (i3 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? false : z18, (i3 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? false : z19, (i3 & 524288) != 0 ? false : z20, (i3 & 1048576) != 0 ? false : z21, (i3 & 2097152) != 0 ? false : z22, (i3 & 4194304) != 0 ? false : z23, (i3 & 8388608) != 0 ? false : z24, (i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z25, (i3 & 33554432) != 0 ? false : z26, (i3 & 67108864) != 0 ? false : z27, (i3 & 134217728) != 0 ? false : z28, (i3 & 268435456) != 0 ? false : z29, (i3 & 536870912) != 0 ? false : z30, (i3 & 1073741824) != 0 ? false : z31, (i3 & Integer.MIN_VALUE) != 0 ? -90 : i, (i4 & 1) != 0 ? 600 : i2);
    }
}

package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/api/response/WireBluetoothDecryptionResponse;", "", "decryptedPayloadBase64", "", "(Ljava/lang/String;)V", "getDecryptedPayloadBase64", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBluetoothDecryptionResponse {
    @JsonProperty("decrypted_payload_base64")
    @InterfaceC41208ft5("decrypted_payload_base64")
    private final String decryptedPayloadBase64;

    public WireBluetoothDecryptionResponse(String decryptedPayloadBase64) {
        Intrinsics.checkNotNullParameter(decryptedPayloadBase64, "decryptedPayloadBase64");
        this.decryptedPayloadBase64 = decryptedPayloadBase64;
    }

    public static /* synthetic */ WireBluetoothDecryptionResponse copy$default(WireBluetoothDecryptionResponse wireBluetoothDecryptionResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBluetoothDecryptionResponse.decryptedPayloadBase64;
        }
        return wireBluetoothDecryptionResponse.copy(str);
    }

    public final String component1() {
        return this.decryptedPayloadBase64;
    }

    public final WireBluetoothDecryptionResponse copy(String decryptedPayloadBase64) {
        Intrinsics.checkNotNullParameter(decryptedPayloadBase64, "decryptedPayloadBase64");
        return new WireBluetoothDecryptionResponse(decryptedPayloadBase64);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireBluetoothDecryptionResponse) && Intrinsics.areEqual(this.decryptedPayloadBase64, ((WireBluetoothDecryptionResponse) obj).decryptedPayloadBase64);
    }

    public final String getDecryptedPayloadBase64() {
        return this.decryptedPayloadBase64;
    }

    public int hashCode() {
        return this.decryptedPayloadBase64.hashCode();
    }

    public String toString() {
        String str = this.decryptedPayloadBase64;
        return "WireBluetoothDecryptionResponse(decryptedPayloadBase64=" + str + ")";
    }
}

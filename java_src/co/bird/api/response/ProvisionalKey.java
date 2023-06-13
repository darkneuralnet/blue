package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/response/ProvisionalKey;", "", "aesEncryptionKey", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getAesEncryptionKey", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ProvisionalKey {
    @JsonProperty("aes_encryption_key")
    @InterfaceC41208ft5("aes_encryption_key")
    private final String aesEncryptionKey;
    @JsonProperty("password")
    @InterfaceC41208ft5("password")
    private final String password;

    public ProvisionalKey() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ProvisionalKey copy$default(ProvisionalKey provisionalKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provisionalKey.aesEncryptionKey;
        }
        if ((i & 2) != 0) {
            str2 = provisionalKey.password;
        }
        return provisionalKey.copy(str, str2);
    }

    public final String component1() {
        return this.aesEncryptionKey;
    }

    public final String component2() {
        return this.password;
    }

    public final ProvisionalKey copy(String aesEncryptionKey, String password) {
        Intrinsics.checkNotNullParameter(aesEncryptionKey, "aesEncryptionKey");
        Intrinsics.checkNotNullParameter(password, "password");
        return new ProvisionalKey(aesEncryptionKey, password);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionalKey) {
            ProvisionalKey provisionalKey = (ProvisionalKey) obj;
            return Intrinsics.areEqual(this.aesEncryptionKey, provisionalKey.aesEncryptionKey) && Intrinsics.areEqual(this.password, provisionalKey.password);
        }
        return false;
    }

    public final String getAesEncryptionKey() {
        return this.aesEncryptionKey;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return (this.aesEncryptionKey.hashCode() * 31) + this.password.hashCode();
    }

    public String toString() {
        String str = this.aesEncryptionKey;
        String str2 = this.password;
        return "ProvisionalKey(aesEncryptionKey=" + str + ", password=" + str2 + ")";
    }

    public ProvisionalKey(String aesEncryptionKey, String password) {
        Intrinsics.checkNotNullParameter(aesEncryptionKey, "aesEncryptionKey");
        Intrinsics.checkNotNullParameter(password, "password");
        this.aesEncryptionKey = aesEncryptionKey;
        this.password = password;
    }

    public /* synthetic */ ProvisionalKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
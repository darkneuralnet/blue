package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/response/SmartlockKey;", "", "id", "", "key", "password", "provisional", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getKey", "getPassword", "getProvisional", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SmartlockKey {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68228id;
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty("password")
    @InterfaceC41208ft5("password")
    private final String password;
    @JsonProperty("provisional")
    @InterfaceC41208ft5("provisional")
    private final boolean provisional;

    public SmartlockKey() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ SmartlockKey copy$default(SmartlockKey smartlockKey, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartlockKey.f68228id;
        }
        if ((i & 2) != 0) {
            str2 = smartlockKey.key;
        }
        if ((i & 4) != 0) {
            str3 = smartlockKey.password;
        }
        if ((i & 8) != 0) {
            z = smartlockKey.provisional;
        }
        return smartlockKey.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.f68228id;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.password;
    }

    public final boolean component4() {
        return this.provisional;
    }

    public final SmartlockKey copy(String id, String key, String password, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(password, "password");
        return new SmartlockKey(id, key, password, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartlockKey) {
            SmartlockKey smartlockKey = (SmartlockKey) obj;
            return Intrinsics.areEqual(this.f68228id, smartlockKey.f68228id) && Intrinsics.areEqual(this.key, smartlockKey.key) && Intrinsics.areEqual(this.password, smartlockKey.password) && this.provisional == smartlockKey.provisional;
        }
        return false;
    }

    public final String getId() {
        return this.f68228id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPassword() {
        return this.password;
    }

    public final boolean getProvisional() {
        return this.provisional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f68228id.hashCode() * 31) + this.key.hashCode()) * 31) + this.password.hashCode()) * 31;
        boolean z = this.provisional;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f68228id;
        String str2 = this.key;
        String str3 = this.password;
        boolean z = this.provisional;
        return "SmartlockKey(id=" + str + ", key=" + str2 + ", password=" + str3 + ", provisional=" + z + ")";
    }

    public SmartlockKey(String id, String key, String password, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(password, "password");
        this.f68228id = id;
        this.key = key;
        this.password = password;
        this.provisional = z;
    }

    public /* synthetic */ SmartlockKey(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}

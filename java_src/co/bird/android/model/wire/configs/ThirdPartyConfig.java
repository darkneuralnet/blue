package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ThirdPartyConfig;", "", "facebook", "Lco/bird/android/model/wire/configs/FacebookConfig;", "firebase", "Lco/bird/android/model/wire/configs/FirebaseConfig;", "(Lco/bird/android/model/wire/configs/FacebookConfig;Lco/bird/android/model/wire/configs/FirebaseConfig;)V", "getFacebook", "()Lco/bird/android/model/wire/configs/FacebookConfig;", "getFirebase", "()Lco/bird/android/model/wire/configs/FirebaseConfig;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ThirdPartyConfig {
    @JsonProperty("facebook")
    @InterfaceC41208ft5("facebook")
    private final FacebookConfig facebook;
    @JsonProperty("firebase")
    @InterfaceC41208ft5("firebase")
    private final FirebaseConfig firebase;

    public ThirdPartyConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ThirdPartyConfig copy$default(ThirdPartyConfig thirdPartyConfig, FacebookConfig facebookConfig, FirebaseConfig firebaseConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            facebookConfig = thirdPartyConfig.facebook;
        }
        if ((i & 2) != 0) {
            firebaseConfig = thirdPartyConfig.firebase;
        }
        return thirdPartyConfig.copy(facebookConfig, firebaseConfig);
    }

    public final FacebookConfig component1() {
        return this.facebook;
    }

    public final FirebaseConfig component2() {
        return this.firebase;
    }

    public final ThirdPartyConfig copy(FacebookConfig facebook, FirebaseConfig firebase) {
        Intrinsics.checkNotNullParameter(facebook, "facebook");
        Intrinsics.checkNotNullParameter(firebase, "firebase");
        return new ThirdPartyConfig(facebook, firebase);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThirdPartyConfig) {
            ThirdPartyConfig thirdPartyConfig = (ThirdPartyConfig) obj;
            return Intrinsics.areEqual(this.facebook, thirdPartyConfig.facebook) && Intrinsics.areEqual(this.firebase, thirdPartyConfig.firebase);
        }
        return false;
    }

    public final FacebookConfig getFacebook() {
        return this.facebook;
    }

    public final FirebaseConfig getFirebase() {
        return this.firebase;
    }

    public int hashCode() {
        return (this.facebook.hashCode() * 31) + this.firebase.hashCode();
    }

    public String toString() {
        FacebookConfig facebookConfig = this.facebook;
        FirebaseConfig firebaseConfig = this.firebase;
        return "ThirdPartyConfig(facebook=" + facebookConfig + ", firebase=" + firebaseConfig + ")";
    }

    public ThirdPartyConfig(FacebookConfig facebook, FirebaseConfig firebase) {
        Intrinsics.checkNotNullParameter(facebook, "facebook");
        Intrinsics.checkNotNullParameter(firebase, "firebase");
        this.facebook = facebook;
        this.firebase = firebase;
    }

    public /* synthetic */ ThirdPartyConfig(FacebookConfig facebookConfig, FirebaseConfig firebaseConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FacebookConfig(false, false, 3, null) : facebookConfig, (i & 2) != 0 ? new FirebaseConfig(false, 1, null) : firebaseConfig);
    }
}

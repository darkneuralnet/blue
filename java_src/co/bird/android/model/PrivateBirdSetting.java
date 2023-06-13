package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/PrivateBirdSetting;", "", "tamperAlarmEnabled", "", "(Z)V", "getTamperAlarmEnabled", "()Z", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PrivateBirdSetting {
    @JsonProperty("tamper_alarm")
    @InterfaceC41208ft5("tamper_alarm")
    private final boolean tamperAlarmEnabled;

    public PrivateBirdSetting() {
        this(false, 1, null);
    }

    public final boolean getTamperAlarmEnabled() {
        return this.tamperAlarmEnabled;
    }

    public PrivateBirdSetting(boolean z) {
        this.tamperAlarmEnabled = z;
    }

    public /* synthetic */ PrivateBirdSetting(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

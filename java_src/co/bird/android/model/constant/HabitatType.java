package co.bird.android.model.constant;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/constant/HabitatType;", "", "habitatId", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getHabitatId", "()Ljava/lang/String;", "BIRD", "CIRC", "CITY_DEMO", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum HabitatType {
    BIRD("00000000-0000-0000-0000-000000000000"),
    CIRC("f3612b08-65d8-4377-8c70-1086a926a33f"),
    CITY_DEMO("8984f2c0-6a28-4c91-a93a-42fb75528351");
    
    private final String habitatId;

    HabitatType(String str) {
        this.habitatId = str;
    }

    public final String getHabitatId() {
        return this.habitatId;
    }
}

package co.bird.android.model.identification;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationJurisdiction;", "Landroid/os/Parcelable;", "jurisdiction", "", "(Ljava/lang/String;)V", "getJurisdiction", "()Ljava/lang/String;", "Lco/bird/android/model/identification/IdentificationCountryJurisdiction;", "Lco/bird/android/model/identification/IdentificationRegionJurisdiction;", "Lco/bird/android/model/identification/IdentificationStateJurisdiction;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class IdentificationJurisdiction implements Parcelable {
    private final String jurisdiction;

    public /* synthetic */ IdentificationJurisdiction(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJurisdiction() {
        return this.jurisdiction;
    }

    private IdentificationJurisdiction(String str) {
        this.jurisdiction = str;
    }
}

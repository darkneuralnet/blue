package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdLicenseView {
    private final String code;

    public BirdLicenseView(String str) {
        this.code = str;
    }

    public static /* synthetic */ BirdLicenseView copy$default(BirdLicenseView birdLicenseView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdLicenseView.code;
        }
        return birdLicenseView.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final BirdLicenseView copy(String str) {
        return new BirdLicenseView(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BirdLicenseView) && Intrinsics.areEqual(this.code, ((BirdLicenseView) obj).code);
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        String str = this.code;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.code;
        return "BirdLicenseView(code=" + str + ")";
    }
}

package com.stripe.android.stripe3ds2.observability;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "Landroid/os/Parcelable;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Stripe3ds2ErrorReporterConfig implements DefaultErrorReporter.Config, Parcelable {
    public static final Parcelable.Creator<Stripe3ds2ErrorReporterConfig> CREATOR = new Creator();
    private final SdkTransactionId sdkTransactionId;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2ErrorReporterConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2ErrorReporterConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2ErrorReporterConfig(parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2ErrorReporterConfig[] newArray(int i) {
            return new Stripe3ds2ErrorReporterConfig[i];
        }
    }

    public Stripe3ds2ErrorReporterConfig(SdkTransactionId sdkTransactionId) {
        this.sdkTransactionId = sdkTransactionId;
    }

    private final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public static /* synthetic */ Stripe3ds2ErrorReporterConfig copy$default(Stripe3ds2ErrorReporterConfig stripe3ds2ErrorReporterConfig, SdkTransactionId sdkTransactionId, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkTransactionId = stripe3ds2ErrorReporterConfig.sdkTransactionId;
        }
        return stripe3ds2ErrorReporterConfig.copy(sdkTransactionId);
    }

    public final Stripe3ds2ErrorReporterConfig copy(SdkTransactionId sdkTransactionId) {
        return new Stripe3ds2ErrorReporterConfig(sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Stripe3ds2ErrorReporterConfig) && Intrinsics.areEqual(this.sdkTransactionId, ((Stripe3ds2ErrorReporterConfig) obj).sdkTransactionId);
    }

    @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
    public Map<String, String> getCustomTags() {
        Map<String, String> map;
        Map<String, String> emptyMap;
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId != null) {
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("sdk_transaction_id", sdkTransactionId.getValue()));
        } else {
            map = null;
        }
        if (map == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        return map;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            return 0;
        }
        return sdkTransactionId.hashCode();
    }

    public String toString() {
        return "Stripe3ds2ErrorReporterConfig(sdkTransactionId=" + this.sdkTransactionId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        sdkTransactionId.writeToParcel(out, i);
    }
}

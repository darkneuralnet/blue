package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.init.p048ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001AB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010#\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b,J\u000e\u0010-\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b.J\u000e\u0010/\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\b0JO\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020;HÖ\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006B"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "Landroid/os/Parcelable;", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "timeoutMins", "", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getCreqData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getCreqExecutorConfig$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "getCreqExecutorFactory$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "getCresData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "getIntentData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getTimeoutMins$3ds2sdk_release", "()I", "getUiCustomization$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "component3", "component3$3ds2sdk_release", "component4", "component4$3ds2sdk_release", "component5", "component5$3ds2sdk_release", "component6", "component6$3ds2sdk_release", "component7", "component7$3ds2sdk_release", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeViewArgs implements Parcelable {
    private static final String EXTRA_ARGS = "extra_args";
    private final ChallengeRequestData creqData;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final ChallengeRequestExecutor.Factory creqExecutorFactory;
    private final ChallengeResponseData cresData;
    private final IntentData intentData;
    private final int timeoutMins;
    private final StripeUiCustomization uiCustomization;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeViewArgs> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;", "", "()V", "EXTRA_ARGS", "", "create", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "extras", "Landroid/os/Bundle;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeViewArgs create(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            Parcelable parcelable = extras.getParcelable(ChallengeViewArgs.EXTRA_ARGS);
            if (parcelable != null) {
                return (ChallengeViewArgs) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeViewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeViewArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeViewArgs(ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestData.CREATOR.createFromParcel(parcel), (StripeUiCustomization) parcel.readParcelable(ChallengeViewArgs.class.getClassLoader()), ChallengeRequestExecutor.Config.CREATOR.createFromParcel(parcel), (ChallengeRequestExecutor.Factory) parcel.readSerializable(), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeViewArgs[] newArray(int i) {
            return new ChallengeViewArgs[i];
        }
    }

    public ChallengeViewArgs(ChallengeResponseData cresData, ChallengeRequestData creqData, StripeUiCustomization uiCustomization, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeRequestExecutor.Factory creqExecutorFactory, int i, IntentData intentData) {
        Intrinsics.checkNotNullParameter(cresData, "cresData");
        Intrinsics.checkNotNullParameter(creqData, "creqData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
        Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        this.cresData = cresData;
        this.creqData = creqData;
        this.uiCustomization = uiCustomization;
        this.creqExecutorConfig = creqExecutorConfig;
        this.creqExecutorFactory = creqExecutorFactory;
        this.timeoutMins = i;
        this.intentData = intentData;
    }

    public static /* synthetic */ ChallengeViewArgs copy$default(ChallengeViewArgs challengeViewArgs, ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, int i, IntentData intentData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            challengeResponseData = challengeViewArgs.cresData;
        }
        if ((i2 & 2) != 0) {
            challengeRequestData = challengeViewArgs.creqData;
        }
        ChallengeRequestData challengeRequestData2 = challengeRequestData;
        if ((i2 & 4) != 0) {
            stripeUiCustomization = challengeViewArgs.uiCustomization;
        }
        StripeUiCustomization stripeUiCustomization2 = stripeUiCustomization;
        if ((i2 & 8) != 0) {
            config = challengeViewArgs.creqExecutorConfig;
        }
        ChallengeRequestExecutor.Config config2 = config;
        if ((i2 & 16) != 0) {
            factory = challengeViewArgs.creqExecutorFactory;
        }
        ChallengeRequestExecutor.Factory factory2 = factory;
        if ((i2 & 32) != 0) {
            i = challengeViewArgs.timeoutMins;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            intentData = challengeViewArgs.intentData;
        }
        return challengeViewArgs.copy(challengeResponseData, challengeRequestData2, stripeUiCustomization2, config2, factory2, i3, intentData);
    }

    public final ChallengeResponseData component1$3ds2sdk_release() {
        return this.cresData;
    }

    public final ChallengeRequestData component2$3ds2sdk_release() {
        return this.creqData;
    }

    public final StripeUiCustomization component3$3ds2sdk_release() {
        return this.uiCustomization;
    }

    public final ChallengeRequestExecutor.Config component4$3ds2sdk_release() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory component5$3ds2sdk_release() {
        return this.creqExecutorFactory;
    }

    public final int component6$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final IntentData component7$3ds2sdk_release() {
        return this.intentData;
    }

    public final ChallengeViewArgs copy(ChallengeResponseData cresData, ChallengeRequestData creqData, StripeUiCustomization uiCustomization, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeRequestExecutor.Factory creqExecutorFactory, int i, IntentData intentData) {
        Intrinsics.checkNotNullParameter(cresData, "cresData");
        Intrinsics.checkNotNullParameter(creqData, "creqData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
        Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        return new ChallengeViewArgs(cresData, creqData, uiCustomization, creqExecutorConfig, creqExecutorFactory, i, intentData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeViewArgs) {
            ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) obj;
            return Intrinsics.areEqual(this.cresData, challengeViewArgs.cresData) && Intrinsics.areEqual(this.creqData, challengeViewArgs.creqData) && Intrinsics.areEqual(this.uiCustomization, challengeViewArgs.uiCustomization) && Intrinsics.areEqual(this.creqExecutorConfig, challengeViewArgs.creqExecutorConfig) && Intrinsics.areEqual(this.creqExecutorFactory, challengeViewArgs.creqExecutorFactory) && this.timeoutMins == challengeViewArgs.timeoutMins && Intrinsics.areEqual(this.intentData, challengeViewArgs.intentData);
        }
        return false;
    }

    public final ChallengeRequestData getCreqData$3ds2sdk_release() {
        return this.creqData;
    }

    public final ChallengeRequestExecutor.Config getCreqExecutorConfig$3ds2sdk_release() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory getCreqExecutorFactory$3ds2sdk_release() {
        return this.creqExecutorFactory;
    }

    public final ChallengeResponseData getCresData$3ds2sdk_release() {
        return this.cresData;
    }

    public final IntentData getIntentData$3ds2sdk_release() {
        return this.intentData;
    }

    public final SdkTransactionId getSdkTransactionId$3ds2sdk_release() {
        return this.creqData.getSdkTransId();
    }

    public final int getTimeoutMins$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final StripeUiCustomization getUiCustomization$3ds2sdk_release() {
        return this.uiCustomization;
    }

    public int hashCode() {
        return (((((((((((this.cresData.hashCode() * 31) + this.creqData.hashCode()) * 31) + this.uiCustomization.hashCode()) * 31) + this.creqExecutorConfig.hashCode()) * 31) + this.creqExecutorFactory.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public final Bundle toBundle() {
        return C39564d70.m44603a(TuplesKt.m28425to(EXTRA_ARGS, this));
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.cresData + ", creqData=" + this.creqData + ", uiCustomization=" + this.uiCustomization + ", creqExecutorConfig=" + this.creqExecutorConfig + ", creqExecutorFactory=" + this.creqExecutorFactory + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.cresData.writeToParcel(out, i);
        this.creqData.writeToParcel(out, i);
        out.writeParcelable(this.uiCustomization, i);
        this.creqExecutorConfig.writeToParcel(out, i);
        out.writeSerializable(this.creqExecutorFactory);
        out.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(out, i);
    }
}

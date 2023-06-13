package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.SetupIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/SetupIntentResult;", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/SetupIntent;", "intent", "outcomeFromFlow", "", "failureMessage", "", "(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V", "getFailureMessage", "()Ljava/lang/String;", "getIntent", "()Lcom/stripe/android/model/SetupIntent;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class SetupIntentResult extends StripeIntentResult<SetupIntent> {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SetupIntentResult> CREATOR = new Creator();
    private final String failureMessage;
    private final SetupIntent intent;
    private final int outcomeFromFlow;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SetupIntentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntentResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetupIntentResult(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntentResult[] newArray(int i) {
            return new SetupIntentResult[i];
        }
    }

    public /* synthetic */ SetupIntentResult(SetupIntent setupIntent, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(setupIntent, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }

    private final int component2() {
        return this.outcomeFromFlow;
    }

    public static /* synthetic */ SetupIntentResult copy$default(SetupIntentResult setupIntentResult, SetupIntent setupIntent, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            setupIntent = setupIntentResult.getIntent();
        }
        if ((i2 & 2) != 0) {
            i = setupIntentResult.outcomeFromFlow;
        }
        if ((i2 & 4) != 0) {
            str = setupIntentResult.getFailureMessage();
        }
        return setupIntentResult.copy(setupIntent, i, str);
    }

    public final SetupIntent component1() {
        return getIntent();
    }

    public final String component3() {
        return getFailureMessage();
    }

    public final SetupIntentResult copy(SetupIntent intent, int i, String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new SetupIntentResult(intent, i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetupIntentResult) {
            SetupIntentResult setupIntentResult = (SetupIntentResult) obj;
            return Intrinsics.areEqual(getIntent(), setupIntentResult.getIntent()) && this.outcomeFromFlow == setupIntentResult.outcomeFromFlow && Intrinsics.areEqual(getFailureMessage(), setupIntentResult.getFailureMessage());
        }
        return false;
    }

    @Override // com.stripe.android.StripeIntentResult
    public String getFailureMessage() {
        return this.failureMessage;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (((getIntent().hashCode() * 31) + Integer.hashCode(this.outcomeFromFlow)) * 31) + (getFailureMessage() == null ? 0 : getFailureMessage().hashCode());
    }

    public String toString() {
        SetupIntent intent = getIntent();
        int i = this.outcomeFromFlow;
        String failureMessage = getFailureMessage();
        return "SetupIntentResult(intent=" + intent + ", outcomeFromFlow=" + i + ", failureMessage=" + failureMessage + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.intent.writeToParcel(out, i);
        out.writeInt(this.outcomeFromFlow);
        out.writeString(this.failureMessage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentResult(SetupIntent intent, int i, String str) {
        super(i);
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.outcomeFromFlow = i;
        this.failureMessage = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.StripeIntentResult
    public SetupIntent getIntent() {
        return this.intent;
    }
}

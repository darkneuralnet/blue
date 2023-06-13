package com.stripe.android.stripe3ds2.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "Landroid/os/Parcelable;", "()V", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "toBundle", "Landroid/os/Bundle;", "toBundle$3ds2sdk_release", "Canceled", "Companion", "Failed", "ProtocolError", "RuntimeError", "Succeeded", "Timeout", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ChallengeResult implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_RESULT = "extra_result";

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getUiTypeCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Canceled extends ChallengeResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Canceled(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String str, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = canceled.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = canceled.getInitialUiType();
            }
            if ((i & 4) != 0) {
                intentData = canceled.getIntentData();
            }
            return canceled.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Canceled copy(String str, UiType uiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Canceled(str, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Canceled) {
                Canceled canceled = (Canceled) obj;
                return Intrinsics.areEqual(this.uiTypeCode, canceled.uiTypeCode) && getInitialUiType() == canceled.getInitialUiType() && Intrinsics.areEqual(getIntentData(), canceled.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            return ((((str == null ? 0 : str.hashCode()) * 31) + (getInitialUiType() != null ? getInitialUiType().hashCode() : 0)) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;", "", "()V", "EXTRA_RESULT", "", "fromIntent", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "intent", "Landroid/content/Intent;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeResult fromIntent(Intent intent) {
            ChallengeResult challengeResult;
            if (intent != null) {
                challengeResult = (ChallengeResult) intent.getParcelableExtra("extra_result");
            } else {
                challengeResult = null;
            }
            if (challengeResult == null) {
                return new RuntimeError(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, IntentData.Companion.getEMPTY());
            }
            return challengeResult;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getUiTypeCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Failed extends ChallengeResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = failed.getInitialUiType();
            }
            if ((i & 4) != 0) {
                intentData = failed.getIntentData();
            }
            return failed.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Failed copy(String uiTypeCode, UiType uiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Failed(uiTypeCode, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failed) {
                Failed failed = (Failed) obj;
                return Intrinsics.areEqual(this.uiTypeCode, failed.uiTypeCode) && getInitialUiType() == failed.getInitialUiType() && Intrinsics.areEqual(getIntentData(), failed.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            return (((this.uiTypeCode.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", MessageExtension.FIELD_DATA, "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getData", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ProtocolError extends ChallengeResult {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new Creator();
        private final ErrorData data;
        private final UiType initialUiType;
        private final IntentData intentData;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ProtocolError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError[] newArray(int i) {
                return new ProtocolError[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.data = data;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ ProtocolError copy$default(ProtocolError protocolError, ErrorData errorData, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                errorData = protocolError.data;
            }
            if ((i & 2) != 0) {
                uiType = protocolError.getInitialUiType();
            }
            if ((i & 4) != 0) {
                intentData = protocolError.getIntentData();
            }
            return protocolError.copy(errorData, uiType, intentData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final ProtocolError copy(ErrorData data, UiType uiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new ProtocolError(data, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ProtocolError) {
                ProtocolError protocolError = (ProtocolError) obj;
                return Intrinsics.areEqual(this.data, protocolError.data) && getInitialUiType() == protocolError.getInitialUiType() && Intrinsics.areEqual(getIntentData(), protocolError.getIntentData());
            }
            return false;
        }

        public final ErrorData getData() {
            return this.data;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.data.writeToParcel(out, i);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "throwable", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class RuntimeError extends ChallengeResult {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final Throwable throwable;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<RuntimeError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError[] newArray(int i) {
                return new RuntimeError[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.throwable = throwable;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, Throwable th, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                th = runtimeError.throwable;
            }
            if ((i & 2) != 0) {
                uiType = runtimeError.getInitialUiType();
            }
            if ((i & 4) != 0) {
                intentData = runtimeError.getIntentData();
            }
            return runtimeError.copy(th, uiType, intentData);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final RuntimeError copy(Throwable throwable, UiType uiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new RuntimeError(throwable, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RuntimeError) {
                RuntimeError runtimeError = (RuntimeError) obj;
                return Intrinsics.areEqual(this.throwable, runtimeError.throwable) && getInitialUiType() == runtimeError.getInitialUiType() && Intrinsics.areEqual(getIntentData(), runtimeError.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return (((this.throwable.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeSerializable(this.throwable);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getUiTypeCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Succeeded extends ChallengeResult {
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Succeeded(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = succeeded.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = succeeded.getInitialUiType();
            }
            if ((i & 4) != 0) {
                intentData = succeeded.getIntentData();
            }
            return succeeded.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Succeeded copy(String uiTypeCode, UiType uiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Succeeded(uiTypeCode, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Succeeded) {
                Succeeded succeeded = (Succeeded) obj;
                return Intrinsics.areEqual(this.uiTypeCode, succeeded.uiTypeCode) && getInitialUiType() == succeeded.getInitialUiType() && Intrinsics.areEqual(getIntentData(), succeeded.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            return (((this.uiTypeCode.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getUiTypeCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Timeout extends ChallengeResult {
        public static final Parcelable.Creator<Timeout> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Timeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout[] newArray(int i) {
                return new Timeout[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String str, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Timeout copy$default(Timeout timeout, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timeout.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = timeout.getInitialUiType();
            }
            if ((i & 4) != 0) {
                intentData = timeout.getIntentData();
            }
            return timeout.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Timeout copy(String str, UiType uiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Timeout(str, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Timeout) {
                Timeout timeout = (Timeout) obj;
                return Intrinsics.areEqual(this.uiTypeCode, timeout.uiTypeCode) && getInitialUiType() == timeout.getInitialUiType() && Intrinsics.areEqual(getIntentData(), timeout.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            return ((((str == null ? 0 : str.hashCode()) * 31) + (getInitialUiType() != null ? getInitialUiType().hashCode() : 0)) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i);
        }
    }

    public /* synthetic */ ChallengeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UiType getInitialUiType();

    public abstract IntentData getIntentData();

    public final Bundle toBundle$3ds2sdk_release() {
        return C39564d70.m44603a(TuplesKt.m28425to("extra_result", this));
    }

    private ChallengeResult() {
    }
}

package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002ABBs\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0084\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010/J\t\u00100\u001a\u000201HÖ\u0001J\u0013\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\r\u00106\u001a\u00020\u0000H\u0000¢\u0006\u0002\b7J\r\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\t\u0010;\u001a\u00020\u0004HÖ\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000201HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006C"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", ChallengeRequestData.FIELD_MESSAGE_VERSION, "", "threeDsServerTransId", "acsTransId", "sdkTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", ChallengeRequestData.FIELD_CHALLENGE_DATA_ENTRY, "cancelReason", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "challengeHtmlDataEntry", ChallengeRequestData.FIELD_MESSAGE_EXTENSION, "", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", ChallengeRequestData.FIELD_OOB_CONTINUE, "", "shouldResendChallenge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAcsTransId", "()Ljava/lang/String;", "getCancelReason", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "getChallengeDataEntry", "getChallengeHtmlDataEntry", "getMessageExtensions", "()Ljava/util/List;", "getMessageVersion", "getOobContinue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getShouldResendChallenge", "getThreeDsServerTransId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "sanitize", "sanitize$3ds2sdk_release", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CancelReason", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeRequestData implements Serializable, Parcelable {
    public static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    public static final String FIELD_ACS_TRANS_ID = "acsTransID";
    public static final String FIELD_CHALLENGE_CANCEL = "challengeCancel";
    public static final String FIELD_CHALLENGE_DATA_ENTRY = "challengeDataEntry";
    public static final String FIELD_CHALLENGE_HTML_DATA_ENTRY = "challengeHTMLDataEntry";
    public static final String FIELD_MESSAGE_EXTENSION = "messageExtensions";
    public static final String FIELD_MESSAGE_TYPE = "messageType";
    public static final String FIELD_MESSAGE_VERSION = "messageVersion";
    public static final String FIELD_OOB_CONTINUE = "oobContinue";
    public static final String FIELD_RESEND_CHALLENGE = "resendChallenge";
    public static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    public static final String MESSAGE_TYPE = "CReq";
    private final String acsTransId;
    private final CancelReason cancelReason;
    private final String challengeDataEntry;
    private final String challengeHtmlDataEntry;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final Boolean oobContinue;
    private final SdkTransactionId sdkTransId;
    private final Boolean shouldResendChallenge;
    private final String threeDsServerTransId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "UserSelected", "Reserved", "TransactionTimedOutDecoupled", "TransactionTimedOutOther", "TransactionTimedOutFirstCreq", "TransactionError", "Unknown", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CancelReason {
        UserSelected("01"),
        Reserved("02"),
        TransactionTimedOutDecoupled("03"),
        TransactionTimedOutOther("04"),
        TransactionTimedOutFirstCreq("05"),
        TransactionError("06"),
        Unknown("07");
        
        private final String code;

        CancelReason(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$Companion;", "", "()V", "FIELD_3DS_SERVER_TRANS_ID", "", "FIELD_ACS_TRANS_ID", "FIELD_CHALLENGE_CANCEL", "FIELD_CHALLENGE_DATA_ENTRY", "FIELD_CHALLENGE_HTML_DATA_ENTRY", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_CONTINUE", "FIELD_RESEND_CHALLENGE", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeRequestData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            SdkTransactionId createFromParcel = SdkTransactionId.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            CancelReason valueOf = parcel.readInt() == 0 ? null : CancelReason.valueOf(parcel.readString());
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChallengeRequestData(readString, readString2, readString3, createFromParcel, readString4, valueOf, readString5, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData[] newArray(int i) {
            return new ChallengeRequestData[i];
        }
    }

    public ChallengeRequestData(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String str, CancelReason cancelReason, String str2, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(threeDsServerTransId, "threeDsServerTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        this.messageVersion = messageVersion;
        this.threeDsServerTransId = threeDsServerTransId;
        this.acsTransId = acsTransId;
        this.sdkTransId = sdkTransId;
        this.challengeDataEntry = str;
        this.cancelReason = cancelReason;
        this.challengeHtmlDataEntry = str2;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeRequestData copy$default(ChallengeRequestData challengeRequestData, String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason, String str5, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        return challengeRequestData.copy((i & 1) != 0 ? challengeRequestData.messageVersion : str, (i & 2) != 0 ? challengeRequestData.threeDsServerTransId : str2, (i & 4) != 0 ? challengeRequestData.acsTransId : str3, (i & 8) != 0 ? challengeRequestData.sdkTransId : sdkTransactionId, (i & 16) != 0 ? challengeRequestData.challengeDataEntry : str4, (i & 32) != 0 ? challengeRequestData.cancelReason : cancelReason, (i & 64) != 0 ? challengeRequestData.challengeHtmlDataEntry : str5, (i & 128) != 0 ? challengeRequestData.messageExtensions : list, (i & 256) != 0 ? challengeRequestData.oobContinue : bool, (i & 512) != 0 ? challengeRequestData.shouldResendChallenge : bool2);
    }

    public final String component1() {
        return this.messageVersion;
    }

    public final Boolean component10() {
        return this.shouldResendChallenge;
    }

    public final String component2() {
        return this.threeDsServerTransId;
    }

    public final String component3() {
        return this.acsTransId;
    }

    public final SdkTransactionId component4() {
        return this.sdkTransId;
    }

    public final String component5() {
        return this.challengeDataEntry;
    }

    public final CancelReason component6() {
        return this.cancelReason;
    }

    public final String component7() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> component8() {
        return this.messageExtensions;
    }

    public final Boolean component9() {
        return this.oobContinue;
    }

    public final ChallengeRequestData copy(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String str, CancelReason cancelReason, String str2, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(threeDsServerTransId, "threeDsServerTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        return new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, str, cancelReason, str2, list, bool, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeRequestData) {
            ChallengeRequestData challengeRequestData = (ChallengeRequestData) obj;
            return Intrinsics.areEqual(this.messageVersion, challengeRequestData.messageVersion) && Intrinsics.areEqual(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && Intrinsics.areEqual(this.acsTransId, challengeRequestData.acsTransId) && Intrinsics.areEqual(this.sdkTransId, challengeRequestData.sdkTransId) && Intrinsics.areEqual(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && this.cancelReason == challengeRequestData.cancelReason && Intrinsics.areEqual(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && Intrinsics.areEqual(this.messageExtensions, challengeRequestData.messageExtensions) && Intrinsics.areEqual(this.oobContinue, challengeRequestData.oobContinue) && Intrinsics.areEqual(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge);
        }
        return false;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final CancelReason getCancelReason() {
        return this.cancelReason;
    }

    public final String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    public final String getChallengeHtmlDataEntry() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final Boolean getOobContinue() {
        return this.oobContinue;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final Boolean getShouldResendChallenge() {
        return this.shouldResendChallenge;
    }

    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    public int hashCode() {
        int hashCode = ((((((this.messageVersion.hashCode() * 31) + this.threeDsServerTransId.hashCode()) * 31) + this.acsTransId.hashCode()) * 31) + this.sdkTransId.hashCode()) * 31;
        String str = this.challengeDataEntry;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CancelReason cancelReason = this.cancelReason;
        int hashCode3 = (hashCode2 + (cancelReason == null ? 0 : cancelReason.hashCode())) * 31;
        String str2 = this.challengeHtmlDataEntry;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MessageExtension> list = this.messageExtensions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.oobContinue;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final ChallengeRequestData sanitize$3ds2sdk_release() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        String str;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject json = new JSONObject().put(FIELD_MESSAGE_TYPE, MESSAGE_TYPE).put(FIELD_MESSAGE_VERSION, this.messageVersion).put(FIELD_SDK_TRANS_ID, this.sdkTransId.getValue()).put(FIELD_3DS_SERVER_TRANS_ID, this.threeDsServerTransId).put(FIELD_ACS_TRANS_ID, this.acsTransId);
            CancelReason cancelReason = this.cancelReason;
            if (cancelReason != null) {
                json.put(FIELD_CHALLENGE_CANCEL, cancelReason.getCode());
            }
            String str2 = this.challengeDataEntry;
            if (str2 != null) {
                json.put(FIELD_CHALLENGE_DATA_ENTRY, str2);
            }
            String str3 = this.challengeHtmlDataEntry;
            if (str3 != null) {
                json.put(FIELD_CHALLENGE_HTML_DATA_ENTRY, str3);
            }
            JSONArray jsonArray = MessageExtension.Companion.toJsonArray(this.messageExtensions);
            if (jsonArray != null) {
                json.put(FIELD_MESSAGE_EXTENSION, jsonArray);
            }
            Boolean bool = this.oobContinue;
            if (bool != null) {
                json.put(FIELD_OOB_CONTINUE, bool.booleanValue());
            }
            Boolean bool2 = this.shouldResendChallenge;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "Y";
                } else {
                    str = "N";
                }
                json.put(FIELD_RESEND_CHALLENGE, str);
            }
            Intrinsics.checkNotNullExpressionValue(json, "json");
            return json;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(Result.m116783constructorimpl(ResultKt.createFailure(th)));
            if (m116786exceptionOrNullimpl == null) {
                throw new KotlinNothingValueException();
            }
            throw new SDKRuntimeException(m116786exceptionOrNullimpl);
        }
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.messageVersion + ", threeDsServerTransId=" + this.threeDsServerTransId + ", acsTransId=" + this.acsTransId + ", sdkTransId=" + this.sdkTransId + ", challengeDataEntry=" + this.challengeDataEntry + ", cancelReason=" + this.cancelReason + ", challengeHtmlDataEntry=" + this.challengeHtmlDataEntry + ", messageExtensions=" + this.messageExtensions + ", oobContinue=" + this.oobContinue + ", shouldResendChallenge=" + this.shouldResendChallenge + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.messageVersion);
        out.writeString(this.threeDsServerTransId);
        out.writeString(this.acsTransId);
        this.sdkTransId.writeToParcel(out, i);
        out.writeString(this.challengeDataEntry);
        CancelReason cancelReason = this.cancelReason;
        if (cancelReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cancelReason.name());
        }
        out.writeString(this.challengeHtmlDataEntry);
        List<MessageExtension> list = this.messageExtensions;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (MessageExtension messageExtension : list) {
                messageExtension.writeToParcel(out, i);
            }
        }
        Boolean bool = this.oobContinue;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    public /* synthetic */ ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason, String str5, List list, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, sdkTransactionId, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : cancelReason, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
    }
}

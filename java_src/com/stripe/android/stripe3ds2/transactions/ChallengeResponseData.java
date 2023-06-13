package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 v2\u00020\u0001:\u0003uvwBÍ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010&J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020 HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010b\u001a\u00020\nHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÙ\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010g\u001a\u00020hHÖ\u0001J\u0013\u0010i\u001a\u00020\n2\b\u0010j\u001a\u0004\u0018\u00010kHÖ\u0003J\t\u0010l\u001a\u00020hHÖ\u0001J\u0006\u0010m\u001a\u00020nJ\t\u0010o\u001a\u00020\u0003HÖ\u0001J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020hHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u00103R\u0014\u00104\u001a\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u00107R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010(R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010(R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010(¨\u0006x"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Landroid/os/Parcelable;", "serverTransId", "", "acsTransId", "acsHtml", "acsHtmlRefresh", "uiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "isChallengeCompleted", "", ChallengeResponseData.FIELD_CHALLENGE_INFO_HEADER, ChallengeResponseData.FIELD_CHALLENGE_INFO_LABEL, ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT, "challengeAdditionalInfoText", "shouldShowChallengeInfoTextIndicator", "challengeSelectOptions", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", ChallengeResponseData.FIELD_EXPAND_INFO_LABEL, ChallengeResponseData.FIELD_EXPAND_INFO_TEXT, ChallengeResponseData.FIELD_ISSUER_IMAGE, "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", ChallengeRequestData.FIELD_MESSAGE_EXTENSION, "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "messageVersion", "oobAppUrl", ChallengeResponseData.FIELD_OOB_APP_LABEL, ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL, "paymentSystemImage", ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL, "sdkTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL, ChallengeResponseData.FIELD_WHITELISTING_INFO_TEXT, ChallengeResponseData.FIELD_WHY_INFO_LABEL, ChallengeResponseData.FIELD_WHY_INFO_TEXT, ChallengeResponseData.FIELD_TRANS_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsHtml", "()Ljava/lang/String;", "getAcsHtmlRefresh", "getAcsTransId", "getChallengeAdditionalInfoText", "getChallengeInfoHeader", "getChallengeInfoLabel", "getChallengeInfoText", "getChallengeSelectOptions", "()Ljava/util/List;", "getExpandInfoLabel", "getExpandInfoText", "()Z", "isValidForUi", "isValidForUi$3ds2sdk_release", "getIssuerImage", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "getMessageExtensions", "getMessageVersion", "getOobAppLabel", "getOobAppUrl", "getOobContinueLabel", "getPaymentSystemImage", "getResendInformationLabel", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getServerTransId", "getShouldShowChallengeInfoTextIndicator", "getSubmitAuthenticationLabel", "getTransStatus", "getUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getWhitelistingInfoText", "getWhyInfoLabel", "getWhyInfoText", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ChallengeSelectOption", "Companion", "Image", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeResponseData implements Parcelable {
    private static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    private static final String FIELD_ACS_HTML = "acsHTML";
    private static final String FIELD_ACS_HTML_REFRESH = "acsHTMLRefresh";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_ACS_UI_TYPE = "acsUiType";
    private static final String FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT = "challengeAddInfo";
    private static final String FIELD_CHALLENGE_COMPLETION_INDICATOR = "challengeCompletionInd";
    private static final String FIELD_CHALLENGE_INFO_HEADER = "challengeInfoHeader";
    private static final String FIELD_CHALLENGE_INFO_LABEL = "challengeInfoLabel";
    private static final String FIELD_CHALLENGE_INFO_TEXT = "challengeInfoText";
    private static final String FIELD_CHALLENGE_INFO_TEXT_INDICATOR = "challengeInfoTextIndicator";
    private static final String FIELD_CHALLENGE_SELECT_INFO = "challengeSelectInfo";
    private static final String FIELD_EXPAND_INFO_LABEL = "expandInfoLabel";
    private static final String FIELD_EXPAND_INFO_TEXT = "expandInfoText";
    private static final String FIELD_ISSUER_IMAGE = "issuerImage";
    private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_OOB_APP_LABEL = "oobAppLabel";
    private static final String FIELD_OOB_APP_URL = "oobAppURL";
    private static final String FIELD_OOB_CONTINUE_LABEL = "oobContinueLabel";
    private static final String FIELD_PAYMENT_SYSTEM_IMAGE = "psImage";
    private static final String FIELD_RESEND_INFORMATION_LABEL = "resendInformationLabel";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_SUBMIT_AUTHENTICATION_LABEL = "submitAuthenticationLabel";
    private static final String FIELD_TRANS_STATUS = "transStatus";
    private static final String FIELD_WHITELISTING_INFO_TEXT = "whitelistingInfoText";
    private static final String FIELD_WHY_INFO_LABEL = "whyInfoLabel";
    private static final String FIELD_WHY_INFO_TEXT = "whyInfoText";
    private static final Set<String> FINAL_CRES_FIELDS;
    public static final String MESSAGE_TYPE = "CRes";
    private static final String NO_VALUE = "N";
    private static final List<String> YES_NO_VALUES;
    private static final String YES_VALUE = "Y";
    private final String acsHtml;
    private final String acsHtmlRefresh;
    private final String acsTransId;
    private final String challengeAdditionalInfoText;
    private final String challengeInfoHeader;
    private final String challengeInfoLabel;
    private final String challengeInfoText;
    private final List<ChallengeSelectOption> challengeSelectOptions;
    private final String expandInfoLabel;
    private final String expandInfoText;
    private final boolean isChallengeCompleted;
    private final Image issuerImage;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final String oobAppLabel;
    private final String oobAppUrl;
    private final String oobContinueLabel;
    private final Image paymentSystemImage;
    private final String resendInformationLabel;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    private final boolean shouldShowChallengeInfoTextIndicator;
    private final String submitAuthenticationLabel;
    private final String transStatus;
    private final UiType uiType;
    private final String whitelistingInfoText;
    private final String whyInfoLabel;
    private final String whyInfoText;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "Landroid/os/Parcelable;", "name", "", Entry.TYPE_TEXT, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ChallengeSelectOption implements Parcelable {
        private final String name;
        private final String text;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption$Companion;", "", "()V", "fromJson", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "challengeSelectOptionsJson", "Lorg/json/JSONArray;", "fromJson$3ds2sdk_release", "toJsonArray", "options", "toJsonArray$3ds2sdk_release", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<ChallengeSelectOption> fromJson$3ds2sdk_release(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String name = optJSONObject.keys().next();
                        String text = optJSONObject.optString(name);
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        Intrinsics.checkNotNullExpressionValue(text, "text");
                        arrayList.add(new ChallengeSelectOption(name, text));
                    }
                }
                return arrayList;
            }

            public final JSONArray toJsonArray$3ds2sdk_release(List<ChallengeSelectOption> list) throws JSONException {
                if (list == null) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                for (ChallengeSelectOption challengeSelectOption : list) {
                    jSONArray.put(challengeSelectOption.toJson());
                }
                return jSONArray;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ChallengeSelectOption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChallengeSelectOption(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption[] newArray(int i) {
                return new ChallengeSelectOption[i];
            }
        }

        public ChallengeSelectOption(String name, String text) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.name = name;
            this.text = text;
        }

        public static /* synthetic */ ChallengeSelectOption copy$default(ChallengeSelectOption challengeSelectOption, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = challengeSelectOption.name;
            }
            if ((i & 2) != 0) {
                str2 = challengeSelectOption.text;
            }
            return challengeSelectOption.copy(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject toJson() throws JSONException {
            JSONObject put = new JSONObject().put(this.name, this.text);
            Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n                .put(name, text)");
            return put;
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.text;
        }

        public final ChallengeSelectOption copy(String name, String text) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            return new ChallengeSelectOption(name, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChallengeSelectOption) {
                ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) obj;
                return Intrinsics.areEqual(this.name, challengeSelectOption.name) && Intrinsics.areEqual(this.text, challengeSelectOption.text);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.name + ", text=" + this.text + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.name);
            out.writeString(this.text);
        }
    }

    @Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0015\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b/J\u0014\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0002J\u0015\u00102\u001a\u0002032\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b4J\u0017\u00105\u001a\u0004\u0018\u0001062\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b7J\u001f\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;J\u001d\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010'2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b@J\u001f\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\bBJ\u001a\u0010C\u001a\u0004\u0018\u00010\u00042\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020\u0004H\u0002J\u0017\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bGJ\u001f\u0010H\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0000¢\u0006\u0002\bIJ\u0015\u0010J\u001a\u00020K2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bLJ\u001d\u0010M\u001a\u00020N2\u0006\u0010+\u001a\u00020,2\u0006\u0010E\u001a\u00020\u0004H\u0001¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020:2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bQJ%\u0010R\u001a\u00020S2\u0006\u0010+\u001a\u00020,2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0002\bUR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006V"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;", "", "()V", "FIELD_ACS_COUNTER_ACS_TO_SDK", "", "FIELD_ACS_HTML", "FIELD_ACS_HTML_REFRESH", "FIELD_ACS_TRANS_ID", "FIELD_ACS_UI_TYPE", "FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT", "FIELD_CHALLENGE_COMPLETION_INDICATOR", "FIELD_CHALLENGE_INFO_HEADER", "FIELD_CHALLENGE_INFO_LABEL", "FIELD_CHALLENGE_INFO_TEXT", "FIELD_CHALLENGE_INFO_TEXT_INDICATOR", "FIELD_CHALLENGE_SELECT_INFO", "FIELD_EXPAND_INFO_LABEL", "FIELD_EXPAND_INFO_TEXT", "FIELD_ISSUER_IMAGE", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_APP_LABEL", "FIELD_OOB_APP_URL", "FIELD_OOB_CONTINUE_LABEL", "FIELD_PAYMENT_SYSTEM_IMAGE", "FIELD_RESEND_INFORMATION_LABEL", "FIELD_SDK_TRANS_ID", "FIELD_SERVER_TRANS_ID", "FIELD_SUBMIT_AUTHENTICATION_LABEL", "FIELD_TRANS_STATUS", "FIELD_WHITELISTING_INFO_TEXT", "FIELD_WHY_INFO_LABEL", "FIELD_WHY_INFO_TEXT", "FINAL_CRES_FIELDS", "", "MESSAGE_TYPE", "NO_VALUE", "YES_NO_VALUES", "", "YES_VALUE", "checkFinalCresFields", "", "cresJson", "Lorg/json/JSONObject;", "checkFinalCresFields$3ds2sdk_release", "checkMessageType", "checkMessageType$3ds2sdk_release", "decodeHtml", "encodedHtml", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "fromJson$3ds2sdk_release", "getChallengeSelectInfoArray", "Lorg/json/JSONArray;", "getChallengeSelectInfoArray$3ds2sdk_release", "getDecodedAcsHtml", "uiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getDecodedAcsHtml$3ds2sdk_release", "getMessageExtensions", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "getMessageExtensions$3ds2sdk_release", "getMessageVersion", "getMessageVersion$3ds2sdk_release", "getOobContinueLabel", "getOobContinueLabel$3ds2sdk_release", "getOrNull", "json", "fieldName", "getResendInformationLabel", "getResendInformationLabel$3ds2sdk_release", "getSubmitAuthenticationLabel", "getSubmitAuthenticationLabel$3ds2sdk_release", "getTransStatus", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "getTransStatus$3ds2sdk_release", "getTransactionId", "Ljava/util/UUID;", "getTransactionId$3ds2sdk_release", "getUiType", "getUiType$3ds2sdk_release", "getYesNoValue", "", "isRequired", "getYesNoValue$3ds2sdk_release", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String decodeHtml(String str) {
            Object m116783constructorimpl;
            String str2 = null;
            if (str == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.Companion;
            try {
                Result.Companion companion2 = Result.Companion;
                byte[] decode = Base64.decode(str, 8);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(encodedHtml, Base64.URL_SAFE)");
                m116783constructorimpl = Result.m116783constructorimpl(new String(decode, Charsets.UTF_8));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                str2 = m116783constructorimpl;
            }
            return str2;
        }

        private final String getOrNull(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public final void checkFinalCresFields$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Iterator<String> keys = cresJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!ChallengeResponseData.FINAL_CRES_FIELDS.contains(next)) {
                    int code = ProtocolError.InvalidMessageReceived.getCode();
                    throw new ChallengeResponseParseException(code, "Message is not final CRes", "Invalid data element for final CRes: " + next);
                }
            }
        }

        public final void checkMessageType$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            if (Intrinsics.areEqual(ChallengeResponseData.MESSAGE_TYPE, cresJson.optString("messageType"))) {
                return;
            }
            throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not CRes", "Invalid Message Type");
        }

        public final ChallengeResponseData fromJson$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            ChallengeResponseData challengeResponseData;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            checkMessageType$3ds2sdk_release(cresJson);
            boolean yesNoValue$3ds2sdk_release = getYesNoValue$3ds2sdk_release(cresJson, ChallengeResponseData.FIELD_CHALLENGE_COMPLETION_INDICATOR, true);
            SdkTransactionId sdkTransactionId = new SdkTransactionId(getTransactionId$3ds2sdk_release(cresJson, "sdkTransID"));
            String uuid = getTransactionId$3ds2sdk_release(cresJson, "threeDSServerTransID").toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "getTransactionId(cresJso…RVER_TRANS_ID).toString()");
            String uuid2 = getTransactionId$3ds2sdk_release(cresJson, "acsTransID").toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "getTransactionId(cresJso…_ACS_TRANS_ID).toString()");
            String messageVersion$3ds2sdk_release = getMessageVersion$3ds2sdk_release(cresJson);
            List<MessageExtension> messageExtensions$3ds2sdk_release = getMessageExtensions$3ds2sdk_release(cresJson);
            if (yesNoValue$3ds2sdk_release) {
                checkFinalCresFields$3ds2sdk_release(cresJson);
                challengeResponseData = new ChallengeResponseData(uuid, uuid2, null, null, null, yesNoValue$3ds2sdk_release, null, null, null, null, false, null, null, null, null, messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, null, null, null, null, null, sdkTransactionId, null, null, null, null, getTransStatus$3ds2sdk_release(cresJson).getCode(), 129925084, null);
            } else {
                boolean yesNoValue$3ds2sdk_release2 = getYesNoValue$3ds2sdk_release(cresJson, ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT_INDICATOR, false);
                String resendInformationLabel$3ds2sdk_release = getResendInformationLabel$3ds2sdk_release(cresJson);
                JSONArray challengeSelectInfoArray$3ds2sdk_release = getChallengeSelectInfoArray$3ds2sdk_release(cresJson);
                UiType uiType$3ds2sdk_release = getUiType$3ds2sdk_release(cresJson);
                String submitAuthenticationLabel$3ds2sdk_release = getSubmitAuthenticationLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                String decodedAcsHtml$3ds2sdk_release = getDecodedAcsHtml$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                String oobContinueLabel$3ds2sdk_release = getOobContinueLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                List<ChallengeSelectOption> fromJson$3ds2sdk_release = ChallengeSelectOption.Companion.fromJson$3ds2sdk_release(challengeSelectInfoArray$3ds2sdk_release);
                String decodeHtml = decodeHtml(cresJson.optString(ChallengeResponseData.FIELD_ACS_HTML_REFRESH));
                String optString = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_HEADER);
                String optString2 = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_LABEL);
                String optString3 = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT);
                String optString4 = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT);
                String optString5 = cresJson.optString(ChallengeResponseData.FIELD_EXPAND_INFO_LABEL);
                String optString6 = cresJson.optString(ChallengeResponseData.FIELD_EXPAND_INFO_TEXT);
                Image.Companion companion = Image.Companion;
                challengeResponseData = new ChallengeResponseData(uuid, uuid2, decodedAcsHtml$3ds2sdk_release, decodeHtml, uiType$3ds2sdk_release, yesNoValue$3ds2sdk_release, optString, optString2, optString3, optString4, yesNoValue$3ds2sdk_release2, fromJson$3ds2sdk_release, optString5, optString6, companion.fromJson$3ds2sdk_release(cresJson.optJSONObject(ChallengeResponseData.FIELD_ISSUER_IMAGE)), messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, cresJson.optString(ChallengeResponseData.FIELD_OOB_APP_URL), cresJson.optString(ChallengeResponseData.FIELD_OOB_APP_LABEL), oobContinueLabel$3ds2sdk_release, companion.fromJson$3ds2sdk_release(cresJson.optJSONObject(ChallengeResponseData.FIELD_PAYMENT_SYSTEM_IMAGE)), resendInformationLabel$3ds2sdk_release, sdkTransactionId, submitAuthenticationLabel$3ds2sdk_release, cresJson.optString(ChallengeResponseData.FIELD_WHITELISTING_INFO_TEXT), cresJson.optString(ChallengeResponseData.FIELD_WHY_INFO_LABEL), cresJson.optString(ChallengeResponseData.FIELD_WHY_INFO_TEXT), "");
            }
            if (challengeResponseData.isValidForUi$3ds2sdk_release()) {
                return challengeResponseData;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing("UI fields missing");
        }

        public final JSONArray getChallengeSelectInfoArray$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Object m116783constructorimpl;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            if (!cresJson.has(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO)) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.Companion;
            try {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(cresJson.getJSONArray(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) == null) {
                return (JSONArray) m116783constructorimpl;
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO);
        }

        public final String getDecodedAcsHtml$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_ACS_HTML);
            if (orNull != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(orNull);
                if (!isBlank) {
                    z = false;
                    if (!z && uiType == UiType.Html) {
                        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_HTML);
                    }
                    return decodeHtml(orNull);
                }
            }
            z = true;
            if (!z) {
            }
            return decodeHtml(orNull);
        }

        public final List<MessageExtension> getMessageExtensions$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            String joinToString$default;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            List<MessageExtension> fromJson = MessageExtension.Companion.fromJson(cresJson.optJSONArray(ChallengeResponseData.FIELD_MESSAGE_EXTENSION));
            if (fromJson != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = fromJson.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    MessageExtension messageExtension = (MessageExtension) next;
                    if ((!messageExtension.getCriticalityIndicator() || messageExtension.isProcessable()) ? false : false) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ProtocolError protocolError = ProtocolError.UnrecognizedCriticalMessageExtensions;
                    joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
                    throw new ChallengeResponseParseException(protocolError, joinToString$default);
                }
            }
            return fromJson;
        }

        public final String getMessageVersion$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String it = cresJson.optString("messageVersion");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            if (!(!isBlank)) {
                it = null;
            }
            if (it != null) {
                return it;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing("messageVersion");
        }

        public final String getOobContinueLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String optString = cresJson.optString(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
            if (optString != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(optString);
                if (!isBlank) {
                    z = false;
                    if (!z && uiType == UiType.OutOfBand) {
                        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
                    }
                    return optString;
                }
            }
            z = true;
            if (!z) {
            }
            return optString;
        }

        public final String getResendInformationLabel$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            boolean z;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
            if (orNull != null) {
                if (orNull.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
                }
            }
            return orNull;
        }

        public final String getSubmitAuthenticationLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
            if (orNull != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(orNull);
                if (!isBlank) {
                    z = false;
                    if (!z && uiType.getRequiresSubmitButton$3ds2sdk_release()) {
                        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
                    }
                    return orNull;
                }
            }
            z = true;
            if (!z) {
            }
            return orNull;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TransactionStatus getTransStatus$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String optString = cresJson.optString(ChallengeResponseData.FIELD_TRANS_STATUS);
            if (optString != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(optString);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        TransactionStatus fromCode = TransactionStatus.Companion.fromCode(optString);
                        if (fromCode != null) {
                            return fromCode;
                        }
                        throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_TRANS_STATUS);
                    }
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_TRANS_STATUS);
                }
            }
            z = true;
            if (z) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final UUID getTransactionId$3ds2sdk_release(JSONObject cresJson, String fieldName) throws ChallengeResponseParseException {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            String optString = cresJson.optString(fieldName);
            if (optString != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(optString);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        try {
                            Result.Companion companion = Result.Companion;
                            UUID fromString = UUID.fromString(optString);
                            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(transId)");
                            return fromString;
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            if (Result.m116786exceptionOrNullimpl(Result.m116783constructorimpl(ResultKt.createFailure(th))) == null) {
                                throw new KotlinNothingValueException();
                            }
                            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(fieldName);
                        }
                    }
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(fieldName);
                }
            }
            z = true;
            if (z) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final UiType getUiType$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String optString = cresJson.optString(ChallengeResponseData.FIELD_ACS_UI_TYPE);
            if (optString != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(optString);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        UiType fromCode$3ds2sdk_release = UiType.Companion.fromCode$3ds2sdk_release(optString);
                        if (fromCode$3ds2sdk_release != null) {
                            return fromCode$3ds2sdk_release;
                        }
                        throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_ACS_UI_TYPE);
                    }
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_UI_TYPE);
                }
            }
            z = true;
            if (z) {
            }
        }

        public final boolean getYesNoValue$3ds2sdk_release(JSONObject cresJson, String fieldName, boolean z) throws ChallengeResponseParseException {
            String orNull;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            if (z) {
                if (cresJson.has(fieldName)) {
                    orNull = cresJson.getString(fieldName);
                } else {
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(fieldName);
                }
            } else {
                orNull = getOrNull(cresJson, fieldName);
            }
            if (orNull != null && !ChallengeResponseData.YES_NO_VALUES.contains(orNull)) {
                if (z) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(orNull);
                    if (isBlank) {
                        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(fieldName);
                    }
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(fieldName);
            }
            return Intrinsics.areEqual(ChallengeResponseData.YES_VALUE, orNull);
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeResponseData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            UiType valueOf = parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(ChallengeSelectOption.CREATOR.createFromParcel(parcel));
                }
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            Image createFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    arrayList3.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    i2++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList3;
            }
            return new ChallengeResponseData(readString, readString2, readString3, readString4, valueOf, z, readString5, readString6, readString7, readString8, z2, arrayList, readString9, readString10, createFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData[] newArray(int i) {
            return new ChallengeResponseData[i];
        }
    }

    static {
        List<String> listOf;
        Set<String> of;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{YES_VALUE, NO_VALUE});
        YES_NO_VALUES = listOf;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"threeDSServerTransID", "acsCounterAtoS", "acsTransID", FIELD_CHALLENGE_COMPLETION_INDICATOR, FIELD_MESSAGE_EXTENSION, "messageType", "messageVersion", "sdkTransID", FIELD_TRANS_STATUS});
        FINAL_CRES_FIELDS = of;
    }

    public ChallengeResponseData(String serverTransId, String acsTransId, String str, String str2, UiType uiType, boolean z, String str3, String str4, String str5, String str6, boolean z2, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, SdkTransactionId sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        Intrinsics.checkNotNullParameter(serverTransId, "serverTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        this.serverTransId = serverTransId;
        this.acsTransId = acsTransId;
        this.acsHtml = str;
        this.acsHtmlRefresh = str2;
        this.uiType = uiType;
        this.isChallengeCompleted = z;
        this.challengeInfoHeader = str3;
        this.challengeInfoLabel = str4;
        this.challengeInfoText = str5;
        this.challengeAdditionalInfoText = str6;
        this.shouldShowChallengeInfoTextIndicator = z2;
        this.challengeSelectOptions = list;
        this.expandInfoLabel = str7;
        this.expandInfoText = str8;
        this.issuerImage = image;
        this.messageExtensions = list2;
        this.messageVersion = messageVersion;
        this.oobAppUrl = str9;
        this.oobAppLabel = str10;
        this.oobContinueLabel = str11;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str12;
        this.sdkTransId = sdkTransId;
        this.submitAuthenticationLabel = str13;
        this.whitelistingInfoText = str14;
        this.whyInfoLabel = str15;
        this.whyInfoText = str16;
        this.transStatus = str17;
    }

    public final String component1() {
        return this.serverTransId;
    }

    public final String component10() {
        return this.challengeAdditionalInfoText;
    }

    public final boolean component11() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final List<ChallengeSelectOption> component12() {
        return this.challengeSelectOptions;
    }

    public final String component13() {
        return this.expandInfoLabel;
    }

    public final String component14() {
        return this.expandInfoText;
    }

    public final Image component15() {
        return this.issuerImage;
    }

    public final List<MessageExtension> component16() {
        return this.messageExtensions;
    }

    public final String component17() {
        return this.messageVersion;
    }

    public final String component18() {
        return this.oobAppUrl;
    }

    public final String component19() {
        return this.oobAppLabel;
    }

    public final String component2() {
        return this.acsTransId;
    }

    public final String component20() {
        return this.oobContinueLabel;
    }

    public final Image component21() {
        return this.paymentSystemImage;
    }

    public final String component22() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId component23() {
        return this.sdkTransId;
    }

    public final String component24() {
        return this.submitAuthenticationLabel;
    }

    public final String component25() {
        return this.whitelistingInfoText;
    }

    public final String component26() {
        return this.whyInfoLabel;
    }

    public final String component27() {
        return this.whyInfoText;
    }

    public final String component28() {
        return this.transStatus;
    }

    public final String component3() {
        return this.acsHtml;
    }

    public final String component4() {
        return this.acsHtmlRefresh;
    }

    public final UiType component5() {
        return this.uiType;
    }

    public final boolean component6() {
        return this.isChallengeCompleted;
    }

    public final String component7() {
        return this.challengeInfoHeader;
    }

    public final String component8() {
        return this.challengeInfoLabel;
    }

    public final String component9() {
        return this.challengeInfoText;
    }

    public final ChallengeResponseData copy(String serverTransId, String acsTransId, String str, String str2, UiType uiType, boolean z, String str3, String str4, String str5, String str6, boolean z2, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, SdkTransactionId sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        Intrinsics.checkNotNullParameter(serverTransId, "serverTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        return new ChallengeResponseData(serverTransId, acsTransId, str, str2, uiType, z, str3, str4, str5, str6, z2, list, str7, str8, image, list2, messageVersion, str9, str10, str11, image2, str12, sdkTransId, str13, str14, str15, str16, str17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeResponseData) {
            ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
            return Intrinsics.areEqual(this.serverTransId, challengeResponseData.serverTransId) && Intrinsics.areEqual(this.acsTransId, challengeResponseData.acsTransId) && Intrinsics.areEqual(this.acsHtml, challengeResponseData.acsHtml) && Intrinsics.areEqual(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && this.uiType == challengeResponseData.uiType && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && Intrinsics.areEqual(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && Intrinsics.areEqual(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && Intrinsics.areEqual(this.challengeInfoText, challengeResponseData.challengeInfoText) && Intrinsics.areEqual(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && Intrinsics.areEqual(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && Intrinsics.areEqual(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && Intrinsics.areEqual(this.expandInfoText, challengeResponseData.expandInfoText) && Intrinsics.areEqual(this.issuerImage, challengeResponseData.issuerImage) && Intrinsics.areEqual(this.messageExtensions, challengeResponseData.messageExtensions) && Intrinsics.areEqual(this.messageVersion, challengeResponseData.messageVersion) && Intrinsics.areEqual(this.oobAppUrl, challengeResponseData.oobAppUrl) && Intrinsics.areEqual(this.oobAppLabel, challengeResponseData.oobAppLabel) && Intrinsics.areEqual(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && Intrinsics.areEqual(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && Intrinsics.areEqual(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && Intrinsics.areEqual(this.sdkTransId, challengeResponseData.sdkTransId) && Intrinsics.areEqual(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && Intrinsics.areEqual(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && Intrinsics.areEqual(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && Intrinsics.areEqual(this.whyInfoText, challengeResponseData.whyInfoText) && Intrinsics.areEqual(this.transStatus, challengeResponseData.transStatus);
        }
        return false;
    }

    public final String getAcsHtml() {
        return this.acsHtml;
    }

    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final List<ChallengeSelectOption> getChallengeSelectOptions() {
        return this.challengeSelectOptions;
    }

    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getOobAppLabel() {
        return this.oobAppLabel;
    }

    public final String getOobAppUrl() {
        return this.oobAppUrl;
    }

    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    public final String getTransStatus() {
        return this.transStatus;
    }

    public final UiType getUiType() {
        return this.uiType;
    }

    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.serverTransId.hashCode() * 31) + this.acsTransId.hashCode()) * 31;
        String str = this.acsHtml;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acsHtmlRefresh;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiType uiType = this.uiType;
        int hashCode4 = (hashCode3 + (uiType == null ? 0 : uiType.hashCode())) * 31;
        boolean z = this.isChallengeCompleted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str3 = this.challengeInfoHeader;
        int hashCode5 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.challengeInfoLabel;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.challengeInfoText;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challengeAdditionalInfoText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z2 = this.shouldShowChallengeInfoTextIndicator;
        int i3 = (hashCode8 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        int hashCode9 = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.expandInfoLabel;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expandInfoText;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.issuerImage;
        int hashCode12 = (hashCode11 + (image == null ? 0 : image.hashCode())) * 31;
        List<MessageExtension> list2 = this.messageExtensions;
        int hashCode13 = (((hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        String str9 = this.oobAppUrl;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oobAppLabel;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oobContinueLabel;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Image image2 = this.paymentSystemImage;
        int hashCode17 = (hashCode16 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str12 = this.resendInformationLabel;
        int hashCode18 = (((hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.sdkTransId.hashCode()) * 31;
        String str13 = this.submitAuthenticationLabel;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.whitelistingInfoText;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.whyInfoLabel;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.whyInfoText;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transStatus;
        return hashCode22 + (str17 != null ? str17.hashCode() : 0);
    }

    public final boolean isChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isValidForUi$3ds2sdk_release() {
        Set<String> of;
        boolean z;
        boolean z2;
        boolean isBlank;
        List<ChallengeSelectOption> list;
        boolean isBlank2;
        Set<String> of2;
        boolean z3;
        boolean isBlank3;
        boolean isBlank4;
        UiType uiType = this.uiType;
        if (uiType == null) {
            return true;
        }
        boolean z4 = false;
        if (uiType != UiType.Html) {
            of = SetsKt__SetsKt.setOf((Object[]) new String[]{this.challengeInfoHeader, this.challengeInfoLabel, this.challengeInfoText, this.whyInfoLabel, this.whyInfoText, this.expandInfoLabel, this.expandInfoText, this.resendInformationLabel});
            if (!(of instanceof Collection) || !of.isEmpty()) {
                for (String str : of) {
                    if (str != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(str);
                        if (!isBlank) {
                            z = false;
                            continue;
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    continue;
                    if (!z) {
                    }
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
            UiType uiType2 = this.uiType;
            if (uiType2 == UiType.OutOfBand) {
                of2 = SetsKt__SetsKt.setOf((Object[]) new String[]{this.oobAppLabel, this.oobAppUrl, this.oobContinueLabel});
                if (!(of2 instanceof Collection) || !of2.isEmpty()) {
                    for (String str2 : of2) {
                        if (str2 != null) {
                            isBlank3 = StringsKt__StringsJVMKt.isBlank(str2);
                            if (!isBlank3) {
                                z3 = false;
                                if (!z3) {
                                    return true;
                                }
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                    }
                }
                return false;
            } else if ((uiType2 == UiType.SingleSelect || uiType2 == UiType.MultiSelect) && ((list = this.challengeSelectOptions) == null || list.isEmpty())) {
                return false;
            } else {
                String str3 = this.submitAuthenticationLabel;
                if (str3 != null) {
                    isBlank2 = StringsKt__StringsJVMKt.isBlank(str3);
                }
                z4 = true;
                return !z4;
            }
        }
        String str4 = this.acsHtml;
        if (str4 != null) {
            isBlank4 = StringsKt__StringsJVMKt.isBlank(str4);
        }
        z4 = true;
        return !z4;
    }

    public final JSONObject toJson() throws JSONException {
        String str;
        Object obj;
        JSONObject jSONObject;
        JSONObject put = new JSONObject().put("messageType", MESSAGE_TYPE).put("threeDSServerTransID", this.serverTransId).put("acsTransID", this.acsTransId).put(FIELD_ACS_HTML, this.acsHtml).put(FIELD_ACS_HTML_REFRESH, this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        JSONObject jSONObject2 = null;
        if (uiType != null) {
            str = uiType.getCode();
        } else {
            str = null;
        }
        JSONObject put2 = put.put(FIELD_ACS_UI_TYPE, str);
        boolean z = this.isChallengeCompleted;
        String str2 = YES_VALUE;
        if (z) {
            obj = YES_VALUE;
        } else {
            obj = NO_VALUE;
        }
        JSONObject put3 = put2.put(FIELD_CHALLENGE_COMPLETION_INDICATOR, obj).put(FIELD_CHALLENGE_INFO_HEADER, this.challengeInfoHeader).put(FIELD_CHALLENGE_INFO_LABEL, this.challengeInfoLabel).put(FIELD_CHALLENGE_INFO_TEXT, this.challengeInfoText).put(FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT, this.challengeAdditionalInfoText).put(FIELD_CHALLENGE_SELECT_INFO, ChallengeSelectOption.Companion.toJsonArray$3ds2sdk_release(this.challengeSelectOptions)).put(FIELD_EXPAND_INFO_LABEL, this.expandInfoLabel).put(FIELD_EXPAND_INFO_TEXT, this.expandInfoText);
        Image image = this.issuerImage;
        if (image != null) {
            jSONObject = image.toJson$3ds2sdk_release();
        } else {
            jSONObject = null;
        }
        JSONObject put4 = put3.put(FIELD_ISSUER_IMAGE, jSONObject).put(FIELD_MESSAGE_EXTENSION, MessageExtension.Companion.toJsonArray(this.messageExtensions)).put("messageVersion", this.messageVersion).put(FIELD_OOB_APP_URL, this.oobAppUrl).put(FIELD_OOB_APP_LABEL, this.oobAppLabel).put(FIELD_OOB_CONTINUE_LABEL, this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 != null) {
            jSONObject2 = image2.toJson$3ds2sdk_release();
        }
        JSONObject put5 = put4.put(FIELD_PAYMENT_SYSTEM_IMAGE, jSONObject2).put(FIELD_RESEND_INFORMATION_LABEL, this.resendInformationLabel).put("sdkTransID", this.sdkTransId).put(FIELD_SUBMIT_AUTHENTICATION_LABEL, this.submitAuthenticationLabel).put(FIELD_WHITELISTING_INFO_TEXT, this.whitelistingInfoText).put(FIELD_WHY_INFO_LABEL, this.whyInfoLabel).put(FIELD_WHY_INFO_TEXT, this.whyInfoText).put(FIELD_TRANS_STATUS, this.transStatus);
        if (!this.isChallengeCompleted) {
            if (!this.shouldShowChallengeInfoTextIndicator) {
                str2 = NO_VALUE;
            }
            put5.put(FIELD_CHALLENGE_INFO_TEXT_INDICATOR, str2);
        }
        Intrinsics.checkNotNullExpressionValue(put5, "JSONObject()\n           …          }\n            }");
        return put5;
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", acsHtml=" + this.acsHtml + ", acsHtmlRefresh=" + this.acsHtmlRefresh + ", uiType=" + this.uiType + ", isChallengeCompleted=" + this.isChallengeCompleted + ", challengeInfoHeader=" + this.challengeInfoHeader + ", challengeInfoLabel=" + this.challengeInfoLabel + ", challengeInfoText=" + this.challengeInfoText + ", challengeAdditionalInfoText=" + this.challengeAdditionalInfoText + ", shouldShowChallengeInfoTextIndicator=" + this.shouldShowChallengeInfoTextIndicator + ", challengeSelectOptions=" + this.challengeSelectOptions + ", expandInfoLabel=" + this.expandInfoLabel + ", expandInfoText=" + this.expandInfoText + ", issuerImage=" + this.issuerImage + ", messageExtensions=" + this.messageExtensions + ", messageVersion=" + this.messageVersion + ", oobAppUrl=" + this.oobAppUrl + ", oobAppLabel=" + this.oobAppLabel + ", oobContinueLabel=" + this.oobContinueLabel + ", paymentSystemImage=" + this.paymentSystemImage + ", resendInformationLabel=" + this.resendInformationLabel + ", sdkTransId=" + this.sdkTransId + ", submitAuthenticationLabel=" + this.submitAuthenticationLabel + ", whitelistingInfoText=" + this.whitelistingInfoText + ", whyInfoLabel=" + this.whyInfoLabel + ", whyInfoText=" + this.whyInfoText + ", transStatus=" + this.transStatus + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.serverTransId);
        out.writeString(this.acsTransId);
        out.writeString(this.acsHtml);
        out.writeString(this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        if (uiType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(uiType.name());
        }
        out.writeInt(this.isChallengeCompleted ? 1 : 0);
        out.writeString(this.challengeInfoHeader);
        out.writeString(this.challengeInfoLabel);
        out.writeString(this.challengeInfoText);
        out.writeString(this.challengeAdditionalInfoText);
        out.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ChallengeSelectOption challengeSelectOption : list) {
                challengeSelectOption.writeToParcel(out, i);
            }
        }
        out.writeString(this.expandInfoLabel);
        out.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i);
        }
        List<MessageExtension> list2 = this.messageExtensions;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (MessageExtension messageExtension : list2) {
                messageExtension.writeToParcel(out, i);
            }
        }
        out.writeString(this.messageVersion);
        out.writeString(this.oobAppUrl);
        out.writeString(this.oobAppLabel);
        out.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image2.writeToParcel(out, i);
        }
        out.writeString(this.resendInformationLabel);
        this.sdkTransId.writeToParcel(out, i);
        out.writeString(this.submitAuthenticationLabel);
        out.writeString(this.whitelistingInfoText);
        out.writeString(this.whyInfoLabel);
        out.writeString(this.whyInfoText);
        out.writeString(this.transStatus);
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0012J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0015J\t\u0010\u001c\u001a\u00020\u0015HÖ\u0001J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "Landroid/os/Parcelable;", "mediumUrl", "", "highUrl", "extraHighUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtraHighUrl$3ds2sdk_release", "()Ljava/lang/String;", "getHighUrl$3ds2sdk_release", "highestFidelityImageUrl", "getHighestFidelityImageUrl", "getMediumUrl$3ds2sdk_release", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "component3", "component3$3ds2sdk_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "getUrlForDensity", "density", "hashCode", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Image implements Parcelable {
        private static final String FIELD_EXTRA_HIGH = "extraHigh";
        private static final String FIELD_HIGH = "high";
        private static final String FIELD_MEDIUM = "medium";
        private final String extraHighUrl;
        private final String highUrl;
        private final String mediumUrl;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image$Companion;", "", "()V", "FIELD_EXTRA_HIGH", "", "FIELD_HIGH", "FIELD_MEDIUM", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "imageJson", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Image fromJson$3ds2sdk_release(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new Image(jSONObject.optString(Image.FIELD_MEDIUM), jSONObject.optString(Image.FIELD_HIGH), jSONObject.optString(Image.FIELD_EXTRA_HIGH));
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.mediumUrl;
            }
            if ((i & 2) != 0) {
                str2 = image.highUrl;
            }
            if ((i & 4) != 0) {
                str3 = image.extraHighUrl;
            }
            return image.copy(str, str2, str3);
        }

        public final String component1$3ds2sdk_release() {
            return this.mediumUrl;
        }

        public final String component2$3ds2sdk_release() {
            return this.highUrl;
        }

        public final String component3$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final Image copy(String str, String str2, String str3) {
            return new Image(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Image) {
                Image image = (Image) obj;
                return Intrinsics.areEqual(this.mediumUrl, image.mediumUrl) && Intrinsics.areEqual(this.highUrl, image.highUrl) && Intrinsics.areEqual(this.extraHighUrl, image.extraHighUrl);
            }
            return false;
        }

        public final String getExtraHighUrl$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final String getHighUrl$3ds2sdk_release() {
            return this.highUrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[EDGE_INSN: B:19:0x003a->B:16:0x003a ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getHighestFidelityImageUrl() {
            List listOf;
            Object obj;
            boolean z;
            boolean isBlank;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{this.extraHighUrl, this.highUrl, this.mediumUrl});
            Iterator it = listOf.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String str = (String) obj;
                    if (str != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(str);
                        if (!isBlank) {
                            z = false;
                            if (!z) {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (String) obj;
        }

        public final String getMediumUrl$3ds2sdk_release() {
            return this.mediumUrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getUrlForDensity(int i) {
            String str;
            boolean z;
            boolean isBlank;
            if (i <= 160) {
                str = this.mediumUrl;
            } else if (i >= 320) {
                str = this.extraHighUrl;
            } else {
                str = this.highUrl;
            }
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        str = null;
                    }
                    if (str != null) {
                        return getHighestFidelityImageUrl();
                    }
                    return str;
                }
            }
            z = true;
            if (z) {
            }
            if (str != null) {
            }
        }

        public int hashCode() {
            String str = this.mediumUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.highUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extraHighUrl;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final JSONObject toJson$3ds2sdk_release() throws JSONException {
            JSONObject put = new JSONObject().put(FIELD_MEDIUM, this.mediumUrl).put(FIELD_HIGH, this.highUrl).put(FIELD_EXTRA_HIGH, this.extraHighUrl);
            Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …EXTRA_HIGH, extraHighUrl)");
            return put;
        }

        public String toString() {
            return "Image(mediumUrl=" + this.mediumUrl + ", highUrl=" + this.highUrl + ", extraHighUrl=" + this.extraHighUrl + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mediumUrl);
            out.writeString(this.highUrl);
            out.writeString(this.extraHighUrl);
        }

        public /* synthetic */ Image(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ ChallengeResponseData(String str, String str2, String str3, String str4, UiType uiType, boolean z, String str5, String str6, String str7, String str8, boolean z2, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : uiType, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : image, (32768 & i) != 0 ? null : list2, str11, (131072 & i) != 0 ? null : str12, (262144 & i) != 0 ? null : str13, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : image2, (2097152 & i) != 0 ? null : str15, sdkTransactionId, (8388608 & i) != 0 ? null : str16, (16777216 & i) != 0 ? null : str17, (33554432 & i) != 0 ? null : str18, (67108864 & i) != 0 ? null : str19, (i & 134217728) != 0 ? null : str20);
    }
}

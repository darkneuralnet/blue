.class public final Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;,
        Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;,
        Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008G\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 v2\u00020\u0001:\u0003uvwB\u00cd\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u0012\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010&J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020 H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010b\u001a\u00020\nH\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d9\u0002\u0010f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010g\u001a\u00020hH\u00d6\u0001J\u0013\u0010i\u001a\u00020\n2\u0008\u0010j\u001a\u0004\u0018\u00010kH\u00d6\u0003J\t\u0010l\u001a\u00020hH\u00d6\u0001J\u0006\u0010m\u001a\u00020nJ\t\u0010o\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020hH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010(R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010(R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010(R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u00103R\u0014\u00104\u001a\u00020\n8AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00100R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00107R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010(R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010(R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010(R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010FR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010(R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010(R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010(\u00a8\u0006x"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
        "Landroid/os/Parcelable;",
        "serverTransId",
        "",
        "acsTransId",
        "acsHtml",
        "acsHtmlRefresh",
        "uiType",
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "isChallengeCompleted",
        "",
        "challengeInfoHeader",
        "challengeInfoLabel",
        "challengeInfoText",
        "challengeAdditionalInfoText",
        "shouldShowChallengeInfoTextIndicator",
        "challengeSelectOptions",
        "",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
        "expandInfoLabel",
        "expandInfoText",
        "issuerImage",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
        "messageExtensions",
        "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;",
        "messageVersion",
        "oobAppUrl",
        "oobAppLabel",
        "oobContinueLabel",
        "paymentSystemImage",
        "resendInformationLabel",
        "sdkTransId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "submitAuthenticationLabel",
        "whitelistingInfoText",
        "whyInfoLabel",
        "whyInfoText",
        "transStatus",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getAcsHtml",
        "()Ljava/lang/String;",
        "getAcsHtmlRefresh",
        "getAcsTransId",
        "getChallengeAdditionalInfoText",
        "getChallengeInfoHeader",
        "getChallengeInfoLabel",
        "getChallengeInfoText",
        "getChallengeSelectOptions",
        "()Ljava/util/List;",
        "getExpandInfoLabel",
        "getExpandInfoText",
        "()Z",
        "isValidForUi",
        "isValidForUi$3ds2sdk_release",
        "getIssuerImage",
        "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
        "getMessageExtensions",
        "getMessageVersion",
        "getOobAppLabel",
        "getOobAppUrl",
        "getOobContinueLabel",
        "getPaymentSystemImage",
        "getResendInformationLabel",
        "getSdkTransId",
        "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "getServerTransId",
        "getShouldShowChallengeInfoTextIndicator",
        "getSubmitAuthenticationLabel",
        "getTransStatus",
        "getUiType",
        "()Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "getWhitelistingInfoText",
        "getWhyInfoLabel",
        "getWhyInfoText",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toJson",
        "Lorg/json/JSONObject;",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "ChallengeSelectOption",
        "Companion",
        "Image",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;

.field private static final FIELD_ACS_COUNTER_ACS_TO_SDK:Ljava/lang/String; = "acsCounterAtoS"

.field private static final FIELD_ACS_HTML:Ljava/lang/String; = "acsHTML"

.field private static final FIELD_ACS_HTML_REFRESH:Ljava/lang/String; = "acsHTMLRefresh"

.field private static final FIELD_ACS_TRANS_ID:Ljava/lang/String; = "acsTransID"

.field private static final FIELD_ACS_UI_TYPE:Ljava/lang/String; = "acsUiType"

.field private static final FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT:Ljava/lang/String; = "challengeAddInfo"

.field private static final FIELD_CHALLENGE_COMPLETION_INDICATOR:Ljava/lang/String; = "challengeCompletionInd"

.field private static final FIELD_CHALLENGE_INFO_HEADER:Ljava/lang/String; = "challengeInfoHeader"

.field private static final FIELD_CHALLENGE_INFO_LABEL:Ljava/lang/String; = "challengeInfoLabel"

.field private static final FIELD_CHALLENGE_INFO_TEXT:Ljava/lang/String; = "challengeInfoText"

.field private static final FIELD_CHALLENGE_INFO_TEXT_INDICATOR:Ljava/lang/String; = "challengeInfoTextIndicator"

.field private static final FIELD_CHALLENGE_SELECT_INFO:Ljava/lang/String; = "challengeSelectInfo"

.field private static final FIELD_EXPAND_INFO_LABEL:Ljava/lang/String; = "expandInfoLabel"

.field private static final FIELD_EXPAND_INFO_TEXT:Ljava/lang/String; = "expandInfoText"

.field private static final FIELD_ISSUER_IMAGE:Ljava/lang/String; = "issuerImage"

.field private static final FIELD_MESSAGE_EXTENSION:Ljava/lang/String; = "messageExtension"

.field private static final FIELD_MESSAGE_TYPE:Ljava/lang/String; = "messageType"

.field private static final FIELD_MESSAGE_VERSION:Ljava/lang/String; = "messageVersion"

.field private static final FIELD_OOB_APP_LABEL:Ljava/lang/String; = "oobAppLabel"

.field private static final FIELD_OOB_APP_URL:Ljava/lang/String; = "oobAppURL"

.field private static final FIELD_OOB_CONTINUE_LABEL:Ljava/lang/String; = "oobContinueLabel"

.field private static final FIELD_PAYMENT_SYSTEM_IMAGE:Ljava/lang/String; = "psImage"

.field private static final FIELD_RESEND_INFORMATION_LABEL:Ljava/lang/String; = "resendInformationLabel"

.field private static final FIELD_SDK_TRANS_ID:Ljava/lang/String; = "sdkTransID"

.field private static final FIELD_SERVER_TRANS_ID:Ljava/lang/String; = "threeDSServerTransID"

.field private static final FIELD_SUBMIT_AUTHENTICATION_LABEL:Ljava/lang/String; = "submitAuthenticationLabel"

.field private static final FIELD_TRANS_STATUS:Ljava/lang/String; = "transStatus"

.field private static final FIELD_WHITELISTING_INFO_TEXT:Ljava/lang/String; = "whitelistingInfoText"

.field private static final FIELD_WHY_INFO_LABEL:Ljava/lang/String; = "whyInfoLabel"

.field private static final FIELD_WHY_INFO_TEXT:Ljava/lang/String; = "whyInfoText"

.field private static final FINAL_CRES_FIELDS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MESSAGE_TYPE:Ljava/lang/String; = "CRes"

.field private static final NO_VALUE:Ljava/lang/String; = "N"

.field private static final YES_NO_VALUES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final YES_VALUE:Ljava/lang/String; = "Y"


# instance fields
.field private final acsHtml:Ljava/lang/String;

.field private final acsHtmlRefresh:Ljava/lang/String;

.field private final acsTransId:Ljava/lang/String;

.field private final challengeAdditionalInfoText:Ljava/lang/String;

.field private final challengeInfoHeader:Ljava/lang/String;

.field private final challengeInfoLabel:Ljava/lang/String;

.field private final challengeInfoText:Ljava/lang/String;

.field private final challengeSelectOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;"
        }
    .end annotation
.end field

.field private final expandInfoLabel:Ljava/lang/String;

.field private final expandInfoText:Ljava/lang/String;

.field private final isChallengeCompleted:Z

.field private final issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

.field private final messageExtensions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;",
            ">;"
        }
    .end annotation
.end field

.field private final messageVersion:Ljava/lang/String;

.field private final oobAppLabel:Ljava/lang/String;

.field private final oobAppUrl:Ljava/lang/String;

.field private final oobContinueLabel:Ljava/lang/String;

.field private final paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

.field private final resendInformationLabel:Ljava/lang/String;

.field private final sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

.field private final serverTransId:Ljava/lang/String;

.field private final shouldShowChallengeInfoTextIndicator:Z

.field private final submitAuthenticationLabel:Ljava/lang/String;

.field private final transStatus:Ljava/lang/String;

.field private final uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field private final whitelistingInfoText:Ljava/lang/String;

.field private final whyInfoLabel:Ljava/lang/String;

.field private final whyInfoText:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Creator;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "Y"

    const-string v1, "N"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->YES_NO_VALUES:Ljava/util/List;

    const-string v1, "threeDSServerTransID"

    const-string v2, "acsCounterAtoS"

    const-string v3, "acsTransID"

    const-string v4, "challengeCompletionInd"

    const-string v5, "messageExtension"

    const-string v6, "messageType"

    const-string v7, "messageVersion"

    const-string v8, "sdkTransID"

    const-string v9, "transStatus"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->FINAL_CRES_FIELDS:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p17

    move-object/from16 v4, p23

    const-string v5, "serverTransId"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "acsTransId"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "messageVersion"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sdkTransId"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    iput-object v2, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move v1, p6

    iput-boolean v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    move-object v1, p7

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    move/from16 v1, p11

    iput-boolean v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    move-object/from16 v1, p12

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    iput-object v3, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    move-object/from16 v1, p22

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    iput-object v4, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    move-object/from16 v1, p24

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    move-object/from16 v1, p25

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    move-object/from16 v1, p26

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    move-object/from16 v1, p27

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    move-object/from16 v1, p28

    iput-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 32

    move/from16 v0, p29

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    move v9, v3

    goto :goto_3

    :cond_3
    move/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move v14, v3

    goto :goto_8

    :cond_8
    move/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move-object/from16 v16, v2

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    move-object/from16 v17, v2

    goto :goto_b

    :cond_b
    move-object/from16 v17, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-object/from16 v18, v2

    goto :goto_c

    :cond_c
    move-object/from16 v18, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v19, v2

    goto :goto_d

    :cond_d
    move-object/from16 v19, p16

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v21, v2

    goto :goto_e

    :cond_e
    move-object/from16 v21, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v22, v2

    goto :goto_f

    :cond_f
    move-object/from16 v22, p19

    :goto_f
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v23, v2

    goto :goto_10

    :cond_10
    move-object/from16 v23, p20

    :goto_10
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v24, v2

    goto :goto_11

    :cond_11
    move-object/from16 v24, p21

    :goto_11
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move-object/from16 v25, v2

    goto :goto_12

    :cond_12
    move-object/from16 v25, p22

    :goto_12
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_13

    move-object/from16 v27, v2

    goto :goto_13

    :cond_13
    move-object/from16 v27, p24

    :goto_13
    const/high16 v1, 0x1000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    move-object/from16 v28, v2

    goto :goto_14

    :cond_14
    move-object/from16 v28, p25

    :goto_14
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_15

    move-object/from16 v29, v2

    goto :goto_15

    :cond_15
    move-object/from16 v29, p26

    :goto_15
    const/high16 v1, 0x4000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_16

    move-object/from16 v30, v2

    goto :goto_16

    :cond_16
    move-object/from16 v30, p27

    :goto_16
    const/high16 v1, 0x8000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_17

    move-object/from16 v31, v2

    goto :goto_17

    :cond_17
    move-object/from16 v31, p28

    :goto_17
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v20, p17

    move-object/from16 v26, p23

    invoke-direct/range {v3 .. v31}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getFINAL_CRES_FIELDS$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->FINAL_CRES_FIELDS:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getYES_NO_VALUES$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->YES_NO_VALUES:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p29

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-object/from16 p23, v15

    if-eqz v16, :cond_17

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-object/from16 p24, v15

    if-eqz v16, :cond_18

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move-object/from16 p25, v15

    if-eqz v16, :cond_19

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, v1, v16

    move-object/from16 p26, v15

    if-eqz v16, :cond_1a

    iget-object v15, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v1, v1, v16

    if-eqz v1, :cond_1b

    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p27, v15

    move-object/from16 p28, v1

    invoke-virtual/range {p0 .. p28}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/stripe3ds2/transactions/UiType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    const-string v0, "serverTransId"

    move-object/from16 v29, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsTransId"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersion"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransId"

    move-object/from16 v1, p23

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v30, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-object/from16 v0, v30

    move-object/from16 v1, v29

    invoke-direct/range {v0 .. v28}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v30
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    iget-boolean v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    iget-boolean v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    return v2

    :cond_1d
    return v0
.end method

.method public final getAcsHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    return-object v0
.end method

.method public final getAcsHtmlRefresh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    return-object v0
.end method

.method public final getAcsTransId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChallengeAdditionalInfoText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final getChallengeInfoHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final getChallengeInfoLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getChallengeInfoText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final getChallengeSelectOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getExpandInfoLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpandInfoText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final getIssuerImage()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    return-object v0
.end method

.method public final getMessageExtensions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    return-object v0
.end method

.method public final getMessageVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getOobAppLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getOobAppUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getOobContinueLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentSystemImage()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    return-object v0
.end method

.method public final getResendInformationLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdkTransId()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    return-object v0
.end method

.method public final getServerTransId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldShowChallengeInfoTextIndicator()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    return v0
.end method

.method public final getSubmitAuthenticationLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTransStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    return-object v0
.end method

.method public final getWhitelistingInfoText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhyInfoLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhyInfoText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    move v1, v3

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    if-eqz v1, :cond_8

    goto :goto_7

    :cond_8
    move v3, v1

    :goto_7
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_8

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_9

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_a

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_b

    :cond_c
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_c

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_d

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_e

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_f

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_10

    :cond_11
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_11

    :cond_12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_12

    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_13

    :cond_14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_14

    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_15

    :cond_16
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    if-nez v1, :cond_17

    goto :goto_16

    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    return v0
.end method

.method public final isChallengeCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    return v0
.end method

.method public final isValidForUi$3ds2sdk_release()Z
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Html:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v3, 0x0

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v3, v1

    :cond_2
    xor-int/lit8 v0, v3, 0x1

    return v0

    :cond_3
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    aput-object v2, v0, v3

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    const/4 v4, 0x2

    aput-object v2, v0, v4

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    const/4 v5, 0x3

    aput-object v2, v0, v5

    const/4 v2, 0x4

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    aput-object v6, v0, v2

    const/4 v2, 0x5

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    aput-object v6, v0, v2

    const/4 v2, 0x6

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    aput-object v6, v0, v2

    const/4 v2, 0x7

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    aput-object v6, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    move v0, v1

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_8

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    move v2, v3

    goto :goto_1

    :cond_8
    :goto_0
    move v2, v1

    :goto_1
    if-nez v2, :cond_6

    move v0, v3

    :goto_2
    if-eqz v0, :cond_9

    return v3

    :cond_9
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/UiType;->OutOfBand:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-ne v0, v2, :cond_f

    new-array v0, v5, [Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    aput-object v2, v0, v3

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    aput-object v2, v0, v4

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_a
    move v1, v3

    goto :goto_5

    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_e

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_3

    :cond_d
    move v2, v3

    goto :goto_4

    :cond_e
    :goto_3
    move v2, v1

    :goto_4
    xor-int/2addr v2, v1

    if-eqz v2, :cond_c

    :goto_5
    return v1

    :cond_f
    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/UiType;->SingleSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-eq v0, v2, :cond_10

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/UiType;->MultiSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-ne v0, v2, :cond_11

    :cond_10
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    if-eqz v0, :cond_14

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_6

    :cond_11
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    if-eqz v0, :cond_12

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_13

    :cond_12
    move v3, v1

    :cond_13
    xor-int/lit8 v0, v3, 0x1

    return v0

    :cond_14
    :goto_6
    return v3
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "messageType"

    const-string v2, "CRes"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "threeDSServerTransID"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "acsTransID"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "acsHTML"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "acsHTMLRefresh"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/UiType;->getCode()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "acsUiType"

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    const-string v3, "Y"

    const-string v4, "N"

    if-eqz v1, :cond_1

    move-object v1, v3

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    const-string v5, "challengeCompletionInd"

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "challengeInfoHeader"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "challengeInfoLabel"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "challengeInfoText"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "challengeAddInfo"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;->Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption$Companion;

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    invoke-virtual {v1, v5}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption$Companion;->toJsonArray$3ds2sdk_release(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v1

    const-string v5, "challengeSelectInfo"

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "expandInfoLabel"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "expandInfoText"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;->toJson$3ds2sdk_release()Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    const-string v5, "issuerImage"

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;->Companion:Lcom/stripe/android/stripe3ds2/transactions/MessageExtension$Companion;

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    invoke-virtual {v1, v5}, Lcom/stripe/android/stripe3ds2/transactions/MessageExtension$Companion;->toJsonArray(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v1

    const-string v5, "messageExtension"

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "messageVersion"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "oobAppURL"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "oobAppLabel"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "oobContinueLabel"

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;->toJson$3ds2sdk_release()Lorg/json/JSONObject;

    move-result-object v2

    :cond_3
    const-string v1, "psImage"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "resendInformationLabel"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sdkTransID"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "submitAuthenticationLabel"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "whitelistingInfoText"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "whyInfoLabel"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "whyInfoText"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "transStatus"

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    if-nez v1, :cond_5

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, v4

    :goto_3
    const-string v1, "challengeInfoTextIndicator"

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    const-string v1, "JSONObject()\n           \u2026          }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChallengeResponseData(serverTransId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", acsTransId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", acsHtml="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", acsHtmlRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", uiType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isChallengeCompleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", challengeInfoHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeInfoLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeAdditionalInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowChallengeInfoTextIndicator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", challengeSelectOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expandInfoLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expandInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", issuerImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", oobAppUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", oobAppLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", oobContinueLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentSystemImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resendInformationLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdkTransId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", submitAuthenticationLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whitelistingInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whyInfoLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whyInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", transStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->serverTransId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsTransId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtml:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->acsHtmlRefresh:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->uiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoHeader:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeInfoText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeAdditionalInfoText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->shouldShowChallengeInfoTextIndicator:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->challengeSelectOptions:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;

    invoke-virtual {v3, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->expandInfoText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->issuerImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageExtensions:Ljava/util/List;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;

    invoke-virtual {v3, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_5
    :goto_5
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->messageVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobAppLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->oobContinueLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->paymentSystemImage:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->resendInformationLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->sdkTransId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->submitAuthenticationLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whitelistingInfoText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->whyInfoText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->transStatus:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

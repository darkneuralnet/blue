.class public final Lcom/stripe/android/model/parsers/NextActionDataParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/parsers/NextActionDataParser$WhenMappings;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/NextActionDataParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "AlipayRedirectParser",
        "BlikAuthorizeParser",
        "CashAppRedirectParser",
        "Companion",
        "DisplayOxxoDetailsJsonParser",
        "RedirectToUrlParser",
        "SdkDataJsonParser",
        "UpiAwaitNotificationParser",
        "VerifyWithMicrodepositsParser",
        "WeChatPayRedirectParser",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;

.field private static final FIELD_NEXT_ACTION_TYPE:Ljava/lang/String; = "type"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/parsers/NextActionDataParser;->Companion:Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/NextActionDataParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData;
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->Companion:Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;

    const-string v1, "type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;->fromCode$payments_core_release(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/model/parsers/NextActionDataParser$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    packed-switch v1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;-><init>()V

    goto :goto_1

    :pswitch_2
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;-><init>()V

    goto :goto_1

    :pswitch_3
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;-><init>()V

    goto :goto_1

    :pswitch_4
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;-><init>()V

    goto :goto_1

    :pswitch_5
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;-><init>()V

    goto :goto_1

    :pswitch_6
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;-><init>()V

    goto :goto_1

    :pswitch_7
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;-><init>()V

    goto :goto_1

    :pswitch_8
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;-><init>()V

    goto :goto_1

    :pswitch_9
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;-><init>()V

    :goto_1
    invoke-virtual {v0}, Lcom/stripe/android/model/StripeIntent$NextActionType;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    invoke-interface {v1, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent$NextActionData;

    return-object p1

    :pswitch_a
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

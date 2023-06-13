.class public final Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/parsers/NextActionDataParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VerifyWithMicrodepositsParser"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseMicrodepositType",
        "Lcom/stripe/android/model/MicrodepositType;",
        "Companion",
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
.field private static final ARRIVAL_DATE:Ljava/lang/String; = "arrival_date"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;

.field private static final HOSTED_VERIFICATION_URL:Ljava/lang/String; = "hosted_verification_url"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final MICRODEPOSIT_TYPE:Ljava/lang/String; = "microdeposit_type"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;->Companion:Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final parseMicrodepositType(Lorg/json/JSONObject;)Lcom/stripe/android/model/MicrodepositType;
    .locals 6

    invoke-static {}, Lcom/stripe/android/model/MicrodepositType;->values()[Lcom/stripe/android/model/MicrodepositType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/stripe/android/model/MicrodepositType;->getValue()Ljava/lang/String;

    move-result-object v4

    const-string v5, "microdeposit_type"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object v3, Lcom/stripe/android/model/MicrodepositType;->UNKNOWN:Lcom/stripe/android/model/MicrodepositType;

    :cond_2
    return-object v3
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;

    move-result-object p1

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;
    .locals 5

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;

    const-string v1, "arrival_date"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    const-string v3, "hosted_verification_url"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "json.optString(HOSTED_VERIFICATION_URL)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;->parseMicrodepositType(Lorg/json/JSONObject;)Lcom/stripe/android/model/MicrodepositType;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;-><init>(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V

    return-object v0
.end method

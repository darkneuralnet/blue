.class public final Lcom/stripe/android/FraudDetectionDataRepositoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "fraudDetectionJsonParser",
        "Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;",
        "timestampSupplier",
        "Lkotlin/Function0;",
        "",
        "fraudDetectionData",
        "Lcom/stripe/android/networking/FraudDetectionData;",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFraudDetectionDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataRepository.kt\ncom/stripe/android/FraudDetectionDataRepositoryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"
    }
.end annotation


# static fields
.field private static final fraudDetectionJsonParser:Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;

.field private static final timestampSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/stripe/android/FraudDetectionDataRepositoryKt$timestampSupplier$1;->INSTANCE:Lcom/stripe/android/FraudDetectionDataRepositoryKt$timestampSupplier$1;

    sput-object v0, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->timestampSupplier:Lkotlin/jvm/functions/Function0;

    new-instance v1, Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;

    invoke-direct {v1, v0}, Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;-><init>(Lkotlin/jvm/functions/Function0;)V

    sput-object v1, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->fraudDetectionJsonParser:Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;

    return-void
.end method

.method public static final synthetic access$fraudDetectionData(Lcom/stripe/android/core/networking/StripeResponse;)Lcom/stripe/android/networking/FraudDetectionData;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->fraudDetectionData(Lcom/stripe/android/core/networking/StripeResponse;)Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTimestampSupplier$p()Lkotlin/jvm/functions/Function0;
    .locals 1

    sget-object v0, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->timestampSupplier:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method private static final fraudDetectionData(Lcom/stripe/android/core/networking/StripeResponse;)Lcom/stripe/android/networking/FraudDetectionData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/networking/FraudDetectionData;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeResponse;->isOk()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    sget-object v0, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->fraudDetectionJsonParser:Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;

    invoke-static {p0}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v1

    :cond_1
    return-object v1
.end method

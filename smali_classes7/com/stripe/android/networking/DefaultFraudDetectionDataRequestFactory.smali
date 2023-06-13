.class public final Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0008\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;",
        "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "fraudDetectionDataRequestParamsFactory",
        "Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;",
        "(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V",
        "create",
        "Lcom/stripe/android/networking/FraudDetectionDataRequest;",
        "arg",
        "Lcom/stripe/android/networking/FraudDetectionData;",
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


# instance fields
.field private final fraudDetectionDataRequestParamsFactory:Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;

    invoke-direct {v0, p1}, Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;-><init>(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V
    .locals 1

    const-string v0, "fraudDetectionDataRequestParamsFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;->fraudDetectionDataRequestParamsFactory:Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/networking/FraudDetectionData;)Lcom/stripe/android/networking/FraudDetectionDataRequest;
    .locals 2

    new-instance v0, Lcom/stripe/android/networking/FraudDetectionDataRequest;

    iget-object v1, p0, Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;->fraudDetectionDataRequestParamsFactory:Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;->createParams$payments_core_release(Lcom/stripe/android/networking/FraudDetectionData;)Ljava/util/Map;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/networking/FraudDetectionData;->getGuid$payments_core_release()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/networking/FraudDetectionDataRequest;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    return-object v0
.end method

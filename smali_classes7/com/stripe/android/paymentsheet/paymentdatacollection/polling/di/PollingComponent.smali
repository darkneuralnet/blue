.class public interface abstract Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/core/injection/CoroutineContextModule;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule;,
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;",
        "",
        "inject",
        "",
        "factory",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;",
        "Builder",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract inject(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;)V
.end method

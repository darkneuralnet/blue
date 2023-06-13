.class public interface abstract Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\'J\u0010\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\'J\u0012\u0010\n\u001a\u00020\u00002\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'J\u0008\u0010\u000c\u001a\u00020\u000bH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;",
        "",
        "Landroid/app/Application;",
        "application",
        "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
        "config",
        "LSC0;",
        "dispatcher",
        "ioDispatcher",
        "",
        "injectorKey",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;",
        "build",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;
.end method

.method public abstract config(Lcom/stripe/android/polling/IntentStatusPoller$Config;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract injectorKey(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract ioDispatcher(LSC0;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

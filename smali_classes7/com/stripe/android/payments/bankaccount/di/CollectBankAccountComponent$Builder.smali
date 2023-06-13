.class public interface abstract Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0016\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0010\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007H\'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\'J\u0008\u0010\u000c\u001a\u00020\u000bH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;",
        "",
        "Landroid/app/Application;",
        "application",
        "LBX2;",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
        "viewEffect",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "configuration",
        "Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;",
        "build",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;
.end method

.method public abstract configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract savedStateHandle(Landroidx/lifecycle/p;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract viewEffect(LBX2;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;"
        }
    .end annotation
.end method

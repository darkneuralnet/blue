.class public interface abstract Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Subcomponent$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0016\u0010\u0008\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0008\u0010\n\u001a\u00020\tH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;",
        "",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "args",
        "formArguments",
        "LEu1;",
        "",
        "saveForFutureUseVisibleFlow",
        "showCheckboxFlow",
        "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;",
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
.method public abstract build()Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;
.end method

.method public abstract formArguments(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract showCheckboxFlow(LEu1;)Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;"
        }
    .end annotation
.end method

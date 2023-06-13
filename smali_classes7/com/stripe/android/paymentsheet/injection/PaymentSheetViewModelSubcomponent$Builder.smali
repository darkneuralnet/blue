.class public interface abstract Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Subcomponent$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\'J\u0008\u0010\u0008\u001a\u00020\u0007H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;",
        "",
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;",
        "paymentSheetViewModelModule",
        "Landroidx/lifecycle/p;",
        "handle",
        "savedStateHandle",
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;",
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
.method public abstract build()Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;
.end method

.method public abstract paymentSheetViewModelModule(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;
.end method

.method public abstract savedStateHandle(Landroidx/lifecycle/p;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

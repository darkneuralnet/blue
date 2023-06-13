.class public final Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;->module:Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;-><init>(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)V

    return-object v0
.end method

.method public static provideArgs(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;
    .locals 0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;->provideArgs()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;->module:Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;->provideArgs(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvideArgsFactory;->get()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/util/Set<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;->module:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;)V

    return-object v0
.end method

.method public static providesProductUsage(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;->providesProductUsage()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;->module:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule_ProvidesProductUsageFactory;->providesProductUsage(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

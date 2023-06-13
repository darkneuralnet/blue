.class public final Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory$InstanceHolder;->a()Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;

    move-result-object v0

    return-object v0
.end method

.method public static provideMessageVersionRegistry()Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule;->Companion:Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule$Companion;->provideMessageVersionRegistry()Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;
    .locals 1

    invoke-static {}, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;->provideMessageVersionRegistry()Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;->get()Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    move-result-object v0

    return-object v0
.end method

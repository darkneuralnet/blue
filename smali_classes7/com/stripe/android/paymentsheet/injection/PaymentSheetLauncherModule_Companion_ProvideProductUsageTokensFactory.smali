.class public final Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/util/Set<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory$InstanceHolder;->a()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object v0

    return-object v0
.end method

.method public static provideProductUsageTokens()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule;->Companion:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;->provideProductUsageTokens()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory;->get()Ljava/util/Set;

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

    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory;->provideProductUsageTokens()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        ">;"
    }
.end annotation


# instance fields
.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;->argsProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideConfiguration(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule;->Companion:Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;->provideConfiguration(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-static {v0}, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;->provideConfiguration(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;->get()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object v0

    return-object v0
.end method

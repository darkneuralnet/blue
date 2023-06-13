.class public final Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/injection/NonFallbackInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkPaymentLauncher;->buildLinkComponent(Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;Lcom/stripe/android/link/LinkActivityContract$Args;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "inject",
        "",
        "injectable",
        "Lcom/stripe/android/core/injection/Injectable;",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $linkComponent:Lcom/stripe/android/link/injection/LinkComponent;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/injection/LinkComponent;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public inject(Lcom/stripe/android/core/injection/Injectable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/Injectable<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "injectable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent;->inject(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent;->inject(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent;->inject(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent;->inject(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent;->inject(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;->$linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent;->inject(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)V

    :goto_0
    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid Injectable "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requested in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public abstract Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/injection/NonFallbackInjector;


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;,
        Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelModule;,
        Lcom/stripe/android/core/injection/CoroutineContextModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;,
        Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008!\u0018\u00002\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "()V",
        "inject",
        "",
        "injectable",
        "Lcom/stripe/android/core/injection/Injectable;",
        "factory",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;",
        "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;",
        "Builder",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

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

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;->inject(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;->inject(Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;)V

    :goto_0
    return-void

    :cond_1
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

.method public abstract inject(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;)V
.end method

.method public abstract inject(Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;)V
.end method

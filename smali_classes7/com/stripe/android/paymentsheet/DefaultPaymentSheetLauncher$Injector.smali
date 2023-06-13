.class final Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/injection/NonFallbackInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Injector"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "paymentSheetLauncherComponent",
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;",
        "(Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;)V",
        "inject",
        "",
        "injectable",
        "Lcom/stripe/android/core/injection/Injectable;",
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


# instance fields
.field private final paymentSheetLauncherComponent:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;)V
    .locals 1

    const-string v0, "paymentSheetLauncherComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;->paymentSheetLauncherComponent:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;

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

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;->paymentSheetLauncherComponent:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;->inject(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;->paymentSheetLauncherComponent:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;

    check-cast p1, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;->inject(Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;)V

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

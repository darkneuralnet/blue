.class public final Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;",
        "()V",
        "toolbarCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;",
        "build",
        "setBackgroundColor",
        "hexColor",
        "",
        "setButtonText",
        "buttonText",
        "setHeaderText",
        "headerText",
        "setStatusBarColor",
        "setTextColor",
        "setTextFontName",
        "fontName",
        "setTextFontSize",
        "fontSize",
        "",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;

    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;

    move-result-object v0

    return-object v0
.end method

.method public final setBackgroundColor(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "hexColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->setBackgroundColor(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setButtonText(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "buttonText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->setButtonText(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setHeaderText(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "headerText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->setHeaderText(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setStatusBarColor(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "hexColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->setStatusBarColor(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setTextColor(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "hexColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setTextFontName(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "fontName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextFontName(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setTextFontSize(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextFontSize(I)V

    return-object p0
.end method

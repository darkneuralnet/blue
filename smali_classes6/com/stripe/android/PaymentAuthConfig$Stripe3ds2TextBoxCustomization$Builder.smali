.class public final Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000cJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;",
        "()V",
        "textBoxCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;",
        "build",
        "setBorderColor",
        "hexColor",
        "",
        "setBorderWidth",
        "borderWidth",
        "",
        "setCornerRadius",
        "cornerRadius",
        "setTextColor",
        "setTextFontName",
        "fontName",
        "setTextFontSize",
        "fontSize",
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
.field private final textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;

    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;

    move-result-object v0

    return-object v0
.end method

.method public final setBorderColor(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "hexColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->setBorderColor(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setBorderWidth(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->setBorderWidth(I)V

    return-object p0
.end method

.method public final setCornerRadius(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->setCornerRadius(I)V

    return-object p0
.end method

.method public final setTextColor(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "hexColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setTextFontName(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "fontName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextFontName(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setTextFontSize(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;->textBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextFontSize(I)V

    return-object p0
.end method

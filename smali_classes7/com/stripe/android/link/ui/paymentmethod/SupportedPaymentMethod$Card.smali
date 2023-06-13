.class final Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Card;
.super Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Card"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Card;",
        "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
        "primaryButtonLabel",
        "",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "resources",
        "Landroid/content/res/Resources;",
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


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v3, "card"

    invoke-static {}, Lcom/stripe/android/ui/core/forms/LinkCardFormKt;->getLinkCardForm()Lcom/stripe/android/ui/core/elements/LayoutSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/LayoutSpec;->getItems()Ljava/util/List;

    move-result-object v4

    sget v5, Lcom/stripe/android/link/R$string;->stripe_paymentsheet_payment_method_card:I

    sget v6, Lcom/stripe/android/link/R$drawable;->ic_link_card:I

    const/4 v7, 0x0

    sget v0, Lcom/stripe/android/link/R$drawable;->stripe_ic_lock:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public primaryButtonLabel(Lcom/stripe/android/model/StripeIntent;Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->completePaymentButtonLabel(Lcom/stripe/android/model/StripeIntent;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

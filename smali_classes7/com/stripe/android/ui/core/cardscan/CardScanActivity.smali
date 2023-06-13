.class public final Lcom/stripe/android/ui/core/cardscan/CardScanActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/cardscan/CardScanActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "stripeCardScanProxy",
        "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
        "viewBinding",
        "Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;",
        "getViewBinding",
        "()Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;",
        "viewBinding$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onScanFinished",
        "result",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Companion",
        "payments-ui-core_release"
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
.field public static final CARD_SCAN_PARCELABLE_NAME:Ljava/lang/String; = "CardScanActivityResult"

.field public static final Companion:Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;


# instance fields
.field private stripeCardScanProxy:Lcom/stripe/android/ui/core/StripeCardScanProxy;

.field private final viewBinding$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->Companion:Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$viewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$viewBinding$2;-><init>(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->viewBinding$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$onScanFinished(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V

    return-void
.end method

.method private final getViewBinding()Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;

    return-object v0
.end method

.method private final onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "CardScanActivityResult"

    check-cast p1, Landroid/os/Parcelable;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "Intent()\n            .pu\u2026     result\n            )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->getViewBinding()Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    sget-object v0, Lcom/stripe/android/ui/core/StripeCardScanProxy;->Companion:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    sget-object p1, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {p1, p0}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$onCreate$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$onCreate$1;-><init>(Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->stripeCardScanProxy:Lcom/stripe/android/ui/core/StripeCardScanProxy;

    if-nez p1, :cond_0

    const-string p1, "stripeCardScanProxy"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p1}, Lcom/stripe/android/ui/core/StripeCardScanProxy;->present()V

    return-void
.end method

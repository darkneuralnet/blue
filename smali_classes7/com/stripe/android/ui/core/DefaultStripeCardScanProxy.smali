.class public final Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ui/core/StripeCardScanProxy;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016JC\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;",
        "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
        "",
        "present",
        "LLifecycleOwner;",
        "lifecycleOwner",
        "Landroidx/fragment/app/FragmentManager;",
        "supportFragmentManager",
        "",
        "fragmentContainer",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Lkotlin/ParameterName;",
        "name",
        "cardScanSheetResult",
        "onFinished",
        "attachCardScanFragment",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;",
        "cardScanSheet",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;",
        "<init>",
        "(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V
    .locals 1

    const-string v0, "cardScanSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;->cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    return-void
.end method


# virtual methods
.method public attachCardScanFragment(LLifecycleOwner;Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLifecycleOwner;",
            "Landroidx/fragment/app/FragmentManager;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFinished"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;->cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->attachCardScanFragment(LLifecycleOwner;Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public present()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;->cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    invoke-virtual {v0}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->present()V

    return-void
.end method

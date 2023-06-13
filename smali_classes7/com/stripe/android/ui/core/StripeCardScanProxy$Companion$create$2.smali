.class final Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $activity:Landroidx/appcompat/app/AppCompatActivity;

.field final synthetic $onFinished:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $stripePublishableKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->$stripePublishableKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->$onFinished:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
    .locals 8

    new-instance v0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    sget-object v1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->Companion:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;

    iget-object v2, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    iget-object v3, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->$stripePublishableKey:Ljava/lang/String;

    new-instance v4, Lcom/stripe/android/ui/core/StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0;

    iget-object v5, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->$onFinished:Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v5}, Lcom/stripe/android/ui/core/StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v4, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$CardScanResultCallback;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;->create$default(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;Landroidx/activity/ComponentActivity;Ljava/lang/String;Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$CardScanResultCallback;Landroidx/activity/result/ActivityResultRegistry;ILjava/lang/Object;)Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;-><init>(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$create$2;->invoke()Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    move-result-object v0

    return-object v0
.end method

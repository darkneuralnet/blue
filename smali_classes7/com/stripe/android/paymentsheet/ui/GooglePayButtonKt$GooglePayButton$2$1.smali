.class final Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/paymentsheet/ui/GooglePayButton;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $isEnabled:Z

.field final synthetic $onPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;


# direct methods
.method public constructor <init>(ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->$isEnabled:Z

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->$state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->$onPressed:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->invoke(Lcom/stripe/android/paymentsheet/ui/GooglePayButton;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/paymentsheet/ui/GooglePayButton;)V
    .locals 2

    const-string v0, "googlePayButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->$isEnabled:Z

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->$state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->updateState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1;->$onPressed:Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$2$1$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

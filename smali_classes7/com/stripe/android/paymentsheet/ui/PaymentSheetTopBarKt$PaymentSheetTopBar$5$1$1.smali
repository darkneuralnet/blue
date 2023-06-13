.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
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
.field final synthetic $keyboardController:LnN5;

.field final synthetic $onNavigationIconPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LnN5;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LnN5;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;->$keyboardController:LnN5;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;->$onNavigationIconPressed:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;->$keyboardController:LnN5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LnN5;->b()V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;->$onNavigationIconPressed:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

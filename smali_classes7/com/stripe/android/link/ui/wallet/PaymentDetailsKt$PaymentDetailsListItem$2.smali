.class final Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->PaymentDetailsListItem(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
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
.field final synthetic $$changed:I

.field final synthetic $enabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $isSupported:Z

.field final synthetic $isUpdating:Z

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onMenuButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "ZZZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$enabled:Z

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$isSupported:Z

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$isSelected:Z

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$isUpdating:Z

    iput-object p6, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$onMenuButtonClick:Lkotlin/jvm/functions/Function0;

    iput p8, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$enabled:Z

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$isSupported:Z

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$isSelected:Z

    iget-boolean v4, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$isUpdating:Z

    iget-object v5, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$onMenuButtonClick:Lkotlin/jvm/functions/Function0;

    iget p2, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$PaymentDetailsListItem$2;->$$changed:I

    or-int/lit8 v8, p2, 0x1

    move-object v7, p1

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->PaymentDetailsListItem(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method
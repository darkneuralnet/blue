.class final Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodIconUi-qFjXxE8(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZJLEt0;I)V
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

.field final synthetic $color:J

.field final synthetic $iconRes:I

.field final synthetic $iconUrl:Ljava/lang/String;

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $tintOnSelected:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZJI)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$iconRes:I

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$iconUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$tintOnSelected:Z

    iput-wide p5, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$color:J

    iput p7, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$iconRes:I

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$iconUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$tintOnSelected:Z

    iget-wide v4, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$color:J

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodIconUi$1;->$$changed:I

    or-int/lit8 v7, p2, 0x1

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->access$PaymentMethodIconUi-qFjXxE8(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZJLEt0;I)V

    return-void
.end method

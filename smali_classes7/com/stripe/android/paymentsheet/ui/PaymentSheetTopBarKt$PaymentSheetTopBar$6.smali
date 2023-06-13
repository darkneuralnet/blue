.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->PaymentSheetTopBar-uFdPcIQ(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LZc5;",
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
.field final synthetic $$dirty:I

.field final synthetic $onEditIconPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

.field final synthetic $tintColor:J


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;JLkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
            "J",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iput-wide p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$tintColor:J

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$onEditIconPressed:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc5;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 7

    const-string v0, "$this$TopAppBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:99)"

    const v1, 0x2bc0d05b

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->getShowEditMenu()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->getEditMenuLabel()I

    move-result v0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled()Z

    move-result v1

    iget-wide v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$tintColor:J

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$onEditIconPressed:Lkotlin/jvm/functions/Function0;

    iget p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$6;->$$dirty:I

    and-int/lit16 v6, p1, 0x1c00

    move-object v5, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->access$EditButton-FNF3uiM(IZJLkotlin/jvm/functions/Function0;LEt0;I)V

    :cond_3
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_1
    return-void
.end method

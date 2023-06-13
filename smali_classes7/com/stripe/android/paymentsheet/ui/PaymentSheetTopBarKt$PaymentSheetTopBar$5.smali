.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentSheetTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,198:1\n50#2:199\n49#2:200\n1057#3,6:201\n*S KotlinDebug\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5\n*L\n86#1:199\n86#1:200\n86#1:201,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

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

.field final synthetic $state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

.field final synthetic $tintColor:J


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;LnN5;Lkotlin/jvm/functions/Function0;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
            "LnN5;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;IJ)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$keyboardController:LnN5;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$onNavigationIconPressed:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$$dirty:I

    iput-wide p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$tintColor:J

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:82)"

    const v2, -0xc1b33ce

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->isEnabled()Z

    move-result v2

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$keyboardController:LnN5;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$onNavigationIconPressed:Lkotlin/jvm/functions/Function0;

    const v1, 0x1e7b2b64

    invoke-interface {p1, v1}, LEt0;->F(I)V

    invoke-interface {p1, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;

    invoke-direct {v3, p2, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1;-><init>(LnN5;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    move-object v0, v3

    check-cast v0, Lkotlin/jvm/functions/Function0;

    const/4 v1, 0x0

    const/4 v3, 0x0

    new-instance p2, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$2;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iget-wide v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5;->$tintColor:J

    invoke-direct {p2, v4, v5, v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5$2;-><init>(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;J)V

    const v4, 0x1d755ce

    const/4 v5, 0x1

    invoke-static {p1, v4, v5, p2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xa

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_1
    return-void
.end method

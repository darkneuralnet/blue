.class final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOptions(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LCo2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lh10;",
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
        "SMAP\nPaymentOptionsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,269:1\n154#2:270\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5\n*L\n70#1:270\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $isEditing:Z

.field final synthetic $isProcessing:Z

.field final synthetic $onAddCardPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemRemoved:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:LCo2;

.field final synthetic $state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;


# direct methods
.method public constructor <init>(ZLCo2;ILcom/stripe/android/paymentsheet/PaymentOptionsState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LCo2;",
            "I",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$isProcessing:Z

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$scrollState:LCo2;

    iput p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$$dirty:I

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$isEditing:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$onAddCardPressed:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$onItemRemoved:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->invoke(Lh10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lh10;LEt0;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v2, p3

    const-string v3, "$this$BoxWithConstraints"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v10, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v5, 0x12

    if-ne v3, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v6, "com.stripe.android.paymentsheet.ui.PaymentOptions.<anonymous> (PaymentOptionsUI.kt:63)"

    const v7, 0x2257aa59

    invoke-static {v7, v2, v3, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lh10;->a()F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v10, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->rememberItemWidth-8Feqmps(FLEt0;I)F

    move-result v15

    iget-boolean v1, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$isProcessing:Z

    xor-int/lit8 v8, v1, 0x1

    const/16 v1, 0x11

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v4, v3}, LND3;->c(FFILjava/lang/Object;)LPD3;

    move-result-object v3

    const/4 v1, 0x0

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$scrollState:LCo2;

    const/4 v4, 0x0

    new-instance v20, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;

    iget-object v12, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    iget-boolean v13, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$isProcessing:Z

    iget-boolean v14, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$isEditing:Z

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$onAddCardPressed:Lkotlin/jvm/functions/Function0;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$onItemRemoved:Lkotlin/jvm/functions/Function1;

    iget v6, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$$dirty:I

    move-object/from16 v16, v11

    move-object/from16 v11, v20

    move-object/from16 v17, v9

    move-object/from16 v18, v7

    move/from16 v19, v6

    invoke-direct/range {v11 .. v19}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iget v6, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->$$dirty:I

    shr-int/lit8 v5, v6, 0x12

    and-int/lit8 v5, v5, 0x70

    or-int/lit16 v11, v5, 0x180

    const/16 v12, 0x79

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v9, v20

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, Lgn2;->b(LgV2;LCo2;LPD3;ZLlo$d;LK9$c;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    return-void
.end method

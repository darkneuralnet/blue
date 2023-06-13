.class final Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionCard-flo8M7A(ZZILpm0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
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
        "SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,258:1\n78#2,2:259\n80#2:287\n84#2:295\n75#3:261\n76#3,11:263\n89#3:294\n76#4:262\n460#5,13:274\n473#5,3:291\n1#6:288\n154#7:289\n154#7:290\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1\n*L\n149#1:259,2\n149#1:287\n149#1:295\n149#1:261\n149#1:263,11\n149#1:294\n149#1:262\n149#1:274,13\n149#1:291,3\n166#1:289\n167#1:290\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $iconRes:I

.field final synthetic $iconTint:Lpm0;

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $labelText:Ljava/lang/String;

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;IILpm0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II",
            "Lpm0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$labelText:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$isSelected:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$isEnabled:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$iconRes:I

    iput p6, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$$dirty:I

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$iconTint:Lpm0;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.PaymentOptionCard.<anonymous> (PaymentOptionUi.kt:147)"

    const v4, 0x531f8200

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->b()Llo$e;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->g()LK9$b;

    move-result-object v2

    sget-object v3, LgV2;->b0:LgV2$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$labelText:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PAYMENT_OPTION_CARD_TEST_TAG_"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v12

    iget-boolean v13, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$isSelected:Z

    iget-boolean v14, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$isEnabled:Z

    const/4 v15, 0x0

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v12 .. v18}, LGr5;->c(LgV2;ZZLCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v4

    iget v5, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$iconRes:I

    iget v7, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$$dirty:I

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1;->$iconTint:Lpm0;

    const v9, -0x1cd0f17e

    invoke-interface {v11, v9}, LEt0;->F(I)V

    const/16 v9, 0x36

    invoke-static {v1, v2, v11, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v11, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v11, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v11, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v11, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    sget-object v12, LBt0;->M:LBt0$a;

    invoke-virtual {v12}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v14

    instance-of v14, v14, Llm;

    if-nez v14, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v11, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual {v12}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v1, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v13, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v13, v9, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v13, v10, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v1, v11, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v11, v1}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v11, v1}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, -0x41ef170a

    invoke-interface {v11, v1}, LEt0;->F(I)V

    shr-int/lit8 v1, v7, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v5, v11, v1}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lpm0;->w()J

    move-result-wide v13

    sget-object v12, Lsm0;->b:Lsm0$a;

    const/4 v15, 0x0

    const/16 v16, 0x2

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, Lsm0$a;->b(Lsm0$a;JIILjava/lang/Object;)Lsm0;

    move-result-object v2

    move-object v7, v2

    goto :goto_2

    :cond_5
    move-object v7, v6

    :goto_2
    const/16 v2, 0x28

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v3, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v2

    const/16 v3, 0x38

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2, v3}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v9, 0x1b8

    const/16 v10, 0x38

    move-object/from16 v8, p1

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method

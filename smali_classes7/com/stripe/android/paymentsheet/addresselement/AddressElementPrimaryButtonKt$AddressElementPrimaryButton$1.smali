.class final Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt;->AddressElementPrimaryButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V
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
        "SMAP\nAddressElementPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,84:1\n154#2:85\n154#2:118\n68#3,5:86\n73#3:117\n77#3:123\n75#4:91\n76#4,11:93\n89#4:122\n76#5:92\n460#6,13:104\n473#6,3:119\n*S KotlinDebug\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1\n*L\n59#1:85\n66#1:118\n56#1:86,5\n56#1:117\n56#1:123\n56#1:91\n56#1:93,11\n56#1:122\n56#1:92\n56#1:104,13\n56#1:119,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $background:J

.field final synthetic $borderStroke:LeZ;

.field final synthetic $isEnabled:Z

.field final synthetic $onBackground:J

.field final synthetic $onButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shape:Lbc5;

.field final synthetic $text:Ljava/lang/String;

.field final synthetic $textStyle:LG26;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;ZLbc5;LeZ;JILjava/lang/String;JLG26;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lbc5;",
            "LeZ;",
            "JI",
            "Ljava/lang/String;",
            "J",
            "LG26;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$isEnabled:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$shape:Lbc5;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$borderStroke:LeZ;

    iput-wide p5, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$background:J

    iput p7, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$$dirty:I

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$text:Ljava/lang/String;

    iput-wide p9, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$onBackground:J

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$textStyle:LG26;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v14, p1

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.addresselement.AddressElementPrimaryButton.<anonymous> (AddressElementPrimaryButton.kt:54)"

    const v4, -0x31a7f93b

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v13, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v13, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4, v2, v5, v13, v3}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v4

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->e()LK9;

    move-result-object v5

    iget-object v15, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iget-boolean v12, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$isEnabled:Z

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$shape:Lbc5;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$borderStroke:LeZ;

    iget-wide v6, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$background:J

    iget v8, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$$dirty:I

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$text:Ljava/lang/String;

    move/from16 v16, v8

    move-object/from16 v17, v9

    iget-wide v8, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$onBackground:J

    move/from16 v18, v12

    iget-object v12, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;->$textStyle:LG26;

    const v2, 0x2bb5b5d7

    invoke-interface {v14, v2}, LEt0;->F(I)V

    const/4 v2, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x6

    invoke-static {v5, v2, v14, v12}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v12, -0x4ee9b9da

    invoke-interface {v14, v12}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v12

    invoke-interface {v14, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v13

    invoke-interface {v14, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LJq6;

    sget-object v22, LBt0;->M:LBt0$a;

    invoke-virtual/range {v22 .. v22}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v0

    instance-of v0, v0, Llm;

    if-nez v0, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v14, v2}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v12, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v13, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v0, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {v14, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, -0x60802e81

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v0}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const/16 v1, 0x2c

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v0, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    const/4 v13, 0x0

    const/16 v22, 0x0

    sget-object v1, Li70;->a:Li70;

    const-wide/16 v4, 0x0

    const-wide/16 v23, 0x0

    sget v2, Li70;->l:I

    shl-int/lit8 v12, v2, 0xc

    const/16 v21, 0xa

    move-wide v2, v6

    move-wide/from16 v26, v8

    move/from16 v25, v16

    move-wide/from16 v8, v23

    move-object/from16 v23, v10

    move-object/from16 v10, p1

    move-object/from16 v24, v11

    move v11, v12

    move/from16 v28, v18

    move-object/from16 v20, v19

    const/16 v29, 0x6

    move/from16 v12, v21

    invoke-virtual/range {v1 .. v12}, Li70;->a(JJJJLEt0;II)Lh70;

    move-result-object v8

    const/4 v9, 0x0

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1;

    move-object/from16 v16, v1

    move-wide/from16 v18, v26

    move/from16 v21, v25

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1;-><init>(Ljava/lang/String;JLG26;I)V

    const v2, -0x47bf665e

    const/4 v3, 0x1

    invoke-static {v14, v2, v3, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    shr-int/lit8 v1, v25, 0x6

    and-int/lit8 v1, v1, 0xe

    const v2, 0x30000030

    or-int/2addr v1, v2

    shl-int/lit8 v2, v25, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int v12, v1, v2

    const/16 v16, 0x118

    move-object v1, v15

    move-object v2, v0

    move/from16 v3, v28

    move-object v4, v13

    move-object/from16 v5, v22

    move-object/from16 v6, v24

    move-object/from16 v7, v23

    move-object/from16 v11, p1

    move/from16 v13, v16

    invoke-static/range {v1 .. v13}, Lk70;->c(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lj70;Lhy5;LeZ;Lh70;LPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method

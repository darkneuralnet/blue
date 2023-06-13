.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
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
        "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,545:1\n154#2:546\n154#2:616\n154#2:617\n154#2:618\n67#3,6:547\n73#3:579\n77#3:615\n75#4:553\n76#4,11:555\n89#4:614\n76#5:554\n460#6,13:566\n50#6:580\n49#6:581\n83#6,3:588\n36#6:597\n36#6:604\n473#6,3:611\n1057#7,6:582\n1057#7,6:591\n1057#7,6:598\n1057#7,6:605\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14\n*L\n248#1:546\n303#1:616\n325#1:617\n330#1:618\n250#1:547,6\n250#1:579\n250#1:615\n250#1:553\n250#1:555,11\n250#1:614\n250#1:554\n250#1:566,13\n254#1:580\n254#1:581\n258#1:588,3\n281#1:597\n289#1:604\n250#1:611,3\n254#1:582,6\n258#1:591,6\n281#1:598,6\n289#1:605,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $$dirty1:I

.field final synthetic $cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

.field final synthetic $expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $itemBeingRemoved$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onAddNewPaymentMethodClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onEditPaymentMethod:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPayAnotherWayClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSetDefault:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $primaryButtonLabel:Ljava/lang/String;

.field final synthetic $setExpanded:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEX2;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "LEX2<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/ui/core/elements/CvcController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$primaryButtonLabel:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty:I

    iput p5, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty1:I

    iput-object p6, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onPayAnotherWayClick:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$setExpanded:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onEditPaymentMethod:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onSetDefault:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$itemBeingRemoved$delegate:LEX2;

    iput-object p13, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onAddNewPaymentMethodClick:Lkotlin/jvm/functions/Function0;

    iput-object p14, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p15, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    const-string v2, "$this$ScrollableTopLevelColumn"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_1

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    move v14, v2

    goto :goto_1

    :cond_1
    move/from16 v14, p3

    :goto_1
    and-int/lit8 v2, v14, 0x5b

    const/16 v5, 0x12

    if-ne v2, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_a

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v5, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous> (WalletScreen.kt:246)"

    const v6, -0x4343300f

    invoke-static {v6, v14, v2, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v5, 0xc

    int-to-float v9, v5

    invoke-static {v9}, Lk61;->g(F)F

    move-result v5

    invoke-static {v2, v5}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v5

    const/4 v13, 0x6

    invoke-static {v5, v15, v13}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v10, 0x0

    const/4 v12, 0x3

    invoke-static {v2, v10, v10, v12, v10}, Lif;->b(LgV2;Ltm1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LgV2;

    move-result-object v2

    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$setExpanded:Lkotlin/jvm/functions/Function1;

    iget v8, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty:I

    iget-object v11, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onEditPaymentMethod:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onSetDefault:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$itemBeingRemoved$delegate:LEX2;

    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onAddNewPaymentMethodClick:Lkotlin/jvm/functions/Function0;

    iget v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty1:I

    const v1, 0x2bb5b5d7

    invoke-interface {v15, v1}, LEt0;->F(I)V

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->n()LK9;

    move-result-object v1

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v1, v14, v15, v14}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v1

    const v14, -0x4ee9b9da

    invoke-interface {v15, v14}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v14

    invoke-interface {v15, v14}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg01;

    move-object/from16 v26, v4

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    move/from16 v27, v9

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v15, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v18, LBt0;->M:LBt0$a;

    invoke-virtual/range {v18 .. v18}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    move/from16 v19, v3

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v3

    instance-of v3, v3, Llm;

    if-nez v3, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v15, v0}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v14, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v9, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v0, v15, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, -0x620f9c09

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded()Z

    move-result v0

    const v1, 0x44faf204

    const/4 v14, 0x1

    if-nez v0, :cond_a

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    const v0, 0x3ece60e3

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result v2

    xor-int/2addr v2, v14

    invoke-interface {v15, v1}, LEt0;->F(I)V

    invoke-interface {v15, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_9

    :cond_8
    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$4$1;

    invoke-direct {v3, v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$4$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v15, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    sget v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    invoke-static {v0, v2, v3, v15, v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->CollapsedPaymentDetails(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    const/16 v23, 0x3

    goto/16 :goto_6

    :cond_a
    :goto_4
    const v0, 0x3ece5b10

    invoke-interface {v15, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, v8, 0x9

    const v2, 0x1e7b2b64

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-interface {v15, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v15, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$1$1;

    invoke-direct {v3, v6, v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v15, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x4

    new-array v4, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v11, v4, v6

    aput-object v13, v4, v14

    const/4 v6, 0x2

    aput-object v10, v4, v6

    const/16 v23, 0x3

    aput-object v12, v4, v23

    const v6, -0x21de6e89

    invoke-interface {v15, v6}, LEt0;->F(I)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_5
    if-ge v6, v2, :cond_d

    aget-object v9, v4, v6

    invoke-interface {v15, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_d
    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v8, :cond_e

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_f

    :cond_e
    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;

    move-object/from16 v16, v2

    move-object/from16 v17, v11

    move/from16 v18, v19

    move-object/from16 v19, v13

    move-object/from16 v20, v10

    move-object/from16 v21, v12

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEX2;)V

    invoke-interface {v15, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v1}, LEt0;->F(I)V

    invoke-interface {v15, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_11

    :cond_10
    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$3$1;

    invoke-direct {v2, v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$3$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v15, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_11
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function0;

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v8, v0, 0x8

    move-object v2, v5

    move-object/from16 v0, v26

    move-object v5, v0

    move-object/from16 v7, p2

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->access$ExpandedPaymentDetails(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_6
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    const v0, -0x1d80c0f8

    invoke-interface {v15, v0}, LEt0;->F(I)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    instance-of v1, v1, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v1, :cond_12

    sget v1, Lcom/stripe/android/link/R$string;->wallet_bank_account_terms:I

    const/4 v13, 0x0

    invoke-static {v1, v15, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->access$replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v1, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-virtual {v1, v15, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->h()J

    move-result-wide v5

    invoke-virtual {v1, v15, v3}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v4

    invoke-virtual {v4}, LGc6;->f()LG26;

    move-result-object v7

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v4, v8, v14, v9}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    const/16 v17, 0x0

    invoke-static/range {v27 .. v27}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v4

    new-instance v9, LGN5;

    move-object/from16 v25, v9

    invoke-virtual {v1, v15, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->j()J

    move-result-wide v26

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x3ffe

    const/16 v45, 0x0

    invoke-direct/range {v25 .. v45}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x30

    const/16 v17, 0x1a4

    move-object v3, v4

    move-object v4, v1

    move/from16 v18, v23

    move-object/from16 v12, p2

    move/from16 v19, v13

    const/4 v1, 0x6

    move/from16 v13, v16

    move v1, v14

    move/from16 v16, v24

    move/from16 v14, v17

    invoke-static/range {v2 .. v14}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    goto :goto_7

    :cond_12
    move v1, v14

    move/from16 v18, v23

    move/from16 v16, v24

    :goto_7
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getErrorMessage()Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v2

    if-eqz v2, :cond_13

    move v2, v1

    goto :goto_8

    :cond_13
    const/4 v2, 0x0

    :goto_8
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$2;

    iget-object v8, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-direct {v7, v8}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;)V

    const v8, 0x35ace8c9

    invoke-static {v15, v8, v1, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const/high16 v8, 0x180000

    and-int/lit8 v9, v16, 0xe

    or-int/2addr v9, v8

    const/16 v10, 0x1e

    move v12, v1

    const/4 v11, 0x6

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedCard()Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-result-object v1

    const v2, -0x1d80bd68

    invoke-interface {v15, v2}, LEt0;->F(I)V

    const/16 v8, 0x10

    if-nez v1, :cond_14

    goto :goto_9

    :cond_14
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    iget v4, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty:I

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getRequiresCardDetailsRecollection()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v5

    sget-object v19, LgV2;->b0:LgV2$a;

    const/16 v20, 0x0

    int-to-float v1, v8

    invoke-static {v1}, Lk61;->g(F)F

    move-result v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xd

    const/16 v25, 0x0

    invoke-static/range {v19 .. v25}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v6

    sget v1, Lcom/stripe/android/ui/core/elements/CvcController;->$stable:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v1, v1, 0xc08

    shr-int/2addr v4, v11

    and-int/lit8 v4, v4, 0x70

    or-int v7, v1, v4

    const/4 v9, 0x0

    move-object v1, v2

    move-object v2, v3

    move v3, v5

    move-object v4, v6

    move-object/from16 v5, p2

    move v6, v7

    move v7, v9

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->CardDetailsRecollectionForm(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLgV2;LEt0;II)V

    :cond_15
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_9
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    sget-object v1, LgV2;->b0:LgV2$a;

    int-to-float v2, v8

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    invoke-static {v1, v15, v11}, LDN5;->a(LgV2;LEt0;I)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$primaryButtonLabel:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v2

    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    const/4 v4, 0x0

    sget v5, Lcom/stripe/android/link/R$drawable;->stripe_ic_lock:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v6, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty:I

    shr-int/lit8 v6, v6, 0x3

    and-int/lit8 v6, v6, 0xe

    iget v7, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty1:I

    shl-int/2addr v7, v11

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v7, v6

    const/16 v8, 0x8

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;LEt0;II)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$uiState:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result v1

    xor-int/2addr v1, v12

    sget v2, Lcom/stripe/android/link/R$string;->wallet_pay_another_way:I

    const/4 v3, 0x0

    invoke-static {v2, v15, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$onPayAnotherWayClick:Lkotlin/jvm/functions/Function0;

    iget v4, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->$$dirty1:I

    shl-int/lit8 v4, v4, 0x3

    and-int/lit16 v4, v4, 0x380

    invoke-static {v1, v2, v3, v15, v4}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->SecondaryButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static {}, LQt0;->Y()V

    :cond_16
    :goto_a
    return-void
.end method

.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->CardDetailsRecollectionForm(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLgV2;LEt0;II)V
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
        "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,545:1\n74#2,6:546\n80#2:578\n84#2:584\n75#3:552\n76#3,11:554\n89#3:583\n76#4:553\n460#5,13:565\n473#5,3:580\n154#6:579\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1\n*L\n383#1:546,6\n383#1:578\n383#1:584\n383#1:552\n383#1:554,11\n383#1:583\n383#1:553\n383#1:565,13\n383#1:580,3\n389#1:579\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $errorTextResId:I

.field final synthetic $modifier:LgV2;

.field final synthetic $rowElement:Lcom/stripe/android/uicore/elements/RowElement;


# direct methods
.method public constructor <init>(LgV2;IILcom/stripe/android/uicore/elements/RowElement;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$modifier:LgV2;

    iput p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$$dirty:I

    iput p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$errorTextResId:I

    iput-object p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$rowElement:Lcom/stripe/android/uicore/elements/RowElement;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v7, 0x2

    if-ne v2, v7, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.wallet.CardDetailsRecollectionForm.<anonymous> (WalletScreen.kt:381)"

    const v4, -0x3f8ba86

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$modifier:LgV2;

    iget v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$errorTextResId:I

    iget-object v8, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$rowElement:Lcom/stripe/android/uicore/elements/RowElement;

    iget v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;->$$dirty:I

    shr-int/lit8 v3, v3, 0x9

    and-int/lit8 v3, v3, 0xe

    const v4, -0x1cd0f17e

    invoke-interface {v10, v4}, LEt0;->F(I)V

    sget-object v4, Llo;->a:Llo;

    invoke-virtual {v4}, Llo;->g()Llo$l;

    move-result-object v4

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->j()LK9$b;

    move-result-object v5

    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v9, v6, 0xe

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v6, v9

    invoke-static {v4, v5, v10, v6}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v4

    shl-int/lit8 v5, v3, 0x3

    and-int/lit8 v5, v5, 0x70

    const v6, -0x4ee9b9da

    invoke-interface {v10, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v10, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v10, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v10, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    sget-object v12, LBt0;->M:LBt0$a;

    invoke-virtual {v12}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    shl-int/lit8 v5, v5, 0x9

    and-int/lit16 v5, v5, 0x1c00

    const/4 v14, 0x6

    or-int/2addr v5, v14

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v10, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual {v12}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v13, v4, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v9, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v11, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    shr-int/lit8 v6, v5, 0x3

    and-int/lit8 v6, v6, 0x70

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v4, v10, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v10, v1}, LEt0;->F(I)V

    shr-int/lit8 v1, v5, 0x9

    and-int/lit8 v1, v1, 0xe

    const v4, -0x455f09d5

    invoke-interface {v10, v4}, LEt0;->F(I)V

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v7, :cond_6

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto :goto_5

    :cond_6
    :goto_2
    sget-object v1, LQm0;->a:LQm0;

    shr-int/lit8 v1, v3, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v14

    const v3, 0x118853c4

    invoke-interface {v10, v3}, LEt0;->F(I)V

    and-int/lit8 v1, v1, 0x51

    const/16 v9, 0x10

    if-ne v1, v9, :cond_8

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v1, 0x0

    invoke-static {v2, v10, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    sget-object v11, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v12, 0x0

    invoke-static {v11, v2, v3, v12}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v5, 0x30

    const/4 v6, 0x4

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorText(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V

    int-to-float v1, v9

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v11, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    invoke-static {v1, v10, v14}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/uicore/elements/SectionElement;->Companion:Lcom/stripe/android/uicore/elements/SectionElement$Companion;

    invoke-static {v2, v8, v12, v7, v12}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap$default(Lcom/stripe/android/uicore/elements/SectionElement$Companion;Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/RowElement;->getFields()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget v7, Lcom/stripe/android/uicore/elements/SectionElement;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int/lit16 v7, v7, 0x186

    sget v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v8, v8, 0x9

    or-int/2addr v8, v7

    const/16 v9, 0x30

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/SectionElementUIKt;->SectionElementUI-rgidl0k(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    :goto_4
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    :goto_5
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_6
    return-void
.end method

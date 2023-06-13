.class final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->InstitutionalPrePaneContent(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPartnerAuthScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,538:1\n74#2,7:539\n81#2:572\n85#2:580\n75#3:546\n76#3,11:548\n89#3:579\n76#4:547\n76#4:574\n460#5,13:559\n473#5,3:576\n154#6:573\n154#6:575\n*S KotlinDebug\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4\n*L\n406#1:539,7\n406#1:572\n406#1:580\n406#1:546\n406#1:548,11\n406#1:579\n406#1:547\n418#1:574\n406#1:559,13\n406#1:576,3\n414#1:573\n420#1:575\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $content:Lcom/stripe/android/financialconnections/domain/OauthPrepane;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/OauthPrepane;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4;->$content:Lcom/stripe/android/financialconnections/domain/OauthPrepane;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 26

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$FinancialConnectionsButton"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x51

    const/16 v13, 0x10

    if-ne v1, v13, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrePaneContent.<anonymous>.<anonymous> (PartnerAuthScreen.kt:404)"

    const v3, -0xd698ea7

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, LK9;->a:LK9$a;

    invoke-virtual {v0}, LK9$a;->h()LK9$c;

    move-result-object v0

    move-object/from16 v14, p0

    iget-object v12, v14, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4;->$content:Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    const v1, 0x2952b718

    invoke-interface {v15, v1}, LEt0;->F(I)V

    sget-object v11, LgV2;->b0:LgV2$a;

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->f()Llo$d;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {v1, v0, v15, v2}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v0

    const v1, -0x4ee9b9da

    invoke-interface {v15, v1}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v1

    invoke-interface {v15, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJq6;

    sget-object v4, LBt0;->M:LBt0$a;

    invoke-virtual {v4}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static {v11}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v15, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual {v4}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v5, v0, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v1, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v2, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v3, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v15, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget-object v0, Lad5;->a:Lad5;

    const v0, -0x436ee643

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getCta()Lcom/stripe/android/financialconnections/domain/Cta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Cta;->getText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 v24, v11

    move-object/from16 v11, v16

    sget-object v16, Lr06;->b:Lr06$a;

    invoke-virtual/range {v16 .. v16}, Lr06$a;->a()I

    move-result v16

    invoke-static/range {v16 .. v16}, Lr06;->g(I)Lr06;

    move-result-object v16

    move-object/from16 v25, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0xfdfe

    move-object/from16 v20, p2

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-virtual/range {v25 .. v25}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getCta()Lcom/stripe/android/financialconnections/domain/Cta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Cta;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    move-object/from16 v12, p2

    goto :goto_3

    :cond_6
    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    move-object/from16 v2, v24

    invoke-static {v2, v1}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v1

    const/4 v3, 0x6

    move-object/from16 v12, p2

    invoke-static {v1, v12, v3}, LDN5;->a(LgV2;LEt0;I)V

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v1

    invoke-interface {v12, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    const/4 v8, 0x0

    sget v9, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    const v10, 0xc00d80

    or-int/2addr v10, v9

    const/16 v11, 0x170

    move-object/from16 v9, p2

    invoke-static/range {v0 .. v11}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    return-void
.end method

.class final Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentMainContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPD3;",
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
        "SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,558:1\n74#2,6:559\n80#2:591\n74#2,6:596\n80#2:628\n84#2:653\n84#2:658\n75#3:565\n76#3,11:567\n75#3:602\n76#3,11:604\n89#3:652\n89#3:657\n76#4:566\n76#4:603\n460#5,13:578\n460#5,13:615\n36#5:630\n36#5:638\n473#5,3:649\n473#5,3:654\n154#6:592\n154#6:593\n154#6:594\n154#6:595\n154#6:629\n154#6:637\n154#6:645\n154#6:647\n1057#7,6:631\n1057#7,6:639\n1855#8:646\n1856#8:648\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2\n*L\n183#1:559,6\n183#1:591\n186#1:596,6\n186#1:628\n186#1:653\n183#1:658\n183#1:565\n183#1:567,11\n186#1:602\n186#1:604,11\n186#1:652\n183#1:657\n183#1:566\n186#1:603\n183#1:578,13\n186#1:615,13\n206#1:630\n221#1:638\n186#1:649,3\n183#1:654,3\n191#1:592\n192#1:593\n193#1:594\n194#1:595\n203#1:629\n218#1:637\n229#1:645\n232#1:647\n206#1:631,6\n221#1:639,6\n231#1:646\n231#1:648\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $acceptConsent:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $bullets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onClickableTextClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onContinueClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

.field final synthetic $scrollState:LXp5;

.field final synthetic $title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;


# direct methods
.method public constructor <init>(LXp5;Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILcom/stripe/android/financialconnections/ui/TextResource$Text;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXp5;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$scrollState:LXp5;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$acceptConsent:Ldp;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$onContinueClick:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$$dirty:I

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$bullets:Ljava/util/List;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPD3;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 51

    move-object/from16 v0, p0

    move-object/from16 v9, p2

    move/from16 v1, p3

    const-string v2, "it"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v10, 0x10

    if-ne v2, v10, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.consent.ConsentMainContent.<anonymous> (ConsentScreen.kt:181)"

    const v4, 0x4a5a97ea    # 3581434.5f

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v8, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v8, v3, v1, v2}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$scrollState:LXp5;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$acceptConsent:Ldp;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$onContinueClick:Lkotlin/jvm/functions/Function0;

    iget v3, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$$dirty:I

    iget-object v15, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iget-object v14, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;->$bullets:Ljava/util/List;

    const v13, -0x1cd0f17e

    invoke-interface {v9, v13}, LEt0;->F(I)V

    sget-object v18, Llo;->a:Llo;

    invoke-virtual/range {v18 .. v18}, Llo;->g()Llo$l;

    move-result-object v11

    sget-object v19, LK9;->a:LK9$a;

    invoke-virtual/range {v19 .. v19}, LK9$a;->j()LK9$b;

    move-result-object v12

    const/4 v10, 0x0

    invoke-static {v11, v12, v9, v10}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v11

    const v12, -0x4ee9b9da

    invoke-interface {v9, v12}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v12

    invoke-interface {v9, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v13

    invoke-interface {v9, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v9, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    sget-object v20, LBt0;->M:LBt0$a;

    invoke-virtual/range {v20 .. v20}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    move/from16 v21, v3

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v3

    instance-of v3, v3, Llm;

    if-nez v3, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v9, v0}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v11, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v12, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v13, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v10, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v1, v0, v9, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v9, v0}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v9, v1}, LEt0;->F(I)V

    sget-object v10, LQm0;->a:LQm0;

    const v3, -0x39d5bfa0

    invoke-interface {v9, v3}, LEt0;->F(I)V

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/16 v17, 0x2

    const/16 v22, 0x0

    move-object v11, v10

    const v1, -0x4ee9b9da

    move-object v12, v8

    const v0, -0x1cd0f17e

    move-object/from16 v24, v14

    move v14, v3

    move-object v3, v15

    move/from16 v15, v17

    move-object/from16 v16, v22

    invoke-static/range {v11 .. v16}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/16 v17, 0x0

    move-object v12, v2

    invoke-static/range {v11 .. v17}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v11, 0x0

    int-to-float v12, v11

    invoke-static {v12}, Lk61;->g(F)F

    move-result v12

    const/16 v13, 0x18

    int-to-float v13, v13

    invoke-static {v13}, Lk61;->g(F)F

    move-result v14

    invoke-static {v13}, Lk61;->g(F)F

    move-result v15

    invoke-static {v13}, Lk61;->g(F)F

    move-result v1

    invoke-static {v2, v14, v12, v15, v1}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v1

    invoke-interface {v9, v0}, LEt0;->F(I)V

    invoke-virtual/range {v18 .. v18}, Llo;->g()Llo$l;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, LK9$a;->j()LK9$b;

    move-result-object v2

    invoke-static {v0, v2, v9, v11}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v0

    const v2, -0x4ee9b9da

    invoke-interface {v9, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v9, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v11

    invoke-interface {v9, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v9, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    invoke-virtual/range {v20 .. v20}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v9, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v14

    invoke-virtual/range {v20 .. v20}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v14, v0, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v14, v2, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v14, v11, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v14, v12, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v1, v0, v9, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v9, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v9, v0}, LEt0;->F(I)V

    const v0, -0x19fc462a

    invoke-interface {v9, v0}, LEt0;->F(I)V

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getShouldShowMerchantLogos()Z

    move-result v0

    const v1, 0x44faf204

    const/4 v11, 0x6

    if-eqz v0, :cond_9

    const v0, -0x335de065    # -8.4999384E7f

    invoke-interface {v9, v0}, LEt0;->F(I)V

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getMerchantLogos()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, LK9$a;->g()LK9$b;

    move-result-object v2

    invoke-interface {v10, v8, v2}, LPm0;->c(LgV2;LK9$b;)LgV2;

    move-result-object v2

    const/16 v12, 0x40

    const/4 v13, 0x0

    invoke-static {v2, v0, v9, v12, v13}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->access$ConsentLogoHeader(LgV2;Ljava/util/List;LEt0;II)V

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v8, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v0, v9, v11}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface {v9, v1}, LEt0;->F(I)V

    invoke-interface {v9, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_8

    :cond_7
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2$1$1$1$1;

    invoke-direct {v1, v5}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v9, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v2, v1

    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v0, v9, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v25

    const-wide/16 v26, 0x0

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

    sget-object v1, Lr06;->b:Lr06$a;

    invoke-virtual {v1}, Lr06$a;->a()I

    move-result v1

    invoke-static {v1}, Lr06;->g(I)Lr06;

    move-result-object v44

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const v49, 0x3bfff

    const/16 v50, 0x0

    invoke-static/range {v25 .. v50}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v8

    const/4 v12, 0x0

    sget-object v1, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->CLICKABLE:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v0, v9, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v13

    invoke-virtual {v13}, LG26;->L()LGN5;

    move-result-object v25

    invoke-virtual {v0, v9, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v26

    const/16 v44, 0x3ffe

    invoke-static/range {v25 .. v45}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/16 v13, 0x8

    const/16 v14, 0x8

    move-object v1, v3

    move/from16 v15, v21

    move-object v3, v8

    move-object/from16 v16, v4

    move-object v4, v12

    move-object v12, v5

    move-object v5, v0

    move-object v0, v6

    move-object/from16 v6, p2

    move-object/from16 v17, v7

    move v7, v13

    move v8, v14

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_9
    move-object/from16 v16, v4

    move-object v12, v5

    move-object v0, v6

    move-object/from16 v17, v7

    move/from16 v15, v21

    const v2, -0x335ddcd2    # -8.5006704E7f

    invoke-interface {v9, v2}, LEt0;->F(I)V

    const/16 v2, 0x10

    int-to-float v4, v2

    invoke-static {v4}, Lk61;->g(F)F

    move-result v2

    invoke-static {v8, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v9, v11}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface {v9, v1}, LEt0;->F(I)V

    invoke-interface {v9, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_a

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_b

    :cond_a
    new-instance v2, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2$1$1$2$1;

    invoke-direct {v2, v12}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2$1$1$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v9, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_b
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v1, v9, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v4

    const/4 v5, 0x0

    sget-object v6, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->CLICKABLE:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v1, v9, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v7

    invoke-virtual {v7}, LG26;->L()LGN5;

    move-result-object v25

    invoke-virtual {v1, v9, v11}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

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

    invoke-static/range {v25 .. v45}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x8

    const/16 v14, 0x8

    move-object v1, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, p2

    move-object v11, v8

    move v8, v14

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-static {v13}, Lk61;->g(F)F

    move-result v1

    invoke-static {v11, v1}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v9, v2}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_3
    const v1, -0x335dda0b    # -8.5012392E7f

    invoke-interface {v9, v1}, LEt0;->F(I)V

    move-object/from16 v14, v24

    check-cast v14, Ljava/lang/Iterable;

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    sget-object v3, LgV2;->b0:LgV2$a;

    const/16 v4, 0x10

    int-to-float v5, v4

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v3, v5}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const/4 v5, 0x6

    invoke-static {v3, v9, v5}, LDN5;->a(LgV2;LEt0;I)V

    shr-int/lit8 v3, v15, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v2, v12, v9, v3}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->BulletItem(Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;Lkotlin/jvm/functions/Function1;LEt0;I)V

    goto :goto_4

    :cond_c
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    sget-object v23, LgV2;->b0:LgV2$a;

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    const/16 v26, 0x2

    const/16 v27, 0x0

    move-object/from16 v22, v10

    invoke-static/range {v22 .. v27}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v9, v2}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-virtual/range {v17 .. v17}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v2

    and-int/lit16 v1, v15, 0x380

    or-int/lit8 v1, v1, 0x48

    and-int/lit16 v3, v15, 0x1c00

    or-int v6, v1, v3

    move-object v1, v0

    move-object v3, v12

    move-object/from16 v4, v16

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->access$ConsentFooter(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    :goto_5
    return-void
.end method

.class final Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt;
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
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Type.kt\ncom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,95:1\n73#2,7:96\n80#2:129\n84#2:134\n75#3:103\n76#3,11:105\n89#3:133\n76#4:104\n460#5,13:116\n473#5,3:130\n*S KotlinDebug\n*F\n+ 1 Type.kt\ncom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1\n*L\n39#1:96,7\n39#1:129\n39#1:134\n39#1:103\n39#1:105,11\n39#1:133\n39#1:104\n39#1:116,13\n39#1:130,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/ui/theme/ComposableSingletons$TypeKt$lambda-1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 36

    move-object/from16 v15, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$TypeKt.lambda-1.<anonymous> (Type.kt:37)"

    const v3, -0x34d86dde    # -1.0981922E7f

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v0, -0x1cd0f17e

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v15, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v15, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v15, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x264fd914

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const-string v0, "subtitle"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move-object v1, v15

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v19

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x7ffe

    move-object/from16 v20, p1

    move-object/from16 v24, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "subtitleEmphasized"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v24

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitleEmphasized()LG26;

    move-result-object v19

    move-object/from16 v25, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "heading"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getHeading()LG26;

    move-result-object v19

    move-object/from16 v26, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "subheading"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubheading()LG26;

    move-result-object v19

    move-object/from16 v27, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "KICKER"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v27

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getKicker()LG26;

    move-result-object v19

    move-object/from16 v28, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "body"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v28

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v19

    move-object/from16 v29, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "bodyEmphasized"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v29

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBodyEmphasized()LG26;

    move-result-object v19

    move-object/from16 v30, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "detail"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v30

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetail()LG26;

    move-result-object v19

    move-object/from16 v31, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "detailEmphasized"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v31

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetailEmphasized()LG26;

    move-result-object v19

    move-object/from16 v32, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "caption"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v32

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaption()LG26;

    move-result-object v19

    move-object/from16 v33, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "captionEmphasized"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v33

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionEmphasized()LG26;

    move-result-object v19

    move-object/from16 v34, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "captionTight"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v34

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionTight()LG26;

    move-result-object v19

    move-object/from16 v35, v2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const-string v0, "captionTightEmphasized"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, v35

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionTightEmphasized()LG26;

    move-result-object v19

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

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

.class public final LSE0$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSE0;->a(LF96;LgV2;Ltm1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;LEt0;II)V
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
        "SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n936#2,4:148\n857#2,5:152\n36#3:157\n460#3,13:183\n473#3,3:197\n1057#4,6:158\n67#5,6:164\n73#5:196\n77#5:201\n75#6:170\n76#6,11:172\n89#6:200\n76#7:171\n76#8:202\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n129#1:148,4\n129#1:152,5\n132#1:157\n132#1:183,13\n132#1:197,3\n132#1:158,6\n132#1:164,6\n132#1:196\n132#1:201\n132#1:170\n132#1:172,11\n132#1:200\n132#1:171\n129#1:202\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic h:I

.field public final synthetic i:Ltm1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltm1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic k:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "TT;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LF96;ILtm1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "TT;>;I",
            "Ltm1<",
            "Ljava/lang/Float;",
            ">;TT;",
            "Lkotlin/jvm/functions/Function3<",
            "-TT;-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LSE0$d;->g:LF96;

    iput p2, p0, LSE0$d;->h:I

    iput-object p3, p0, LSE0$d;->i:Ltm1;

    iput-object p4, p0, LSE0$d;->j:Ljava/lang/Object;

    iput-object p5, p0, LSE0$d;->k:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LsP5;)F
    .locals 0

    invoke-static {p0}, LSE0$d;->b(LsP5;)F

    move-result p0

    return p0
.end method

.method public static final b(LsP5;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LSE0$d;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v9, p1

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

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_2

    const v2, -0x55057628

    const-string v4, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LSE0$d;->g:LF96;

    new-instance v2, LSE0$d$b;

    iget-object v4, v0, LSE0$d;->i:Ltm1;

    invoke-direct {v2, v4}, LSE0$d$b;-><init>(Ltm1;)V

    iget-object v4, v0, LSE0$d;->j:Ljava/lang/Object;

    iget v5, v0, LSE0$d;->h:I

    and-int/lit8 v5, v5, 0xe

    const v6, -0x4fcbfb15

    invoke-interface {v9, v6}, LEt0;->F(I)V

    const-string v6, "FloatAnimation"

    sget-object v7, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v7}, LXj6;->i(Lkotlin/jvm/internal/FloatCompanionObject;)Lwb6;

    move-result-object v7

    and-int/lit8 v8, v5, 0xe

    shl-int/lit8 v5, v5, 0x3

    and-int/lit16 v10, v5, 0x380

    or-int/2addr v8, v10

    and-int/lit16 v10, v5, 0x1c00

    or-int/2addr v8, v10

    const v10, 0xe000

    and-int/2addr v5, v10

    or-int/2addr v5, v8

    const v8, -0x880d1ef

    invoke-interface {v9, v8}, LEt0;->F(I)V

    invoke-virtual {v1}, LF96;->g()Ljava/lang/Object;

    move-result-object v8

    shr-int/lit8 v11, v5, 0x9

    and-int/lit8 v11, v11, 0x70

    const v12, -0x1a25b2ec

    invoke-interface {v9, v12}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v13

    const-string v14, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)"

    if-eqz v13, :cond_3

    invoke-static {v12, v11, v3, v14}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_3
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const/4 v15, 0x0

    if-eqz v8, :cond_4

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_4
    move v8, v15

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v1}, LF96;->m()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v9, v12}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-static {v12, v11, v3, v14}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_7
    move v13, v15

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1}, LF96;->k()LF96$b;

    move-result-object v4

    shr-int/lit8 v11, v5, 0x3

    and-int/lit8 v11, v11, 0x70

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v4, v9, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ltm1;

    and-int/lit8 v2, v5, 0xe

    shl-int/lit8 v11, v5, 0x9

    and-int/2addr v10, v11

    or-int/2addr v2, v10

    shl-int/lit8 v5, v5, 0x6

    const/high16 v10, 0x70000

    and-int/2addr v5, v10

    or-int v10, v2, v5

    move-object v2, v8

    move-object v5, v7

    move-object/from16 v7, p1

    move v8, v10

    invoke-static/range {v1 .. v8}, LJ96;->c(LF96;Ljava/lang/Object;Ljava/lang/Object;Ltm1;Lwb6;Ljava/lang/String;LEt0;I)LsP5;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    sget-object v2, LgV2;->b0:LgV2$a;

    const v3, 0x44faf204

    invoke-interface {v9, v3}, LEt0;->F(I)V

    invoke-interface {v9, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, LSE0$d$a;

    invoke-direct {v4, v1}, LSE0$d$a;-><init>(LsP5;)V

    invoke-interface {v9, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v1

    iget-object v2, v0, LSE0$d;->k:Lkotlin/jvm/functions/Function3;

    iget-object v3, v0, LSE0$d;->j:Ljava/lang/Object;

    iget v4, v0, LSE0$d;->h:I

    const v5, 0x2bb5b5d7

    invoke-interface {v9, v5}, LEt0;->F(I)V

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->n()LK9;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6, v9, v6}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v7, -0x4ee9b9da

    invoke-interface {v9, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v9, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v9, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v9, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    sget-object v11, LBt0;->M:LBt0$a;

    invoke-virtual {v11}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_b

    invoke-static {}, Lyt0;->c()V

    :cond_b
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-interface {v9, v12}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_c
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual {v11}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v12, v5, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v11}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v12, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v11}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v12, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v11}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v12, v10, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v5, v9, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v9, v1}, LEt0;->F(I)V

    const v1, -0x7f65a980

    invoke-interface {v9, v1}, LEt0;->F(I)V

    sget-object v1, Lf10;->a:Lf10;

    shr-int/lit8 v1, v4, 0x9

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v3, v9, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    :goto_4
    return-void
.end method

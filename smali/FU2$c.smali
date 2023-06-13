.class public final LFU2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V
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
        "SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,684:1\n67#2,6:685\n73#2:717\n77#2:722\n75#3:691\n76#3,11:693\n89#3:721\n76#4:692\n460#5,13:704\n473#5,3:718\n50#5:723\n49#5:724\n1114#6,6:725\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1\n*L\n456#1:685,6\n456#1:717\n456#1:722\n456#1:691\n456#1:693,11\n456#1:721\n456#1:692\n456#1:704,13\n456#1:718,3\n474#1:723\n474#1:724\n474#1:725,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LGU2;

.field public final synthetic h:LEy3;

.field public final synthetic i:Leb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb<",
            "LHU2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Lhy5;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:F

.field public final synthetic n:I

.field public final synthetic o:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:J

.field public final synthetic q:LZC0;

.field public final synthetic r:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LGU2;LEy3;Leb;Lhy5;JJFILkotlin/jvm/functions/Function2;JLZC0;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGU2;",
            "LEy3;",
            "Leb<",
            "LHU2;",
            ">;",
            "Lhy5;",
            "JJFI",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;J",
            "LZC0;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LFU2$c;->g:LGU2;

    iput-object p2, p0, LFU2$c;->h:LEy3;

    iput-object p3, p0, LFU2$c;->i:Leb;

    iput-object p4, p0, LFU2$c;->j:Lhy5;

    iput-wide p5, p0, LFU2$c;->k:J

    iput-wide p7, p0, LFU2$c;->l:J

    iput p9, p0, LFU2$c;->m:F

    iput p10, p0, LFU2$c;->n:I

    iput-object p11, p0, LFU2$c;->o:Lkotlin/jvm/functions/Function2;

    iput-wide p12, p0, LFU2$c;->p:J

    iput-object p14, p0, LFU2$c;->q:LZC0;

    iput-object p15, p0, LFU2$c;->r:Lkotlin/jvm/functions/Function3;

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

    invoke-virtual {p0, p1, p2, p3}, LFU2$c;->invoke(Lh10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lh10;LEt0;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v2, p3

    const-string v3, "$this$BoxWithConstraints"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    if-nez v3, :cond_1

    invoke-interface {v10, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    move-object v13, v0

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)"

    const v5, 0x5fce4f96

    invoke-static {v5, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lh10;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkz0;->m(J)I

    move-result v2

    int-to-float v9, v2

    sget-object v11, LgV2;->b0:LgV2$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v11, v12, v13, v14}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    iget-object v3, v0, LFU2$c;->o:Lkotlin/jvm/functions/Function2;

    iget v4, v0, LFU2$c;->n:I

    iget-wide v5, v0, LFU2$c;->p:J

    iget-object v7, v0, LFU2$c;->g:LGU2;

    iget-object v15, v0, LFU2$c;->q:LZC0;

    const v8, 0x2bb5b5d7

    invoke-interface {v10, v8}, LEt0;->F(I)V

    sget-object v8, LK9;->a:LK9$a;

    invoke-virtual {v8}, LK9$a;->n()LK9;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v12, v13, v10, v13}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v12

    const v14, -0x4ee9b9da

    invoke-interface {v10, v14}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v14

    invoke-interface {v10, v14}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v13

    invoke-interface {v10, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpm2;

    move/from16 v16, v9

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v10, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v1

    instance-of v1, v1, Llm;

    if-nez v1, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v10, v0}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v12, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v14, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v13, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v9, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v0, v10, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v10, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    shr-int/lit8 v0, v4, 0x18

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v10, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LFU2$c$a;

    invoke-direct {v0, v7, v15}, LFU2$c$a;-><init>(LGU2;LZC0;)V

    invoke-virtual {v7}, LGU2;->g()LtX5;

    move-result-object v1

    invoke-virtual {v1}, LtX5;->t()Ljava/lang/Object;

    move-result-object v1

    sget-object v9, LHU2;->b:LHU2;

    if-eq v1, v9, :cond_7

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    :goto_4
    shr-int/lit8 v2, v4, 0x15

    and-int/lit8 v7, v2, 0xe

    move-wide v2, v5

    move-object v4, v0

    move v5, v1

    move-object/from16 v6, p2

    invoke-static/range {v2 .. v7}, LFU2;->i(JLkotlin/jvm/functions/Function0;ZLEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-virtual {v8}, LK9$a;->l()LK9;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v11, v0}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object v0

    invoke-static {}, LFU2;->k()F

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v1, v4, v3}, LBB5;->C(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v0

    invoke-static {v0, v2, v4, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    move-object/from16 v13, p0

    iget-object v1, v13, LFU2$c;->g:LGU2;

    invoke-virtual {v1}, LGU2;->g()LtX5;

    move-result-object v1

    iget-object v2, v13, LFU2$c;->h:LEy3;

    iget-object v3, v13, LFU2$c;->g:LGU2;

    const v4, 0x1e7b2b64

    invoke-interface {v10, v4}, LEt0;->F(I)V

    invoke-interface {v10, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v10, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_8

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_9

    :cond_8
    invoke-virtual {v3}, LGU2;->g()LtX5;

    move-result-object v1

    invoke-static {v1, v2}, LFU2;->g(LtX5;LEy3;)LB43;

    move-result-object v4

    invoke-interface {v10, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v4, LB43;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v4, v2, v1, v2}, LE43;->b(LgV2;LB43;LC43;ILjava/lang/Object;)LgV2;

    move-result-object v0

    new-instance v1, LFU2$c$b;

    iget-object v2, v13, LFU2$c;->g:LGU2;

    invoke-direct {v1, v2}, LFU2$c$b;-><init>(LGU2;)V

    invoke-static {v0, v1}, LFe3;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v17

    iget-object v0, v13, LFU2$c;->g:LGU2;

    invoke-virtual {v0}, LGU2;->g()LtX5;

    move-result-object v18

    iget-object v0, v13, LFU2$c;->h:LEy3;

    iget-object v1, v13, LFU2$c;->g:LGU2;

    invoke-virtual {v1}, LGU2;->g()LtX5;

    move-result-object v1

    invoke-virtual {v1}, LtX5;->n()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v9, :cond_a

    const/16 v20, 0x1

    goto :goto_5

    :cond_a
    const/16 v20, 0x0

    :goto_5
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x18

    const/16 v24, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v17 .. v24}, LsX5;->k(LgV2;LtX5;LEy3;ZZLrX2;ILjava/lang/Object;)LgV2;

    move-result-object v0

    iget-object v1, v13, LFU2$c;->g:LGU2;

    invoke-virtual {v1}, LGU2;->g()LtX5;

    move-result-object v1

    const/4 v2, 0x3

    new-array v3, v2, [LHU2;

    const/4 v4, 0x0

    aput-object v9, v3, v4

    sget-object v4, LHU2;->d:LHU2;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    sget-object v4, LHU2;->c:LHU2;

    const/4 v5, 0x2

    aput-object v4, v3, v5

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    iget-object v4, v13, LFU2$c;->i:Leb;

    new-instance v5, LFU2$c$c;

    iget-object v6, v13, LFU2$c;->g:LGU2;

    move/from16 v7, v16

    invoke-direct {v5, v7, v6}, LFU2$c$c;-><init>(FLGU2;)V

    invoke-static {v0, v1, v3, v4, v5}, LsX5;->h(LgV2;LtX5;Ljava/util/Set;Leb;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object v0

    new-instance v1, LFU2$c$d;

    iget-object v3, v13, LFU2$c;->g:LGU2;

    iget-object v4, v13, LFU2$c;->q:LZC0;

    invoke-direct {v1, v3, v4}, LFU2$c$d;-><init>(LGU2;LZC0;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v4, v1, v5, v3}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v0, v13, LFU2$c;->j:Lhy5;

    iget-wide v3, v13, LFU2$c;->k:J

    iget-wide v6, v13, LFU2$c;->l:J

    const/4 v8, 0x0

    iget v9, v13, LFU2$c;->m:F

    new-instance v11, LFU2$c$e;

    iget-object v12, v13, LFU2$c;->r:Lkotlin/jvm/functions/Function3;

    iget v14, v13, LFU2$c;->n:I

    invoke-direct {v11, v12, v14}, LFU2$c$e;-><init>(Lkotlin/jvm/functions/Function3;I)V

    const v12, -0x6ae6c426

    invoke-static {v10, v12, v5, v11}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v11

    iget v5, v13, LFU2$c;->n:I

    shr-int/lit8 v12, v5, 0x6

    and-int/lit8 v12, v12, 0x70

    const/high16 v14, 0x180000

    or-int/2addr v12, v14

    shr-int/lit8 v14, v5, 0x9

    and-int/lit16 v14, v14, 0x380

    or-int/2addr v12, v14

    shr-int/lit8 v14, v5, 0x9

    and-int/lit16 v14, v14, 0x1c00

    or-int/2addr v12, v14

    const/high16 v14, 0x70000

    shl-int/lit8 v2, v5, 0x3

    and-int/2addr v2, v14

    or-int/2addr v12, v2

    const/16 v14, 0x10

    move-object v2, v0

    move-wide v5, v6

    move-object v7, v8

    move v8, v9

    move-object v9, v11

    move-object/from16 v10, p2

    move v11, v12

    move v12, v14

    invoke-static/range {v1 .. v12}, LNV5;->a(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_6
    return-void
.end method

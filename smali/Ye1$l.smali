.class public final LYe1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe1;->y(LgV2;LF96;LsP5;LsP5;Ljava/lang/String;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "a",
        "(LgV2;LEt0;I)LgV2;"
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
        "SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n25#2:1188\n25#2:1195\n36#2:1202\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n1057#3,6:1203\n76#4:1209\n102#4,2:1210\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n*L\n1038#1:1181\n1061#1:1188\n1066#1:1195\n1070#1:1202\n1038#1:1182,6\n1061#1:1189,6\n1066#1:1196,6\n1070#1:1203,6\n1038#1:1209\n1038#1:1210,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "LXe1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LEh0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LEh0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(LF96;LsP5;LsP5;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "LXe1;",
            ">;",
            "LsP5<",
            "LEh0;",
            ">;",
            "LsP5<",
            "LEh0;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LYe1$l;->g:LF96;

    iput-object p2, p0, LYe1$l;->h:LsP5;

    iput-object p3, p0, LYe1$l;->i:LsP5;

    iput-object p4, p0, LYe1$l;->j:Ljava/lang/String;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final invoke$lambda$1(LEX2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final invoke$lambda$2(LEX2;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    const-string v2, "$this$composed"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x861e7e5

    invoke-interface {v8, v2}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1033)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object v2, v0, LYe1$l;->g:LF96;

    const v9, 0x44faf204

    invoke-interface {v8, v9}, LEt0;->F(I)V

    invoke-interface {v8, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    const/4 v10, 0x0

    if-nez v2, :cond_1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x2

    invoke-static {v2, v10, v3, v10}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v3

    invoke-interface {v8, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, LEX2;

    iget-object v2, v0, LYe1$l;->g:LF96;

    invoke-virtual {v2}, LF96;->g()Ljava/lang/Object;

    move-result-object v2

    iget-object v4, v0, LYe1$l;->g:LF96;

    invoke-virtual {v4}, LF96;->m()Ljava/lang/Object;

    move-result-object v4

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-ne v2, v4, :cond_3

    iget-object v2, v0, LYe1$l;->g:LF96;

    invoke-virtual {v2}, LF96;->q()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v3, v12}, LYe1$l;->invoke$lambda$2(LEX2;Z)V

    goto :goto_0

    :cond_3
    iget-object v2, v0, LYe1$l;->h:LsP5;

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, v0, LYe1$l;->i:LsP5;

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-static {v3, v11}, LYe1$l;->invoke$lambda$2(LEX2;Z)V

    :cond_5
    :goto_0
    invoke-static {v3}, LYe1$l;->invoke$lambda$1(LEX2;)Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, v0, LYe1$l;->g:LF96;

    invoke-virtual {v2}, LF96;->k()LF96$b;

    move-result-object v2

    sget-object v3, LXe1;->b:LXe1;

    sget-object v4, LXe1;->c:LXe1;

    invoke-interface {v2, v3, v4}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, LYe1$l;->h:LsP5;

    iget-object v4, v0, LYe1$l;->i:LsP5;

    if-eqz v2, :cond_7

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEh0;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, LEh0;->a()LK9;

    move-result-object v2

    if-nez v2, :cond_a

    :cond_6
    invoke-interface {v4}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEh0;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LEh0;->a()LK9;

    move-result-object v2

    goto :goto_1

    :cond_7
    invoke-interface {v4}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEh0;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LEh0;->a()LK9;

    move-result-object v2

    if-nez v2, :cond_a

    :cond_8
    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEh0;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LEh0;->a()LK9;

    move-result-object v2

    goto :goto_1

    :cond_9
    move-object v2, v10

    :cond_a
    :goto_1
    invoke-static {v2, v8, v12}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v19

    iget-object v2, v0, LYe1$l;->g:LF96;

    sget-object v3, LG52;->b:LG52$a;

    invoke-static {v3}, LXj6;->e(LG52$a;)Lwb6;

    move-result-object v3

    iget-object v4, v0, LYe1$l;->j:Ljava/lang/String;

    const v13, -0x1d58f75c

    invoke-interface {v8, v13}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    sget-object v14, LEt0;->a:LEt0$a;

    invoke-virtual {v14}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_b

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " shrink/expand"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v8, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_b
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v4, v5

    check-cast v4, Ljava/lang/String;

    const/16 v6, 0x1c0

    const/4 v7, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v2 .. v7}, LJ96;->b(LF96;Lwb6;Ljava/lang/String;LEt0;II)LF96$a;

    move-result-object v15

    iget-object v2, v0, LYe1$l;->g:LF96;

    invoke-virtual {v2}, LF96;->g()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, LYe1$l;->g:LF96;

    invoke-virtual {v3}, LF96;->m()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_c

    move v2, v11

    goto :goto_2

    :cond_c
    move v2, v12

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const v3, -0x5c9428b8

    invoke-interface {v8, v3, v2}, LEt0;->K(ILjava/lang/Object;)V

    iget-object v2, v0, LYe1$l;->g:LF96;

    sget-object v3, LA52;->b:LA52$a;

    invoke-static {v3}, LXj6;->d(LA52$a;)Lwb6;

    move-result-object v3

    iget-object v4, v0, LYe1$l;->j:Ljava/lang/String;

    invoke-interface {v8, v13}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v14}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_d

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " InterruptionHandlingOffset"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v8, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_d
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v4, v5

    check-cast v4, Ljava/lang/String;

    const/16 v6, 0x1c0

    const/4 v7, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v2 .. v7}, LJ96;->b(LF96;Lwb6;Ljava/lang/String;LEt0;II)LF96$a;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->P()V

    iget-object v3, v0, LYe1$l;->g:LF96;

    iget-object v4, v0, LYe1$l;->h:LsP5;

    iget-object v5, v0, LYe1$l;->i:LsP5;

    invoke-interface {v8, v9}, LEt0;->F(I)V

    invoke-interface {v8, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_e

    invoke-virtual {v14}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_f

    :cond_e
    new-instance v6, Lji1;

    move-object v13, v6

    move-object v14, v15

    move-object v15, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v19

    invoke-direct/range {v13 .. v18}, Lji1;-><init>(LF96$a;LF96$a;LsP5;LsP5;LsP5;)V

    invoke-interface {v8, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v6, Lji1;

    iget-object v2, v0, LYe1$l;->g:LF96;

    invoke-virtual {v2}, LF96;->g()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, LYe1$l;->g:LF96;

    invoke-virtual {v3}, LF96;->m()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_10

    invoke-virtual {v6, v10}, Lji1;->h(LK9;)V

    goto :goto_3

    :cond_10
    invoke-virtual {v6}, Lji1;->a()LK9;

    move-result-object v2

    if-nez v2, :cond_12

    invoke-interface/range {v19 .. v19}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK9;

    if-nez v2, :cond_11

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->n()LK9;

    move-result-object v2

    :cond_11
    invoke-virtual {v6, v2}, Lji1;->h(LK9;)V

    :cond_12
    :goto_3
    iget-object v2, v0, LYe1$l;->h:LsP5;

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEh0;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, LEh0;->c()Z

    move-result v2

    if-nez v2, :cond_13

    move v2, v11

    goto :goto_4

    :cond_13
    move v2, v12

    :goto_4
    if-nez v2, :cond_16

    iget-object v2, v0, LYe1$l;->i:LsP5;

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEh0;

    if-eqz v2, :cond_14

    invoke-virtual {v2}, LEh0;->c()Z

    move-result v2

    if-nez v2, :cond_14

    move v2, v11

    goto :goto_5

    :cond_14
    move v2, v12

    :goto_5
    if-eqz v2, :cond_15

    goto :goto_6

    :cond_15
    move v11, v12

    :cond_16
    :goto_6
    sget-object v2, LgV2;->b0:LgV2$a;

    if-eqz v11, :cond_17

    goto :goto_7

    :cond_17
    invoke-static {v2}, LQk0;->b(LgV2;)LgV2;

    move-result-object v2

    :goto_7
    invoke-interface {v1, v2}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v1

    invoke-interface {v1, v6}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v1

    :cond_18
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-static {}, LQt0;->Y()V

    :cond_19
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LYe1$l;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method

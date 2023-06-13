.class public final Law1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1;->b(LgV2;ZLrX2;)LgV2;
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
        "e",
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
        "SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n474#2,4:228\n478#2,2:236\n482#2:242\n25#3:232\n25#3:243\n25#3:250\n25#3:257\n25#3:264\n50#3:271\n49#3:272\n25#3:279\n25#3:287\n67#3,3:294\n66#3:297\n50#3:304\n49#3:305\n1114#4,3:233\n1117#4,3:239\n1114#4,6:244\n1114#4,6:251\n1114#4,6:258\n1114#4,6:265\n1114#4,6:273\n1114#4,6:280\n1114#4,6:288\n1114#4,6:298\n1114#4,6:306\n474#5:238\n76#6:286\n76#7:312\n102#7,2:313\n76#7:315\n102#7,2:316\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2\n*L\n69#1:228,4\n69#1:236,2\n69#1:242\n69#1:232\n70#1:243\n71#1:250\n72#1:257\n84#1:264\n85#1:271\n85#1:272\n109#1:279\n118#1:287\n119#1:294,3\n119#1:297\n130#1:304\n130#1:305\n69#1:233,3\n69#1:239,3\n70#1:244,6\n71#1:251,6\n72#1:258,6\n84#1:265,6\n85#1:273,6\n109#1:280,6\n118#1:288,6\n119#1:298,6\n130#1:306,6\n69#1:238\n117#1:286\n71#1:312\n71#1:313,2\n118#1:315\n118#1:316,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LrX2;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LrX2;Z)V
    .locals 0

    iput-object p1, p0, Law1$c;->g:LrX2;

    iput-boolean p2, p0, Law1$c;->h:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LEX2;LRT3$a;)V
    .locals 0

    invoke-static {p0, p1}, Law1$c;->f(LEX2;LRT3$a;)V

    return-void
.end method

.method public static final synthetic b(LEX2;)Z
    .locals 0

    invoke-static {p0}, Law1$c;->g(LEX2;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(LEX2;Z)V
    .locals 0

    invoke-static {p0, p1}, Law1$c;->h(LEX2;Z)V

    return-void
.end method

.method public static final synthetic d(LEX2;)LRT3$a;
    .locals 0

    invoke-static {p0}, Law1$c;->i(LEX2;)LRT3$a;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LEX2;LRT3$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LRT3$a;",
            ">;",
            "LRT3$a;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(LEX2;)Z
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

.method public static final h(LEX2;Z)V
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

.method public static final i(LEX2;)LRT3$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LRT3$a;",
            ">;)",
            "LRT3$a;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LRT3$a;

    return-object p0
.end method


# virtual methods
.method public final e(LgV2;LEt0;I)LgV2;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "$this$composed"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x6f8a9229

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.focusable.<anonymous> (Focusable.kt:67)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const v2, 0x2e20b340

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const v2, -0x1d58f75c

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    sget-object v3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v3, v1}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v3

    new-instance v5, Liu0;

    invoke-direct {v5, v3}, Liu0;-><init>(LZC0;)V

    invoke-interface {v1, v5}, LEt0;->z(Ljava/lang/Object;)V

    move-object v3, v5

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, Liu0;

    invoke-virtual {v3}, Liu0;->a()LZC0;

    move-result-object v7

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v8, 0x0

    if-ne v3, v5, :cond_2

    invoke-static {v8, v8, v6, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v10, v3

    check-cast v10, LEX2;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_3

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v8, v6, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, LEX2;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_4

    new-instance v5, Landroidx/compose/ui/focus/h;

    invoke-direct {v5}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v1, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v5, Landroidx/compose/ui/focus/h;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v9, v11, :cond_5

    invoke-static {}, LG20;->a()LE20;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v12, v9

    check-cast v12, LE20;

    iget-object v9, v0, Law1$c;->g:LrX2;

    const v11, 0x1e7b2b64

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-interface {v1, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v13

    invoke-interface {v1, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_6

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v14, v13, :cond_7

    :cond_6
    new-instance v14, Law1$c$a;

    invoke-direct {v14, v10, v9}, Law1$c$a;-><init>(LEX2;LrX2;)V

    invoke-interface {v1, v14}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-static {v9, v14, v1, v13}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    iget-boolean v9, v0, Law1$c;->h:Z

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v14, Law1$c$b;

    iget-boolean v15, v0, Law1$c;->h:Z

    iget-object v11, v0, Law1$c;->g:LrX2;

    invoke-direct {v14, v15, v7, v10, v11}, Law1$c$b;-><init>(ZLZC0;LEX2;LrX2;)V

    invoke-static {v9, v14, v1, v13}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    iget-boolean v9, v0, Law1$c;->h:Z

    if-eqz v9, :cond_f

    const v9, 0x53e55dc1

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-static {v3}, Law1$c;->g(LEX2;)Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v9, v11, :cond_8

    new-instance v9, Lcw1;

    invoke-direct {v9}, Lcw1;-><init>()V

    invoke-interface {v1, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v9, LgV2;

    goto :goto_0

    :cond_9
    sget-object v9, LgV2;->b0:LgV2$a;

    :goto_0
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LST3;->a()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LRT3;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v2, v14, :cond_a

    invoke-static {v8, v8, v6, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v2

    invoke-interface {v1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v2, LEX2;

    const v6, 0x607fb4c4

    invoke-interface {v1, v6}, LEt0;->F(I)V

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v6, v14

    invoke-interface {v1, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v6, v14

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v14

    if-nez v6, :cond_b

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v14, v6, :cond_c

    :cond_b
    new-instance v14, Law1$c$c;

    invoke-direct {v14, v11, v3, v2}, Law1$c$c;-><init>(LRT3;LEX2;LEX2;)V

    invoke-interface {v1, v14}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v14, v1, v13}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    sget-object v6, LgV2;->b0:LgV2$a;

    const v14, 0x1e7b2b64

    invoke-interface {v1, v14}, LEt0;->F(I)V

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v14, v15

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_d

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v15, v4, :cond_e

    :cond_d
    new-instance v15, Law1$c$d;

    invoke-direct {v15, v3, v5}, Law1$c$d;-><init>(LEX2;Landroidx/compose/ui/focus/h;)V

    invoke-interface {v1, v15}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x1

    invoke-static {v6, v13, v15, v4, v8}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v4

    invoke-static {v4, v12}, LG20;->b(LgV2;LE20;)LgV2;

    move-result-object v4

    invoke-static {v4, v5}, Landroidx/compose/ui/focus/i;->a(LgV2;Landroidx/compose/ui/focus/h;)LgV2;

    move-result-object v4

    invoke-interface {v4, v9}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v4

    new-instance v13, Law1$c$e;

    iget-object v14, v0, Law1$c;->g:LrX2;

    move-object v5, v13

    move-object v6, v11

    move-object v8, v3

    move-object v9, v2

    move-object v11, v14

    invoke-direct/range {v5 .. v12}, Law1$c$e;-><init>(LRT3;LZC0;LEX2;LEX2;LEX2;LrX2;LE20;)V

    invoke-static {v4, v13}, Landroidx/compose/ui/focus/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/ui/focus/d;->a(LgV2;)LgV2;

    move-result-object v2

    goto :goto_1

    :cond_f
    sget-object v2, LgV2;->b0:LgV2$a;

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Law1$c;->e(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method

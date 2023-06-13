.class public final Lak0$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0;->b(LgV2;LrX2;Ly12;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;)LgV2;
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
        "SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,565:1\n25#2:566\n25#2:573\n25#2:580\n50#2:587\n49#2:588\n25#2:595\n83#2,3:602\n25#2:611\n25#2:622\n1114#3,6:567\n1114#3,6:574\n1114#3,6:581\n1114#3,6:589\n1114#3,6:596\n1114#3,6:605\n1114#3,6:612\n1114#3,3:623\n1117#3,3:629\n474#4,4:618\n478#4,2:626\n482#4:632\n474#5:628\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n*L\n138#1:566\n139#1:573\n148#1:580\n149#1:587\n149#1:588\n152#1:595\n154#1:602,3\n172#1:611\n187#1:622\n138#1:567,6\n139#1:574,6\n148#1:581,6\n149#1:589,6\n152#1:596,6\n154#1:605,6\n172#1:612,6\n187#1:623,3\n187#1:629,3\n187#1:618,4\n187#1:626,2\n187#1:632\n187#1:628\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Z

.field public final synthetic i:LrX2;

.field public final synthetic j:Ly12;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:LCb5;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;ZLrX2;Ly12;Ljava/lang/String;LCb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "LrX2;",
            "Ly12;",
            "Ljava/lang/String;",
            "LCb5;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lak0$d;->g:Lkotlin/jvm/functions/Function0;

    iput-boolean p2, p0, Lak0$d;->h:Z

    iput-object p3, p0, Lak0$d;->i:LrX2;

    iput-object p4, p0, Lak0$d;->j:Ly12;

    iput-object p5, p0, Lak0$d;->k:Ljava/lang/String;

    iput-object p6, p0, Lak0$d;->l:LCb5;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "$this$composed"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x57cf7f4

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object v2, v0, Lak0$d;->g:Lkotlin/jvm/functions/Function0;

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v10

    const v2, -0x1d58f75c

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-ne v4, v6, :cond_1

    invoke-static {v8, v8, v7, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v4

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v9, v4

    check-cast v9, LEX2;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_2

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v15, v4

    check-cast v15, Ljava/util/Map;

    const v4, 0x6dca6879

    invoke-interface {v1, v4}, LEt0;->F(I)V

    iget-boolean v4, v0, Lak0$d;->h:Z

    if-eqz v4, :cond_3

    iget-object v4, v0, Lak0$d;->i:LrX2;

    const/16 v6, 0x230

    invoke-static {v4, v9, v15, v1, v6}, Lak0;->a(LrX2;LEX2;Ljava/util/Map;LEt0;I)V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {v1, v3}, Ldk0;->d(LEt0;I)Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v6, v11, :cond_4

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v8, v7, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v6

    invoke-interface {v1, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v12, v6

    check-cast v12, LEX2;

    const v6, 0x1e7b2b64

    invoke-interface {v1, v6}, LEt0;->F(I)V

    invoke-interface {v1, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_5

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v11, v6, :cond_6

    :cond_5
    new-instance v11, Lak0$d$b;

    invoke-direct {v11, v12, v4}, Lak0$d$b;-><init>(LEX2;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v1, v11}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {v11, v1, v3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v11

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_7

    sget-object v4, LCe3;->b:LCe3$a;

    invoke-virtual {v4}, LCe3$a;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, LCe3;->d(J)LCe3;

    move-result-object v4

    invoke-static {v4, v8, v7, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v4

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object/from16 v17, v4

    check-cast v17, LEX2;

    sget-object v13, LgV2;->b0:LgV2$a;

    iget-object v14, v0, Lak0$d;->i:LrX2;

    iget-boolean v4, v0, Lak0$d;->h:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const/4 v4, 0x6

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v17, v5, v3

    iget-boolean v6, v0, Lak0$d;->h:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v16, 0x1

    aput-object v6, v5, v16

    iget-object v6, v0, Lak0$d;->i:LrX2;

    aput-object v6, v5, v7

    const/4 v7, 0x3

    aput-object v9, v5, v7

    const/4 v7, 0x4

    aput-object v11, v5, v7

    const/4 v7, 0x5

    aput-object v10, v5, v7

    iget-boolean v7, v0, Lak0$d;->h:Z

    const v3, -0x21de6e89

    invoke-interface {v1, v3}, LEt0;->F(I)V

    const/4 v3, 0x0

    const/16 v16, 0x0

    :goto_0
    if-ge v3, v4, :cond_8

    aget-object v4, v5, v3

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int v16, v16, v4

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x6

    goto :goto_0

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v16, :cond_a

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_9

    goto :goto_1

    :cond_9
    move-object v2, v8

    goto :goto_2

    :cond_a
    :goto_1
    new-instance v3, Lak0$d$c;

    const/16 v16, 0x0

    move-object v4, v3

    move-object/from16 v5, v17

    move-object/from16 v18, v6

    move v6, v7

    move-object/from16 v7, v18

    move-object v2, v8

    move-object v8, v9

    move-object v9, v11

    move-object/from16 v11, v16

    invoke-direct/range {v4 .. v11}, Lak0$d$c;-><init>(LEX2;ZLrX2;LEX2;LsP5;LsP5;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :goto_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-static {v13, v14, v2, v3}, LzW5;->b(LgV2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object v2

    sget-object v3, LgV2;->b0:LgV2$a;

    const v4, -0x1d58f75c

    invoke-interface {v1, v4}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_b

    new-instance v4, Lak0$d$a;

    invoke-direct {v4, v12}, Lak0$d$a;-><init>(LEX2;)V

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_b
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v4, LgV2;

    invoke-virtual {v3, v4}, LgV2$a;->t0(LgV2;)LgV2;

    move-result-object v11

    iget-object v13, v0, Lak0$d;->i:LrX2;

    iget-object v14, v0, Lak0$d;->j:Ly12;

    const v3, 0x2e20b340

    invoke-interface {v1, v3}, LEt0;->F(I)V

    const v3, -0x1d58f75c

    invoke-interface {v1, v3}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_c

    sget-object v3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v3, v1}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v3

    new-instance v4, Liu0;

    invoke-direct {v4, v3}, Liu0;-><init>(LZC0;)V

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    move-object v3, v4

    :cond_c
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, Liu0;

    invoke-virtual {v3}, Liu0;->a()LZC0;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    iget-boolean v4, v0, Lak0$d;->h:Z

    iget-object v5, v0, Lak0$d;->k:Ljava/lang/String;

    iget-object v6, v0, Lak0$d;->l:LCb5;

    const/16 v21, 0x0

    const/16 v22, 0x0

    iget-object v7, v0, Lak0$d;->g:Lkotlin/jvm/functions/Function0;

    move-object v12, v2

    move-object v2, v15

    move-object v15, v3

    move-object/from16 v16, v2

    move/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v23, v7

    invoke-static/range {v11 .. v23}, Lak0;->f(LgV2;LgV2;LrX2;Ly12;LZC0;Ljava/util/Map;LsP5;ZLjava/lang/String;LCb5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LgV2;

    move-result-object v2

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
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

    invoke-virtual {p0, p1, p2, p3}, Lak0$d;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method

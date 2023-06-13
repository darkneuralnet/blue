.class public final LZF2$c$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZF2$c;->i(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1"
    f = "Magnifier.kt"
    i = {
        0x0
    }
    l = {
        0x16d
    }
    m = "invokeSuspend"
    n = {
        "magnifier"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LFV3;

.field public final synthetic k:LaG2;

.field public final synthetic l:Landroid/view/View;

.field public final synthetic m:Lg01;

.field public final synthetic n:F

.field public final synthetic o:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "Lo61;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic q:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic r:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic s:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "Lg01;",
            "LCe3;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic t:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic u:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LFV3;LaG2;Landroid/view/View;Lg01;FLBX2;LsP5;LsP5;LsP5;LsP5;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFV3;",
            "LaG2;",
            "Landroid/view/View;",
            "Lg01;",
            "F",
            "LBX2<",
            "Lkotlin/Unit;",
            ">;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lo61;",
            "Lkotlin/Unit;",
            ">;>;",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;",
            "LsP5<",
            "LCe3;",
            ">;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;>;",
            "LEX2<",
            "LCe3;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LZF2$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LZF2$c$a;->j:LFV3;

    iput-object p2, p0, LZF2$c$a;->k:LaG2;

    iput-object p3, p0, LZF2$c$a;->l:Landroid/view/View;

    iput-object p4, p0, LZF2$c$a;->m:Lg01;

    iput p5, p0, LZF2$c$a;->n:F

    iput-object p6, p0, LZF2$c$a;->o:LBX2;

    iput-object p7, p0, LZF2$c$a;->p:LsP5;

    iput-object p8, p0, LZF2$c$a;->q:LsP5;

    iput-object p9, p0, LZF2$c$a;->r:LsP5;

    iput-object p10, p0, LZF2$c$a;->s:LsP5;

    iput-object p11, p0, LZF2$c$a;->t:LEX2;

    iput-object p12, p0, LZF2$c$a;->u:LsP5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p13}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v15, LZF2$c$a;

    iget-object v2, v0, LZF2$c$a;->j:LFV3;

    iget-object v3, v0, LZF2$c$a;->k:LaG2;

    iget-object v4, v0, LZF2$c$a;->l:Landroid/view/View;

    iget-object v5, v0, LZF2$c$a;->m:Lg01;

    iget v6, v0, LZF2$c$a;->n:F

    iget-object v7, v0, LZF2$c$a;->o:LBX2;

    iget-object v8, v0, LZF2$c$a;->p:LsP5;

    iget-object v9, v0, LZF2$c$a;->q:LsP5;

    iget-object v10, v0, LZF2$c$a;->r:LsP5;

    iget-object v11, v0, LZF2$c$a;->s:LsP5;

    iget-object v12, v0, LZF2$c$a;->t:LEX2;

    iget-object v13, v0, LZF2$c$a;->u:LsP5;

    move-object v1, v15

    move-object/from16 v14, p2

    invoke-direct/range {v1 .. v14}, LZF2$c$a;-><init>(LFV3;LaG2;Landroid/view/View;Lg01;FLBX2;LsP5;LsP5;LsP5;LsP5;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v1, p1

    iput-object v1, v15, LZF2$c$a;->i:Ljava/lang/Object;

    return-object v15
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LZF2$c$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LZF2$c$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LZF2$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LZF2$c$a;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, LZF2$c$a;->h:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, v1, LZF2$c$a;->i:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, LEV3;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v1, LZF2$c$a;->i:Ljava/lang/Object;

    check-cast v2, LZC0;

    iget-object v4, v1, LZF2$c$a;->j:LFV3;

    iget-object v5, v1, LZF2$c$a;->k:LaG2;

    iget-object v6, v1, LZF2$c$a;->l:Landroid/view/View;

    iget-object v7, v1, LZF2$c$a;->m:Lg01;

    iget v8, v1, LZF2$c$a;->n:F

    invoke-interface {v4, v5, v6, v7, v8}, LFV3;->a(LaG2;Landroid/view/View;Lg01;F)LEV3;

    move-result-object v4

    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    invoke-interface {v4}, LEV3;->a()J

    move-result-wide v6

    iget-object v8, v1, LZF2$c$a;->m:Lg01;

    iget-object v9, v1, LZF2$c$a;->p:LsP5;

    invoke-static {v9}, LZF2$c;->g(LsP5;)Lkotlin/jvm/functions/Function1;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-static {v6, v7}, LH52;->c(J)J

    move-result-wide v10

    invoke-interface {v8, v10, v11}, Lg01;->j(J)J

    move-result-wide v10

    invoke-static {v10, v11}, Lo61;->c(J)Lo61;

    move-result-object v8

    invoke-interface {v9, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iput-wide v6, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    iget-object v6, v1, LZF2$c$a;->o:LBX2;

    new-instance v7, LZF2$c$a$a;

    const/4 v8, 0x0

    invoke-direct {v7, v4, v8}, LZF2$c$a$a;-><init>(LEV3;Lkotlin/coroutines/Continuation;)V

    invoke-static {v6, v7}, LVu1;->L(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object v6

    invoke-static {v6, v2}, LVu1;->I(LEu1;LZC0;)Lzh2;

    :try_start_1
    new-instance v2, LZF2$c$a$b;

    iget-object v11, v1, LZF2$c$a;->m:Lg01;

    iget-object v12, v1, LZF2$c$a;->q:LsP5;

    iget-object v13, v1, LZF2$c$a;->r:LsP5;

    iget-object v14, v1, LZF2$c$a;->s:LsP5;

    iget-object v15, v1, LZF2$c$a;->t:LEX2;

    iget-object v6, v1, LZF2$c$a;->u:LsP5;

    iget-object v7, v1, LZF2$c$a;->p:LsP5;

    move-object v9, v2

    move-object v10, v4

    move-object/from16 v16, v6

    move-object/from16 v17, v5

    move-object/from16 v18, v7

    invoke-direct/range {v9 .. v18}, LZF2$c$a$b;-><init>(LEV3;Lg01;LsP5;LsP5;LsP5;LEX2;LsP5;Lkotlin/jvm/internal/Ref$LongRef;LsP5;)V

    invoke-static {v2}, LGM5;->o(Lkotlin/jvm/functions/Function0;)LEu1;

    move-result-object v2

    iput-object v4, v1, LZF2$c$a;->i:Ljava/lang/Object;

    iput v3, v1, LZF2$c$a;->h:I

    invoke-static {v2, v1}, LVu1;->i(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    move-object v2, v4

    :goto_0
    invoke-interface {v2}, LEV3;->dismiss()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v4

    :goto_1
    invoke-interface {v2}, LEV3;->dismiss()V

    throw v0
.end method

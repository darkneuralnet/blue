.class public final LMe$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe;->a(LF96;LgV2;Lkotlin/jvm/functions/Function1;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;LEt0;II)V
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
        "SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,780:1\n25#2:781\n36#2:788\n25#2:795\n1057#3,6:782\n1057#3,6:789\n1057#3,6:796\n1#4:802\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1\n*L\n665#1:781\n669#1:788\n676#1:795\n665#1:782,6\n669#1:789,6\n676#1:796,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field public final synthetic i:I

.field public final synthetic j:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LOe<",
            "TS;>;",
            "LHA0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:LOe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOe<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic l:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "LTe;",
            "TS;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:LMM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMM5<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LF96;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;LOe;Lkotlin/jvm/functions/Function4;LMM5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "TS;>;TS;I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LOe<",
            "TS;>;",
            "LHA0;",
            ">;",
            "LOe<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "LTe;",
            "-TS;-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LMM5<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, LMe$d;->g:LF96;

    iput-object p2, p0, LMe$d;->h:Ljava/lang/Object;

    iput p3, p0, LMe$d;->i:I

    iput-object p4, p0, LMe$d;->j:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, LMe$d;->k:LOe;

    iput-object p6, p0, LMe$d;->l:Lkotlin/jvm/functions/Function4;

    iput-object p7, p0, LMe$d;->m:LMM5;

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

    invoke-virtual {p0, p1, p2}, LMe$d;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 14

    move-object v0, p0

    move-object v7, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:663)"

    const v4, 0x34c9ce26

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LMe$d;->j:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, LMe$d;->k:LOe;

    const v3, -0x1d58f75c

    invoke-interface {p1, v3}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_3

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LHA0;

    invoke-interface {p1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v4, LHA0;

    iget-object v1, v0, LMe$d;->g:LF96;

    invoke-virtual {v1}, LF96;->k()LF96$b;

    move-result-object v1

    invoke-interface {v1}, LF96$b;->b()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, LMe$d;->h:Ljava/lang/Object;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, v0, LMe$d;->g:LF96;

    iget-object v6, v0, LMe$d;->h:Ljava/lang/Object;

    iget-object v8, v0, LMe$d;->j:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, LMe$d;->k:LOe;

    const v10, 0x44faf204

    invoke-interface {p1, v10}, LEt0;->F(I)V

    invoke-interface {p1, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    if-nez v1, :cond_4

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v10, v1, :cond_6

    :cond_4
    invoke-virtual {v2}, LF96;->k()LF96$b;

    move-result-object v1

    invoke-interface {v1}, LF96$b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lgi1;->a:Lgi1$a;

    invoke-virtual {v1}, Lgi1$a;->a()Lgi1;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-interface {v8, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHA0;

    invoke-virtual {v1}, LHA0;->a()Lgi1;

    move-result-object v1

    :goto_1
    move-object v10, v1

    invoke-interface {p1, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p1}, LEt0;->Q()V

    move-object v6, v10

    check-cast v6, Lgi1;

    iget-object v1, v0, LMe$d;->h:Ljava/lang/Object;

    iget-object v2, v0, LMe$d;->g:LF96;

    invoke-interface {p1, v3}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_7

    new-instance v3, LOe$a;

    invoke-virtual {v2}, LF96;->m()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {v3, v1}, LOe$a;-><init>(Z)V

    invoke-interface {p1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v3, LOe$a;

    invoke-virtual {v4}, LHA0;->c()LZe1;

    move-result-object v5

    sget-object v1, LgV2;->b0:LgV2$a;

    new-instance v2, LMe$d$a;

    invoke-direct {v2, v4}, LMe$d$a;-><init>(LHA0;)V

    invoke-static {v1, v2}, Landroidx/compose/ui/layout/b;->a(LgV2;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object v1

    iget-object v2, v0, LMe$d;->h:Ljava/lang/Object;

    iget-object v4, v0, LMe$d;->g:LF96;

    invoke-virtual {v4}, LF96;->m()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3, v2}, LOe$a;->b(Z)V

    invoke-interface {v1, v3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v3

    iget-object v1, v0, LMe$d;->g:LF96;

    new-instance v2, LMe$d$b;

    iget-object v4, v0, LMe$d;->h:Ljava/lang/Object;

    invoke-direct {v2, v4}, LMe$d$b;-><init>(Ljava/lang/Object;)V

    new-instance v4, LMe$d$c;

    iget-object v9, v0, LMe$d;->k:LOe;

    iget-object v10, v0, LMe$d;->h:Ljava/lang/Object;

    iget-object v11, v0, LMe$d;->l:Lkotlin/jvm/functions/Function4;

    iget v12, v0, LMe$d;->i:I

    iget-object v13, v0, LMe$d;->m:LMM5;

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, LMe$d$c;-><init>(LOe;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;ILMM5;)V

    const v8, -0x70f1d811

    const/4 v9, 0x1

    invoke-static {p1, v8, v9, v4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v8

    iget v4, v0, LMe$d;->i:I

    and-int/lit8 v4, v4, 0xe

    const/high16 v9, 0x30000

    or-int/2addr v9, v4

    const/4 v10, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object v7, p1

    move v8, v9

    move v9, v10

    invoke-static/range {v1 .. v9}, LSe;->c(LF96;Lkotlin/jvm/functions/Function1;LgV2;LZe1;Lgi1;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_2
    return-void
.end method

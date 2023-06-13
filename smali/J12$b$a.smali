.class public final LJ12$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ12$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
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
        "SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n460#2,11:365\n460#2,11:376\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n*L\n187#1:365,11\n194#1:376,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LsP5<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LJ12;

.field public final synthetic i:Lkotlin/jvm/internal/Ref$FloatRef;

.field public final synthetic j:LZC0;


# direct methods
.method public constructor <init>(LEX2;LJ12;Lkotlin/jvm/internal/Ref$FloatRef;LZC0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LsP5<",
            "Ljava/lang/Long;",
            ">;>;",
            "LJ12;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "LZC0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LJ12$b$a;->g:LEX2;

    iput-object p2, p0, LJ12$b$a;->h:LJ12;

    iput-object p3, p0, LJ12$b$a;->i:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p4, p0, LJ12$b$a;->j:LZC0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 6

    iget-object v0, p0, LJ12$b$a;->g:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LsP5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    iget-object v2, p0, LJ12$b$a;->h:LJ12;

    invoke-static {v2}, LJ12;->a(LJ12;)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    iget-object v2, p0, LJ12$b$a;->i:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget-object v5, p0, LJ12$b$a;->j:LZC0;

    invoke-interface {v5}, LZC0;->K()Lkotlin/coroutines/CoroutineContext;

    move-result-object v5

    invoke-static {v5}, LuW5;->n(Lkotlin/coroutines/CoroutineContext;)F

    move-result v5

    cmpg-float v2, v2, v5

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    if-nez v2, :cond_5

    :cond_2
    iget-object v2, p0, LJ12$b$a;->h:LJ12;

    invoke-static {v2, p1, p2}, LJ12;->e(LJ12;J)V

    iget-object p1, p0, LJ12$b$a;->h:LJ12;

    invoke-static {p1}, LJ12;->b(LJ12;)LLX2;

    move-result-object p1

    invoke-virtual {p1}, LLX2;->u()I

    move-result p2

    if-lez p2, :cond_4

    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p1

    move v2, v4

    :cond_3
    aget-object v5, p1, v2

    check-cast v5, LJ12$a;

    invoke-virtual {v5}, LJ12$a;->i()V

    add-int/2addr v2, v3

    if-lt v2, p2, :cond_3

    :cond_4
    iget-object p1, p0, LJ12$b$a;->i:Lkotlin/jvm/internal/Ref$FloatRef;

    iget-object p2, p0, LJ12$b$a;->j:LZC0;

    invoke-interface {p2}, LZC0;->K()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-static {p2}, LuW5;->n(Lkotlin/coroutines/CoroutineContext;)F

    move-result p2

    iput p2, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    :cond_5
    iget-object p1, p0, LJ12$b$a;->i:Lkotlin/jvm/internal/Ref$FloatRef;

    iget p1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_6

    move p1, v3

    goto :goto_2

    :cond_6
    move p1, v4

    :goto_2
    if-eqz p1, :cond_8

    iget-object p1, p0, LJ12$b$a;->h:LJ12;

    invoke-static {p1}, LJ12;->b(LJ12;)LLX2;

    move-result-object p1

    invoke-virtual {p1}, LLX2;->u()I

    move-result p2

    if-lez p2, :cond_9

    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_7
    aget-object v0, p1, v4

    check-cast v0, LJ12$a;

    invoke-virtual {v0}, LJ12$a;->k()V

    add-int/2addr v4, v3

    if-lt v4, p2, :cond_7

    goto :goto_3

    :cond_8
    iget-object p1, p0, LJ12$b$a;->h:LJ12;

    invoke-static {p1}, LJ12;->a(LJ12;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    long-to-float p1, v0

    iget-object p2, p0, LJ12$b$a;->i:Lkotlin/jvm/internal/Ref$FloatRef;

    iget p2, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    div-float/2addr p1, p2

    float-to-long p1, p1

    iget-object v0, p0, LJ12$b$a;->h:LJ12;

    invoke-static {v0, p1, p2}, LJ12;->c(LJ12;J)V

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LJ12$b$a;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

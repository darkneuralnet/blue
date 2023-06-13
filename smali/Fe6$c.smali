.class public final LFe6$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFe6;->h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "frameTime",
        "",
        "a",
        "(J)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LFe6;

.field public final synthetic h:F

.field public final synthetic i:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LFe6;FLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFe6;",
            "F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LFe6$c;->g:LFe6;

    iput p2, p0, LFe6$c;->h:F

    iput-object p3, p0, LFe6$c;->i:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 11

    iget-object v0, p0, LFe6$c;->g:LFe6;

    invoke-static {v0}, LFe6;->b(LFe6;)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, LFe6$c;->g:LFe6;

    invoke-static {v0, p1, p2}, LFe6;->f(LFe6;J)V

    :cond_0
    new-instance v0, Lsf;

    iget-object v1, p0, LFe6$c;->g:LFe6;

    invoke-virtual {v1}, LFe6;->i()F

    move-result v1

    invoke-direct {v0, v1}, Lsf;-><init>(F)V

    iget v1, p0, LFe6$c;->h:F

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {}, LFe6;->a()LFe6$a;

    move-result-object v1

    invoke-virtual {v1}, LFe6$a;->a()Lvk6;

    move-result-object v1

    new-instance v2, Lsf;

    iget-object v3, p0, LFe6$c;->g:LFe6;

    invoke-virtual {v3}, LFe6;->i()F

    move-result v3

    invoke-direct {v2, v3}, Lsf;-><init>(F)V

    invoke-static {}, LFe6;->a()LFe6$a;

    move-result-object v3

    invoke-virtual {v3}, LFe6$a;->b()Lsf;

    move-result-object v3

    iget-object v4, p0, LFe6$c;->g:LFe6;

    invoke-static {v4}, LFe6;->c(LFe6;)Lsf;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lvk6;->b(Lvf;Lvf;Lvf;)J

    move-result-wide v1

    goto :goto_1

    :cond_2
    iget-object v1, p0, LFe6$c;->g:LFe6;

    invoke-static {v1}, LFe6;->b(LFe6;)J

    move-result-wide v1

    sub-long v1, p1, v1

    long-to-float v1, v1

    iget v2, p0, LFe6$c;->h:F

    div-float/2addr v1, v2

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToLong(F)J

    move-result-wide v1

    :goto_1
    move-wide v7, v1

    invoke-static {}, LFe6;->a()LFe6$a;

    move-result-object v1

    invoke-virtual {v1}, LFe6$a;->a()Lvk6;

    move-result-object v1

    invoke-static {}, LFe6;->a()LFe6$a;

    move-result-object v2

    invoke-virtual {v2}, LFe6$a;->b()Lsf;

    move-result-object v5

    iget-object v2, p0, LFe6$c;->g:LFe6;

    invoke-static {v2}, LFe6;->c(LFe6;)Lsf;

    move-result-object v6

    move-wide v2, v7

    move-object v4, v0

    invoke-virtual/range {v1 .. v6}, Lvk6;->e(JLvf;Lvf;Lvf;)Lvf;

    move-result-object v1

    check-cast v1, Lsf;

    invoke-virtual {v1}, Lsf;->f()F

    move-result v9

    iget-object v10, p0, LFe6$c;->g:LFe6;

    invoke-static {}, LFe6;->a()LFe6$a;

    move-result-object v1

    invoke-virtual {v1}, LFe6$a;->a()Lvk6;

    move-result-object v1

    invoke-static {}, LFe6;->a()LFe6$a;

    move-result-object v2

    invoke-virtual {v2}, LFe6$a;->b()Lsf;

    move-result-object v5

    iget-object v2, p0, LFe6$c;->g:LFe6;

    invoke-static {v2}, LFe6;->c(LFe6;)Lsf;

    move-result-object v6

    move-wide v2, v7

    invoke-virtual/range {v1 .. v6}, Lvk6;->d(JLvf;Lvf;Lvf;)Lvf;

    move-result-object v0

    check-cast v0, Lsf;

    invoke-static {v10, v0}, LFe6;->g(LFe6;Lsf;)V

    iget-object v0, p0, LFe6$c;->g:LFe6;

    invoke-static {v0, p1, p2}, LFe6;->f(LFe6;J)V

    iget-object p1, p0, LFe6$c;->g:LFe6;

    invoke-virtual {p1}, LFe6;->i()F

    move-result p1

    sub-float/2addr p1, v9

    iget-object p2, p0, LFe6$c;->g:LFe6;

    invoke-virtual {p2, v9}, LFe6;->j(F)V

    iget-object p2, p0, LFe6$c;->i:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LFe6$c;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

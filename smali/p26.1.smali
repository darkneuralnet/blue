.class public final Lp26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\n"
    }
    d2 = {
        "Lp26;",
        "",
        "Lme0;",
        "canvas",
        "Li26;",
        "textLayoutResult",
        "",
        "a",
        "<init>",
        "()V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lp26;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp26;

    invoke-direct {v0}, Lp26;-><init>()V

    sput-object v0, Lp26;->a:Lp26;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lme0;Li26;)V
    .locals 13

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textLayoutResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Li26;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Li26;->k()Lg26;

    move-result-object v0

    invoke-virtual {v0}, Lg26;->f()I

    move-result v0

    sget-object v2, Ln26;->a:Ln26$a;

    invoke-virtual {v2}, Ln26$a;->c()I

    move-result v2

    invoke-static {v0, v2}, Ln26;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p2}, Li26;->A()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, Li26;->A()J

    move-result-wide v3

    invoke-static {v3, v4}, LG52;->f(J)I

    move-result v3

    int-to-float v3, v3

    sget-object v4, LCe3;->b:LCe3$a;

    invoke-virtual {v4}, LCe3$a;->c()J

    move-result-wide v4

    invoke-static {v2, v3}, LCB5;->a(FF)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, LSs4;->b(JJ)LOs4;

    move-result-object v2

    invoke-interface {p1}, Lme0;->v()V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v2, v1, v3, v4}, Lme0;->e(Lme0;LOs4;IILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, Li26;->k()Lg26;

    move-result-object v1

    invoke-virtual {v1}, Lg26;->i()LG26;

    move-result-object v1

    invoke-virtual {v1}, LG26;->A()LGN5;

    move-result-object v1

    invoke-virtual {v1}, LGN5;->s()LR06;

    move-result-object v2

    if-nez v2, :cond_2

    sget-object v2, LR06;->b:LR06$a;

    invoke-virtual {v2}, LR06$a;->c()LR06;

    move-result-object v2

    :cond_2
    move-object v8, v2

    invoke-virtual {v1}, LGN5;->r()LPx5;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, LPx5;->d:LPx5$a;

    invoke-virtual {v2}, LPx5$a;->a()LPx5;

    move-result-object v2

    :cond_3
    move-object v7, v2

    invoke-virtual {v1}, LGN5;->h()LJ61;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v2, Lzl1;->a:Lzl1;

    :cond_4
    move-object v9, v2

    :try_start_0
    invoke-virtual {v1}, LGN5;->f()La30;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v1}, LGN5;->t()LH16;

    move-result-object v2

    sget-object v3, LH16$b;->b:LH16$b;

    if-eq v2, v3, :cond_5

    invoke-virtual {v1}, LGN5;->t()LH16;

    move-result-object v1

    invoke-interface {v1}, LH16;->h()F

    move-result v1

    goto :goto_1

    :cond_5
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_1
    move v6, v1

    invoke-virtual {p2}, Li26;->v()LRW2;

    move-result-object v3

    const/4 v10, 0x0

    const/16 v11, 0x40

    const/4 v12, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, LRW2;->D(LRW2;Lme0;La30;FLPx5;LR06;LJ61;IILjava/lang/Object;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, LGN5;->t()LH16;

    move-result-object v2

    sget-object v3, LH16$b;->b:LH16$b;

    if-eq v2, v3, :cond_7

    invoke-virtual {v1}, LGN5;->t()LH16;

    move-result-object v1

    invoke-interface {v1}, LH16;->a()J

    move-result-wide v1

    goto :goto_2

    :cond_7
    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-virtual {v1}, Lpm0$a;->a()J

    move-result-wide v1

    :goto_2
    move-wide v5, v1

    invoke-virtual {p2}, Li26;->v()LRW2;

    move-result-object v3

    const/4 v10, 0x0

    const/16 v11, 0x20

    const/4 v12, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, LRW2;->B(LRW2;Lme0;JLPx5;LR06;LJ61;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    if-eqz v0, :cond_8

    invoke-interface {p1}, Lme0;->p()V

    :cond_8
    return-void

    :catchall_0
    move-exception p2

    if-eqz v0, :cond_9

    invoke-interface {p1}, Lme0;->p()V

    :cond_9
    throw p2
.end method

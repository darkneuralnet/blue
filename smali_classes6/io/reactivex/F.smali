.class public abstract Lio/reactivex/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/K;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/K<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/r;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/r;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static H(Ljava/lang/Object;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "item is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/v;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/v;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static J(Lna4;)Lio/reactivex/k;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lna4<",
            "+",
            "Lio/reactivex/K<",
            "+TT;>;>;)",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/flowable/w;

    invoke-static {}, Lio/reactivex/internal/operators/single/u;->a()Lio/reactivex/functions/o;

    move-result-object v3

    const/4 v4, 0x0

    const v5, 0x7fffffff

    invoke-static {}, Lio/reactivex/k;->j()I

    move-result v6

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/w;-><init>(Lna4;Lio/reactivex/functions/o;ZII)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static K(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "+TT;>;",
            "Lio/reactivex/K<",
            "+TT;>;)",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/K;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lio/reactivex/k;->h0([Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/F;->J(Lna4;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static M()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/operators/single/x;->b:Lio/reactivex/F;

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public static f0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lio/reactivex/F;->g0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static g0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/D;

    invoke-direct {v0, p0, p1, p2, p3}, Lio/reactivex/internal/operators/single/D;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lio/reactivex/J;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/J<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/b;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/b;-><init>(Lio/reactivex/J;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lio/reactivex/K<",
            "+TT;>;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "singleSupplier is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/c;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/c;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static l0(Lio/reactivex/k;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/k<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/j0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/reactivex/internal/operators/flowable/j0;-><init>(Lio/reactivex/k;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static m0(Lio/reactivex/K;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Lio/reactivex/F;

    if-eqz v0, :cond_0

    check-cast p0, Lio/reactivex/F;

    invoke-static {p0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/single/s;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/s;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static n0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/m;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "T5:",
            "Ljava/lang/Object;",
            "T6:",
            "Ljava/lang/Object;",
            "T7:",
            "Ljava/lang/Object;",
            "T8:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "+TT1;>;",
            "Lio/reactivex/K<",
            "+TT2;>;",
            "Lio/reactivex/K<",
            "+TT3;>;",
            "Lio/reactivex/K<",
            "+TT4;>;",
            "Lio/reactivex/K<",
            "+TT5;>;",
            "Lio/reactivex/K<",
            "+TT6;>;",
            "Lio/reactivex/K<",
            "+TT7;>;",
            "Lio/reactivex/K<",
            "+TT8;>;",
            "Lio/reactivex/functions/m<",
            "-TT1;-TT2;-TT3;-TT4;-TT5;-TT6;-TT7;-TT8;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source6 is null"

    invoke-static {p5, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source7 is null"

    invoke-static {p6, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source8 is null"

    invoke-static {p7, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p8}, Lio/reactivex/internal/functions/a;->B(Lio/reactivex/functions/m;)Lio/reactivex/functions/o;

    move-result-object p8

    const/16 v0, 0x8

    new-array v0, v0, [Lio/reactivex/K;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    invoke-static {p8, v0}, Lio/reactivex/F;->t0(Lio/reactivex/functions/o;[Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static o0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/j;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "T5:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "+TT1;>;",
            "Lio/reactivex/K<",
            "+TT2;>;",
            "Lio/reactivex/K<",
            "+TT3;>;",
            "Lio/reactivex/K<",
            "+TT4;>;",
            "Lio/reactivex/K<",
            "+TT5;>;",
            "Lio/reactivex/functions/j<",
            "-TT1;-TT2;-TT3;-TT4;-TT5;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p5}, Lio/reactivex/internal/functions/a;->y(Lio/reactivex/functions/j;)Lio/reactivex/functions/o;

    move-result-object p5

    const/4 v0, 0x5

    new-array v0, v0, [Lio/reactivex/K;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    invoke-static {p5, v0}, Lio/reactivex/F;->t0(Lio/reactivex/functions/o;[Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static p0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/i;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "+TT1;>;",
            "Lio/reactivex/K<",
            "+TT2;>;",
            "Lio/reactivex/K<",
            "+TT3;>;",
            "Lio/reactivex/K<",
            "+TT4;>;",
            "Lio/reactivex/functions/i<",
            "-TT1;-TT2;-TT3;-TT4;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p4}, Lio/reactivex/internal/functions/a;->x(Lio/reactivex/functions/i;)Lio/reactivex/functions/o;

    move-result-object p4

    const/4 v0, 0x4

    new-array v0, v0, [Lio/reactivex/K;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    invoke-static {p4, v0}, Lio/reactivex/F;->t0(Lio/reactivex/functions/o;[Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static q0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/h;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "+TT1;>;",
            "Lio/reactivex/K<",
            "+TT2;>;",
            "Lio/reactivex/K<",
            "+TT3;>;",
            "Lio/reactivex/functions/h<",
            "-TT1;-TT2;-TT3;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p3}, Lio/reactivex/internal/functions/a;->w(Lio/reactivex/functions/h;)Lio/reactivex/functions/o;

    move-result-object p3

    const/4 v0, 0x3

    new-array v0, v0, [Lio/reactivex/K;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    invoke-static {p3, v0}, Lio/reactivex/F;->t0(Lio/reactivex/functions/o;[Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static r0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/c;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "+TT1;>;",
            "Lio/reactivex/K<",
            "+TT2;>;",
            "Lio/reactivex/functions/c<",
            "-TT1;-TT2;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p2}, Lio/reactivex/internal/functions/a;->v(Lio/reactivex/functions/c;)Lio/reactivex/functions/o;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/K;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {p2, v0}, Lio/reactivex/F;->t0(Lio/reactivex/functions/o;[Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static s0(Ljava/lang/Iterable;Lio/reactivex/functions/o;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/K<",
            "+TT;>;>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "zipper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/H;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/H;-><init>(Ljava/lang/Iterable;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static varargs t0(Lio/reactivex/functions/o;[Lio/reactivex/K;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;[",
            "Lio/reactivex/K<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "zipper is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "sources is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p1

    if-nez v0, :cond_0

    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-static {p0}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/single/G;

    invoke-direct {v0, p1, p0}, Lio/reactivex/internal/operators/single/G;-><init>([Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static x(Ljava/lang/Throwable;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "exception is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lio/reactivex/internal/functions/a;->k(Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/F;->y(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static y(Ljava/util/concurrent/Callable;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "errorSupplier is null"

    invoke-static {p0, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/n;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/n;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lio/reactivex/functions/o;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/K<",
            "+TR;>;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/o;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/o;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lio/reactivex/functions/o;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/h;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/p;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/p;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lio/reactivex/functions/o;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/u<",
            "+TR;>;>;)",
            "Lio/reactivex/p<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/q;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/q;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->n(Lio/reactivex/p;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TR;>;>;)",
            "Lio/reactivex/Observable<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/mixed/n;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/mixed/n;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public final F()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/single/t;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/t;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final G()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lio/reactivex/internal/operators/completable/o;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/o;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public final I(Lio/reactivex/functions/o;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/functions/o<",
            "-TT;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/w;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/w;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final L(Lio/reactivex/K;)Lio/reactivex/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "+TT;>;)",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lio/reactivex/F;->K(Lio/reactivex/K;Lio/reactivex/K;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public final N(Lio/reactivex/E;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/y;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/y;-><init>(Lio/reactivex/K;Lio/reactivex/E;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final O(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "resumeSingleInCaseOfError is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lio/reactivex/internal/functions/a;->l(Ljava/lang/Object;)Lio/reactivex/functions/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/F;->P(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final P(Lio/reactivex/functions/o;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lio/reactivex/K<",
            "+TT;>;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "resumeFunctionInCaseOfError is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/A;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/A;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Q(Lio/reactivex/functions/o;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "Ljava/lang/Throwable;",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "resumeFunction is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/reactivex/internal/operators/single/z;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final R(Ljava/lang/Object;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "value is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lio/reactivex/internal/operators/single/z;-><init>(Lio/reactivex/K;Lio/reactivex/functions/o;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final S()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/F;->i0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->J0()Lio/reactivex/k;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->l0(Lio/reactivex/k;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final T(J)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/F;->i0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lio/reactivex/k;->K0(J)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->l0(Lio/reactivex/k;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final U(Lio/reactivex/functions/d;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/d<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/F;->i0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/k;->M0(Lio/reactivex/functions/d;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->l0(Lio/reactivex/k;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final V(Lio/reactivex/functions/q;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/F;->i0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/k;->N0(Lio/reactivex/functions/q;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->l0(Lio/reactivex/k;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final W(Lio/reactivex/functions/o;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/k<",
            "Ljava/lang/Throwable;",
            ">;+",
            "Lna4<",
            "*>;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/F;->i0()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/k;->O0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->l0(Lio/reactivex/k;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public abstract X(Lio/reactivex/I;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final Y(Lio/reactivex/E;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/B;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/B;-><init>(Lio/reactivex/K;Lio/reactivex/E;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Lio/reactivex/I;)Lio/reactivex/I;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lio/reactivex/I<",
            "-TT;>;>(TE;)TE;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    return-object p1
.end method

.method public final a(Lio/reactivex/I;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lio/reactivex/plugins/a;->C(Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, p1}, Lio/reactivex/F;->X(Lio/reactivex/I;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "subscribeActual failed"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final a0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/F;->e0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lio/reactivex/functions/b;)Lio/reactivex/disposables/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/b<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    const-string v0, "onCallback is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/observers/d;

    invoke-direct {v0, p1}, Lio/reactivex/internal/observers/d;-><init>(Lio/reactivex/functions/b;)V

    invoke-virtual {p0, v0}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    return-object v0
.end method

.method public final b0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/F;->e0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final c0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Lio/reactivex/K<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "other is null"

    invoke-static {p5, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p5}, Lio/reactivex/F;->e0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final d0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/K;)Lio/reactivex/F;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/K<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "other is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v5

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lio/reactivex/F;->e0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lio/reactivex/G;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/G<",
            "TT;+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "converter is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/G;

    invoke-interface {p1, p0}, Lio/reactivex/G;->c(Lio/reactivex/F;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Lio/reactivex/K<",
            "+TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/C;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/single/C;-><init>(Lio/reactivex/K;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/observers/h;

    invoke-direct {v0}, Lio/reactivex/internal/observers/h;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    invoke-virtual {v0}, Lio/reactivex/internal/observers/h;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/single/a;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/a;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final h0()Lio/reactivex/c;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/completable/o;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/completable/o;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->l(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lio/reactivex/L;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/L<",
            "-TT;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "transformer is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/L;

    invoke-interface {p1, p0}, Lio/reactivex/L;->c(Lio/reactivex/F;)Lio/reactivex/K;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->m0(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final i0()Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/fuseable/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/fuseable/b;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/b;->d()Lio/reactivex/k;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/single/E;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/E;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method

.method public final j0()Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/fuseable/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/fuseable/c;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/c;->a()Lio/reactivex/p;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/maybe/u;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/maybe/u;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->n(Lio/reactivex/p;)Lio/reactivex/p;

    move-result-object v0

    return-object v0
.end method

.method public final k0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lio/reactivex/internal/fuseable/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/reactivex/internal/fuseable/d;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/d;->c()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/single/F;

    invoke-direct {v0, p0}, Lio/reactivex/internal/operators/single/F;-><init>(Lio/reactivex/K;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final l(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/F;->m(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final m(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Z)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/d;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/single/d;-><init>(Lio/reactivex/K;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final n(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lio/reactivex/F;->o(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final o(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/F;->p(Lio/reactivex/B;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lio/reactivex/B;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "TU;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "other is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/f;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/f;-><init>(Lio/reactivex/K;Lio/reactivex/B;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lio/reactivex/functions/g;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onAfterSuccess is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/g;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/g;-><init>(Lio/reactivex/K;Lio/reactivex/functions/g;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lio/reactivex/functions/a;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/a;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onFinally is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/h;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/h;-><init>(Lio/reactivex/K;Lio/reactivex/functions/a;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lio/reactivex/functions/a;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/a;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onDispose is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/i;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/i;-><init>(Lio/reactivex/K;Lio/reactivex/functions/a;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final subscribe()Lio/reactivex/disposables/c;
    .locals 2

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v0

    sget-object v1, Lio/reactivex/internal/functions/a;->f:Lio/reactivex/functions/g;

    invoke-virtual {p0, v0, v1}, Lio/reactivex/F;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v0

    return-object v0
.end method

.method public final subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/functions/a;->f:Lio/reactivex/functions/g;

    invoke-virtual {p0, p1, v0}, Lio/reactivex/F;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public final subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/observers/k;

    invoke-direct {v0, p1, p2}, Lio/reactivex/internal/observers/k;-><init>(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)V

    invoke-virtual {p0, v0}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    return-object v0
.end method

.method public final t(Lio/reactivex/functions/g;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onError is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/j;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/j;-><init>(Lio/reactivex/K;Lio/reactivex/functions/g;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lio/reactivex/functions/b;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/b<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onEvent is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/k;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/k;-><init>(Lio/reactivex/K;Lio/reactivex/functions/b;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final u0(Lio/reactivex/K;Lio/reactivex/functions/c;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/K<",
            "TU;>;",
            "Lio/reactivex/functions/c<",
            "-TT;-TU;+TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/reactivex/F;->r0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/c;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lio/reactivex/functions/g;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Lio/reactivex/disposables/c;",
            ">;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/l;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/l;-><init>(Lio/reactivex/K;Lio/reactivex/functions/g;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lio/reactivex/functions/g;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/single/m;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/single/m;-><init>(Lio/reactivex/K;Lio/reactivex/functions/g;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->p(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lio/reactivex/functions/q;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/q<",
            "-TT;>;)",
            "Lio/reactivex/p<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lio/reactivex/internal/operators/maybe/m;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/maybe/m;-><init>(Lio/reactivex/K;Lio/reactivex/functions/q;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->n(Lio/reactivex/p;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

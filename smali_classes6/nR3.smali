.class public abstract LnR3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LnR3$a;
    }
.end annotation


# static fields
.field public static a:LnR3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LnR3;->a()LnR3$a;

    move-result-object v0

    invoke-virtual {v0}, LnR3$a;->a()LnR3;

    move-result-object v0

    sput-object v0, LnR3;->a:LnR3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LnR3$a;
    .locals 4

    new-instance v0, LWt$b;

    invoke-direct {v0}, LWt$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, LWt$b;->h(J)LnR3$a;

    move-result-object v0

    sget-object v3, LmR3$a;->b:LmR3$a;

    invoke-virtual {v0, v3}, LnR3$a;->g(LmR3$a;)LnR3$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, LnR3$a;->c(J)LnR3$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()LmR3$a;
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, LnR3;->g()LmR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->f:LmR3$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, LnR3;->g()LmR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->c:LmR3$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, LnR3;->g()LmR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->b:LmR3$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, LnR3;->g()LmR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->e:LmR3$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, LnR3;->g()LmR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->d:LmR3$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, LnR3;->g()LmR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->b:LmR3$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n()LnR3$a;
.end method

.method public o(Ljava/lang/String;JJ)LnR3;
    .locals 1

    invoke-virtual {p0}, LnR3;->n()LnR3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LnR3$a;->b(Ljava/lang/String;)LnR3$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, LnR3$a;->c(J)LnR3$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, LnR3$a;->h(J)LnR3$a;

    move-result-object p1

    invoke-virtual {p1}, LnR3$a;->a()LnR3;

    move-result-object p1

    return-object p1
.end method

.method public p()LnR3;
    .locals 2

    invoke-virtual {p0}, LnR3;->n()LnR3$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LnR3$a;->b(Ljava/lang/String;)LnR3$a;

    move-result-object v0

    invoke-virtual {v0}, LnR3$a;->a()LnR3;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)LnR3;
    .locals 1

    invoke-virtual {p0}, LnR3;->n()LnR3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LnR3$a;->e(Ljava/lang/String;)LnR3$a;

    move-result-object p1

    sget-object v0, LmR3$a;->f:LmR3$a;

    invoke-virtual {p1, v0}, LnR3$a;->g(LmR3$a;)LnR3$a;

    move-result-object p1

    invoke-virtual {p1}, LnR3$a;->a()LnR3;

    move-result-object p1

    return-object p1
.end method

.method public r()LnR3;
    .locals 2

    invoke-virtual {p0}, LnR3;->n()LnR3$a;

    move-result-object v0

    sget-object v1, LmR3$a;->c:LmR3$a;

    invoke-virtual {v0, v1}, LnR3$a;->g(LmR3$a;)LnR3$a;

    move-result-object v0

    invoke-virtual {v0}, LnR3$a;->a()LnR3;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)LnR3;
    .locals 1

    invoke-virtual {p0}, LnR3;->n()LnR3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LnR3$a;->d(Ljava/lang/String;)LnR3$a;

    move-result-object p1

    sget-object v0, LmR3$a;->e:LmR3$a;

    invoke-virtual {p1, v0}, LnR3$a;->g(LmR3$a;)LnR3$a;

    move-result-object p1

    invoke-virtual {p1, p5}, LnR3$a;->b(Ljava/lang/String;)LnR3$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LnR3$a;->f(Ljava/lang/String;)LnR3$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, LnR3$a;->c(J)LnR3$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, LnR3$a;->h(J)LnR3$a;

    move-result-object p1

    invoke-virtual {p1}, LnR3$a;->a()LnR3;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)LnR3;
    .locals 1

    invoke-virtual {p0}, LnR3;->n()LnR3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LnR3$a;->d(Ljava/lang/String;)LnR3$a;

    move-result-object p1

    sget-object v0, LmR3$a;->d:LmR3$a;

    invoke-virtual {p1, v0}, LnR3$a;->g(LmR3$a;)LnR3$a;

    move-result-object p1

    invoke-virtual {p1}, LnR3$a;->a()LnR3;

    move-result-object p1

    return-object p1
.end method

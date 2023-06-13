.class public final LhH8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, LhH8;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a(Lhj1;)LWJ8;
    .locals 4

    new-instance v0, LDI8;

    invoke-direct {v0}, LDI8;-><init>()V

    invoke-virtual {p0}, Lhj1;->d()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    sget-object v1, LnJ8;->c:LnJ8;

    goto :goto_0

    :cond_0
    sget-object v1, LnJ8;->e:LnJ8;

    goto :goto_0

    :cond_1
    sget-object v1, LnJ8;->d:LnJ8;

    :goto_0
    invoke-virtual {v0, v1}, LDI8;->d(LnJ8;)LDI8;

    invoke-virtual {p0}, Lhj1;->b()I

    move-result v1

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    sget-object v1, LPI8;->c:LPI8;

    goto :goto_1

    :cond_2
    sget-object v1, LPI8;->e:LPI8;

    goto :goto_1

    :cond_3
    sget-object v1, LPI8;->d:LPI8;

    :goto_1
    invoke-virtual {v0, v1}, LDI8;->a(LPI8;)LDI8;

    invoke-virtual {p0}, Lhj1;->e()I

    move-result v1

    if-eq v1, v3, :cond_5

    if-eq v1, v2, :cond_4

    sget-object v1, LzJ8;->c:LzJ8;

    goto :goto_2

    :cond_4
    sget-object v1, LzJ8;->e:LzJ8;

    goto :goto_2

    :cond_5
    sget-object v1, LzJ8;->d:LzJ8;

    :goto_2
    invoke-virtual {v0, v1}, LDI8;->f(LzJ8;)LDI8;

    invoke-virtual {p0}, Lhj1;->c()I

    move-result v1

    if-eq v1, v3, :cond_7

    if-eq v1, v2, :cond_6

    sget-object v1, LbJ8;->c:LbJ8;

    goto :goto_3

    :cond_6
    sget-object v1, LbJ8;->e:LbJ8;

    goto :goto_3

    :cond_7
    sget-object v1, LbJ8;->d:LbJ8;

    :goto_3
    invoke-virtual {v0, v1}, LDI8;->b(LbJ8;)LDI8;

    invoke-virtual {p0}, Lhj1;->g()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, LDI8;->c(Ljava/lang/Boolean;)LDI8;

    invoke-virtual {p0}, Lhj1;->a()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {v0, p0}, LDI8;->e(Ljava/lang/Float;)LDI8;

    invoke-virtual {v0}, LDI8;->k()LWJ8;

    move-result-object p0

    return-object p0
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-static {}, LhH8;->d()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const-string v0, "play-services-mlkit-face-detection"

    return-object v0

    :cond_0
    const-string v0, "face-detection"

    return-object v0
.end method

.method public static c(Ly49;ZLZN8;)V
    .locals 1

    new-instance v0, LCA8;

    invoke-direct {v0, p1, p2}, LCA8;-><init>(ZLZN8;)V

    sget-object p1, LlO8;->g:LlO8;

    invoke-virtual {p0, v0, p1}, Ly49;->c(Li49;LlO8;)V

    return-void
.end method

.method public static d()Z
    .locals 3

    sget-object v0, LhH8;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v1

    invoke-virtual {v1}, LyU2;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkf7;->b(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return v1
.end method

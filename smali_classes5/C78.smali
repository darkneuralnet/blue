.class public final LC78;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le28;


# instance fields
.field public final a:LH28;

.field public final b:Ljava/lang/String;

.field public final c:LS78;


# direct methods
.method public constructor <init>(LH28;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC78;->a:LH28;

    iput-object p2, p0, LC78;->b:Ljava/lang/String;

    new-instance v0, LS78;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, LS78;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v0, p0, LC78;->c:LS78;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->b(LS78;)I

    move-result v0

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    sget v0, Lcom/google/android/gms/internal/clearcut/c$e;->i:I

    return v0

    :cond_0
    sget v0, Lcom/google/android/gms/internal/clearcut/c$e;->j:I

    return v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->b(LS78;)I

    move-result v0

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()LH28;
    .locals 1

    iget-object v0, p0, LC78;->a:LH28;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->j(LS78;)I

    move-result v0

    return v0
.end method

.method public final e()LS78;
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->d(LS78;)I

    move-result v0

    return v0
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->e(LS78;)I

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->w(LS78;)I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->x(LS78;)I

    move-result v0

    return v0
.end method

.method public final j()[I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->y(LS78;)[I

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->z(LS78;)I

    move-result v0

    return v0
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, LC78;->c:LS78;

    invoke-static {v0}, LS78;->A(LS78;)I

    move-result v0

    return v0
.end method

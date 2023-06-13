.class public Lyu6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa0;


# instance fields
.field public final a:Lxa0;

.field public final b:LxY5;

.field public final c:J


# direct methods
.method public constructor <init>(LxY5;Lxa0;)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0, p2, p1, v0, v1}, Lyu6;-><init>(Lxa0;LxY5;J)V

    return-void
.end method

.method public constructor <init>(Lxa0;LxY5;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyu6;->a:Lxa0;

    iput-object p2, p0, Lyu6;->b:LxY5;

    iput-wide p3, p0, Lyu6;->c:J

    return-void
.end method


# virtual methods
.method public b()LxY5;
    .locals 1

    iget-object v0, p0, Lyu6;->b:LxY5;

    return-object v0
.end method

.method public c()Lua0;
    .locals 1

    iget-object v0, p0, Lyu6;->a:Lxa0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxa0;->c()Lua0;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lua0;->b:Lua0;

    :goto_0
    return-object v0
.end method

.method public d()Lva0;
    .locals 1

    iget-object v0, p0, Lyu6;->a:Lxa0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxa0;->d()Lva0;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lva0;->b:Lva0;

    :goto_0
    return-object v0
.end method

.method public e()Lsa0;
    .locals 1

    iget-object v0, p0, Lyu6;->a:Lxa0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxa0;->e()Lsa0;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lsa0;->b:Lsa0;

    :goto_0
    return-object v0
.end method

.method public f()Lwa0;
    .locals 1

    iget-object v0, p0, Lyu6;->a:Lxa0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxa0;->f()Lwa0;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lwa0;->b:Lwa0;

    :goto_0
    return-object v0
.end method

.method public getTimestamp()J
    .locals 4

    iget-object v0, p0, Lyu6;->a:Lxa0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxa0;->getTimestamp()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v0, p0, Lyu6;->c:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No timestamp is available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final Lnl7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXs7;


# instance fields
.field public final b:LXs7;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LXs7;->h0:LXs7;

    iput-object v0, p0, Lnl7;->b:LXs7;

    iput-object p1, p0, Lnl7;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LXs7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnl7;->b:LXs7;

    iput-object p1, p0, Lnl7;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()LXs7;
    .locals 1

    iget-object v0, p0, Lnl7;->b:LXs7;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnl7;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnl7;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lnl7;->c:Ljava/lang/String;

    check-cast p1, Lnl7;

    iget-object v3, p1, Lnl7;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnl7;->b:LXs7;

    iget-object p1, p1, Lnl7;->b:LXs7;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lnl7;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnl7;->b:LXs7;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final j()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final o(Ljava/lang/String;Lam8;Ljava/util/List;)LXs7;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Control does not have functions"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzd()LXs7;
    .locals 3

    new-instance v0, Lnl7;

    iget-object v1, p0, Lnl7;->c:Ljava/lang/String;

    iget-object v2, p0, Lnl7;->b:LXs7;

    invoke-interface {v2}, LXs7;->zzd()LXs7;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lnl7;-><init>(Ljava/lang/String;LXs7;)V

    return-object v0
.end method

.method public final zzg()Ljava/lang/Boolean;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Control is not a boolean"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzh()Ljava/lang/Double;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Control is not a double"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Control is not a String"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

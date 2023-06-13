.class public final LkU7;
.super LxT7;
.source "SourceFile"


# instance fields
.field public final b:LNZ7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LxT7;-><init>()V

    new-instance v0, LNZ7;

    invoke-direct {v0}, LNZ7;-><init>()V

    iput-object v0, p0, LkU7;->b:LNZ7;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LkU7;
    .locals 1

    iget-object p1, p0, LkU7;->b:LNZ7;

    const-string v0, "authToken"

    invoke-virtual {p1, v0}, LNZ7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LkU7;

    return-object p1
.end method

.method public final c(Ljava/lang/String;)LYU7;
    .locals 1

    iget-object v0, p0, LkU7;->b:LNZ7;

    invoke-virtual {v0, p1}, LNZ7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYU7;

    return-object p1
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LkU7;->b:LNZ7;

    invoke-virtual {v0}, LNZ7;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-eq p1, p0, :cond_2

    instance-of v1, p1, LkU7;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, LkU7;

    iget-object p1, p1, LkU7;->b:LNZ7;

    iget-object v1, p0, LkU7;->b:LNZ7;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v0, v2

    :cond_2
    :goto_0
    return v0
.end method

.method public final f(Ljava/lang/String;LxT7;)V
    .locals 1

    iget-object v0, p0, LkU7;->b:LNZ7;

    invoke-virtual {v0, p1, p2}, LNZ7;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LkU7;->b:LNZ7;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

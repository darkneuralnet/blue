.class public final LUm8;
.super LkW7;
.source "SourceFile"


# instance fields
.field public final b:LSn8;

.field public c:LKW7;

.field public final synthetic d:Lro8;


# direct methods
.method public constructor <init>(Lro8;)V
    .locals 2

    iput-object p1, p0, LUm8;->d:Lro8;

    invoke-direct {p0}, LkW7;-><init>()V

    new-instance v0, LSn8;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LSn8;-><init>(LgZ7;LEn8;)V

    iput-object v0, p0, LUm8;->b:LSn8;

    invoke-virtual {p0}, LUm8;->a()LKW7;

    move-result-object p1

    iput-object p1, p0, LUm8;->c:LKW7;

    return-void
.end method


# virtual methods
.method public final a()LKW7;
    .locals 2

    iget-object v0, p0, LUm8;->b:LSn8;

    invoke-virtual {v0}, LSn8;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LSn8;->a()LZW7;

    move-result-object v0

    invoke-virtual {v0}, LgZ7;->A()LKW7;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, LUm8;->c:LKW7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget-object v0, p0, LUm8;->c:LKW7;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LKW7;->zza()B

    move-result v0

    iget-object v1, p0, LUm8;->c:LKW7;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, LUm8;->a()LKW7;

    move-result-object v1

    iput-object v1, p0, LUm8;->c:LKW7;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

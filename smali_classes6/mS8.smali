.class public final LmS8;
.super LRQ8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "LRQ8<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final transient d:LvQ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvQ8<",
            "TK;*>;"
        }
    .end annotation
.end field

.field public final transient e:LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZP8<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LvQ8;LZP8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvQ8<",
            "TK;*>;",
            "LZP8<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LRQ8;-><init>()V

    iput-object p1, p0, LmS8;->d:LvQ8;

    iput-object p2, p0, LmS8;->e:LZP8;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, LmS8;->e:LZP8;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LXO8;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    iget-object v0, p0, LmS8;->d:LvQ8;

    invoke-virtual {v0, p1}, LvQ8;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e()LZP8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LmS8;->e:LZP8;

    return-object v0
.end method

.method public final f()LbU8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbU8<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LmS8;->e:LZP8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LZP8;->C(I)LnU8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LmS8;->e:LZP8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LZP8;->C(I)LnU8;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LmS8;->d:LvQ8;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

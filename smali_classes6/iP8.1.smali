.class public final LiP8;
.super LCO8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LCO8<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LCO8;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    const/4 p1, 0x4

    invoke-direct {p0, p1}, LCO8;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)LiP8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LiP8<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LCO8;->b(Ljava/lang/Object;)LCO8;

    return-object p0
.end method

.method public final e(Ljava/util/Iterator;)LiP8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TE;>;)",
            "LiP8<",
            "TE;>;"
        }
    .end annotation

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, v0}, LCO8;->b(Ljava/lang/Object;)LCO8;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final f()LZP8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LCO8;->c:Z

    iget-object v0, p0, LCO8;->a:[Ljava/lang/Object;

    iget v1, p0, LCO8;->b:I

    invoke-static {v0, v1}, LZP8;->w([Ljava/lang/Object;I)LZP8;

    move-result-object v0

    return-object v0
.end method

.class public final LGQ8;
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


# virtual methods
.method public final d(Ljava/lang/Object;)LGQ8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LGQ8<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0, p1}, LCO8;->b(Ljava/lang/Object;)LCO8;

    return-object p0
.end method

.method public final e()LRQ8;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LRQ8<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, LCO8;->b:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, LCO8;->a:[Ljava/lang/Object;

    invoke-static {v0, v2}, LRQ8;->u(I[Ljava/lang/Object;)LRQ8;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iput v2, p0, LCO8;->b:I

    iput-boolean v1, p0, LCO8;->c:Z

    return-object v0

    :cond_0
    iget-object v0, p0, LCO8;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LoT8;

    invoke-direct {v1, v0}, LoT8;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    sget-object v0, LSS8;->j:LSS8;

    return-object v0
.end method

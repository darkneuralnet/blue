.class public final Ls59;
.super LQ59;
.source "SourceFile"


# instance fields
.field public b:I

.field public final c:I

.field public final synthetic d:LT69;


# direct methods
.method public constructor <init>(LT69;)V
    .locals 1

    iput-object p1, p0, Ls59;->d:LT69;

    invoke-direct {p0}, LQ59;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ls59;->b:I

    invoke-virtual {p1}, LT69;->c()I

    move-result p1

    iput p1, p0, Ls59;->c:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Ls59;->b:I

    iget v1, p0, Ls59;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget v0, p0, Ls59;->b:I

    iget v1, p0, Ls59;->c:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ls59;->b:I

    iget-object v1, p0, Ls59;->d:LT69;

    invoke-virtual {v1, v0}, LT69;->b(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

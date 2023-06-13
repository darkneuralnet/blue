.class public final LOP8;
.super LZP8;
.source "SourceFile"


# instance fields
.field public final transient d:I

.field public final transient e:I

.field public final synthetic f:LZP8;


# direct methods
.method public constructor <init>(LZP8;II)V
    .locals 0

    iput-object p1, p0, LOP8;->f:LZP8;

    invoke-direct {p0}, LZP8;-><init>()V

    iput p2, p0, LOP8;->d:I

    iput p3, p0, LOP8;->e:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 2

    iget-object v0, p0, LOP8;->f:LZP8;

    invoke-virtual {v0}, LXO8;->c()I

    move-result v0

    iget v1, p0, LOP8;->d:I

    add-int/2addr v0, v1

    iget v1, p0, LOP8;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, LOP8;->f:LZP8;

    invoke-virtual {v0}, LXO8;->c()I

    move-result v0

    iget v1, p0, LOP8;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LOP8;->e:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LyK8;->a(IILjava/lang/String;)I

    iget-object v0, p0, LOP8;->f:LZP8;

    iget v1, p0, LOP8;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LOP8;->f:LZP8;

    invoke-virtual {v0}, LXO8;->j()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final s(II)LZP8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "LZP8;"
        }
    .end annotation

    iget v0, p0, LOP8;->e:I

    invoke-static {p1, p2, v0}, LyK8;->h(III)V

    iget-object v0, p0, LOP8;->f:LZP8;

    iget v1, p0, LOP8;->d:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, LZP8;->s(II)LZP8;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LOP8;->e:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZP8;->s(II)LZP8;

    move-result-object p1

    return-object p1
.end method

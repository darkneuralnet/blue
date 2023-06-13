.class public LVY1$e;
.super LVY1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LVY1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient d:I

.field public final transient e:I

.field public final synthetic f:LVY1;


# direct methods
.method public constructor <init>(LVY1;II)V
    .locals 0

    iput-object p1, p0, LVY1$e;->f:LVY1;

    invoke-direct {p0}, LVY1;-><init>()V

    iput p2, p0, LVY1$e;->d:I

    iput p3, p0, LVY1$e;->e:I

    return-void
.end method


# virtual methods
.method public N(II)LVY1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, LVY1$e;->e:I

    invoke-static {p1, p2, v0}, LEZ3;->s(III)V

    iget-object v0, p0, LVY1$e;->f:LVY1;

    iget v1, p0, LVY1$e;->d:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, LVY1;->N(II)LVY1;

    move-result-object p1

    return-object p1
.end method

.method public c()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVY1$e;->f:LVY1;

    invoke-virtual {v0}, LQY1;->c()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, LVY1$e;->f:LVY1;

    invoke-virtual {v0}, LQY1;->f()I

    move-result v0

    iget v1, p0, LVY1$e;->d:I

    add-int/2addr v0, v1

    iget v1, p0, LVY1$e;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, LVY1$e;->f:LVY1;

    invoke-virtual {v0}, LQY1;->f()I

    move-result v0

    iget v1, p0, LVY1$e;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, LVY1$e;->e:I

    invoke-static {p1, v0}, LEZ3;->l(II)I

    iget-object v0, p0, LVY1$e;->f:LVY1;

    iget v1, p0, LVY1$e;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, LVY1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, LVY1;->C()Lue6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, LVY1;->D(I)Lue6;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, LVY1$e;->e:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LVY1$e;->N(II)LVY1;

    move-result-object p1

    return-object p1
.end method

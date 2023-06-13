.class public final LOK7;
.super LeL7;
.source "SourceFile"


# instance fields
.field public final transient d:I

.field public final transient e:I

.field public final synthetic f:LeL7;


# direct methods
.method public constructor <init>(LeL7;II)V
    .locals 0

    iput-object p1, p0, LOK7;->f:LeL7;

    invoke-direct {p0}, LeL7;-><init>()V

    iput p2, p0, LOK7;->d:I

    iput p3, p0, LOK7;->e:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 2

    iget-object v0, p0, LOK7;->f:LeL7;

    invoke-virtual {v0}, LOI7;->c()I

    move-result v0

    iget v1, p0, LOK7;->d:I

    add-int/2addr v0, v1

    iget v1, p0, LOK7;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, LOK7;->f:LeL7;

    invoke-virtual {v0}, LOI7;->c()I

    move-result v0

    iget v1, p0, LOK7;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LOK7;->f:LeL7;

    invoke-virtual {v0}, LOI7;->f()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LOK7;->e:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LmA7;->a(IILjava/lang/String;)I

    iget-object v0, p0, LOK7;->f:LeL7;

    iget v1, p0, LOK7;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(II)LeL7;
    .locals 2

    iget v0, p0, LOK7;->e:I

    invoke-static {p1, p2, v0}, LmA7;->c(III)V

    iget-object v0, p0, LOK7;->f:LeL7;

    iget v1, p0, LOK7;->d:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, LeL7;->h(II)LeL7;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LOK7;->e:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LeL7;->h(II)LeL7;

    move-result-object p1

    return-object p1
.end method

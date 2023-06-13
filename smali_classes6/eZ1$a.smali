.class public final LeZ1$a;
.super LbZ1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LeZ1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LbZ1$a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final f:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LbZ1$a;-><init>()V

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Comparator;

    iput-object p1, p0, LeZ1$a;->f:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LQY1$b;
    .locals 0

    invoke-virtual {p0, p1}, LeZ1$a;->l(Ljava/lang/Object;)LeZ1$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;)LQY1$a;
    .locals 0

    invoke-virtual {p0, p1}, LeZ1$a;->l(Ljava/lang/Object;)LeZ1$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)LbZ1$a;
    .locals 0

    invoke-virtual {p0, p1}, LeZ1$a;->l(Ljava/lang/Object;)LeZ1$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k()LbZ1;
    .locals 1

    invoke-virtual {p0}, LeZ1$a;->n()LeZ1;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/Object;)LeZ1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LeZ1$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LbZ1$a;->h(Ljava/lang/Object;)LbZ1$a;

    return-object p0
.end method

.method public varargs m([Ljava/lang/Object;)LeZ1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "LeZ1$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LbZ1$a;->i([Ljava/lang/Object;)LbZ1$a;

    return-object p0
.end method

.method public n()LeZ1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LQY1$a;->a:[Ljava/lang/Object;

    iget-object v1, p0, LeZ1$a;->f:Ljava/util/Comparator;

    iget v2, p0, LQY1$a;->b:I

    invoke-static {v1, v2, v0}, LeZ1;->H(Ljava/util/Comparator;I[Ljava/lang/Object;)LeZ1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    iput v1, p0, LQY1$a;->b:I

    const/4 v1, 0x1

    iput-boolean v1, p0, LQY1$a;->c:Z

    return-object v0
.end method

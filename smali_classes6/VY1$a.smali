.class public final LVY1$a;
.super LQY1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVY1;
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
        "LQY1$a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LVY1$a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LQY1$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LQY1$b;
    .locals 0

    invoke-virtual {p0, p1}, LVY1$a;->h(Ljava/lang/Object;)LVY1$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;)LQY1$a;
    .locals 0

    invoke-virtual {p0, p1}, LVY1$a;->h(Ljava/lang/Object;)LVY1$a;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Object;)LVY1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LVY1$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LQY1$a;->d(Ljava/lang/Object;)LQY1$a;

    return-object p0
.end method

.method public i(Ljava/util/Iterator;)LVY1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TE;>;)",
            "LVY1$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LQY1$b;->b(Ljava/util/Iterator;)LQY1$b;

    return-object p0
.end method

.method public j()LVY1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LQY1$a;->c:Z

    iget-object v0, p0, LQY1$a;->a:[Ljava/lang/Object;

    iget v1, p0, LQY1$a;->b:I

    invoke-static {v0, v1}, LVY1;->s([Ljava/lang/Object;I)LVY1;

    move-result-object v0

    return-object v0
.end method

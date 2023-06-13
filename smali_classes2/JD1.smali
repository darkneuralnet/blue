.class public LJD1;
.super Lgl2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgl2<",
        "LHD1;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:LHD1;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfl2<",
            "LHD1;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lgl2;-><init>(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfl2;

    iget-object p1, p1, Lfl2;->b:Ljava/lang/Object;

    check-cast p1, LHD1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LHD1;->e()I

    move-result v0

    :goto_0
    new-instance p1, LHD1;

    new-array v1, v0, [F

    new-array v0, v0, [I

    invoke-direct {p1, v1, v0}, LHD1;-><init>([F[I)V

    iput-object p1, p0, LJD1;->i:LHD1;

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lfl2;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJD1;->p(Lfl2;F)LHD1;

    move-result-object p1

    return-object p1
.end method

.method public p(Lfl2;F)LHD1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl2<",
            "LHD1;",
            ">;F)",
            "LHD1;"
        }
    .end annotation

    iget-object v0, p0, LJD1;->i:LHD1;

    iget-object v1, p1, Lfl2;->b:Ljava/lang/Object;

    check-cast v1, LHD1;

    iget-object p1, p1, Lfl2;->c:Ljava/lang/Object;

    check-cast p1, LHD1;

    invoke-virtual {v0, v1, p1, p2}, LHD1;->f(LHD1;LHD1;F)V

    iget-object p1, p0, LJD1;->i:LHD1;

    return-object p1
.end method

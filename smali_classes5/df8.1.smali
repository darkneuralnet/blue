.class public final Ldf8;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements LWW7;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "LWW7;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final b:LWW7;


# direct methods
.method public constructor <init>(LWW7;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Ldf8;->b:LWW7;

    return-void
.end method

.method public static synthetic a(Ldf8;)LWW7;
    .locals 0

    iget-object p0, p0, Ldf8;->b:LWW7;

    return-object p0
.end method


# virtual methods
.method public final N2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ldf8;->b:LWW7;

    invoke-interface {v0}, LWW7;->N2()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldf8;->b:LWW7;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, LGf8;

    invoke-direct {v0, p0}, LGf8;-><init>(Ldf8;)V

    return-object v0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldf8;->b:LWW7;

    invoke-interface {v0, p1}, LWW7;->l(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsf8;

    invoke-direct {v0, p0, p1}, Lsf8;-><init>(Ldf8;I)V

    return-object v0
.end method

.method public final s3()LWW7;
    .locals 0

    return-object p0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Ldf8;->b:LWW7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

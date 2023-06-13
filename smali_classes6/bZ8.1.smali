.class public final LbZ8;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements LgM8;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "LgM8;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final b:LgM8;


# direct methods
.method public constructor <init>(LgM8;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LbZ8;->b:LgM8;

    return-void
.end method

.method public static synthetic a(LbZ8;)LgM8;
    .locals 0

    iget-object p0, p0, LbZ8;->b:LgM8;

    return-object p0
.end method


# virtual methods
.method public final X2(Lzy8;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final g(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LbZ8;->b:LgM8;

    invoke-interface {v0, p1}, LgM8;->g(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LbZ8;->b:LgM8;

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

    new-instance v0, Lc09;

    invoke-direct {v0, p0}, Lc09;-><init>(LbZ8;)V

    return-object v0
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

    new-instance v0, LRY8;

    invoke-direct {v0, p0, p1}, LRY8;-><init>(LbZ8;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LbZ8;->b:LgM8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zzd()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LbZ8;->b:LgM8;

    invoke-interface {v0}, LgM8;->zzd()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zze()LgM8;
    .locals 0

    return-object p0
.end method

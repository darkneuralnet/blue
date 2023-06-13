.class public final LXr9;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lko9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/util/RandomAccess;",
        "Lko9;"
    }
.end annotation


# instance fields
.field public final b:Lko9;


# direct methods
.method public constructor <init>(Lko9;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LXr9;->b:Lko9;

    return-void
.end method

.method public static synthetic a(LXr9;)Lko9;
    .locals 0

    iget-object p0, p0, LXr9;->b:Lko9;

    return-object p0
.end method


# virtual methods
.method public final P2(Lnh9;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXr9;->b:Lko9;

    check-cast v0, Lfo9;

    invoke-virtual {v0, p1}, Lfo9;->b(I)Ljava/lang/String;

    move-result-object p1

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

    new-instance v0, LVr9;

    invoke-direct {v0, p0}, LVr9;-><init>(LXr9;)V

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

    new-instance v0, LTr9;

    invoke-direct {v0, p0, p1}, LTr9;-><init>(LXr9;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LXr9;->b:Lko9;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lko9;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXr9;->b:Lko9;

    invoke-interface {v0, p1}, Lko9;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LXr9;->b:Lko9;

    invoke-interface {v0}, Lko9;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

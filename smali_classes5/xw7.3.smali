.class public final Lxw7;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements LOu7;


# instance fields
.field public final b:LOu7;


# direct methods
.method public constructor <init>(LOu7;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lxw7;->b:LOu7;

    return-void
.end method

.method public static synthetic a(Lxw7;)LOu7;
    .locals 0

    iget-object p0, p0, Lxw7;->b:LOu7;

    return-object p0
.end method


# virtual methods
.method public final H2(Lkt7;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxw7;->b:LOu7;

    check-cast v0, LNu7;

    invoke-virtual {v0, p1}, LNu7;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lww7;

    invoke-direct {v0, p0}, Lww7;-><init>(Lxw7;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lvw7;

    invoke-direct {v0, p0, p1}, Lvw7;-><init>(Lxw7;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lxw7;->b:LOu7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()LOu7;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxw7;->b:LOu7;

    invoke-interface {v0, p1}, LOu7;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lxw7;->b:LOu7;

    invoke-interface {v0}, LOu7;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

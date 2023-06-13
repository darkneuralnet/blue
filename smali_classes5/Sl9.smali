.class public final LSl9;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements LId9;


# instance fields
.field public final b:LId9;


# direct methods
.method public constructor <init>(LId9;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LSl9;->b:LId9;

    return-void
.end method

.method public static bridge synthetic a(LSl9;)LId9;
    .locals 0

    iget-object p0, p0, LSl9;->b:LId9;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSl9;->b:LId9;

    check-cast v0, LYc9;

    invoke-virtual {v0, p1}, LYc9;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lkl9;

    invoke-direct {v0, p0}, Lkl9;-><init>(LSl9;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lel9;

    invoke-direct {v0, p0, p1}, Lel9;-><init>(LSl9;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LSl9;->b:LId9;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()LId9;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSl9;->b:LId9;

    invoke-interface {v0, p1}, LId9;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LSl9;->b:LId9;

    invoke-interface {v0}, LId9;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

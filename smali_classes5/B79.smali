.class public final LB79;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements LsX8;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final b:LsX8;


# direct methods
.method public constructor <init>(LsX8;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LB79;->b:LsX8;

    return-void
.end method

.method public static bridge synthetic a(LB79;)LsX8;
    .locals 0

    iget-object p0, p0, LB79;->b:LsX8;

    return-object p0
.end method


# virtual methods
.method public final I0(LfO8;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB79;->b:LsX8;

    check-cast v0, LiX8;

    invoke-virtual {v0, p1}, LiX8;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lu79;

    invoke-direct {v0, p0}, Lu79;-><init>(LB79;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lm79;

    invoke-direct {v0, p0, p1}, Lm79;-><init>(LB79;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LB79;->b:LsX8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()LsX8;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB79;->b:LsX8;

    invoke-interface {v0, p1}, LsX8;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LB79;->b:LsX8;

    invoke-interface {v0}, LsX8;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

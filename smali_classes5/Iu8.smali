.class public final LIu8;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lid8;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final b:Lid8;


# direct methods
.method public constructor <init>(Lid8;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LIu8;->b:Lid8;

    return-void
.end method

.method public static bridge synthetic a(LIu8;)Lid8;
    .locals 0

    iget-object p0, p0, LIu8;->b:Lid8;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LIu8;->b:Lid8;

    check-cast v0, LZc8;

    invoke-virtual {v0, p1}, LZc8;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Luu8;

    invoke-direct {v0, p0}, Luu8;-><init>(LIu8;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Liu8;

    invoke-direct {v0, p0, p1}, Liu8;-><init>(LIu8;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LIu8;->b:Lid8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lid8;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LIu8;->b:Lid8;

    invoke-interface {v0, p1}, Lid8;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LIu8;->b:Lid8;

    invoke-interface {v0}, Lid8;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

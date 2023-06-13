.class public final LNr8;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lmf8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/util/RandomAccess;",
        "Lmf8;"
    }
.end annotation


# instance fields
.field public final b:Lmf8;


# direct methods
.method public constructor <init>(Lmf8;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LNr8;->b:Lmf8;

    return-void
.end method

.method public static synthetic a(LNr8;)Lmf8;
    .locals 0

    iget-object p0, p0, LNr8;->b:Lmf8;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNr8;->b:Lmf8;

    check-cast v0, Lfe8;

    invoke-virtual {v0, p1}, Lfe8;->b(I)Ljava/lang/String;

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

    new-instance v0, LBr8;

    invoke-direct {v0, p0}, LBr8;-><init>(LNr8;)V

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

    new-instance v0, Lpr8;

    invoke-direct {v0, p0, p1}, Lpr8;-><init>(LNr8;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LNr8;->b:Lmf8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lmf8;
    .locals 0

    return-object p0
.end method

.method public final zzg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LNr8;->b:Lmf8;

    invoke-interface {v0}, Lmf8;->zzg()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

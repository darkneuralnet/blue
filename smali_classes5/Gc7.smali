.class public final LGc7;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements LAb7;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final b:LAb7;


# direct methods
.method public constructor <init>(LAb7;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LGc7;->b:LAb7;

    return-void
.end method

.method public static bridge synthetic a(LGc7;)LAb7;
    .locals 0

    iget-object p0, p0, LGc7;->b:LAb7;

    return-object p0
.end method


# virtual methods
.method public final B()LAb7;
    .locals 0

    return-object p0
.end method

.method public final R0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LGc7;->b:LAb7;

    invoke-interface {v0}, LAb7;->R0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c1(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LGc7;->b:LAb7;

    invoke-interface {v0, p1}, LAb7;->c1(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LGc7;->b:LAb7;

    check-cast v0, Lzb7;

    invoke-virtual {v0, p1}, Lzb7;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LFc7;

    invoke-direct {v0, p0}, LFc7;-><init>(LGc7;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, LEc7;

    invoke-direct {v0, p0, p1}, LEc7;-><init>(LGc7;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LGc7;->b:LAb7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

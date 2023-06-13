.class public final Ldb7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSa7;


# instance fields
.field public final b:I

.field public final c:LRc7;


# direct methods
.method public constructor <init>(Lib7;ILRc7;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p1, 0x1ea8e13

    iput p1, p0, Ldb7;->b:I

    iput-object p3, p0, Ldb7;->c:LRc7;

    return-void
.end method


# virtual methods
.method public final B()LSc7;
    .locals 1

    iget-object v0, p0, Ldb7;->c:LRc7;

    invoke-virtual {v0}, LRc7;->a()LSc7;

    move-result-object v0

    return-object v0
.end method

.method public final Q0(Lbc7;Lbc7;)Lbc7;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ldb7;

    iget p1, p1, Ldb7;->b:I

    const/4 p1, 0x0

    return p1
.end method

.method public final i0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final n0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x3(LSb7;LTb7;)LSb7;
    .locals 1

    check-cast p2, Lfb7;

    move-object v0, p1

    check-cast v0, Lab7;

    invoke-virtual {v0, p2}, Lab7;->n(Lfb7;)Lab7;

    return-object p1
.end method

.method public final y()I
    .locals 1

    const v0, 0x1ea8e13

    return v0
.end method

.method public final zbd()LRc7;
    .locals 1

    iget-object v0, p0, Ldb7;->c:LRc7;

    return-object v0
.end method

.class public final LiE1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lbu0;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0002R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "LiE1;",
        "",
        "Lbu0;",
        "",
        "hasNext",
        "a",
        "",
        "b",
        "LnE5;",
        "LnE5;",
        "getTable",
        "()LnE5;",
        "table",
        "",
        "c",
        "I",
        "getEnd",
        "()I",
        "end",
        "d",
        "index",
        "e",
        "version",
        "start",
        "<init>",
        "(LnE5;II)V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LnE5;

.field public final c:I

.field public d:I

.field public final e:I


# direct methods
.method public constructor <init>(LnE5;II)V
    .locals 1

    const-string v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiE1;->b:LnE5;

    iput p3, p0, LiE1;->c:I

    iput p2, p0, LiE1;->d:I

    invoke-virtual {p1}, LnE5;->v()I

    move-result p2

    iput p2, p0, LiE1;->e:I

    invoke-virtual {p1}, LnE5;->w()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a()Lbu0;
    .locals 4

    invoke-virtual {p0}, LiE1;->b()V

    iget v0, p0, LiE1;->d:I

    iget-object v1, p0, LiE1;->b:LnE5;

    invoke-virtual {v1}, LnE5;->j()[I

    move-result-object v1

    invoke-static {v1, v0}, LpE5;->g([II)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, LiE1;->d:I

    new-instance v1, LoE5;

    iget-object v2, p0, LiE1;->b:LnE5;

    iget v3, p0, LiE1;->e:I

    invoke-direct {v1, v2, v0, v3}, LoE5;-><init>(LnE5;II)V

    return-object v1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LiE1;->b:LnE5;

    invoke-virtual {v0}, LnE5;->v()I

    move-result v0

    iget v1, p0, LiE1;->e:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, LiE1;->d:I

    iget v1, p0, LiE1;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LiE1;->a()Lbu0;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

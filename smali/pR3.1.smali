.class public abstract LpR3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010(\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008 \u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u00032\u0008\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0010\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010\u0005\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\u0008\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u0010\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0002J\u0008\u0010\u000f\u001a\u00020\rH\u0002R2\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u00108\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\n8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u0008\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u001c\u0012\u0004\u0008\u001d\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "LpR3;",
        "K",
        "V",
        "T",
        "",
        "b",
        "()Ljava/lang/Object;",
        "",
        "hasNext",
        "next",
        "",
        "pathIndex",
        "e",
        "",
        "c",
        "a",
        "",
        "Lra6;",
        "[Lra6;",
        "d",
        "()[Lra6;",
        "path",
        "I",
        "getPathLastIndex",
        "()I",
        "f",
        "(I)V",
        "pathLastIndex",
        "Z",
        "getHasNext$annotations",
        "()V",
        "Lqa6;",
        "node",
        "<init>",
        "(Lqa6;[Lra6;)V",
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
.field public final b:[Lra6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lra6<",
            "TK;TV;TT;>;"
        }
    .end annotation
.end field

.field public c:I

.field public d:Z


# direct methods
.method public constructor <init>(Lqa6;[Lra6;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqa6<",
            "TK;TV;>;[",
            "Lra6<",
            "TK;TV;TT;>;)V"
        }
    .end annotation

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LpR3;->b:[Lra6;

    const/4 v0, 0x1

    iput-boolean v0, p0, LpR3;->d:Z

    const/4 v0, 0x0

    aget-object p2, p2, v0

    invoke-virtual {p1}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Lqa6;->m()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p2, v1, p1}, Lra6;->i([Ljava/lang/Object;I)V

    iput v0, p0, LpR3;->c:I

    invoke-virtual {p0}, LpR3;->c()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    invoke-virtual {p0}, LpR3;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, LpR3;->a()V

    iget-object v0, p0, LpR3;->b:[Lra6;

    iget v1, p0, LpR3;->c:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lra6;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, LpR3;->b:[Lra6;

    iget v1, p0, LpR3;->c:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lra6;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, LpR3;->c:I

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ge v2, v0, :cond_4

    invoke-virtual {p0, v0}, LpR3;->e(I)I

    move-result v3

    if-ne v3, v2, :cond_1

    iget-object v4, p0, LpR3;->b:[Lra6;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Lra6;->f()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v3, p0, LpR3;->b:[Lra6;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lra6;->h()V

    invoke-virtual {p0, v0}, LpR3;->e(I)I

    move-result v3

    :cond_1
    if-eq v3, v2, :cond_2

    iput v3, p0, LpR3;->c:I

    return-void

    :cond_2
    if-lez v0, :cond_3

    iget-object v2, p0, LpR3;->b:[Lra6;

    add-int/lit8 v3, v0, -0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lra6;->h()V

    :cond_3
    iget-object v2, p0, LpR3;->b:[Lra6;

    aget-object v2, v2, v0

    sget-object v3, Lqa6;->e:Lqa6$a;

    invoke-virtual {v3}, Lqa6$a;->a()Lqa6;

    move-result-object v3

    invoke-virtual {v3}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lra6;->i([Ljava/lang/Object;I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    iput-boolean v1, p0, LpR3;->d:Z

    return-void
.end method

.method public final d()[Lra6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lra6<",
            "TK;TV;TT;>;"
        }
    .end annotation

    iget-object v0, p0, LpR3;->b:[Lra6;

    return-object v0
.end method

.method public final e(I)I
    .locals 3

    iget-object v0, p0, LpR3;->b:[Lra6;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lra6;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return p1

    :cond_0
    iget-object v0, p0, LpR3;->b:[Lra6;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lra6;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LpR3;->b:[Lra6;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lra6;->b()Lqa6;

    move-result-object v0

    const/4 v1, 0x6

    if-ne p1, v1, :cond_1

    iget-object v1, p0, LpR3;->b:[Lra6;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v2, v0}, Lra6;->i([Ljava/lang/Object;I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LpR3;->b:[Lra6;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lqa6;->m()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {v1, v2, v0}, Lra6;->i([Ljava/lang/Object;I)V

    :goto_0
    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, LpR3;->e(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, LpR3;->c:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, LpR3;->d:Z

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LpR3;->a()V

    iget-object v0, p0, LpR3;->b:[Lra6;

    iget v1, p0, LpR3;->c:I

    aget-object v0, v0, v1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LpR3;->c()V

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

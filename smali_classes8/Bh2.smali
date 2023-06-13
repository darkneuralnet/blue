.class public LBh2;
.super LSh2;
.source "SourceFile"

# interfaces
.implements Lms0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0003R\u001a\u0010\u000c\u001a\u00020\u00058\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "LBh2;",
        "LSh2;",
        "Lms0;",
        "",
        "exception",
        "",
        "a",
        "b1",
        "c",
        "Z",
        "p0",
        "()Z",
        "handlesException",
        "q0",
        "onCancelComplete",
        "Lzh2;",
        "parent",
        "<init>",
        "(Lzh2;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>(Lzh2;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LSh2;-><init>(Z)V

    invoke-virtual {p0, p1}, LSh2;->w0(Lzh2;)V

    invoke-virtual {p0}, LBh2;->b1()Z

    move-result p1

    iput-boolean p1, p0, LBh2;->c:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, Lqs0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lqs0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, LSh2;->B0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b1()Z
    .locals 4

    invoke-virtual {p0}, LSh2;->s0()LJi0;

    move-result-object v0

    instance-of v1, v0, LKi0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LKi0;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LPh2;->Q()LSh2;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, LSh2;->p0()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, LSh2;->s0()LJi0;

    move-result-object v0

    instance-of v3, v0, LKi0;

    if-eqz v3, :cond_3

    check-cast v0, LKi0;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LPh2;->Q()LSh2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method

.method public p0()Z
    .locals 1

    iget-boolean v0, p0, LBh2;->c:Z

    return v0
.end method

.method public q0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

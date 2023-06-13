.class public final LFM5;
.super LZD3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LZD3<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\"\u0010\t\u001a\u00020\u00072\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0014R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LFM5;",
        "",
        "T",
        "LZD3;",
        "Lkotlin/Function2;",
        "Lpt2;",
        "Lot2;",
        "",
        "callback",
        "w",
        "",
        "index",
        "M",
        "l",
        "LZD3;",
        "pagedList",
        "",
        "m",
        "Z",
        "J",
        "()Z",
        "isImmutable",
        "n",
        "I",
        "isDetached",
        "A",
        "()Ljava/lang/Object;",
        "lastKey",
        "<init>",
        "(LZD3;)V",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final l:LZD3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZD3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final m:Z

.field public final n:Z


# direct methods
.method public constructor <init>(LZD3;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "pagedList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZD3;->E()LfE3;

    move-result-object v2

    invoke-virtual {p1}, LZD3;->z()LZC0;

    move-result-object v3

    invoke-virtual {p1}, LZD3;->C()LSC0;

    move-result-object v4

    invoke-virtual {p1}, LZD3;->H()LbE3;

    move-result-object v0

    invoke-virtual {v0}, LbE3;->I()LbE3;

    move-result-object v5

    invoke-virtual {p1}, LZD3;->y()LZD3$d;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LZD3;-><init>(LfE3;LZC0;LSC0;LbE3;LZD3$d;)V

    iput-object p1, p0, LFM5;->l:LZD3;

    const/4 p1, 0x1

    iput-boolean p1, p0, LFM5;->m:Z

    iput-boolean p1, p0, LFM5;->n:Z

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFM5;->l:LZD3;

    invoke-virtual {v0}, LZD3;->A()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public I()Z
    .locals 1

    iget-boolean v0, p0, LFM5;->n:Z

    return v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, LFM5;->m:Z

    return v0
.end method

.method public M(I)V
    .locals 0

    return-void
.end method

.method public w(Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lpt2;",
            "-",
            "Lot2;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

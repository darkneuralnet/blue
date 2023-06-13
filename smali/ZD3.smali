.class public abstract LZD3;
.super Ljava/util/AbstractList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZD3$c;,
        LZD3$b;,
        LZD3$d;,
        LZD3$a;,
        LZD3$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "PagedList is deprecated and has been replaced by PagingData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\'\u0018\u0000 h*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0005i-39?BA\u0008\u0000\u0012\u0010\u00101\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00028\u00000,\u0012\u0006\u00107\u001a\u000202\u0012\u0006\u0010=\u001a\u000208\u0012\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00028\u00000>\u0012\u0006\u0010I\u001a\u00020D\u00a2\u0006\u0004\u0008f\u0010gJ\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J\u0008\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\r\u001a\u00020\u000b2\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0008H\'J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\'J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\nH\u0017J\u0012\u0010\u0015\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001dJ \u0010 \u001a\u00020\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0008J \u0010\u0002\u001a\u00020\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0008J \u0010#\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0006\u0010\u000c\u001a\u00020\"H\u0007J\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\"J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0007J\u0018\u0010+\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0007R$\u00101\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00028\u00000,8\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u001a\u00107\u001a\u0002028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u001a\u0010=\u001a\u0002088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R \u0010C\u001a\u0008\u0012\u0004\u0012\u00028\u00000>8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u0017\u0010I\u001a\u00020D8\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010OR\u001a\u0010T\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR \u0010Y\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\"0V0U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR2\u0010[\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00080V0U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010XR\u0014\u0010]\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010SR\u0016\u0010`\u001a\u0004\u0018\u00010\u00018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_R\u0014\u0010c\u001a\u00020a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010bR\u0014\u0010e\u001a\u00020a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010b\u00a8\u0006j"
    }
    d2 = {
        "LZD3;",
        "",
        "T",
        "Ljava/util/AbstractList;",
        "Lnd3;",
        "D",
        "",
        "K",
        "Lkotlin/Function2;",
        "Lpt2;",
        "Lot2;",
        "",
        "callback",
        "w",
        "index",
        "M",
        "loadType",
        "loadState",
        "U",
        "Ljava/lang/Runnable;",
        "refreshRetryCallback",
        "V",
        "type",
        "state",
        "x",
        "(Lpt2;Lot2;)V",
        "get",
        "(I)Ljava/lang/Object;",
        "L",
        "",
        "X",
        "listener",
        "v",
        "previousSnapshot",
        "LZD3$b;",
        "u",
        "s",
        "S",
        "position",
        "count",
        "O",
        "(II)V",
        "N",
        "Q",
        "LfE3;",
        "b",
        "LfE3;",
        "E",
        "()LfE3;",
        "pagingSource",
        "LZC0;",
        "c",
        "LZC0;",
        "z",
        "()LZC0;",
        "coroutineScope",
        "LSC0;",
        "d",
        "LSC0;",
        "C",
        "()LSC0;",
        "notifyDispatcher",
        "LbE3;",
        "e",
        "LbE3;",
        "H",
        "()LbE3;",
        "storage",
        "LZD3$d;",
        "f",
        "LZD3$d;",
        "y",
        "()LZD3$d;",
        "config",
        "g",
        "Ljava/lang/Runnable;",
        "getRefreshRetryCallback$paging_common",
        "()Ljava/lang/Runnable;",
        "setRefreshRetryCallback$paging_common",
        "(Ljava/lang/Runnable;)V",
        "h",
        "I",
        "F",
        "()I",
        "requiredRemainder",
        "",
        "Ljava/lang/ref/WeakReference;",
        "i",
        "Ljava/util/List;",
        "callbacks",
        "j",
        "loadStateListeners",
        "G",
        "size",
        "A",
        "()Ljava/lang/Object;",
        "lastKey",
        "",
        "()Z",
        "isDetached",
        "J",
        "isImmutable",
        "<init>",
        "(LfE3;LZC0;LSC0;LbE3;LZD3$d;)V",
        "k",
        "a",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final k:LZD3$c;


# instance fields
.field public final b:LfE3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LfE3<",
            "*TT;>;"
        }
    .end annotation
.end field

.field public final c:LZC0;

.field public final d:LSC0;

.field public final e:LbE3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbE3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final f:LZD3$d;

.field public g:Ljava/lang/Runnable;

.field public final h:I

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "LZD3$b;",
            ">;>;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lkotlin/jvm/functions/Function2<",
            "Lpt2;",
            "Lot2;",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LZD3$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZD3$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZD3;->k:LZD3$c;

    return-void
.end method

.method public constructor <init>(LfE3;LZC0;LSC0;LbE3;LZD3$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfE3<",
            "*TT;>;",
            "LZC0;",
            "LSC0;",
            "LbE3<",
            "TT;>;",
            "LZD3$d;",
            ")V"
        }
    .end annotation

    const-string v0, "pagingSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notifyDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LZD3;->b:LfE3;

    iput-object p2, p0, LZD3;->c:LZC0;

    iput-object p3, p0, LZD3;->d:LSC0;

    iput-object p4, p0, LZD3;->e:LbE3;

    iput-object p5, p0, LZD3;->f:LZD3$d;

    iget p1, p5, LZD3$d;->b:I

    mul-int/lit8 p1, p1, 0x2

    iget p2, p5, LZD3$d;->a:I

    add-int/2addr p1, p2

    iput p1, p0, LZD3;->h:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LZD3;->i:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LZD3;->j:Ljava/util/List;

    return-void
.end method

.method public static final synthetic o(LZD3;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LZD3;->j:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public abstract A()Ljava/lang/Object;
.end method

.method public final C()LSC0;
    .locals 1

    iget-object v0, p0, LZD3;->d:LSC0;

    return-object v0
.end method

.method public final D()Lnd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnd3<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LZD3;->e:LbE3;

    return-object v0
.end method

.method public E()LfE3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LfE3<",
            "*TT;>;"
        }
    .end annotation

    iget-object v0, p0, LZD3;->b:LfE3;

    return-object v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, LZD3;->h:I

    return v0
.end method

.method public G()I
    .locals 1

    iget-object v0, p0, LZD3;->e:LbE3;

    invoke-virtual {v0}, LbE3;->size()I

    move-result v0

    return v0
.end method

.method public final H()LbE3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbE3<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LZD3;->e:LbE3;

    return-object v0
.end method

.method public abstract I()Z
.end method

.method public J()Z
    .locals 1

    invoke-virtual {p0}, LZD3;->I()Z

    move-result v0

    return v0
.end method

.method public final K()I
    .locals 1

    iget-object v0, p0, LZD3;->e:LbE3;

    invoke-virtual {v0}, LbE3;->u()I

    move-result v0

    return v0
.end method

.method public final L(I)V
    .locals 3

    if-ltz p1, :cond_0

    invoke-virtual {p0}, LZD3;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, LZD3;->e:LbE3;

    invoke-virtual {v0, p1}, LbE3;->G(I)V

    invoke-virtual {p0, p1}, LZD3;->M(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LZD3;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract M(I)V
.end method

.method public final N(II)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LZD3;->i:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZD3$b;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, p2}, LZD3$b;->a(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final O(II)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LZD3;->i:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZD3$b;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, p2}, LZD3$b;->b(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final Q(II)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LZD3;->i:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZD3$b;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, p2}, LZD3$b;->c(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public bridge R(I)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final S(LZD3$b;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZD3;->i:Ljava/util/List;

    new-instance v1, LZD3$i;

    invoke-direct {v1, p1}, LZD3$i;-><init>(LZD3$b;)V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method

.method public final T(Lkotlin/jvm/functions/Function2;)V
    .locals 2
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

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZD3;->j:Ljava/util/List;

    new-instance v1, LZD3$j;

    invoke-direct {v1, p1}, LZD3$j;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method

.method public U(Lpt2;Lot2;)V
    .locals 1

    const-string v0, "loadType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "loadState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final V(Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, LZD3;->g:Ljava/lang/Runnable;

    return-void
.end method

.method public final X()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LZD3;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LFM5;

    invoke-direct {v0, p0}, LFM5;-><init>(LZD3;)V

    :goto_0
    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, LZD3;->e:LbE3;

    invoke-virtual {v0, p1}, LbE3;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LZD3;->R(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final s(LZD3$b;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZD3;->i:Ljava/util/List;

    sget-object v1, LZD3$f;->g:LZD3$f;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    iget-object v0, p0, LZD3;->i:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LZD3;->G()I

    move-result v0

    return v0
.end method

.method public final u(Ljava/util/List;LZD3$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "LZD3$b;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot()."
    .end annotation

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    if-eq p1, p0, :cond_0

    sget-object v0, LZD3;->k:LZD3$c;

    invoke-virtual {p0}, LZD3;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0, v1, p1, p2}, LZD3$c;->b(IILZD3$b;)V

    :cond_0
    invoke-virtual {p0, p2}, LZD3;->s(LZD3$b;)V

    return-void
.end method

.method public final v(Lkotlin/jvm/functions/Function2;)V
    .locals 2
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

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZD3;->j:Ljava/util/List;

    sget-object v1, LZD3$g;->g:LZD3$g;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    iget-object v0, p0, LZD3;->j:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, LZD3;->w(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public abstract w(Lkotlin/jvm/functions/Function2;)V
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
.end method

.method public final x(Lpt2;Lot2;)V
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LZD3;->c:LZC0;

    iget-object v2, p0, LZD3;->d:LSC0;

    const/4 v3, 0x0

    new-instance v4, LZD3$h;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, LZD3$h;-><init>(LZD3;Lpt2;Lot2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final y()LZD3$d;
    .locals 1

    iget-object v0, p0, LZD3;->f:LZD3$d;

    return-object v0
.end method

.method public final z()LZC0;
    .locals 1

    iget-object v0, p0, LZD3;->c:LZC0;

    return-object v0
.end method

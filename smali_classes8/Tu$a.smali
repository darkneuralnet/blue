.class public final LTu$a;
.super LPh2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\u0008\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LTu$a;",
        "LPh2;",
        "",
        "cause",
        "",
        "P",
        "(Ljava/lang/Throwable;)V",
        "LWc0;",
        "",
        "f",
        "LWc0;",
        "continuation",
        "Lo51;",
        "g",
        "Lo51;",
        "U",
        "()Lo51;",
        "W",
        "(Lo51;)V",
        "handle",
        "LTu$b;",
        "LTu;",
        "value",
        "T",
        "()LTu$b;",
        "V",
        "(LTu$b;)V",
        "disposer",
        "<init>",
        "(LTu;LWc0;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private volatile synthetic _disposer:Ljava/lang/Object;

.field public final f:LWc0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWc0<",
            "Ljava/util/List<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field public g:Lo51;

.field public final synthetic h:LTu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTu<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LTu;LWc0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LTu$a;->h:LTu;

    invoke-direct {p0}, LPh2;-><init>()V

    iput-object p2, p0, LTu$a;->f:LWc0;

    const/4 p1, 0x0

    iput-object p1, p0, LTu$a;->_disposer:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public P(Ljava/lang/Throwable;)V
    .locals 5

    if-eqz p1, :cond_0

    iget-object v0, p0, LTu$a;->f:LWc0;

    invoke-interface {v0, p1}, LWc0;->L(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LTu$a;->f:LWc0;

    invoke-interface {v0, p1}, LWc0;->B(Ljava/lang/Object;)V

    invoke-virtual {p0}, LTu$a;->T()LTu$b;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LTu$b;->b()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, LTu$a;->h:LTu;

    sget-object v0, LTu;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LTu$a;->f:LWc0;

    iget-object v0, p0, LTu$a;->h:LTu;

    invoke-static {v0}, LTu;->a(LTu;)[LhZ0;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, LhZ0;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final T()LTu$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LTu<",
            "TT;>.b;"
        }
    .end annotation

    iget-object v0, p0, LTu$a;->_disposer:Ljava/lang/Object;

    check-cast v0, LTu$b;

    return-object v0
.end method

.method public final U()Lo51;
    .locals 1

    iget-object v0, p0, LTu$a;->g:Lo51;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "handle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final V(LTu$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTu<",
            "TT;>.b;)V"
        }
    .end annotation

    iput-object p1, p0, LTu$a;->_disposer:Ljava/lang/Object;

    return-void
.end method

.method public final W(Lo51;)V
    .locals 0

    iput-object p1, p0, LTu$a;->g:Lo51;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LTu$a;->P(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

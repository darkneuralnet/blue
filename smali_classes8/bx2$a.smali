.class public abstract Lbx2$a;
.super Lop;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbx2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0006\u0010\u0001\u001a\u00020\u0002H\u0014J\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004H\u0014J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0014J \u0010\r\u001a\u00020\u000c2\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H$J \u0010\u000e\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H&J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0014\u0010\u0013\u001a\u00020\u000c2\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\u0010\u0001\u001a\u0006\u0012\u0002\u0008\u00030\u0014J\u001c\u0010\u0017\u001a\u00020\u000c2\n\u0010\u0001\u001a\u0006\u0012\u0002\u0008\u00030\u00142\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0007R\u001c\u0010\u001a\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lbx2$a;",
        "Lop;",
        "LGh3;",
        "Lbx2;",
        "Lkotlinx/coroutines/internal/Node;",
        "m",
        "affected",
        "",
        "e",
        "next",
        "",
        "l",
        "",
        "f",
        "n",
        "Lbx2$c;",
        "prepareOp",
        "g",
        "j",
        "k",
        "Lrp;",
        "c",
        "failure",
        "a",
        "h",
        "()Lbx2;",
        "affectedNode",
        "i",
        "originalNext",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lop;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lrp;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0}, Lbx2$a;->h()Lbx2;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lbx2$a;->i()Lbx2;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0, v0, v1}, Lbx2$a;->n(Lbx2;Lbx2;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    sget-object v3, Lbx2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, v0, p1, v2}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {p0, v0, v1}, Lbx2$a;->f(Lbx2;Lbx2;)V

    :cond_4
    return-void
.end method

.method public final c(Lrp;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lbx2$a;->m(LGh3;)Lbx2;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, Lqp;->b:Ljava/lang/Object;

    return-object p1

    :cond_1
    iget-object v1, v0, Lbx2;->_next:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p1}, Lrp;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    instance-of v3, v1, LGh3;

    if-eqz v3, :cond_5

    check-cast v1, LGh3;

    invoke-virtual {p1, v1}, LGh3;->b(LGh3;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object p1, Lqp;->b:Ljava/lang/Object;

    return-object p1

    :cond_4
    invoke-virtual {v1, v0}, LGh3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v0}, Lbx2$a;->e(Lbx2;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    return-object v3

    :cond_6
    invoke-virtual {p0, v0, v1}, Lbx2$a;->l(Lbx2;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lbx2$c;

    move-object v4, v1

    check-cast v4, Lbx2;

    invoke-direct {v3, v0, v4, p0}, Lbx2$c;-><init>(Lbx2;Lbx2;Lbx2$a;)V

    sget-object v4, Lbx2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v1, v3}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-virtual {v3, v0}, Lbx2$c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v0, Lcx2;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v0, :cond_0

    return-object v2

    :catchall_0
    move-exception p1

    sget-object v2, Lbx2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, v0, v3, v1}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
.end method

.method public e(Lbx2;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract f(Lbx2;Lbx2;)V
.end method

.method public abstract g(Lbx2$c;)V
.end method

.method public abstract h()Lbx2;
.end method

.method public abstract i()Lbx2;
.end method

.method public j(Lbx2$c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lbx2$a;->g(Lbx2$c;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public k(Lbx2;)V
    .locals 0

    return-void
.end method

.method public l(Lbx2;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public m(LGh3;)Lbx2;
    .locals 0

    invoke-virtual {p0}, Lbx2$a;->h()Lbx2;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public abstract n(Lbx2;Lbx2;)Ljava/lang/Object;
.end method

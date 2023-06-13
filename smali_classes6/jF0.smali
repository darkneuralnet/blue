.class public final LjF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzd6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjF0$a;
    }
.end annotation


# instance fields
.field public a:LcD1;

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "LMX3;",
            "LhF0;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lnf3;

.field public d:LRG6;

.field public e:LjF0$a;


# direct methods
.method public constructor <init>(LcD1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LRG6;

    const-string v1, "HandlerThread"

    invoke-direct {v0, v1}, LRG6;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LjF0;->d:LRG6;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, LjF0;->d:LRG6;

    invoke-virtual {v0, p0}, LRG6;->d(Lzd6;)V

    new-instance v0, LjF0$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LjF0$a;-><init>(LjF0;Landroid/os/Looper;)V

    iput-object v0, p0, LjF0;->e:LjF0$a;

    iput-object p1, p0, LjF0;->a:LcD1;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LjF0;->b:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic b(LjF0;)LcD1;
    .locals 0

    iget-object p0, p0, LjF0;->a:LcD1;

    return-object p0
.end method

.method public static synthetic c(LjF0;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, LjF0;->b:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic d(LjF0;)Lnf3;
    .locals 0

    iget-object p0, p0, LjF0;->c:Lnf3;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, LjF0;->e:LjF0$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public final e(LkF0;)V
    .locals 3

    invoke-virtual {p1}, LkF0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LkF0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    new-instance v0, LyT2;

    iget-object v2, p0, LjF0;->a:LcD1;

    invoke-virtual {v2}, LcD1;->k()LU74;

    move-result-object v2

    invoke-direct {v0, p1, v2}, LyT2;-><init>(LkF0;LU74;)V

    const/4 p1, 0x0

    invoke-static {p1, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, LjF0;->d:LRG6;

    invoke-virtual {v0, p1}, LRG6;->a(Landroid/os/Message;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Requires at least two LatLng points"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(LkF0;)V
    .locals 0

    invoke-virtual {p0, p1}, LjF0;->e(LkF0;)V

    return-void
.end method

.method public final g(LMX3;)V
    .locals 1

    iget-object v0, p0, LjF0;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(Lnf3;)V
    .locals 0

    iput-object p1, p0, LjF0;->c:Lnf3;

    return-void
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, LjF0;->e:LjF0$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iput-object v1, p0, LjF0;->e:LjF0$a;

    :cond_0
    iget-object v0, p0, LjF0;->b:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iput-object v1, p0, LjF0;->b:Ljava/util/HashMap;

    :cond_1
    iget-object v0, p0, LjF0;->c:Lnf3;

    if-eqz v0, :cond_2

    iput-object v1, p0, LjF0;->c:Lnf3;

    :cond_2
    iget-object v0, p0, LjF0;->a:LcD1;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, LcD1;->E(LcD1$o;)V

    iput-object v1, p0, LjF0;->a:LcD1;

    :cond_3
    iget-object v0, p0, LjF0;->d:LRG6;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LRG6;->quit()Z

    iget-object v0, p0, LjF0;->d:LRG6;

    invoke-virtual {v0, v1}, LRG6;->d(Lzd6;)V

    iput-object v1, p0, LjF0;->d:LRG6;

    :cond_4
    return-void
.end method

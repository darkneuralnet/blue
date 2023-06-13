.class public final LoK6;
.super LiK6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LiK6<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaO6<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LoK6;->c:LuK6;

    invoke-direct {p0, p1, p2}, LiK6;-><init>(LuK6;LaO6;)V

    return-void
.end method


# virtual methods
.method public final x1(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1, p2}, LiK6;->x1(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object p2, p0, LoK6;->c:LuK6;

    invoke-static {p2}, LuK6;->w(LuK6;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object p2

    const-string v0, "Expected keepingAlive to be true, but was false."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, LhK6;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p2, "keep_alive"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LoK6;->c:LuK6;

    invoke-virtual {p1}, LuK6;->j()V

    :cond_1
    return-void
.end method

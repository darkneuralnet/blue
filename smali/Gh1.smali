.class public LGh1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIM4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGh1$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LGh1$a;

    invoke-direct {v0, p0, p1}, LGh1$a;-><init>(LGh1;Landroid/os/Handler;)V

    iput-object v0, p0, LGh1;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(LmI4;LEM4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;",
            "LEM4<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, LGh1;->c(LmI4;LEM4;Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(LmI4;Lcom/android/volley/VolleyError;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;",
            "Lcom/android/volley/VolleyError;",
            ")V"
        }
    .end annotation

    const-string v0, "post-error"

    invoke-virtual {p1, v0}, LmI4;->addMarker(Ljava/lang/String;)V

    invoke-static {p2}, LEM4;->a(Lcom/android/volley/VolleyError;)LEM4;

    move-result-object p2

    iget-object v0, p0, LGh1;->a:Ljava/util/concurrent/Executor;

    new-instance v1, LGh1$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, LGh1$b;-><init>(LmI4;LEM4;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(LmI4;LEM4;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;",
            "LEM4<",
            "*>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, LmI4;->markDelivered()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, LmI4;->addMarker(Ljava/lang/String;)V

    iget-object v0, p0, LGh1;->a:Ljava/util/concurrent/Executor;

    new-instance v1, LGh1$b;

    invoke-direct {v1, p1, p2, p3}, LGh1$b;-><init>(LmI4;LEM4;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

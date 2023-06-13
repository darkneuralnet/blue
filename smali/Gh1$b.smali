.class public LGh1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGh1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:LmI4;

.field public final c:LEM4;

.field public final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(LmI4;LEM4;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGh1$b;->b:LmI4;

    iput-object p2, p0, LGh1$b;->c:LEM4;

    iput-object p3, p0, LGh1$b;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LGh1$b;->b:LmI4;

    invoke-virtual {v0}, LmI4;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LGh1$b;->b:LmI4;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, LmI4;->finish(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, LGh1$b;->c:LEM4;

    invoke-virtual {v0}, LEM4;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LGh1$b;->b:LmI4;

    iget-object v1, p0, LGh1$b;->c:LEM4;

    iget-object v1, v1, LEM4;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LmI4;->deliverResponse(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LGh1$b;->b:LmI4;

    iget-object v1, p0, LGh1$b;->c:LEM4;

    iget-object v1, v1, LEM4;->c:Lcom/android/volley/VolleyError;

    invoke-virtual {v0, v1}, LmI4;->deliverError(Lcom/android/volley/VolleyError;)V

    :goto_0
    iget-object v0, p0, LGh1$b;->c:LEM4;

    iget-boolean v0, v0, LEM4;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LGh1$b;->b:LmI4;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, LmI4;->addMarker(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, LGh1$b;->b:LmI4;

    const-string v1, "done"

    invoke-virtual {v0, v1}, LmI4;->finish(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, LGh1$b;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method

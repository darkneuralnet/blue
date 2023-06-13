.class public LLk0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLk0;-><init>(Lio/reactivex/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/E;

.field public final synthetic c:LLk0;


# direct methods
.method public constructor <init>(LLk0;Lio/reactivex/E;)V
    .locals 0

    iput-object p1, p0, LLk0$a;->c:LLk0;

    iput-object p2, p0, LLk0$a;->b:Lio/reactivex/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :goto_0
    :try_start_0
    iget-object v0, p0, LLk0$a;->c:LLk0;

    iget-object v0, v0, LLk0;->b:Ldi3;

    invoke-virtual {v0}, Ldi3;->d()LYi1;

    move-result-object v0

    iget-object v1, v0, LYi1;->c:LYh3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1}, LOx2;->s(LYh3;)V

    invoke-static {v1}, LOx2;->q(LYh3;)V

    new-instance v4, Lfd4;

    invoke-direct {v4}, Lfd4;-><init>()V

    iget-object v5, p0, LLk0$a;->b:Lio/reactivex/E;

    invoke-virtual {v0, v4, v5}, LYi1;->b(Lfd4;Lio/reactivex/E;)V

    invoke-virtual {v4}, Lfd4;->a()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v1, v2, v3, v4, v5}, LOx2;->n(LYh3;JJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error while processing client operation queue"

    invoke-static {v0, v2, v1}, Lye5;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

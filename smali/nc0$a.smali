.class public Lnc0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:LLb0$a;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lnc0$b;

.field public final d:Lnc0$c;


# direct methods
.method public constructor <init>(LLb0$a;Ljava/util/concurrent/Executor;Lnc0$b;Lnc0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc0$a;->a:LLb0$a;

    iput-object p2, p0, Lnc0$a;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lnc0$a;->c:Lnc0$b;

    iput-object p4, p0, Lnc0$a;->d:Lnc0$c;

    return-void
.end method


# virtual methods
.method public a()LLb0$a;
    .locals 1

    iget-object v0, p0, Lnc0$a;->a:LLb0$a;

    return-object v0
.end method

.method public b()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnc0$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lnc0$a;->c:Lnc0$b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lmc0;

    invoke-direct {v2, v1}, Lmc0;-><init>(Lnc0$b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera to configure."

    invoke-static {v1, v2, v0}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnc0$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lnc0$a;->d:Lnc0$c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Llc0;

    invoke-direct {v2, v1}, Llc0;-><init>(Lnc0$c;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera to open."

    invoke-static {v1, v2, v0}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public d(LLb0$a;)LLb0$a;
    .locals 1

    iget-object v0, p0, Lnc0$a;->a:LLb0$a;

    iput-object p1, p0, Lnc0$a;->a:LLb0$a;

    return-object v0
.end method

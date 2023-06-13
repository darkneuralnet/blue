.class public LXQ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final b:LaD6;

.field public final c:LiP5;

.field public final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "StopWorkRunnable"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LXQ5;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LaD6;LiP5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXQ5;->b:LaD6;

    iput-object p2, p0, LXQ5;->c:LiP5;

    iput-boolean p3, p0, LXQ5;->d:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-boolean v0, p0, LXQ5;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LXQ5;->b:LaD6;

    invoke-virtual {v0}, LaD6;->r()Li74;

    move-result-object v0

    iget-object v1, p0, LXQ5;->c:LiP5;

    invoke-virtual {v0, v1}, Li74;->t(LiP5;)Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LXQ5;->b:LaD6;

    invoke-virtual {v0}, LaD6;->r()Li74;

    move-result-object v0

    iget-object v1, p0, LXQ5;->c:LiP5;

    invoke-virtual {v0, v1}, Li74;->u(LiP5;)Z

    move-result v0

    :goto_0
    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v2, LXQ5;->e:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StopWorkRunnable for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LXQ5;->c:LiP5;

    invoke-virtual {v4}, LiP5;->a()LTC6;

    move-result-object v4

    invoke-virtual {v4}, LTC6;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; Processor.stopWork = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

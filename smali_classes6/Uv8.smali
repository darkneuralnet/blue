.class public final synthetic LUv8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRC8;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(LRC8;Landroid/os/Bundle;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUv8;->b:LRC8;

    iput-object p2, p0, LUv8;->c:Landroid/os/Bundle;

    iput-wide p3, p0, LUv8;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LUv8;->b:LRC8;

    iget-object v1, p0, LUv8;->c:Landroid/os/Bundle;

    iget-wide v2, p0, LUv8;->d:J

    iget-object v4, v0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->y()Lla8;

    move-result-object v4

    invoke-virtual {v4}, Lla8;->q()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, LRC8;->F(Landroid/os/Bundle;IJ)V

    return-void

    :cond_0
    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->u()Lec8;

    move-result-object v0

    const-string v1, "Using developer consent only; google app id found"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method

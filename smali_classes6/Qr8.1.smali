.class public final LQr8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J

.field public final synthetic f:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, LQr8;->f:Lcs8;

    iput-object p2, p0, LQr8;->b:Ljava/lang/String;

    iput-object p3, p0, LQr8;->c:Ljava/lang/String;

    iput-object p4, p0, LQr8;->d:Ljava/lang/String;

    iput-wide p5, p0, LQr8;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LQr8;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, LQr8;->f:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    iget-object v1, p0, LQr8;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LhV8;->t(Ljava/lang/String;LwE8;)V

    return-void

    :cond_0
    new-instance v1, LwE8;

    iget-object v2, p0, LQr8;->d:Ljava/lang/String;

    iget-wide v3, p0, LQr8;->e:J

    invoke-direct {v1, v2, v0, v3, v4}, LwE8;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, LQr8;->f:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    iget-object v2, p0, LQr8;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, LhV8;->t(Ljava/lang/String;LwE8;)V

    return-void
.end method

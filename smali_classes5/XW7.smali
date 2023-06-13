.class public final LXW7;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/os/Bundle;

.field public final synthetic j:Ly88;


# direct methods
.method public constructor <init>(Ly88;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LXW7;->j:Ly88;

    iput-object p2, p0, LXW7;->f:Ljava/lang/String;

    iput-object p3, p0, LXW7;->g:Ljava/lang/String;

    iput-object p4, p0, LXW7;->h:Landroid/content/Context;

    iput-object p5, p0, LXW7;->i:Landroid/os/Bundle;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 15

    const-string v0, "com.google.android.gms.measurement.dynamite"

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, LXW7;->j:Ly88;

    iget-object v4, p0, LXW7;->f:Ljava/lang/String;

    iget-object v5, p0, LXW7;->g:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Ly88;->i(Ly88;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, LXW7;->g:Ljava/lang/String;

    iget-object v4, p0, LXW7;->f:Ljava/lang/String;

    iget-object v5, p0, LXW7;->j:Ly88;

    invoke-static {v5}, Ly88;->u(Ly88;)Ljava/lang/String;

    move-result-object v5

    move-object v12, v3

    move-object v11, v4

    move-object v10, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    move-object v10, v3

    move-object v11, v10

    move-object v12, v11

    :goto_0
    iget-object v3, p0, LXW7;->h:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, LXW7;->j:Ly88;

    iget-object v4, p0, LXW7;->h:Landroid/content/Context;

    invoke-virtual {v3, v4, v2}, Ly88;->s(Landroid/content/Context;Z)LnR7;

    move-result-object v4

    invoke-static {v3, v4}, Ly88;->B(Ly88;LnR7;)V

    iget-object v3, p0, LXW7;->j:Ly88;

    invoke-static {v3}, Ly88;->r(Ly88;)LnR7;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v0, p0, LXW7;->j:Ly88;

    invoke-static {v0}, Ly88;->u(Ly88;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Failed to connect to measurement client."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v3, p0, LXW7;->h:Landroid/content/Context;

    invoke-static {v3, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    iget-object v4, p0, LXW7;->h:Landroid/content/Context;

    invoke-static {v4, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-ge v0, v3, :cond_2

    move v9, v2

    goto :goto_1

    :cond_2
    move v9, v1

    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcl;

    int-to-long v7, v4

    const-wide/32 v5, 0x12cc8

    iget-object v13, p0, LXW7;->i:Landroid/os/Bundle;

    iget-object v3, p0, LXW7;->h:Landroid/content/Context;

    invoke-static {v3}, Lbl8;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, Lcom/google/android/gms/internal/measurement/zzcl;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    iget-object v3, p0, LXW7;->j:Ly88;

    invoke-static {v3}, Ly88;->r(Ly88;)LnR7;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LnR7;

    iget-object v4, p0, LXW7;->h:Landroid/content/Context;

    invoke-static {v4}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v4

    iget-wide v5, p0, Lp48;->b:J

    invoke-interface {v3, v4, v0, v5, v6}, LnR7;->initialize(LWO1;Lcom/google/android/gms/internal/measurement/zzcl;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v3, p0, LXW7;->j:Ly88;

    invoke-static {v3, v0, v2, v1}, Ly88;->C(Ly88;Ljava/lang/Exception;ZZ)V

    return-void
.end method

.class public final LM38;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/Long;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Landroid/os/Bundle;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Ly88;


# direct methods
.method public constructor <init>(Ly88;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 0

    iput-object p1, p0, LM38;->l:Ly88;

    iput-object p2, p0, LM38;->f:Ljava/lang/Long;

    iput-object p3, p0, LM38;->g:Ljava/lang/String;

    iput-object p4, p0, LM38;->h:Ljava/lang/String;

    iput-object p5, p0, LM38;->i:Landroid/os/Bundle;

    iput-boolean p6, p0, LM38;->j:Z

    iput-boolean p7, p0, LM38;->k:Z

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LM38;->f:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lp48;->b:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    move-wide v8, v0

    iget-object v0, p0, LM38;->l:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LnR7;

    iget-object v3, p0, LM38;->g:Ljava/lang/String;

    iget-object v4, p0, LM38;->h:Ljava/lang/String;

    iget-object v5, p0, LM38;->i:Landroid/os/Bundle;

    iget-boolean v6, p0, LM38;->j:Z

    iget-boolean v7, p0, LM38;->k:Z

    invoke-interface/range {v2 .. v9}, LnR7;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

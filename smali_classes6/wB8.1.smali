.class public final LwB8;
.super Lsz8;
.source "SourceFile"

# interfaces
.implements Lgz8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsz8<",
        "LPC8;",
        ">;",
        "Lgz8;"
    }
.end annotation


# instance fields
.field public final f:Ljava/lang/Exception;

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LEC8;Z)V
    .locals 1

    invoke-static {}, LEz8;->b()LEz8;

    move-result-object v0

    invoke-virtual {v0}, LEz8;->c()Ljava/util/UUID;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lsz8;-><init>(Ljava/lang/String;Ljava/util/UUID;LEC8;)V

    sget-object p1, LkB8;->f:Lcom/google/android/gms/internal/recaptcha/zzhu;

    iput-object p1, p0, LwB8;->f:Ljava/lang/Exception;

    iput-boolean p3, p0, LwB8;->g:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lgz8;LEC8;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lsz8;-><init>(Ljava/lang/String;LPC8;LEC8;)V

    invoke-interface {p2}, Lgz8;->zze()Ljava/lang/Exception;

    move-result-object p1

    iput-object p1, p0, LwB8;->f:Ljava/lang/Exception;

    iput-boolean p4, p0, LwB8;->g:Z

    return-void
.end method


# virtual methods
.method public final D2(Ljava/lang/String;LEC8;)LPC8;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LwB8;->T0(Ljava/lang/String;LEC8;Z)LPC8;

    move-result-object p1

    return-object p1
.end method

.method public final T0(Ljava/lang/String;LEC8;Z)LPC8;
    .locals 2

    if-eqz p3, :cond_0

    iget-boolean v0, p0, LwB8;->g:Z

    if-nez v0, :cond_0

    sget-object v0, LFE8;->a:LJ38;

    :cond_0
    new-instance v0, LwB8;

    const/4 v1, 0x1

    if-eqz p3, :cond_1

    iget-boolean p3, p0, LwB8;->g:Z

    if-eqz p3, :cond_3

    :cond_1
    iget-boolean p3, p0, LwB8;->g:Z

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    invoke-direct {v0, p1, p0, p2, v1}, LwB8;-><init>(Ljava/lang/String;Lgz8;LEC8;Z)V

    return-object v0
.end method

.method public final zze()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, LwB8;->f:Ljava/lang/Exception;

    return-object v0
.end method

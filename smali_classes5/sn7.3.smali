.class public final Lsn7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lip7;


# instance fields
.field public a:Lfx7;

.field public final b:LGn7;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lyn7;

.field public final g:Ldo7;

.field public final h:LHn7;

.field public final i:Lun7;


# direct methods
.method public constructor <init>(LGn7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILyn7;Ldo7;LHn7;Lun7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn7;->b:LGn7;

    iput-object p2, p0, Lsn7;->c:Ljava/lang/String;

    iput-object p3, p0, Lsn7;->d:Ljava/lang/String;

    const-string p1, "com.google.perception"

    iput-object p1, p0, Lsn7;->e:Ljava/lang/String;

    iput-object p6, p0, Lsn7;->f:Lyn7;

    iput-object p7, p0, Lsn7;->g:Ldo7;

    iput-object p8, p0, Lsn7;->h:LHn7;

    iput-object p9, p0, Lsn7;->i:Lun7;

    return-void
.end method


# virtual methods
.method public final a()Lfx7;
    .locals 1

    iget-object v0, p0, Lsn7;->a:Lfx7;

    return-object v0
.end method

.method public final zzb()Z
    .locals 10

    const-string v0, "AccelerationAllowlist"

    new-instance v1, LGn7;

    iget-object v2, p0, Lsn7;->e:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, LGn7;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, LGn7;->f()V

    :try_start_0
    const-string v2, "Calling goldblum client"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lsn7;->h:LHn7;

    iget-object v4, p0, Lsn7;->f:Lyn7;

    iget-object v5, p0, Lsn7;->g:Ldo7;

    iget-object v6, p0, Lsn7;->c:Ljava/lang/String;

    iget-object v7, p0, Lsn7;->d:Ljava/lang/String;

    iget-object v8, p0, Lsn7;->e:Ljava/lang/String;

    const/4 v9, 0x2

    invoke-interface/range {v3 .. v9}, LHn7;->a(Lyn7;Ldo7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfx7;

    move-result-object v2

    iput-object v2, p0, Lsn7;->a:Lfx7;
    :try_end_0
    .catch LIn7; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, LGn7;->e()V

    iget-object v0, p0, Lsn7;->i:Lun7;

    invoke-virtual {v0, v1}, Lun7;->a(LGn7;)V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "Exception calling goldblum"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lsn7;->b:LGn7;

    invoke-virtual {v2}, LIn7;->a()Lbz9;

    move-result-object v3

    invoke-virtual {v0, v3}, LGn7;->b(Lbz9;)V

    invoke-virtual {v2}, LIn7;->a()Lbz9;

    move-result-object v0

    invoke-virtual {v1, v0}, LGn7;->d(Lbz9;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, LGn7;->e()V

    iget-object v0, p0, Lsn7;->i:Lun7;

    invoke-virtual {v0, v1}, Lun7;->a(LGn7;)V

    const/4 v0, 0x0

    return v0

    :goto_0
    invoke-virtual {v1}, LGn7;->e()V

    iget-object v2, p0, Lsn7;->i:Lun7;

    invoke-virtual {v2, v1}, Lun7;->a(LGn7;)V

    throw v0
.end method

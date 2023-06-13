.class public abstract LSo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;IIJJDILjava/lang/String;)LSo;
    .locals 12
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v11, LQK6;

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double v0, v0, p7

    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    move-result-wide v0

    double-to-int v8, v0

    move-object v0, v11

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LQK6;-><init>(Ljava/lang/String;IIJJIILjava/lang/String;)V

    return-object v11
.end method

.method public static e(Landroid/os/Bundle;Ljava/lang/String;LxL6;LDK6;)LSo;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "status"

    invoke-static {v2, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v3, p3

    invoke-interface {v3, v2, v1}, LDK6;->a(ILjava/lang/String;)I

    move-result v2

    const-string v3, "error_code"

    invoke-static {v3, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "bytes_downloaded"

    invoke-static {v4, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    const-string v6, "total_bytes_to_download"

    invoke-static {v6, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    move-object/from16 v8, p2

    invoke-virtual {v8, v1}, LxL6;->b(Ljava/lang/String;)D

    move-result-wide v8

    const-string v10, "pack_version"

    invoke-static {v10, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v10

    const-string v12, "pack_base_version"

    invoke-static {v12, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    const/4 v14, 0x4

    const/4 v15, 0x1

    if-ne v2, v14, :cond_0

    const-wide/16 v16, 0x0

    cmp-long v14, v12, v16

    if-eqz v14, :cond_0

    cmp-long v10, v12, v10

    if-eqz v10, :cond_0

    const/4 v10, 0x2

    move v15, v10

    :cond_0
    const-string v10, "pack_version_tag"

    invoke-static {v10, v1}, LXN6;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, ""

    invoke-virtual {v0, v10, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v0, p1

    move v1, v2

    move v2, v3

    move-wide v3, v4

    move-wide v5, v6

    move-wide v7, v8

    move v9, v15

    invoke-static/range {v0 .. v10}, LSo;->d(Ljava/lang/String;IIJJDILjava/lang/String;)LSo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract f()I
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()I
.end method

.method public abstract i()J
.end method

.method public abstract j()I
.end method

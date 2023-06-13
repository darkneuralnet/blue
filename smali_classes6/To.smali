.class public abstract LTo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLjava/util/Map;)LTo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LSo;",
            ">;)",
            "LTo;"
        }
    .end annotation

    new-instance v0, LeL6;

    invoke-direct {v0, p0, p1, p2}, LeL6;-><init>(JLjava/util/Map;)V

    return-object v0
.end method

.method public static b(Landroid/os/Bundle;LxL6;)LTo;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, p1, v0}, LTo;->c(Landroid/os/Bundle;LxL6;Ljava/util/List;)LTo;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/os/Bundle;LxL6;Ljava/util/List;)LTo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "LxL6;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "LTo;"
        }
    .end annotation

    sget-object v0, LFK6;->b:LDK6;

    invoke-static {p0, p1, p2, v0}, LTo;->d(Landroid/os/Bundle;LxL6;Ljava/util/List;LDK6;)LTo;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/os/Bundle;LxL6;Ljava/util/List;LDK6;)LTo;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "LxL6;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "LDK6;",
            ")",
            "LTo;"
        }
    .end annotation

    move-object v0, p0

    const-string v1, "pack_names"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    invoke-static {p0, v5, v6, v7}, LSo;->e(Landroid/os/Bundle;Ljava/lang/String;LxL6;LDK6;)LSo;

    move-result-object v8

    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x1

    const-string v14, ""

    move-object v4, v3

    invoke-static/range {v4 .. v14}, LSo;->d(Ljava/lang/String;IIJJDILjava/lang/String;)LSo;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const-string v1, "total_bytes_to_download"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1, v2}, LTo;->a(JLjava/util/Map;)LTo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract e()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LSo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()J
.end method

.class public Lk72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSe4;


# static fields
.field public static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const-string v0, "pixel 4"

    const-string v1, "pixel 4a"

    const-string v2, "pixel 4 xl"

    const-string v3, "pixel 5"

    const-string v4, "pixel 5a"

    const-string v5, "pixel 6"

    const-string v6, "pixel 6a"

    const-string v7, "pixel 6 pro"

    const-string v8, "pixel 7"

    const-string v9, "pixel 7 pro"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lk72;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Z
    .locals 1

    invoke-static {}, Lk72;->g()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lk72;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static e()Z
    .locals 3

    sget-object v0, Lk72;->a:Ljava/util/List;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static f()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    const-string v1, "TD1A"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static g()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    const-string v1, "TP1A"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static h()Z
    .locals 1

    invoke-static {}, Lk72;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lk72;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

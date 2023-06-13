.class public LEx0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static a:LBx0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LBx0;

    invoke-direct {v0}, LBx0;-><init>()V

    sput-object v0, LEx0;->a:LBx0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;Ldx0;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldx0;",
            ">;",
            "Ldx0;",
            ")",
            "Ljava/util/List<",
            "Ldx0;",
            ">;"
        }
    .end annotation

    sget-object v0, LEx0;->a:LBx0;

    invoke-virtual {v0, p0, p1}, LBx0;->a(Ljava/util/List;Ldx0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;Ldx0;)V
    .locals 1

    sget-object v0, LEx0;->a:LBx0;

    invoke-virtual {v0, p0, p1}, LBx0;->b(Landroid/os/Bundle;Ldx0;)V

    return-void
.end method

.method public static c(Landroid/content/Intent;Ldx0;)V
    .locals 1

    sget-object v0, LEx0;->a:LBx0;

    invoke-virtual {v0, p0, p1}, LBx0;->c(Landroid/content/Intent;Ldx0;)V

    return-void
.end method

.method public static d(Ljava/util/List;Ljava/lang/Class;)Ldx0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ldx0;",
            ">(",
            "Ljava/util/List<",
            "Ldx0;",
            ">;",
            "Ljava/lang/Class<",
            "TE;>;)TE;"
        }
    .end annotation

    sget-object v0, LEx0;->a:LBx0;

    invoke-virtual {v0, p0, p1}, LBx0;->e(Ljava/util/List;Ljava/lang/Class;)Ldx0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/os/Bundle;Ljava/lang/Class;)Ldx0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ldx0;",
            ">(",
            "Landroid/os/Bundle;",
            "Ljava/lang/Class<",
            "TE;>;)TE;"
        }
    .end annotation

    sget-object v0, LEx0;->a:LBx0;

    invoke-virtual {v0, p0, p1}, LBx0;->f(Landroid/os/Bundle;Ljava/lang/Class;)Ldx0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/util/Map;Ljava/lang/Class;)Ldx0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ldx0;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Class<",
            "TE;>;)TE;"
        }
    .end annotation

    sget-object v0, LEx0;->a:LBx0;

    invoke-virtual {v0, p0, p1}, LBx0;->g(Ljava/util/Map;Ljava/lang/Class;)Ldx0;

    move-result-object p0

    return-object p0
.end method

.class public final Laf0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf0$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a([Landroidx/camera/core/impl/e;)LZe0;
    .locals 1

    new-instance v0, Laf0$a;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Laf0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()LZe0;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Landroidx/camera/core/impl/e;

    new-instance v1, Landroidx/camera/core/impl/e$a;

    invoke-direct {v1}, Landroidx/camera/core/impl/e$a;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Laf0;->a([Landroidx/camera/core/impl/e;)LZe0;

    move-result-object v0

    return-object v0
.end method

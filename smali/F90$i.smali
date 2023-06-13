.class public abstract LF90$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "i"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Class;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;Landroid/util/Size;)LF90$i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Landroidx/camera/core/impl/q;",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroid/util/Size;",
            ")",
            "LF90$i;"
        }
    .end annotation

    new-instance v6, Lmt;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lmt;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;Landroid/util/Size;)V

    return-object v6
.end method

.method public static b(Landroidx/camera/core/p;)LF90$i;
    .locals 4

    invoke-static {p0}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/p;->r()Landroidx/camera/core/impl/q;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/camera/core/p;->e()Landroid/util/Size;

    move-result-object p0

    invoke-static {v0, v1, v2, v3, p0}, LF90$i;->a(Ljava/lang/String;Ljava/lang/Class;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;Landroid/util/Size;)LF90$i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c()Landroidx/camera/core/impl/q;
.end method

.method public abstract d()Landroid/util/Size;
.end method

.method public abstract e()Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

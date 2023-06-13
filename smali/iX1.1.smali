.class public final LiX1;
.super LL90;
.source "SourceFile"


# static fields
.field public static final c:LiX1;


# instance fields
.field public final b:LkX1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LiX1;

    new-instance v1, LkX1;

    invoke-direct {v1}, LkX1;-><init>()V

    invoke-direct {v0, v1}, LiX1;-><init>(LkX1;)V

    sput-object v0, LiX1;->c:LiX1;

    return-void
.end method

.method public constructor <init>(LkX1;)V
    .locals 0

    invoke-direct {p0}, LL90;-><init>()V

    iput-object p1, p0, LiX1;->b:LkX1;

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/d$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroidx/camera/core/impl/d$a;",
            ")V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LL90;->a(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/d$a;)V

    instance-of v0, p1, Landroidx/camera/core/impl/i;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/camera/core/impl/i;

    new-instance v0, Lja0$a;

    invoke-direct {v0}, Lja0$a;-><init>()V

    invoke-virtual {p1}, Landroidx/camera/core/impl/i;->Z()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LiX1;->b:LkX1;

    invoke-virtual {p1}, Landroidx/camera/core/impl/i;->T()I

    move-result p1

    invoke-virtual {v1, p1, v0}, LkX1;->a(ILja0$a;)V

    :cond_0
    invoke-virtual {v0}, Lja0$a;->a()Lja0;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "config is not ImageCaptureConfig"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class public final Landroidx/camera/core/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Landroid/util/Size;

.field public static final b:Landroidx/camera/core/impl/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/core/e$d;->a:Landroid/util/Size;

    new-instance v1, Landroidx/camera/core/e$c;

    invoke-direct {v1}, Landroidx/camera/core/e$c;-><init>()V

    invoke-virtual {v1, v0}, Landroidx/camera/core/e$c;->i(Landroid/util/Size;)Landroidx/camera/core/e$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/e$c;->j(I)Landroidx/camera/core/e$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/e$c;->k(I)Landroidx/camera/core/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/e$c;->g()Landroidx/camera/core/impl/h;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/e$d;->b:Landroidx/camera/core/impl/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/h;
    .locals 1

    sget-object v0, Landroidx/camera/core/e$d;->b:Landroidx/camera/core/impl/h;

    return-object v0
.end method

.class public final Landroidx/camera/core/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Landroid/util/Size;

.field public c:LAB5;

.field public d:Landroid/util/Size;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/core/m$a;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/core/m$a;->b:Landroid/util/Size;

    sget-object v2, LAB5;->b:LAB5;

    iput-object v2, p0, Landroidx/camera/core/m$a;->c:LAB5;

    iput-object v1, p0, Landroidx/camera/core/m$a;->d:Landroid/util/Size;

    iput-boolean v0, p0, Landroidx/camera/core/m$a;->e:Z

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/m;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/core/m$a;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/core/m$a;->b:Landroid/util/Size;

    sget-object v2, LAB5;->b:LAB5;

    iput-object v2, p0, Landroidx/camera/core/m$a;->c:LAB5;

    iput-object v1, p0, Landroidx/camera/core/m$a;->d:Landroid/util/Size;

    iput-boolean v0, p0, Landroidx/camera/core/m$a;->e:Z

    invoke-virtual {p1}, Landroidx/camera/core/m;->b()I

    move-result v0

    iput v0, p0, Landroidx/camera/core/m$a;->a:I

    invoke-virtual {p1}, Landroidx/camera/core/m;->c()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/m$a;->b:Landroid/util/Size;

    invoke-virtual {p1}, Landroidx/camera/core/m;->d()LAB5;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/m$a;->c:LAB5;

    invoke-virtual {p1}, Landroidx/camera/core/m;->a()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/m$a;->d:Landroid/util/Size;

    invoke-virtual {p1}, Landroidx/camera/core/m;->e()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/camera/core/m$a;->e:Z

    return-void
.end method

.method public static b(Landroidx/camera/core/m;)Landroidx/camera/core/m$a;
    .locals 1

    new-instance v0, Landroidx/camera/core/m$a;

    invoke-direct {v0, p0}, Landroidx/camera/core/m$a;-><init>(Landroidx/camera/core/m;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroidx/camera/core/m;
    .locals 7

    new-instance v6, Landroidx/camera/core/m;

    iget v1, p0, Landroidx/camera/core/m$a;->a:I

    iget-object v2, p0, Landroidx/camera/core/m$a;->b:Landroid/util/Size;

    iget-object v3, p0, Landroidx/camera/core/m$a;->c:LAB5;

    iget-object v4, p0, Landroidx/camera/core/m$a;->d:Landroid/util/Size;

    iget-boolean v5, p0, Landroidx/camera/core/m$a;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroidx/camera/core/m;-><init>(ILandroid/util/Size;LAB5;Landroid/util/Size;Z)V

    return-object v6
.end method

.method public c(Landroid/util/Size;)Landroidx/camera/core/m$a;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/m$a;->d:Landroid/util/Size;

    return-object p0
.end method

.method public d(Landroid/util/Size;)Landroidx/camera/core/m$a;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/m$a;->b:Landroid/util/Size;

    sget-object p1, LAB5;->b:LAB5;

    iput-object p1, p0, Landroidx/camera/core/m$a;->c:LAB5;

    return-object p0
.end method

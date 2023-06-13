.class public Landroidx/camera/core/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/m$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/util/Size;

.field public final b:LAB5;

.field public final c:I

.field public final d:Landroid/util/Size;

.field public final e:Z


# direct methods
.method public constructor <init>(ILandroid/util/Size;LAB5;Landroid/util/Size;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/camera/core/m;->c:I

    iput-object p2, p0, Landroidx/camera/core/m;->a:Landroid/util/Size;

    iput-object p3, p0, Landroidx/camera/core/m;->b:LAB5;

    iput-object p4, p0, Landroidx/camera/core/m;->d:Landroid/util/Size;

    iput-boolean p5, p0, Landroidx/camera/core/m;->e:Z

    return-void
.end method


# virtual methods
.method public a()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/m;->d:Landroid/util/Size;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/m;->c:I

    return v0
.end method

.method public c()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/m;->a:Landroid/util/Size;

    return-object v0
.end method

.method public d()LAB5;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/m;->b:LAB5;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/m;->e:Z

    return v0
.end method

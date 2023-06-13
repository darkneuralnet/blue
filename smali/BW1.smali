.class public final synthetic LBW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/f;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Landroidx/camera/core/i;

.field public final synthetic d:Landroid/graphics/Matrix;

.field public final synthetic e:Landroidx/camera/core/i;

.field public final synthetic f:Landroid/graphics/Rect;

.field public final synthetic g:Landroidx/camera/core/e$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/f;Ljava/util/concurrent/Executor;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBW1;->a:Landroidx/camera/core/f;

    iput-object p2, p0, LBW1;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LBW1;->c:Landroidx/camera/core/i;

    iput-object p4, p0, LBW1;->d:Landroid/graphics/Matrix;

    iput-object p5, p0, LBW1;->e:Landroidx/camera/core/i;

    iput-object p6, p0, LBW1;->f:Landroid/graphics/Rect;

    iput-object p7, p0, LBW1;->g:Landroidx/camera/core/e$a;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LBW1;->a:Landroidx/camera/core/f;

    iget-object v1, p0, LBW1;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LBW1;->c:Landroidx/camera/core/i;

    iget-object v3, p0, LBW1;->d:Landroid/graphics/Matrix;

    iget-object v4, p0, LBW1;->e:Landroidx/camera/core/i;

    iget-object v5, p0, LBW1;->f:Landroid/graphics/Rect;

    iget-object v6, p0, LBW1;->g:Landroidx/camera/core/e$a;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Landroidx/camera/core/f;->b(Landroidx/camera/core/f;Ljava/util/concurrent/Executor;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

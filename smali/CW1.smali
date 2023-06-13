.class public final synthetic LCW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/f;

.field public final synthetic c:Landroidx/camera/core/i;

.field public final synthetic d:Landroid/graphics/Matrix;

.field public final synthetic e:Landroidx/camera/core/i;

.field public final synthetic f:Landroid/graphics/Rect;

.field public final synthetic g:Landroidx/camera/core/e$a;

.field public final synthetic h:LO80$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/f;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCW1;->b:Landroidx/camera/core/f;

    iput-object p2, p0, LCW1;->c:Landroidx/camera/core/i;

    iput-object p3, p0, LCW1;->d:Landroid/graphics/Matrix;

    iput-object p4, p0, LCW1;->e:Landroidx/camera/core/i;

    iput-object p5, p0, LCW1;->f:Landroid/graphics/Rect;

    iput-object p6, p0, LCW1;->g:Landroidx/camera/core/e$a;

    iput-object p7, p0, LCW1;->h:LO80$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, LCW1;->b:Landroidx/camera/core/f;

    iget-object v1, p0, LCW1;->c:Landroidx/camera/core/i;

    iget-object v2, p0, LCW1;->d:Landroid/graphics/Matrix;

    iget-object v3, p0, LCW1;->e:Landroidx/camera/core/i;

    iget-object v4, p0, LCW1;->f:Landroid/graphics/Rect;

    iget-object v5, p0, LCW1;->g:Landroidx/camera/core/e$a;

    iget-object v6, p0, LCW1;->h:LO80$a;

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/f;->c(Landroidx/camera/core/f;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)V

    return-void
.end method

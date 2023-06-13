.class public final synthetic LIV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:LMV5;

.field public final synthetic b:LMV5$a;

.field public final synthetic c:I

.field public final synthetic d:Landroid/util/Size;

.field public final synthetic e:Landroid/graphics/Rect;

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:LLb0;


# direct methods
.method public synthetic constructor <init>(LMV5;LMV5$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLLb0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIV5;->a:LMV5;

    iput-object p2, p0, LIV5;->b:LMV5$a;

    iput p3, p0, LIV5;->c:I

    iput-object p4, p0, LIV5;->d:Landroid/util/Size;

    iput-object p5, p0, LIV5;->e:Landroid/graphics/Rect;

    iput p6, p0, LIV5;->f:I

    iput-boolean p7, p0, LIV5;->g:Z

    iput-object p8, p0, LIV5;->h:LLb0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 9

    iget-object v0, p0, LIV5;->a:LMV5;

    iget-object v1, p0, LIV5;->b:LMV5$a;

    iget v2, p0, LIV5;->c:I

    iget-object v3, p0, LIV5;->d:Landroid/util/Size;

    iget-object v4, p0, LIV5;->e:Landroid/graphics/Rect;

    iget v5, p0, LIV5;->f:I

    iget-boolean v6, p0, LIV5;->g:Z

    iget-object v7, p0, LIV5;->h:LLb0;

    move-object v8, p1

    check-cast v8, Landroid/view/Surface;

    invoke-static/range {v0 .. v8}, LMV5;->b(LMV5;LMV5$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLLb0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

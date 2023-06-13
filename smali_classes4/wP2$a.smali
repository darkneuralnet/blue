.class public final LwP2$a;
.super LVA5;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BitmapTarget;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LwP2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "LVA5<",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lco/bird/android/model/BitmapTarget;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0082\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B%\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008 \u0010!J\"\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00032\u0010\u0010\u0007\u001a\u000c\u0012\u0006\u0008\u0000\u0012\u00020\u0003\u0018\u00010\u0006H\u0016J\u0012\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000e\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00038\u0016@\u0016X\u0096.\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u0013\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "LwP2$a;",
        "K",
        "LVA5;",
        "Landroid/graphics/Bitmap;",
        "Lco/bird/android/model/BitmapTarget;",
        "resource",
        "LG96;",
        "transition",
        "",
        "d",
        "Landroid/graphics/drawable/Drawable;",
        "placeholder",
        "onLoadCleared",
        "errorDrawable",
        "onLoadFailed",
        "LMT;",
        "e",
        "LMT;",
        "cache",
        "f",
        "Ljava/lang/Object;",
        "cacheKey",
        "",
        "g",
        "Ljava/lang/String;",
        "mediaId",
        "h",
        "Landroid/graphics/Bitmap;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "(Landroid/graphics/Bitmap;)V",
        "bitmap",
        "<init>",
        "(LwP2;LMT;Ljava/lang/Object;Ljava/lang/String;)V",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final e:LMT;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMT<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/String;

.field public h:Landroid/graphics/Bitmap;

.field public final synthetic i:LwP2;


# direct methods
.method public constructor <init>(LwP2;LMT;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMT<",
            "TK;>;TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "cache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LwP2$a;->i:LwP2;

    invoke-direct {p0}, LVA5;-><init>()V

    iput-object p2, p0, LwP2$a;->e:LMT;

    iput-object p3, p0, LwP2$a;->f:Ljava/lang/Object;

    iput-object p4, p0, LwP2$a;->g:Ljava/lang/String;

    return-void
.end method

.method public static synthetic c(LwP2;LwP2$a;)V
    .locals 0

    invoke-static {p0, p1}, LwP2$a;->e(LwP2;LwP2$a;)V

    return-void
.end method

.method public static final e(LwP2;LwP2$a;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LwP2;->access$getGlide$p(LwP2;)LUI4;

    move-result-object p0

    invoke-virtual {p0, p1}, LUI4;->d(LLY5;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Bitmap;LG96;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "LG96<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LwP2$a;->e:LMT;

    iget-object v0, p0, LwP2$a;->i:LwP2;

    monitor-enter p2

    :try_start_0
    invoke-static {v0}, LwP2;->access$getLoadingMedia$p(LwP2;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, LwP2$a;->g:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, LwP2$a;->e:LMT;

    iget-object v2, p0, LwP2$a;->f:Ljava/lang/Object;

    invoke-interface {v1, v2}, LMT;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LwP2;->access$getHandler$p(LwP2;)Landroid/os/Handler;

    move-result-object p1

    new-instance v1, LvP2;

    invoke-direct {v1, v0, p0}, LvP2;-><init>(LwP2;LwP2$a;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LwP2$a;->f(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, LwP2$a;->e:LMT;

    iget-object v0, p0, LwP2$a;->f:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, LMT;->b(Ljava/lang/Object;Lco/bird/android/model/BitmapTarget;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1
.end method

.method public f(Landroid/graphics/Bitmap;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LwP2$a;->h:Landroid/graphics/Bitmap;

    return-void
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LwP2$a;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "bitmap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onLoadCleared(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object p1, p0, LwP2$a;->e:LMT;

    iget-object v0, p0, LwP2$a;->i:LwP2;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, LwP2;->access$getLoadingMedia$p(LwP2;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LwP2$a;->g:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public onLoadFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object p1, p0, LwP2$a;->e:LMT;

    iget-object v0, p0, LwP2$a;->i:LwP2;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, LwP2;->access$getLoadingMedia$p(LwP2;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LwP2$a;->g:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;LG96;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, LwP2$a;->d(Landroid/graphics/Bitmap;LG96;)V

    return-void
.end method

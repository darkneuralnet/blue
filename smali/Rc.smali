.class public final synthetic LRc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic a:LTc;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:LKX1$a;


# direct methods
.method public synthetic constructor <init>(LTc;Ljava/util/concurrent/Executor;LKX1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRc;->a:LTc;

    iput-object p2, p0, LRc;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LRc;->c:LKX1$a;

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 3

    iget-object v0, p0, LRc;->a:LTc;

    iget-object v1, p0, LRc;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LRc;->c:LKX1$a;

    invoke-static {v0, v1, v2, p1}, LTc;->f(LTc;Ljava/util/concurrent/Executor;LKX1$a;Landroid/media/ImageReader;)V

    return-void
.end method

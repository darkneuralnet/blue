.class public Landroidx/work/Worker$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/Worker;->d()Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lew5;

.field public final synthetic c:Landroidx/work/Worker;


# direct methods
.method public constructor <init>(Landroidx/work/Worker;Lew5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/work/Worker$b;->c:Landroidx/work/Worker;

    iput-object p2, p0, Landroidx/work/Worker$b;->b:Lew5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Landroidx/work/Worker$b;->c:Landroidx/work/Worker;

    invoke-virtual {v0}, Landroidx/work/Worker;->r()LYw1;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/Worker$b;->b:Lew5;

    invoke-virtual {v1, v0}, Lew5;->p(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/work/Worker$b;->b:Lew5;

    invoke-virtual {v1, v0}, Lew5;->q(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.class public final synthetic LWW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/h;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Landroidx/camera/core/h$l;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWW1;->b:Landroidx/camera/core/h;

    iput-object p2, p0, LWW1;->c:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LWW1;->d:Landroidx/camera/core/h$l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LWW1;->b:Landroidx/camera/core/h;

    iget-object v1, p0, LWW1;->c:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LWW1;->d:Landroidx/camera/core/h$l;

    invoke-static {v0, v1, v2}, Landroidx/camera/core/h;->c0(Landroidx/camera/core/h;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V

    return-void
.end method

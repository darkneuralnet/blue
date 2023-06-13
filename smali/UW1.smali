.class public final synthetic LUW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/h;

.field public final synthetic c:Landroidx/camera/core/h$n;

.field public final synthetic d:Ljava/util/concurrent/Executor;

.field public final synthetic e:Landroidx/camera/core/h$m;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h;Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUW1;->b:Landroidx/camera/core/h;

    iput-object p2, p0, LUW1;->c:Landroidx/camera/core/h$n;

    iput-object p3, p0, LUW1;->d:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LUW1;->e:Landroidx/camera/core/h$m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LUW1;->b:Landroidx/camera/core/h;

    iget-object v1, p0, LUW1;->c:Landroidx/camera/core/h$n;

    iget-object v2, p0, LUW1;->d:Ljava/util/concurrent/Executor;

    iget-object v3, p0, LUW1;->e:Landroidx/camera/core/h$m;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/h;->X(Landroidx/camera/core/h;Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V

    return-void
.end method

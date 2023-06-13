.class public final synthetic LMX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw6$b;


# instance fields
.field public final synthetic a:LOX5;


# direct methods
.method public synthetic constructor <init>(LOX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMX5;->a:LOX5;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1

    iget-object v0, p0, LMX5;->a:LOX5;

    invoke-static {v0, p1, p2, p3}, LOX5;->J(LOX5;Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

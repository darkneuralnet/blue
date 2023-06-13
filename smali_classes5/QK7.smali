.class public final synthetic LQK7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LbM7;


# direct methods
.method public synthetic constructor <init>(LbM7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQK7;->a:LbM7;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LQK7;->a:LbM7;

    check-cast p1, LoG7;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v1, LLL7;

    invoke-direct {v1, v0, p2}, LLL7;-><init>(LbM7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LPI7;

    invoke-virtual {p1, v1}, LPI7;->c5(LXH7;)V

    return-void
.end method

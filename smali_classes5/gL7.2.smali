.class public final synthetic LgL7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LbM7;

.field public final synthetic b:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;


# direct methods
.method public synthetic constructor <init>(LbM7;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgL7;->a:LbM7;

    iput-object p2, p0, LgL7;->b:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LgL7;->a:LbM7;

    iget-object v1, p0, LgL7;->b:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    check-cast p1, LoG7;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, LwL7;

    invoke-direct {v2, v0, p2}, LwL7;-><init>(LbM7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LPI7;

    invoke-virtual {p1, v2, v1}, LPI7;->d5(LXH7;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)V

    return-void
.end method

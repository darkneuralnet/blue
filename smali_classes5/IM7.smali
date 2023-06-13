.class public final LIM7;
.super LEJ7;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;


# direct methods
.method public constructor <init>(LFN7;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)V
    .locals 0

    iput-object p3, p0, LIM7;->a:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    invoke-direct {p0, p2}, LEJ7;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LPI7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, LrM7;

    invoke-direct {p1, p0}, LrM7;-><init>(LIM7;)V

    iget-object v0, p0, LIM7;->a:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    invoke-virtual {p2, p1, v0}, LPI7;->d5(LXH7;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)V

    return-void
.end method

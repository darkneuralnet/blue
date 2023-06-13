.class public final LpN7;
.super LtK7;
.source "SourceFile"


# direct methods
.method public constructor <init>(LFN7;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p2}, LtK7;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LPI7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, LYM7;

    invoke-direct {p1, p0}, LYM7;-><init>(LpN7;)V

    invoke-virtual {p2, p1}, LPI7;->c5(LXH7;)V

    return-void
.end method

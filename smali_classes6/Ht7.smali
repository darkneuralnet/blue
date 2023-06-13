.class public final LHt7;
.super LwM7;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lmh3;


# direct methods
.method public constructor <init>(Lvu7;Lmh3;)V
    .locals 0

    iput-object p2, p0, LHt7;->a:Lmh3;

    invoke-direct {p0}, LwM7;-><init>()V

    return-void
.end method


# virtual methods
.method public final Z0(LgP1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LHt7;->a:Lmh3;

    new-instance v1, LNR5;

    invoke-direct {v1, p1}, LNR5;-><init>(LgP1;)V

    invoke-interface {v0, v1}, Lmh3;->a(LNR5;)V

    return-void
.end method

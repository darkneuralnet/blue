.class public final Lik7;
.super LIt7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LUg3;


# direct methods
.method public constructor <init>(Lfl7;LUg3;)V
    .locals 0

    iput-object p2, p0, Lik7;->a:LUg3;

    invoke-direct {p0}, LIt7;-><init>()V

    return-void
.end method


# virtual methods
.method public final H4(LtO1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lik7;->a:LUg3;

    new-instance v1, LcD1;

    invoke-direct {v1, p1}, LcD1;-><init>(LtO1;)V

    invoke-interface {v0, v1}, LUg3;->onMapReady(LcD1;)V

    return-void
.end method

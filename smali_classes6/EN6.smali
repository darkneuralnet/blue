.class public LEN6;
.super LcK6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LcK6;"
    }
.end annotation


# instance fields
.field public final a:LhK6;

.field public final b:LaO6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LaO6<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic c:LYN6;


# direct methods
.method public constructor <init>(LYN6;LhK6;LaO6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhK6;",
            "LaO6<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LEN6;->c:LYN6;

    invoke-direct {p0}, LcK6;-><init>()V

    iput-object p2, p0, LEN6;->a:LhK6;

    iput-object p3, p0, LEN6;->b:LaO6;

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, LEN6;->c:LYN6;

    iget-object p1, p1, LYN6;->a:LzK6;

    invoke-virtual {p1}, LzK6;->b()V

    iget-object p1, p0, LEN6;->a:LhK6;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetLaunchReviewFlowInfo"

    invoke-virtual {p1, v1, v0}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

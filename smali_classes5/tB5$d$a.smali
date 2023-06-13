.class public LtB5$d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LtB5$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LtB5$d;


# direct methods
.method public constructor <init>(LtB5$d;)V
    .locals 0

    iput-object p1, p0, LtB5$d$a;->a:LtB5$d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    invoke-static {}, Lpi6;->b()V

    iget-object v0, p0, LtB5$d$a;->a:LtB5$d;

    iget-boolean v1, v0, LtB5$d;->a:Z

    iput-boolean p1, v0, LtB5$d;->a:Z

    if-eq v1, p1, :cond_0

    iget-object v0, v0, LtB5$d;->b:LDy0$a;

    invoke-interface {v0, p1}, LDy0$a;->a(Z)V

    :cond_0
    return-void
.end method

.method public final b(Z)V
    .locals 1

    new-instance v0, LtB5$d$a$a;

    invoke-direct {v0, p0, p1}, LtB5$d$a$a;-><init>(LtB5$d$a;Z)V

    invoke-static {v0}, Lpi6;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAvailable(Landroid/net/Network;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LtB5$d$a;->b(Z)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LtB5$d$a;->b(Z)V

    return-void
.end method

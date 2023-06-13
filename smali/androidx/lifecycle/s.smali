.class public Landroidx/lifecycle/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/s$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0015\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/lifecycle/s;",
        "",
        "",
        "c",
        "b",
        "e",
        "d",
        "Landroidx/lifecycle/f$a;",
        "event",
        "f",
        "Landroidx/lifecycle/j;",
        "a",
        "Landroidx/lifecycle/j;",
        "registry",
        "Landroid/os/Handler;",
        "Landroid/os/Handler;",
        "handler",
        "Landroidx/lifecycle/s$a;",
        "Landroidx/lifecycle/s$a;",
        "lastDispatchRunnable",
        "Landroidx/lifecycle/f;",
        "()Landroidx/lifecycle/f;",
        "lifecycle",
        "LLifecycleOwner;",
        "provider",
        "<init>",
        "(LLifecycleOwner;)V",
        "lifecycle-service_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/j;

.field public final b:Landroid/os/Handler;

.field public c:Landroidx/lifecycle/s$a;


# direct methods
.method public constructor <init>(LLifecycleOwner;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0, p1}, Landroidx/lifecycle/j;-><init>(LLifecycleOwner;)V

    iput-object v0, p0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/j;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/s;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/j;

    return-object v0
.end method

.method public b()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public d()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/f$a;)V

    sget-object v0, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public final f(Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/s$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/s$a;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/s$a;

    iget-object v1, p0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/j;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/s$a;-><init>(Landroidx/lifecycle/j;Landroidx/lifecycle/f$a;)V

    iput-object v0, p0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/s$a;

    iget-object p1, p0, Landroidx/lifecycle/s;->b:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

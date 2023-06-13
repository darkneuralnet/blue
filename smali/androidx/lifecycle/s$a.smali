.class public final Landroidx/lifecycle/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/lifecycle/s$a;",
        "Ljava/lang/Runnable;",
        "",
        "run",
        "Landroidx/lifecycle/j;",
        "b",
        "Landroidx/lifecycle/j;",
        "registry",
        "Landroidx/lifecycle/f$a;",
        "c",
        "Landroidx/lifecycle/f$a;",
        "getEvent",
        "()Landroidx/lifecycle/f$a;",
        "event",
        "",
        "d",
        "Z",
        "wasExecuted",
        "<init>",
        "(Landroidx/lifecycle/j;Landroidx/lifecycle/f$a;)V",
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
.field public final b:Landroidx/lifecycle/j;

.field public final c:Landroidx/lifecycle/f$a;

.field public d:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/j;Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/s$a;->b:Landroidx/lifecycle/j;

    iput-object p2, p0, Landroidx/lifecycle/s$a;->c:Landroidx/lifecycle/f$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/s$a;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/s$a;->b:Landroidx/lifecycle/j;

    iget-object v1, p0, Landroidx/lifecycle/s$a;->c:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/s$a;->d:Z

    :cond_0
    return-void
.end method

.class public final Landroidx/lifecycle/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/lifecycle/j$b;",
        "",
        "LLifecycleOwner;",
        "owner",
        "Landroidx/lifecycle/f$a;",
        "event",
        "",
        "a",
        "Landroidx/lifecycle/f$b;",
        "Landroidx/lifecycle/f$b;",
        "b",
        "()Landroidx/lifecycle/f$b;",
        "setState",
        "(Landroidx/lifecycle/f$b;)V",
        "state",
        "Landroidx/lifecycle/i;",
        "Landroidx/lifecycle/i;",
        "getLifecycleObserver",
        "()Landroidx/lifecycle/i;",
        "setLifecycleObserver",
        "(Landroidx/lifecycle/i;)V",
        "lifecycleObserver",
        "LFq2;",
        "observer",
        "initialState",
        "<init>",
        "(LFq2;Landroidx/lifecycle/f$b;)V",
        "lifecycle-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:Landroidx/lifecycle/f$b;

.field public b:Landroidx/lifecycle/i;


# direct methods
.method public constructor <init>(LFq2;Landroidx/lifecycle/f$b;)V
    .locals 1

    const-string v0, "initialState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/lifecycle/k;->f(Ljava/lang/Object;)Landroidx/lifecycle/i;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/j$b;->b:Landroidx/lifecycle/i;

    iput-object p2, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/f$b;

    return-void
.end method


# virtual methods
.method public final a(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/f$a;->c()Landroidx/lifecycle/f$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/j;->j:Landroidx/lifecycle/j$a;

    iget-object v2, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/f$b;

    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/j$a;->a(Landroidx/lifecycle/f$b;Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$b;

    move-result-object v1

    iput-object v1, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/f$b;

    iget-object v1, p0, Landroidx/lifecycle/j$b;->b:Landroidx/lifecycle/i;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/i;->onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    iput-object v0, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/f$b;

    return-void
.end method

.method public final b()Landroidx/lifecycle/f$b;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/j$b;->a:Landroidx/lifecycle/f$b;

    return-object v0
.end method

.class public final Lcom/gorisse/thomas/lifecycle/ViewKt$lifecycleOwner$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLifecycleOwner;
.implements Landroidx/lifecycle/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "com/gorisse/thomas/lifecycle/ViewKt$lifecycleOwner$1",
        "LLifecycleOwner;",
        "Landroidx/lifecycle/i;",
        "source",
        "Landroidx/lifecycle/f$a;",
        "event",
        "",
        "onStateChanged",
        "Landroidx/lifecycle/f;",
        "getLifecycle",
        "Landroidx/lifecycle/j;",
        "b",
        "Landroidx/lifecycle/j;",
        "lifecycle",
        "android-view-lifecycle_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public b:Landroidx/lifecycle/j;


# virtual methods
.method public getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Lcom/gorisse/thomas/lifecycle/ViewKt$lifecycleOwner$1;->b:Landroidx/lifecycle/j;

    return-object v0
.end method

.method public onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/gorisse/thomas/lifecycle/ViewKt$lifecycleOwner$1;->b:Landroidx/lifecycle/j;

    invoke-virtual {p2}, Landroidx/lifecycle/f$a;->c()Landroidx/lifecycle/f$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    return-void
.end method

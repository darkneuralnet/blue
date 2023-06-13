.class public final Lcom/gorisse/thomas/lifecycle/ViewKt$doOnCreate$$inlined$doOnCreate$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006\u00b8\u0006\u0000"
    }
    d2 = {
        "com/gorisse/thomas/lifecycle/LifecycleKt$doOnCreate$1",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
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
.field public final synthetic b:Landroidx/lifecycle/f;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Landroid/view/View;


# virtual methods
.method public onCreate(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/gorisse/thomas/lifecycle/ViewKt$doOnCreate$$inlined$doOnCreate$1;->b:Landroidx/lifecycle/f;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->d(LFq2;)V

    iget-object p1, p0, Lcom/gorisse/thomas/lifecycle/ViewKt$doOnCreate$$inlined$doOnCreate$1;->c:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/gorisse/thomas/lifecycle/ViewKt$doOnCreate$$inlined$doOnCreate$1;->d:Landroid/view/View;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

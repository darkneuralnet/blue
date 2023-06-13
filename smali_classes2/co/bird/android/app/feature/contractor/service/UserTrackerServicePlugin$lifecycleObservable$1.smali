.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;-><init>(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/y<",
        "Landroidx/lifecycle/f$a;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/y;",
        "Landroidx/lifecycle/f$a;",
        "emitter",
        "",
        "b",
        "(Lio/reactivex/y;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;Lio/reactivex/y;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;->c(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;Lio/reactivex/y;)V

    return-void
.end method

.method public static final c(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;Lio/reactivex/y;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getLifecycleOwner$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LLifecycleOwner;

    move-result-object p0

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    new-instance v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p0, v0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Landroidx/lifecycle/f$a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    new-instance v2, Ldi6;

    invoke-direct {v2, v1, p1}, Ldi6;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;Lio/reactivex/y;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/y;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;->b(Lio/reactivex/y;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

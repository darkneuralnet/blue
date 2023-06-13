.class public final Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;


# direct methods
.method public constructor <init>(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    invoke-static {p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->access$getForegroundServiceLauncher$p(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Ldagger/Lazy;

    move-result-object p1

    invoke-interface {p1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfx1;

    iget-object v0, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    invoke-static {v0}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->access$getApplication$p(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Landroid/app/Application;

    move-result-object v0

    sget-object v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c$a;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c$a;

    invoke-interface {p1, v0, v1}, Lfx1;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.class public final Lpx1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfx1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lfx1;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpx1;->a:LY94;

    iput-object p2, p0, Lpx1;->b:LY94;

    iput-object p3, p0, Lpx1;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lpx1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lfx1;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)",
            "Lpx1;"
        }
    .end annotation

    new-instance v0, Lpx1;

    invoke-direct {v0, p0, p1, p2}, Lpx1;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/app/Application;Ldagger/Lazy;LLifecycleOwner;)Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ldagger/Lazy<",
            "Lfx1;",
            ">;",
            "LLifecycleOwner;",
            ")",
            "Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;-><init>(Landroid/app/Application;Ldagger/Lazy;LLifecycleOwner;)V

    return-object v0
.end method


# virtual methods
.method public b()Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;
    .locals 3

    iget-object v0, p0, Lpx1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lpx1;->b:LY94;

    invoke-static {v1}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v1

    iget-object v2, p0, Lpx1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLifecycleOwner;

    invoke-static {v0, v1, v2}, Lpx1;->c(Landroid/app/Application;Ldagger/Lazy;LLifecycleOwner;)Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpx1;->b()Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    move-result-object v0

    return-object v0
.end method

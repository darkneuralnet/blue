.class public final synthetic Lhx1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhx1;->b:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhx1;->b:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;

    invoke-static {v0}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->e(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

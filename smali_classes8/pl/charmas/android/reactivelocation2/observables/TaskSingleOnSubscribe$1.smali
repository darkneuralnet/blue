.class Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;->subscribe(Lio/reactivex/H;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;

.field final synthetic val$emitter:Lio/reactivex/H;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;Lio/reactivex/H;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;->this$0:Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;->val$emitter:Lio/reactivex/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;->val$emitter:Lio/reactivex/H;

    invoke-interface {v0}, Lio/reactivex/H;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;->val$emitter:Lio/reactivex/H;

    invoke-interface {v0, p1}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

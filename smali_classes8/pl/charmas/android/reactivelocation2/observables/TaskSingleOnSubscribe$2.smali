.class Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;->subscribe(Lio/reactivex/H;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;

.field final synthetic val$emitter:Lio/reactivex/H;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;Lio/reactivex/H;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;->this$0:Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;->val$emitter:Lio/reactivex/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Lcom/google/android/gms/common/api/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;->val$emitter:Lio/reactivex/H;

    invoke-interface {v0}, Lio/reactivex/H;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;->val$emitter:Lio/reactivex/H;

    invoke-interface {v0, p1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/Response;

    invoke-virtual {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;->onSuccess(Lcom/google/android/gms/common/api/Response;)V

    return-void
.end method

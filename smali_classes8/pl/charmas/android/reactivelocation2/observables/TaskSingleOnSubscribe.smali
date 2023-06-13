.class public Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/J;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/gms/common/api/Response;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/J<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final task:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/Task;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;->task:Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/H;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;->task:Lcom/google/android/gms/tasks/Task;

    new-instance v1, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;

    invoke-direct {v1, p0, p1}, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$2;-><init>(Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;Lio/reactivex/H;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;

    invoke-direct {v1, p0, p1}, Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe$1;-><init>(Lpl/charmas/android/reactivelocation2/observables/TaskSingleOnSubscribe;Lio/reactivex/H;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

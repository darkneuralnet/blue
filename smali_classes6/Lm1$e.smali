.class public final LLm1$e;
.super Lcom/google/android/gms/common/api/internal/TaskApiCall;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/TaskApiCall<",
        "LA81;",
        "LbQ3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "Lba;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LX94;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LX94<",
            "Lba;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x3391

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/TaskApiCall;-><init>([Lcom/google/android/gms/common/Feature;ZI)V

    iput-object p2, p0, LLm1$e;->a:Ljava/lang/String;

    iput-object p1, p0, LLm1$e;->b:LX94;

    return-void
.end method


# virtual methods
.method public a(LA81;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LA81;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "LbQ3;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, LLm1$d;

    iget-object v1, p0, LLm1$e;->b:LX94;

    invoke-direct {v0, v1, p2}, LLm1$d;-><init>(LX94;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, LLm1$e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, LA81;->e(LpO1$a;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, LA81;

    invoke-virtual {p0, p1, p2}, LLm1$e;->a(LA81;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.class public final synthetic LV49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LcV2;

.field public final synthetic c:Lcom/google/android/gms/tasks/CancellationToken;

.field public final synthetic d:Lcom/google/android/gms/tasks/CancellationTokenSource;

.field public final synthetic e:Ljava/util/concurrent/Callable;

.field public final synthetic f:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LcV2;Lcom/google/android/gms/tasks/CancellationToken;Lcom/google/android/gms/tasks/CancellationTokenSource;Ljava/util/concurrent/Callable;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV49;->b:LcV2;

    iput-object p2, p0, LV49;->c:Lcom/google/android/gms/tasks/CancellationToken;

    iput-object p3, p0, LV49;->d:Lcom/google/android/gms/tasks/CancellationTokenSource;

    iput-object p4, p0, LV49;->e:Ljava/util/concurrent/Callable;

    iput-object p5, p0, LV49;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LV49;->b:LcV2;

    iget-object v1, p0, LV49;->c:Lcom/google/android/gms/tasks/CancellationToken;

    iget-object v2, p0, LV49;->d:Lcom/google/android/gms/tasks/CancellationTokenSource;

    iget-object v3, p0, LV49;->e:Ljava/util/concurrent/Callable;

    iget-object v4, p0, LV49;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, v2, v3, v4}, LcV2;->g(Lcom/google/android/gms/tasks/CancellationToken;Lcom/google/android/gms/tasks/CancellationTokenSource;Ljava/util/concurrent/Callable;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

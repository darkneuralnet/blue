.class public final synthetic Lji9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LGi9;

.field public final synthetic c:LYb9;

.field public final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LGi9;LYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji9;->b:LGi9;

    iput-object p2, p0, Lji9;->c:LYb9;

    iput-object p4, p0, Lji9;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lji9;->b:LGi9;

    iget-object v1, p0, Lji9;->c:LYb9;

    const/4 v2, 0x1

    iget-object v3, p0, Lji9;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, v2, v3}, LGi9;->j(LYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

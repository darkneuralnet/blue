.class public final synthetic Lrn7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ltn7;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:LGn7;

.field public final synthetic g:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Ltn7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrn7;->b:Ltn7;

    iput-object p2, p0, Lrn7;->c:Ljava/lang/String;

    iput-object p3, p0, Lrn7;->d:Ljava/lang/String;

    const-string p1, "com.google.perception"

    iput-object p1, p0, Lrn7;->e:Ljava/lang/String;

    iput-object p6, p0, Lrn7;->f:LGn7;

    iput-object p7, p0, Lrn7;->g:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lrn7;->b:Ltn7;

    iget-object v1, p0, Lrn7;->c:Ljava/lang/String;

    iget-object v2, p0, Lrn7;->d:Ljava/lang/String;

    iget-object v3, p0, Lrn7;->e:Ljava/lang/String;

    const/4 v4, 0x2

    iget-object v5, p0, Lrn7;->f:LGn7;

    iget-object v6, p0, Lrn7;->g:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual/range {v0 .. v6}, Ltn7;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

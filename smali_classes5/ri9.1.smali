.class public final synthetic Lri9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LGi9;

.field public final synthetic c:Ljava/util/Date;

.field public final synthetic d:J

.field public final synthetic e:LYb9;

.field public final synthetic f:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LGi9;Ljava/util/Date;JLYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lri9;->b:LGi9;

    iput-object p2, p0, Lri9;->c:Ljava/util/Date;

    iput-wide p3, p0, Lri9;->d:J

    iput-object p5, p0, Lri9;->e:LYb9;

    iput-object p7, p0, Lri9;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lri9;->b:LGi9;

    iget-object v1, p0, Lri9;->c:Ljava/util/Date;

    iget-wide v2, p0, Lri9;->d:J

    iget-object v4, p0, Lri9;->e:LYb9;

    const/4 v5, 0x0

    iget-object v6, p0, Lri9;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual/range {v0 .. v6}, LGi9;->i(Ljava/util/Date;JLYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

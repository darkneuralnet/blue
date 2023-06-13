.class public final synthetic LIu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/a;

.field public final synthetic b:Lcom/google/android/gms/tasks/Task;

.field public final synthetic c:Lcom/google/android/gms/tasks/Task;

.field public final synthetic d:J

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/a;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIu0;->a:Lcom/google/firebase/remoteconfig/internal/a;

    iput-object p2, p0, LIu0;->b:Lcom/google/android/gms/tasks/Task;

    iput-object p3, p0, LIu0;->c:Lcom/google/android/gms/tasks/Task;

    iput-wide p4, p0, LIu0;->d:J

    iput p6, p0, LIu0;->e:I

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LIu0;->a:Lcom/google/firebase/remoteconfig/internal/a;

    iget-object v1, p0, LIu0;->b:Lcom/google/android/gms/tasks/Task;

    iget-object v2, p0, LIu0;->c:Lcom/google/android/gms/tasks/Task;

    iget-wide v3, p0, LIu0;->d:J

    iget v5, p0, LIu0;->e:I

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lcom/google/firebase/remoteconfig/internal/a;->a(Lcom/google/firebase/remoteconfig/internal/a;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;JILcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

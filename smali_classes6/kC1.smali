.class public LkC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAP5;


# instance fields
.field public final a:LPi6;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "La52;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LPi6;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LPi6;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "La52;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkC1;->a:LPi6;

    iput-object p2, p0, LkC1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, LkC1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public b(LnR3;)Z
    .locals 4

    invoke-virtual {p1}, LnR3;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LkC1;->a:LPi6;

    invoke-virtual {v0, p1}, LPi6;->f(LnR3;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LkC1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {}, La52;->a()La52$a;

    move-result-object v1

    invoke-virtual {p1}, LnR3;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, La52$a;->b(Ljava/lang/String;)La52$a;

    move-result-object v1

    invoke-virtual {p1}, LnR3;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La52$a;->d(J)La52$a;

    move-result-object v1

    invoke-virtual {p1}, LnR3;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La52$a;->c(J)La52$a;

    move-result-object p1

    invoke-virtual {p1}, La52$a;->a()La52;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

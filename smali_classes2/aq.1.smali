.class public final synthetic Laq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lio/reactivex/e;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq;->b:Lio/reactivex/e;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Laq;->b:Lio/reactivex/e;

    invoke-static {v0, p1}, LZp$f;->a(Lio/reactivex/e;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

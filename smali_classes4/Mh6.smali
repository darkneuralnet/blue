.class public final synthetic LMh6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lio/reactivex/H;

.field public final synthetic c:LJh6;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;LJh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh6;->b:Lio/reactivex/H;

    iput-object p2, p0, LMh6;->c:LJh6;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, LMh6;->b:Lio/reactivex/H;

    iget-object v1, p0, LMh6;->c:LJh6;

    invoke-static {v0, v1, p1}, LJh6$l;->a(Lio/reactivex/H;LJh6;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

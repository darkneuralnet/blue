.class public final synthetic LCr4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lio/reactivex/H;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCr4;->b:Lio/reactivex/H;

    iput-boolean p2, p0, LCr4;->c:Z

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, LCr4;->b:Lio/reactivex/H;

    iget-boolean v1, p0, LCr4;->c:Z

    invoke-static {v0, v1, p1}, LAr4$p;->a(Lio/reactivex/H;ZLcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.class public final synthetic LsD1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsD1;->b:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, LsD1;->b:Lio/reactivex/H;

    invoke-static {v0, p1}, LrD1$d;->a(Lio/reactivex/H;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

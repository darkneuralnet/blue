.class public final synthetic LAh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lco/bird/android/App;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/App;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh;->b:Lco/bird/android/App;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, LAh;->b:Lco/bird/android/App;

    invoke-static {v0, p1}, Lco/bird/android/App;->b(Lco/bird/android/App;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

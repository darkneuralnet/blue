.class public final synthetic LWm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWm1;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, LWm1;->a:Ljava/lang/String;

    check-cast p1, LO56;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->d(Ljava/lang/String;LO56;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

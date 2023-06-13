.class public final synthetic LAv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Ljava/net/HttpURLConnection;


# direct methods
.method public synthetic constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAv0;->a:Ljava/net/HttpURLConnection;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, LAv0;->a:Ljava/net/HttpURLConnection;

    check-cast p1, La52;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->a(Ljava/net/HttpURLConnection;La52;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.class public final LPN6;
.super LEN6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEN6<",
        "Lcom/google/android/play/core/review/ReviewInfo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYN6;LaO6;)V
    .locals 2

    new-instance v0, LhK6;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, LEN6;-><init>(LYN6;LhK6;LaO6;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-super {p0, p1}, LEN6;->b(Landroid/os/Bundle;)V

    const-string v0, "confirmation_intent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/PendingIntent;

    iget-object v0, p0, LEN6;->b:LaO6;

    invoke-static {p1}, Lcom/google/android/play/core/review/ReviewInfo;->b(Landroid/app/PendingIntent;)Lcom/google/android/play/core/review/ReviewInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, LaO6;->e(Ljava/lang/Object;)V

    return-void
.end method

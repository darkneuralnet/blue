.class final Lcom/google/android/play/core/review/b;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic b:LaO6;


# direct methods
.method public constructor <init>(Landroid/os/Handler;LaO6;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/play/core/review/b;->b:LaO6;

    invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/play/core/review/b;->b:LaO6;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LaO6;->e(Ljava/lang/Object;)V

    return-void
.end method

.class public final Lco/bird/android/feature/hardcount/HardCountActivity$c;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/hardcount/HardCountActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "co/bird/android/feature/hardcount/HardCountActivity$c",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Landroid/net/Network;",
        "network",
        "",
        "onAvailable",
        "onLost",
        "co.bird.android.feature.hardcount"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/feature/hardcount/HardCountActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/hardcount/HardCountActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/hardcount/HardCountActivity$c;->a:Lco/bird/android/feature/hardcount/HardCountActivity;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    iget-object p1, p0, Lco/bird/android/feature/hardcount/HardCountActivity$c;->a:Lco/bird/android/feature/hardcount/HardCountActivity;

    invoke-virtual {p1}, Lco/bird/android/feature/hardcount/HardCountActivity;->j0()LrG1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LrG1;->c(Z)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    iget-object p1, p0, Lco/bird/android/feature/hardcount/HardCountActivity$c;->a:Lco/bird/android/feature/hardcount/HardCountActivity;

    invoke-virtual {p1}, Lco/bird/android/feature/hardcount/HardCountActivity;->j0()LrG1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LrG1;->c(Z)V

    return-void
.end method

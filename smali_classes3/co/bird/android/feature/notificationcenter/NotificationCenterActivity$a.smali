.class public final Lco/bird/android/feature/notificationcenter/NotificationCenterActivity$a;
.super LVe3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "co/bird/android/feature/notificationcenter/NotificationCenterActivity$a",
        "LVe3;",
        "",
        "handleOnBackPressed",
        "notification-center_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity$a;->a:Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LVe3;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity$a;->a:Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;

    invoke-static {v0}, Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;->access$back(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)V

    return-void
.end method

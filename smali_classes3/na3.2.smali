.class public final Lna3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lna3;",
        "LF6;",
        "LG6;",
        "adapterItem",
        "",
        "b",
        "oldItem",
        "newItem",
        "",
        "c",
        "<init>",
        "()V",
        "notification-center_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationCenterAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterAdapterDiff.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,34:1\n18#2:35\n18#2:40\n18#2:45\n9#3,4:36\n9#3,4:41\n9#3,4:46\n*S KotlinDebug\n*F\n+ 1 NotificationCenterAdapterDiff.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapterDiff\n*L\n12#1:35\n14#1:40\n28#1:45\n12#1:36,4\n14#1:41,4\n28#1:46,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/util/List<",
            "LH6;",
            ">;)",
            "Landroidx/recyclerview/widget/h$e;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LF6$a;->a(LF6;Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object p1

    return-object p1
.end method

.method public b(LG6;)Ljava/lang/String;
    .locals 4

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Lsj4;->item_date_header:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v2

    goto :goto_1

    :cond_2
    sget v1, Lsj4;->item_notification:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/OperatorNotification;

    :cond_4
    instance-of p1, v2, Lco/bird/android/model/OperatorNotification$Notification;

    if-eqz p1, :cond_5

    check-cast v2, Lco/bird/android/model/OperatorNotification$Notification;

    invoke-virtual {v2}, Lco/bird/android/model/OperatorNotification$Notification;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_5
    instance-of p1, v2, Lco/bird/android/model/OperatorNotification$NotificationGroup;

    if-eqz p1, :cond_6

    check-cast v2, Lco/bird/android/model/OperatorNotification$NotificationGroup;

    invoke-virtual {v2}, Lco/bird/android/model/OperatorNotification$NotificationGroup;->getGroupId()Ljava/lang/String;

    move-result-object v3

    :cond_6
    :goto_1
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_3

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.OperatorNotification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/model/OperatorNotification;

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    check-cast p2, Lkotlin/Pair;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lco/bird/android/model/OperatorNotification;

    :cond_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_3
    :goto_1
    return v1
.end method

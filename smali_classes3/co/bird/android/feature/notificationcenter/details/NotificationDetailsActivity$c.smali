.class public final Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->c1()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/Unit;",
        "LOc3;",
        "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "<anonymous parameter 0>",
        "LOc3;",
        "state",
        "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
        "a",
        "(Lkotlin/Unit;LOc3;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;

    invoke-direct {v0}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;-><init>()V

    sput-object v0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;->g:Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;LOc3;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "state"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LOc3;->b()Lco/bird/android/model/persistence/Notification;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getActions()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    check-cast p2, LOc3;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;->a(Lkotlin/Unit;LOc3;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    move-result-object p1

    return-object p1
.end method

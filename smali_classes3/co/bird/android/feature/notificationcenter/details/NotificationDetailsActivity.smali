.class public final Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LNc3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$a;,
        Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001(B\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\"\u0010$\u001a\u0010\u0012\u000c\u0012\n !*\u0004\u0018\u00010\u000b0\u000b0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006)"
    }
    d2 = {
        "Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LNc3;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LOc3;",
        "state",
        "S",
        "Lio/reactivex/F;",
        "",
        "N3",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
        "c1",
        "LKc3;",
        "j",
        "LKc3;",
        "R",
        "()LKc3;",
        "setPresenter",
        "(LKc3;)V",
        "presenter",
        "Lt4;",
        "k",
        "Lt4;",
        "binding",
        "Lpa3;",
        "l",
        "Lpa3;",
        "component",
        "Lio/reactivex/subjects/g;",
        "kotlin.jvm.PlatformType",
        "m",
        "Lio/reactivex/subjects/g;",
        "notificationIdSubject",
        "<init>",
        "()V",
        "n",
        "a",
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
        "SMAP\nNotificationDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailsActivity.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"
    }
.end annotation


# static fields
.field public static final n:Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$a;

.field public static final o:Ljava/text/DateFormat;


# instance fields
.field public j:LKc3;

.field public k:Lt4;

.field public l:Lpa3;

.field public final m:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->n:Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$a;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/DateFormat;->getTimeInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    sput-object v0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->o:Ljava/text/DateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/g;->w0()Lio/reactivex/subjects/g;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->m:Lio/reactivex/subjects/g;

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->Q(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    move-result-object p0

    return-object p0
.end method

.method public static final Q(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    return-object p0
.end method


# virtual methods
.method public N3()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->m:Lio/reactivex/subjects/g;

    invoke-virtual {v0}, Lio/reactivex/F;->F()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "notificationIdSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final R()LKc3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->j:LKc3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public S(LOc3;)V
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LOc3;->b()Lco/bird/android/model/persistence/Notification;

    move-result-object p1

    if-eqz p1, :cond_f

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v0, v0, Lt4;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    iget-object v0, v0, Lt4;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getShortDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    iget-object v0, v0, Lt4;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getFullDescription()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    const/16 v4, 0x3f

    invoke-static {v3, v4}, LwN1;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v3

    goto :goto_0

    :cond_3
    move-object v3, v2

    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getDate()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Days;->getDays()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getDate()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0, p0, v4, v3, v2}, LpT0;->getElapsedTime$default(Lorg/joda/time/DateTime;Landroid/content/Context;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget-object v0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->o:Ljava/text/DateFormat;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getDate()Lorg/joda/time/DateTime;

    move-result-object v5

    invoke-virtual {v5}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object v5, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v5, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    :cond_5
    iget-object v5, v5, Lt4;->g:Landroid/widget/TextView;

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getPinShape()Lco/bird/android/model/constant/NotificationIconPinShape;

    move-result-object v0

    sget-object v5, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    const-string v5, "inflate(layoutInflater, binding.pin, true)"

    const/4 v6, 0x1

    if-eq v0, v6, :cond_a

    if-eq v0, v3, :cond_8

    const/4 v7, 0x3

    if-eq v0, v7, :cond_6

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v7, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v7, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v2

    :cond_7
    iget-object v7, v7, Lt4;->e:Landroid/widget/FrameLayout;

    invoke-static {v0, v7, v6}, LQT3;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LQT3;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, LQT3;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    invoke-static {v7, p0}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v5, v0, LQT3;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v7

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, v0, LQT3;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v5

    invoke-virtual {v0, v5}, Lco/bird/android/widget/FleetMarkerPin;->setColor(I)V

    goto/16 :goto_2

    :cond_8
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v7, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v7, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v2

    :cond_9
    iget-object v7, v7, Lt4;->e:Landroid/widget/FrameLayout;

    invoke-static {v0, v7, v6}, LPT3;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LPT3;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, LPT3;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    invoke-static {v7, p0}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v5, v0, LPT3;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v7

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, v0, LPT3;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v5

    invoke-virtual {v0, v5}, Lco/bird/android/widget/FleetMarkerPin;->setColor(I)V

    goto :goto_2

    :cond_a
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v7, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v7, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v2

    :cond_b
    iget-object v7, v7, Lt4;->e:Landroid/widget/FrameLayout;

    invoke-static {v0, v7, v6}, LOT3;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LOT3;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, LOT3;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    invoke-static {v7, p0}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v5, v0, LOT3;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v7

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, v0, LOT3;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v5

    invoke-virtual {v0, v5}, Lco/bird/android/widget/FleetMarkerPin;->setColor(I)V

    :goto_2
    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v0, :cond_c

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_c
    iget-object v0, v0, Lt4;->b:Landroid/widget/Button;

    const-string v5, "binding.action"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getActions()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_d

    goto :goto_3

    :cond_d
    move v6, v4

    :goto_3
    invoke-static {v0, v6, v4, v3, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Notification;->getActions()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NotificationAction;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez v0, :cond_e

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_e
    move-object v2, v0

    :goto_4
    iget-object v0, v2, Lt4;->b:Landroid/widget/Button;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_f
    return-void
.end method

.method public c1()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Lt4;->b:Landroid/widget/Button;

    const-string v2, "binding.action"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->R()LKc3;

    move-result-object v1

    invoke-virtual {v1}, Lf1;->l()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;->g:Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$c;

    new-instance v3, LDc3;

    invoke-direct {v3, v2}, LDc3;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v1, v3}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "binding.action.clicksThr\u2026ation!!.actions.first() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lt4;->c(Landroid/view/LayoutInflater;)Lt4;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    sget-object p1, Lqa3;->b:Lqa3;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, LAk1;->component$default(LAk1;Landroid/app/Application;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpa3;

    iput-object p1, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->l:Lpa3;

    if-nez p1, :cond_0

    const-string p1, "component"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_0
    invoke-interface {p1, p0}, Lpa3;->c(Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;)V

    iget-object p1, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->k:Lt4;

    if-nez p1, :cond_1

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Lt4;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->R()LKc3;

    move-result-object p1

    invoke-virtual {p1, p0}, LKc3;->r(LNc3;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "notification_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->m:Lio/reactivex/subjects/g;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/g;->onSuccess(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LOc3;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;->S(LOc3;)V

    return-void
.end method

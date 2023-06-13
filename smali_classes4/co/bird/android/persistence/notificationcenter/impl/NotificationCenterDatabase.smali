.class public abstract Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase;
.super LEb5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase;",
        "LEb5;",
        "Lro3;",
        "C",
        "()Lro3;",
        "categoriesDao",
        "LPc3;",
        "E",
        "()LPc3;",
        "notificationGroupDao",
        "LBc3;",
        "D",
        "()LBc3;",
        "notificationDao",
        "<init>",
        "()V",
        "p",
        "a",
        "co.bird.android.lib.persistence.notificationcenter.impl"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final p:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase;->p:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEb5;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract C()Lro3;
.end method

.method public abstract D()LBc3;
.end method

.method public abstract E()LPc3;
.end method

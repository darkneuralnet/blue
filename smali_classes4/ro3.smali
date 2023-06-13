.class public abstract Lro3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\t0\u0008H\'\u00a8\u0006\r"
    }
    d2 = {
        "Lro3;",
        "",
        "",
        "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
        "categories",
        "Lio/reactivex/c;",
        "a",
        "([Lco/bird/android/model/persistence/OperatorNotificationCategory;)Lio/reactivex/c;",
        "Lio/reactivex/Observable;",
        "",
        "b",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.notificationcenter.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs abstract a([Lco/bird/android/model/persistence/OperatorNotificationCategory;)Lio/reactivex/c;
.end method

.method public abstract b()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;>;"
        }
    .end annotation
.end method

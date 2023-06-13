.class public interface abstract Lco/bird/android/model/NotificationPriority;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/NotificationPriority$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/NotificationPriority;",
        "",
        "Companion",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BLUETOOTH_TRACKER:I = 0x0

.field public static final Companion:Lco/bird/android/model/NotificationPriority$Companion;

.field public static final LOCAL_ASSETS:I = 0x3

.field public static final SENSOR_TRACKER:I = 0x1

.field public static final USER_TRACKER:I = 0x2


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/bird/android/model/NotificationPriority$Companion;->$$INSTANCE:Lco/bird/android/model/NotificationPriority$Companion;

    sput-object v0, Lco/bird/android/model/NotificationPriority;->Companion:Lco/bird/android/model/NotificationPriority$Companion;

    return-void
.end method

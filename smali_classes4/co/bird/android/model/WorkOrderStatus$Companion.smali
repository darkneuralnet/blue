.class public final Lco/bird/android/model/WorkOrderStatus$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/WorkOrderStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrderStatus$Companion;",
        "",
        "()V",
        "CLOSED_STATUSES",
        "",
        "Lco/bird/android/model/WorkOrderStatus;",
        "getCLOSED_STATUSES",
        "()[Lco/bird/android/model/WorkOrderStatus;",
        "[Lco/bird/android/model/WorkOrderStatus;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/WorkOrderStatus$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCLOSED_STATUSES()[Lco/bird/android/model/WorkOrderStatus;
    .locals 1

    invoke-static {}, Lco/bird/android/model/WorkOrderStatus;->access$getCLOSED_STATUSES$cp()[Lco/bird/android/model/WorkOrderStatus;

    move-result-object v0

    return-object v0
.end method

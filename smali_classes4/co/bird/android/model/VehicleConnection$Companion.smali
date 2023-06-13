.class public final Lco/bird/android/model/VehicleConnection$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/VehicleConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/VehicleConnection$Companion;",
        "",
        "()V",
        "BLE_MAX_DATA_LENGTH",
        "",
        "BLE_WRITE_CHUNK_DELAY_MILLIS",
        "",
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
.field static final synthetic $$INSTANCE:Lco/bird/android/model/VehicleConnection$Companion;

.field public static final BLE_MAX_DATA_LENGTH:I = 0x10

.field public static final BLE_WRITE_CHUNK_DELAY_MILLIS:J = 0x64L


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/VehicleConnection$Companion;

    invoke-direct {v0}, Lco/bird/android/model/VehicleConnection$Companion;-><init>()V

    sput-object v0, Lco/bird/android/model/VehicleConnection$Companion;->$$INSTANCE:Lco/bird/android/model/VehicleConnection$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

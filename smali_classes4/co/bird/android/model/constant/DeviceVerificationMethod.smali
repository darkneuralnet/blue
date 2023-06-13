.class public final enum Lco/bird/android/model/constant/DeviceVerificationMethod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/DeviceVerificationMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/constant/DeviceVerificationMethod;",
        "",
        "(Ljava/lang/String;I)V",
        "APP_CHECK",
        "PUSH",
        "PUSH_TEST",
        "UNKNOWN",
        "model-constant"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/DeviceVerificationMethod;

.field public static final enum APP_CHECK:Lco/bird/android/model/constant/DeviceVerificationMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "app_check"
    .end annotation

    .annotation runtime Lft5;
        value = "app_check"
    .end annotation
.end field

.field public static final enum PUSH:Lco/bird/android/model/constant/DeviceVerificationMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "push"
    .end annotation

    .annotation runtime Lft5;
        value = "push"
    .end annotation
.end field

.field public static final enum PUSH_TEST:Lco/bird/android/model/constant/DeviceVerificationMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "push_test"
    .end annotation

    .annotation runtime Lft5;
        value = "push_test"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/DeviceVerificationMethod;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/DeviceVerificationMethod;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/constant/DeviceVerificationMethod;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/DeviceVerificationMethod;->APP_CHECK:Lco/bird/android/model/constant/DeviceVerificationMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/DeviceVerificationMethod;->PUSH:Lco/bird/android/model/constant/DeviceVerificationMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/DeviceVerificationMethod;->PUSH_TEST:Lco/bird/android/model/constant/DeviceVerificationMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/DeviceVerificationMethod;->UNKNOWN:Lco/bird/android/model/constant/DeviceVerificationMethod;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/DeviceVerificationMethod;

    const-string v1, "APP_CHECK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/DeviceVerificationMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/DeviceVerificationMethod;->APP_CHECK:Lco/bird/android/model/constant/DeviceVerificationMethod;

    new-instance v0, Lco/bird/android/model/constant/DeviceVerificationMethod;

    const-string v1, "PUSH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/DeviceVerificationMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/DeviceVerificationMethod;->PUSH:Lco/bird/android/model/constant/DeviceVerificationMethod;

    new-instance v0, Lco/bird/android/model/constant/DeviceVerificationMethod;

    const-string v1, "PUSH_TEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/DeviceVerificationMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/DeviceVerificationMethod;->PUSH_TEST:Lco/bird/android/model/constant/DeviceVerificationMethod;

    new-instance v0, Lco/bird/android/model/constant/DeviceVerificationMethod;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/DeviceVerificationMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/DeviceVerificationMethod;->UNKNOWN:Lco/bird/android/model/constant/DeviceVerificationMethod;

    invoke-static {}, Lco/bird/android/model/constant/DeviceVerificationMethod;->$values()[Lco/bird/android/model/constant/DeviceVerificationMethod;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/DeviceVerificationMethod;->$VALUES:[Lco/bird/android/model/constant/DeviceVerificationMethod;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/DeviceVerificationMethod;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/DeviceVerificationMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/DeviceVerificationMethod;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/DeviceVerificationMethod;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/DeviceVerificationMethod;->$VALUES:[Lco/bird/android/model/constant/DeviceVerificationMethod;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/DeviceVerificationMethod;

    return-object v0
.end method

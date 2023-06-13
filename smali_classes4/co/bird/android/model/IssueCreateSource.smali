.class public final enum Lco/bird/android/model/IssueCreateSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/IssueCreateSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/IssueCreateSource;",
        "",
        "(Ljava/lang/String;I)V",
        "INSPECTION",
        "REPAIR",
        "VEHICLE_FAULT_CODE",
        "FIELD_CENTER",
        "RIDER_REPORT",
        "QUALITY_CONTROL",
        "CAMPAIGN",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/IssueCreateSource;

.field public static final enum CAMPAIGN:Lco/bird/android/model/IssueCreateSource;

.field public static final enum FIELD_CENTER:Lco/bird/android/model/IssueCreateSource;

.field public static final enum INSPECTION:Lco/bird/android/model/IssueCreateSource;

.field public static final enum QUALITY_CONTROL:Lco/bird/android/model/IssueCreateSource;

.field public static final enum REPAIR:Lco/bird/android/model/IssueCreateSource;

.field public static final enum RIDER_REPORT:Lco/bird/android/model/IssueCreateSource;

.field public static final enum VEHICLE_FAULT_CODE:Lco/bird/android/model/IssueCreateSource;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/IssueCreateSource;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/IssueCreateSource;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->INSPECTION:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->REPAIR:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->VEHICLE_FAULT_CODE:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->FIELD_CENTER:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->RIDER_REPORT:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->QUALITY_CONTROL:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->CAMPAIGN:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "INSPECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->INSPECTION:Lco/bird/android/model/IssueCreateSource;

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "REPAIR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->REPAIR:Lco/bird/android/model/IssueCreateSource;

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "VEHICLE_FAULT_CODE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->VEHICLE_FAULT_CODE:Lco/bird/android/model/IssueCreateSource;

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "FIELD_CENTER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->FIELD_CENTER:Lco/bird/android/model/IssueCreateSource;

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "RIDER_REPORT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->RIDER_REPORT:Lco/bird/android/model/IssueCreateSource;

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "QUALITY_CONTROL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->QUALITY_CONTROL:Lco/bird/android/model/IssueCreateSource;

    new-instance v0, Lco/bird/android/model/IssueCreateSource;

    const-string v1, "CAMPAIGN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueCreateSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->CAMPAIGN:Lco/bird/android/model/IssueCreateSource;

    invoke-static {}, Lco/bird/android/model/IssueCreateSource;->$values()[Lco/bird/android/model/IssueCreateSource;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/IssueCreateSource;->$VALUES:[Lco/bird/android/model/IssueCreateSource;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/IssueCreateSource;
    .locals 1

    const-class v0, Lco/bird/android/model/IssueCreateSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/IssueCreateSource;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/IssueCreateSource;
    .locals 1

    sget-object v0, Lco/bird/android/model/IssueCreateSource;->$VALUES:[Lco/bird/android/model/IssueCreateSource;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/IssueCreateSource;

    return-object v0
.end method

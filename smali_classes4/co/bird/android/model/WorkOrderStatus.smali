.class public final enum Lco/bird/android/model/WorkOrderStatus;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/WorkOrderStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/WorkOrderStatus;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0087\u0001\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001aB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0006\u001a\u00020\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001j\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/WorkOrderStatus;",
        "",
        "Landroid/os/Parcelable;",
        "(Ljava/lang/String;I)V",
        "describeContents",
        "",
        "isClosed",
        "",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "IN_FIELD",
        "RECOVER",
        "REPAIR",
        "QUALITY_CONTROL",
        "RESOLVED",
        "ABANDONED",
        "DISPUTED",
        "PROGRAMMATIC",
        "FAILED_QC",
        "UNKNOWN",
        "CLOSED",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/WorkOrderStatus;

.field public static final enum ABANDONED:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum CLOSED:Lco/bird/android/model/WorkOrderStatus;
    .annotation runtime Lkotlin/Deprecated;
        message = "Use RESOLVED/DISPUTED"
    .end annotation
.end field

.field private static final CLOSED_STATUSES:[Lco/bird/android/model/WorkOrderStatus;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/WorkOrderStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/WorkOrderStatus$Companion;

.field public static final enum DISPUTED:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum FAILED_QC:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum IN_FIELD:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum PROGRAMMATIC:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum RECOVER:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum REPAIR:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum RESOLVED:Lco/bird/android/model/WorkOrderStatus;

.field public static final enum UNKNOWN:Lco/bird/android/model/WorkOrderStatus;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/WorkOrderStatus;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lco/bird/android/model/WorkOrderStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->IN_FIELD:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->RECOVER:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->REPAIR:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->RESOLVED:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->ABANDONED:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->DISPUTED:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->PROGRAMMATIC:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->FAILED_QC:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->UNKNOWN:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->CLOSED:Lco/bird/android/model/WorkOrderStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lco/bird/android/model/WorkOrderStatus;

    const-string v1, "IN_FIELD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/WorkOrderStatus;->IN_FIELD:Lco/bird/android/model/WorkOrderStatus;

    new-instance v0, Lco/bird/android/model/WorkOrderStatus;

    const-string v1, "RECOVER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/WorkOrderStatus;->RECOVER:Lco/bird/android/model/WorkOrderStatus;

    new-instance v0, Lco/bird/android/model/WorkOrderStatus;

    const-string v1, "REPAIR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/WorkOrderStatus;->REPAIR:Lco/bird/android/model/WorkOrderStatus;

    new-instance v0, Lco/bird/android/model/WorkOrderStatus;

    const-string v1, "QUALITY_CONTROL"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/WorkOrderStatus;->QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatus;

    new-instance v0, Lco/bird/android/model/WorkOrderStatus;

    const-string v1, "RESOLVED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/WorkOrderStatus;->RESOLVED:Lco/bird/android/model/WorkOrderStatus;

    new-instance v1, Lco/bird/android/model/WorkOrderStatus;

    const-string v7, "ABANDONED"

    const/4 v8, 0x5

    invoke-direct {v1, v7, v8}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lco/bird/android/model/WorkOrderStatus;->ABANDONED:Lco/bird/android/model/WorkOrderStatus;

    new-instance v7, Lco/bird/android/model/WorkOrderStatus;

    const-string v8, "DISPUTED"

    const/4 v9, 0x6

    invoke-direct {v7, v8, v9}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lco/bird/android/model/WorkOrderStatus;->DISPUTED:Lco/bird/android/model/WorkOrderStatus;

    new-instance v8, Lco/bird/android/model/WorkOrderStatus;

    const-string v9, "PROGRAMMATIC"

    const/4 v10, 0x7

    invoke-direct {v8, v9, v10}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lco/bird/android/model/WorkOrderStatus;->PROGRAMMATIC:Lco/bird/android/model/WorkOrderStatus;

    new-instance v8, Lco/bird/android/model/WorkOrderStatus;

    const-string v9, "FAILED_QC"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lco/bird/android/model/WorkOrderStatus;->FAILED_QC:Lco/bird/android/model/WorkOrderStatus;

    new-instance v8, Lco/bird/android/model/WorkOrderStatus;

    const-string v9, "UNKNOWN"

    const/16 v10, 0x9

    invoke-direct {v8, v9, v10}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lco/bird/android/model/WorkOrderStatus;->UNKNOWN:Lco/bird/android/model/WorkOrderStatus;

    new-instance v8, Lco/bird/android/model/WorkOrderStatus;

    const-string v9, "CLOSED"

    const/16 v10, 0xa

    invoke-direct {v8, v9, v10}, Lco/bird/android/model/WorkOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lco/bird/android/model/WorkOrderStatus;->CLOSED:Lco/bird/android/model/WorkOrderStatus;

    invoke-static {}, Lco/bird/android/model/WorkOrderStatus;->$values()[Lco/bird/android/model/WorkOrderStatus;

    move-result-object v9

    sput-object v9, Lco/bird/android/model/WorkOrderStatus;->$VALUES:[Lco/bird/android/model/WorkOrderStatus;

    new-instance v9, Lco/bird/android/model/WorkOrderStatus$Companion;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lco/bird/android/model/WorkOrderStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lco/bird/android/model/WorkOrderStatus;->Companion:Lco/bird/android/model/WorkOrderStatus$Companion;

    new-instance v9, Lco/bird/android/model/WorkOrderStatus$Creator;

    invoke-direct {v9}, Lco/bird/android/model/WorkOrderStatus$Creator;-><init>()V

    sput-object v9, Lco/bird/android/model/WorkOrderStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    new-array v6, v6, [Lco/bird/android/model/WorkOrderStatus;

    aput-object v8, v6, v2

    aput-object v0, v6, v3

    aput-object v1, v6, v4

    aput-object v7, v6, v5

    sput-object v6, Lco/bird/android/model/WorkOrderStatus;->CLOSED_STATUSES:[Lco/bird/android/model/WorkOrderStatus;

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

.method public static final synthetic access$getCLOSED_STATUSES$cp()[Lco/bird/android/model/WorkOrderStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/WorkOrderStatus;->CLOSED_STATUSES:[Lco/bird/android/model/WorkOrderStatus;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/WorkOrderStatus;
    .locals 1

    const-class v0, Lco/bird/android/model/WorkOrderStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/WorkOrderStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/WorkOrderStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/WorkOrderStatus;->$VALUES:[Lco/bird/android/model/WorkOrderStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/WorkOrderStatus;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isClosed()Z
    .locals 1

    sget-object v0, Lco/bird/android/model/WorkOrderStatus;->CLOSED_STATUSES:[Lco/bird/android/model/WorkOrderStatus;

    invoke-static {v0, p0}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

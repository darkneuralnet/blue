.class public final enum Lco/bird/android/model/constant/TaskPriority;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/TaskPriority;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/constant/TaskPriority;",
        "",
        "Landroid/os/Parcelable;",
        "level",
        "",
        "(Ljava/lang/String;II)V",
        "getLevel",
        "()I",
        "describeContents",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "IMMEDIATE",
        "URGENT",
        "STANDARD",
        "BACKGROUND",
        "NON_VITAL",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/TaskPriority;

.field public static final enum BACKGROUND:Lco/bird/android/model/constant/TaskPriority;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/constant/TaskPriority;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

.field public static final enum NON_VITAL:Lco/bird/android/model/constant/TaskPriority;

.field public static final enum STANDARD:Lco/bird/android/model/constant/TaskPriority;

.field public static final enum URGENT:Lco/bird/android/model/constant/TaskPriority;


# instance fields
.field private final level:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/TaskPriority;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/constant/TaskPriority;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/TaskPriority;->IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/TaskPriority;->URGENT:Lco/bird/android/model/constant/TaskPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/TaskPriority;->STANDARD:Lco/bird/android/model/constant/TaskPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/TaskPriority;->BACKGROUND:Lco/bird/android/model/constant/TaskPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/TaskPriority;->NON_VITAL:Lco/bird/android/model/constant/TaskPriority;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/TaskPriority;

    const-string v1, "IMMEDIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lco/bird/android/model/constant/TaskPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

    new-instance v0, Lco/bird/android/model/constant/TaskPriority;

    const-string v1, "URGENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lco/bird/android/model/constant/TaskPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->URGENT:Lco/bird/android/model/constant/TaskPriority;

    new-instance v0, Lco/bird/android/model/constant/TaskPriority;

    const-string v1, "STANDARD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lco/bird/android/model/constant/TaskPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->STANDARD:Lco/bird/android/model/constant/TaskPriority;

    new-instance v0, Lco/bird/android/model/constant/TaskPriority;

    const-string v1, "BACKGROUND"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lco/bird/android/model/constant/TaskPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->BACKGROUND:Lco/bird/android/model/constant/TaskPriority;

    new-instance v0, Lco/bird/android/model/constant/TaskPriority;

    const-string v1, "NON_VITAL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lco/bird/android/model/constant/TaskPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->NON_VITAL:Lco/bird/android/model/constant/TaskPriority;

    invoke-static {}, Lco/bird/android/model/constant/TaskPriority;->$values()[Lco/bird/android/model/constant/TaskPriority;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->$VALUES:[Lco/bird/android/model/constant/TaskPriority;

    new-instance v0, Lco/bird/android/model/constant/TaskPriority$Creator;

    invoke-direct {v0}, Lco/bird/android/model/constant/TaskPriority$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/constant/TaskPriority;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/constant/TaskPriority;->level:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/TaskPriority;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/TaskPriority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/TaskPriority;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/TaskPriority;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/TaskPriority;->$VALUES:[Lco/bird/android/model/constant/TaskPriority;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/TaskPriority;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getLevel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/constant/TaskPriority;->level:I

    return v0
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

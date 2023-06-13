.class public final enum Lco/bird/android/model/IdToolOption;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/IdToolOption$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/IdToolOption;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 \u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/IdToolOption;",
        "",
        "Landroid/os/Parcelable;",
        "(Ljava/lang/String;I)V",
        "correspondingPartKinds",
        "",
        "Lco/bird/android/model/constant/PartKind;",
        "getCorrespondingPartKinds",
        "()[Lco/bird/android/model/constant/PartKind;",
        "sourceKind",
        "getSourceKind",
        "()Lco/bird/android/model/constant/PartKind;",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "BATTERY_SERIAL",
        "BEACON",
        "BRAIN",
        "GERMAN_LICENSE_PLATE",
        "HANDLEBAR",
        "IL_LICENSE_PLATE",
        "LICENSE_PLATE",
        "MOTOR",
        "ONE_CODE",
        "PCM",
        "US_CA_PLATE",
        "HELMET",
        "PHYSICAL_LOCK_STICKER",
        "QR_CODE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/IdToolOption;

.field public static final enum BATTERY_SERIAL:Lco/bird/android/model/IdToolOption;

.field public static final enum BEACON:Lco/bird/android/model/IdToolOption;

.field public static final enum BRAIN:Lco/bird/android/model/IdToolOption;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/IdToolOption;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum GERMAN_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

.field public static final enum HANDLEBAR:Lco/bird/android/model/IdToolOption;

.field public static final enum HELMET:Lco/bird/android/model/IdToolOption;

.field public static final enum IL_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

.field public static final enum LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

.field public static final enum MOTOR:Lco/bird/android/model/IdToolOption;

.field public static final enum ONE_CODE:Lco/bird/android/model/IdToolOption;

.field public static final enum PCM:Lco/bird/android/model/IdToolOption;

.field public static final enum PHYSICAL_LOCK_STICKER:Lco/bird/android/model/IdToolOption;

.field public static final enum QR_CODE:Lco/bird/android/model/IdToolOption;

.field public static final enum US_CA_PLATE:Lco/bird/android/model/IdToolOption;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/IdToolOption;
    .locals 3

    const/16 v0, 0xe

    new-array v0, v0, [Lco/bird/android/model/IdToolOption;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/IdToolOption;->BATTERY_SERIAL:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/IdToolOption;->BEACON:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/IdToolOption;->BRAIN:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/IdToolOption;->GERMAN_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/IdToolOption;->HANDLEBAR:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/IdToolOption;->IL_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/IdToolOption;->LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/IdToolOption;->MOTOR:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/IdToolOption;->ONE_CODE:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/IdToolOption;->PCM:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/IdToolOption;->US_CA_PLATE:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/IdToolOption;->HELMET:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/IdToolOption;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/IdToolOption;->QR_CODE:Lco/bird/android/model/IdToolOption;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "BATTERY_SERIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->BATTERY_SERIAL:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "BEACON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->BEACON:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "BRAIN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->BRAIN:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "GERMAN_LICENSE_PLATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->GERMAN_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "HANDLEBAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->HANDLEBAR:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "IL_LICENSE_PLATE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->IL_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "LICENSE_PLATE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "MOTOR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->MOTOR:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "ONE_CODE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->ONE_CODE:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "PCM"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->PCM:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "US_CA_PLATE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->US_CA_PLATE:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "HELMET"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->HELMET:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "PHYSICAL_LOCK_STICKER"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption;

    const-string v1, "QR_CODE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IdToolOption;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IdToolOption;->QR_CODE:Lco/bird/android/model/IdToolOption;

    invoke-static {}, Lco/bird/android/model/IdToolOption;->$values()[Lco/bird/android/model/IdToolOption;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/IdToolOption;->$VALUES:[Lco/bird/android/model/IdToolOption;

    new-instance v0, Lco/bird/android/model/IdToolOption$Creator;

    invoke-direct {v0}, Lco/bird/android/model/IdToolOption$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/IdToolOption;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/IdToolOption;
    .locals 1

    const-class v0, Lco/bird/android/model/IdToolOption;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/IdToolOption;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/IdToolOption;
    .locals 1

    sget-object v0, Lco/bird/android/model/IdToolOption;->$VALUES:[Lco/bird/android/model/IdToolOption;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/IdToolOption;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getCorrespondingPartKinds()[Lco/bird/android/model/constant/PartKind;
    .locals 4

    sget-object v0, Lco/bird/android/model/IdToolOption$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_1
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->HELMET:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_2
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->IL_PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_3
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->BEACON:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_4
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->PCM:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_5
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->MOTOR:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_6
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->US_CA_PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_7
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->BATTERY_SERIAL:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_8
    new-array v0, v1, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/constant/PartKind;->PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v3

    goto :goto_0

    :pswitch_9
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->GERMAN_PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_a
    new-array v0, v1, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->BRAIN:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v3

    goto :goto_0

    :pswitch_b
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->BRAIN:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_c
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    goto :goto_0

    :pswitch_d
    new-array v0, v3, [Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    aput-object v1, v0, v2

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getSourceKind()Lco/bird/android/model/constant/PartKind;
    .locals 2

    sget-object v0, Lco/bird/android/model/IdToolOption$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lco/bird/android/model/constant/PartKind;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lco/bird/android/model/constant/PartKind;->HELMET:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lco/bird/android/model/constant/PartKind;->IL_PLATE:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lco/bird/android/model/constant/PartKind;->BEACON:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lco/bird/android/model/constant/PartKind;->PCM:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_5
    sget-object v0, Lco/bird/android/model/constant/PartKind;->MOTOR:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_6
    sget-object v0, Lco/bird/android/model/constant/PartKind;->US_CA_PLATE:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_7
    sget-object v0, Lco/bird/android/model/constant/PartKind;->BATTERY_SERIAL:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_8
    sget-object v0, Lco/bird/android/model/constant/PartKind;->GERMAN_PLATE:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_9
    sget-object v0, Lco/bird/android/model/constant/PartKind;->BRAIN:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_a
    sget-object v0, Lco/bird/android/model/constant/PartKind;->PLATE:Lco/bird/android/model/constant/PartKind;

    goto :goto_0

    :pswitch_b
    sget-object v0, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_b
        :pswitch_8
        :pswitch_b
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

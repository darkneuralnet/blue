.class public final enum Lco/bird/android/model/identification/IdentificationGender;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationGender$Companion;,
        Lco/bird/android/model/identification/IdentificationGender$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationGender;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0010B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0006\u001a\u00020\u0005J\u0019\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u00d6\u0001j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationGender;",
        "",
        "Landroid/os/Parcelable;",
        "(Ljava/lang/String;I)V",
        "describeContents",
        "",
        "toStringResId",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "MALE",
        "FEMALE",
        "OTHER",
        "UNKNOWN",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationGender;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/identification/IdentificationGender;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/identification/IdentificationGender$Companion;

.field public static final enum FEMALE:Lco/bird/android/model/identification/IdentificationGender;

.field public static final enum MALE:Lco/bird/android/model/identification/IdentificationGender;

.field public static final enum OTHER:Lco/bird/android/model/identification/IdentificationGender;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationGender;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationGender;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationGender;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationGender;->MALE:Lco/bird/android/model/identification/IdentificationGender;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationGender;->FEMALE:Lco/bird/android/model/identification/IdentificationGender;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationGender;->OTHER:Lco/bird/android/model/identification/IdentificationGender;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/identification/IdentificationGender;->UNKNOWN:Lco/bird/android/model/identification/IdentificationGender;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationGender;

    const-string v1, "MALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->MALE:Lco/bird/android/model/identification/IdentificationGender;

    new-instance v0, Lco/bird/android/model/identification/IdentificationGender;

    const-string v1, "FEMALE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->FEMALE:Lco/bird/android/model/identification/IdentificationGender;

    new-instance v0, Lco/bird/android/model/identification/IdentificationGender;

    const-string v1, "OTHER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->OTHER:Lco/bird/android/model/identification/IdentificationGender;

    new-instance v0, Lco/bird/android/model/identification/IdentificationGender;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->UNKNOWN:Lco/bird/android/model/identification/IdentificationGender;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationGender;->$values()[Lco/bird/android/model/identification/IdentificationGender;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->$VALUES:[Lco/bird/android/model/identification/IdentificationGender;

    new-instance v0, Lco/bird/android/model/identification/IdentificationGender$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationGender$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->Companion:Lco/bird/android/model/identification/IdentificationGender$Companion;

    new-instance v0, Lco/bird/android/model/identification/IdentificationGender$Creator;

    invoke-direct {v0}, Lco/bird/android/model/identification/IdentificationGender$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/identification/IdentificationGender;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationGender;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationGender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationGender;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationGender;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationGender;->$VALUES:[Lco/bird/android/model/identification/IdentificationGender;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationGender;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toStringResId()I
    .locals 2

    sget-object v0, Lco/bird/android/model/identification/IdentificationGender$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    sget v0, Lnl4;->gender_other:I

    goto :goto_0

    :cond_0
    sget v0, Lnl4;->gender_female:I

    goto :goto_0

    :cond_1
    sget v0, Lnl4;->gender_male:I

    :goto_0
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

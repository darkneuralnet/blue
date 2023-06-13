.class public final enum Lco/bird/android/model/identification/IdentificationDocumentType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationDocumentType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0087\u0001\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0016B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0019\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0005H\u00d6\u0001j\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "",
        "Landroid/os/Parcelable;",
        "(Ljava/lang/String;I)V",
        "describeContents",
        "",
        "toWire",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "LEGACY",
        "ID_CARD",
        "DRIVER_LICENSE",
        "PROVISIONAL_DRIVER_LICENSE",
        "PASSPORT",
        "VISA",
        "RESIDENCE_CARD",
        "EMIRATES_ID",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationEntry.kt\nco/bird/android/model/identification/IdentificationDocumentType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/identification/IdentificationDocumentType$Companion;

.field public static final enum DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum EMIRATES_ID:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum ID_CARD:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum LEGACY:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum PASSPORT:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum PROVISIONAL_DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum RESIDENCE_CARD:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public static final enum VISA:Lco/bird/android/model/identification/IdentificationDocumentType;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationDocumentType;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationDocumentType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->LEGACY:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->ID_CARD:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->PROVISIONAL_DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->PASSPORT:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->VISA:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->RESIDENCE_CARD:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->EMIRATES_ID:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/identification/IdentificationDocumentType;->UNKNOWN:Lco/bird/android/model/identification/IdentificationDocumentType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "LEGACY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->LEGACY:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "ID_CARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->ID_CARD:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "DRIVER_LICENSE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "PROVISIONAL_DRIVER_LICENSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->PROVISIONAL_DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "PASSPORT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->PASSPORT:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "VISA"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->VISA:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "RESIDENCE_CARD"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->RESIDENCE_CARD:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "EMIRATES_ID"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->EMIRATES_ID:Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationDocumentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->UNKNOWN:Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentType;->$values()[Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->$VALUES:[Lco/bird/android/model/identification/IdentificationDocumentType;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationDocumentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->Companion:Lco/bird/android/model/identification/IdentificationDocumentType$Companion;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentType$Creator;

    invoke-direct {v0}, Lco/bird/android/model/identification/IdentificationDocumentType$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationDocumentType;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationDocumentType;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationDocumentType;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->$VALUES:[Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationDocumentType;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toWire()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "getDefault()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentType;->UNKNOWN:Lco/bird/android/model/identification/IdentificationDocumentType;

    if-eq p0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
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

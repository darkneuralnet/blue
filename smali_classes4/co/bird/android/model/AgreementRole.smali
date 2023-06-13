.class public final enum Lco/bird/android/model/AgreementRole;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/AgreementRole;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/AgreementRole;",
        "",
        "Landroid/os/Parcelable;",
        "title",
        "",
        "(Ljava/lang/String;II)V",
        "getTitle",
        "()I",
        "describeContents",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "UNKNOWN",
        "RIDER",
        "MULTI_RIDE_HOST",
        "MULTI_RIDE_GUEST",
        "MECHANIC",
        "CHARGER",
        "PRELOAD",
        "MERCHANT",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/AgreementRole;

.field public static final enum CHARGER:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "CHARGER"
    .end annotation

    .annotation runtime Lft5;
        value = "CHARGER"
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/AgreementRole;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum MECHANIC:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MECHANIC"
    .end annotation

    .annotation runtime Lft5;
        value = "MECHANIC"
    .end annotation
.end field

.field public static final enum MERCHANT:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MERCHANT"
    .end annotation

    .annotation runtime Lft5;
        value = "MERCHANT"
    .end annotation
.end field

.field public static final enum MULTI_RIDE_GUEST:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MULTI_RIDE_GUEST"
    .end annotation

    .annotation runtime Lft5;
        value = "MULTI_RIDE_GUEST"
    .end annotation
.end field

.field public static final enum MULTI_RIDE_HOST:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MULTI_RIDE_HOST"
    .end annotation

    .annotation runtime Lft5;
        value = "MULTI_RIDE_HOST"
    .end annotation
.end field

.field public static final enum PRELOAD:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "PRELOAD"
    .end annotation

    .annotation runtime Lft5;
        value = "PRELOAD"
    .end annotation
.end field

.field public static final enum RIDER:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "RIDER"
    .end annotation

    .annotation runtime Lft5;
        value = "RIDER"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lco/bird/android/model/AgreementRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "UNKNOWN"
    .end annotation

    .annotation runtime Lft5;
        value = "UNKNOWN"
    .end annotation
.end field


# instance fields
.field private final title:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/AgreementRole;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lco/bird/android/model/AgreementRole;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/AgreementRole;->UNKNOWN:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/AgreementRole;->RIDER:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_HOST:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_GUEST:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/AgreementRole;->MECHANIC:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/AgreementRole;->CHARGER:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/AgreementRole;->PRELOAD:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/AgreementRole;->MERCHANT:Lco/bird/android/model/AgreementRole;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lco/bird/android/model/AgreementRole;

    sget v1, Lnl4;->generic_agreement_title:I

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->UNKNOWN:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const/4 v2, 0x1

    sget v3, Lnl4;->rental_agreement_title:I

    const-string v4, "RIDER"

    invoke-direct {v0, v4, v2, v3}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->RIDER:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const/4 v2, 0x2

    sget v3, Lnl4;->host_agreement_title:I

    const-string v4, "MULTI_RIDE_HOST"

    invoke-direct {v0, v4, v2, v3}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_HOST:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const-string v2, "MULTI_RIDE_GUEST"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_GUEST:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const/4 v1, 0x4

    sget v2, Lnl4;->mechanic_agreement_title:I

    const-string v3, "MECHANIC"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->MECHANIC:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const/4 v1, 0x5

    sget v2, Lnl4;->charger_agreement_title:I

    const-string v3, "CHARGER"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->CHARGER:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const/4 v1, 0x6

    sget v2, Lnl4;->preload_agreement_title:I

    const-string v3, "PRELOAD"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->PRELOAD:Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole;

    const/4 v1, 0x7

    sget v2, Lnl4;->merchant_agreement_title:I

    const-string v3, "MERCHANT"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/AgreementRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/AgreementRole;->MERCHANT:Lco/bird/android/model/AgreementRole;

    invoke-static {}, Lco/bird/android/model/AgreementRole;->$values()[Lco/bird/android/model/AgreementRole;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/AgreementRole;->$VALUES:[Lco/bird/android/model/AgreementRole;

    new-instance v0, Lco/bird/android/model/AgreementRole$Creator;

    invoke-direct {v0}, Lco/bird/android/model/AgreementRole$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/AgreementRole;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iput p3, p0, Lco/bird/android/model/AgreementRole;->title:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/AgreementRole;
    .locals 1

    const-class v0, Lco/bird/android/model/AgreementRole;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/AgreementRole;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/AgreementRole;
    .locals 1

    sget-object v0, Lco/bird/android/model/AgreementRole;->$VALUES:[Lco/bird/android/model/AgreementRole;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/AgreementRole;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getTitle()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/AgreementRole;->title:I

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

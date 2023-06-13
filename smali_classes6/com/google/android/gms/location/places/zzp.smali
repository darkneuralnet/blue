.class public final Lcom/google/android/gms/location/places/zzp;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "UserDataTypeCreator"
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
    value = {
        0x3e8
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/location/places/zzp;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzaw:Lcom/google/android/gms/location/places/zzp;

.field private static final zzax:Lcom/google/android/gms/location/places/zzp;

.field private static final zzay:Lcom/google/android/gms/location/places/zzp;

.field private static final zzaz:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/location/places/zzp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final type:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x1
    .end annotation
.end field

.field private final zzba:I
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x2
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "test_type"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/location/places/zzp;->zzb(Ljava/lang/String;I)Lcom/google/android/gms/location/places/zzp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/location/places/zzp;->zzaw:Lcom/google/android/gms/location/places/zzp;

    const-string v1, "labeled_place"

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/google/android/gms/location/places/zzp;->zzb(Ljava/lang/String;I)Lcom/google/android/gms/location/places/zzp;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/location/places/zzp;->zzax:Lcom/google/android/gms/location/places/zzp;

    const-string v2, "here_content"

    const/4 v3, 0x7

    invoke-static {v2, v3}, Lcom/google/android/gms/location/places/zzp;->zzb(Ljava/lang/String;I)Lcom/google/android/gms/location/places/zzp;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/location/places/zzp;->zzay:Lcom/google/android/gms/location/places/zzp;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/util/CollectionUtils;->setOf(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/location/places/zzp;->zzaz:Ljava/util/Set;

    new-instance v0, Lcom/google/android/gms/location/places/zzo;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/zzo;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/zzp;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x1
        .end annotation
    .end param
    .param p2    # I
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzp;->type:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/location/places/zzp;->zzba:I

    return-void
.end method

.method private static zzb(Ljava/lang/String;I)Lcom/google/android/gms/location/places/zzp;
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/zzp;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/location/places/zzp;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/location/places/zzp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/location/places/zzp;

    iget-object v1, p0, Lcom/google/android/gms/location/places/zzp;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/location/places/zzp;->type:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/location/places/zzp;->zzba:I

    iget p1, p1, Lcom/google/android/gms/location/places/zzp;->zzba:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzp;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzp;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzp;->type:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/location/places/zzp;->zzba:I

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method

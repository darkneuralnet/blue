.class public final Lcom/google/android/gms/location/places/PlaceFilter$zzb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/PlaceFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzb"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private zzaa:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/location/places/zzp;",
            ">;"
        }
    .end annotation
.end field

.field private zzab:[Ljava/lang/String;

.field private zzt:Z

.field private zzz:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlaceFilter$zzb;->zzz:Ljava/util/Collection;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/location/places/PlaceFilter$zzb;->zzt:Z

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlaceFilter$zzb;->zzaa:Ljava/util/Collection;

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlaceFilter$zzb;->zzab:[Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/location/places/zzh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/PlaceFilter$zzb;-><init>()V

    return-void
.end method

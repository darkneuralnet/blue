.class public final enum Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001j\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;",
        "",
        "Landroid/os/Parcelable;",
        "",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

.field public static final enum c:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

.field public static final synthetic d:[Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    const-string v1, "INDIRECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->b:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    new-instance v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    const-string v1, "API"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->c:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    invoke-static {}, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->a()[Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->d:[Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    new-instance v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode$a;

    invoke-direct {v0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode$a;-><init>()V

    sput-object v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->b:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->c:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;
    .locals 1

    const-class v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    return-object p0
.end method

.method public static values()[Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->d:[Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

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

.class public final Lco/bird/android/model/extra/ScanBarcodeExtra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0015\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BE\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JK\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u00c6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0013\u0010$\u001a\u00020\r2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020#H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006."
    }
    d2 = {
        "Lco/bird/android/model/extra/ScanBarcodeExtra;",
        "Landroid/os/Parcelable;",
        "scanType",
        "Lco/bird/android/model/ScanType;",
        "birdCode",
        "",
        "action",
        "Lco/bird/android/model/constant/BirdAction;",
        "mode",
        "Lco/bird/android/model/constant/MapMode;",
        "intention",
        "Lco/bird/android/model/constant/ScanIntention;",
        "damageStatusUpdate",
        "",
        "(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)V",
        "getAction",
        "()Lco/bird/android/model/constant/BirdAction;",
        "getBirdCode",
        "()Ljava/lang/String;",
        "getDamageStatusUpdate",
        "()Z",
        "getIntention",
        "()Lco/bird/android/model/constant/ScanIntention;",
        "getMode",
        "()Lco/bird/android/model/constant/MapMode;",
        "getScanType",
        "()Lco/bird/android/model/ScanType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/extra/ScanBarcodeExtra;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final action:Lco/bird/android/model/constant/BirdAction;

.field private final birdCode:Ljava/lang/String;

.field private final damageStatusUpdate:Z

.field private final intention:Lco/bird/android/model/constant/ScanIntention;

.field private final mode:Lco/bird/android/model/constant/MapMode;

.field private final scanType:Lco/bird/android/model/ScanType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/extra/ScanBarcodeExtra$Creator;

    invoke-direct {v0}, Lco/bird/android/model/extra/ScanBarcodeExtra$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/extra/ScanBarcodeExtra;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)V
    .locals 1

    const-string v0, "scanType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    iput-object p2, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    iput-object p4, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    iput-object p5, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    iput-boolean p6, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    sget-object p1, Lco/bird/android/model/ScanType;->EXISTING_QR_CODE:Lco/bird/android/model/ScanType;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p7, 0x2

    const/4 p8, 0x0

    if-eqz p1, :cond_1

    move-object v2, p8

    goto :goto_0

    :cond_1
    move-object v2, p2

    :goto_0
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v3, p8

    goto :goto_1

    :cond_2
    move-object v3, p3

    :goto_1
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_3

    move-object v5, p8

    goto :goto_2

    :cond_3
    move-object v5, p5

    :goto_2
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_4

    const/4 p6, 0x0

    :cond_4
    move v6, p6

    move-object v0, p0

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/extra/ScanBarcodeExtra;-><init>(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/extra/ScanBarcodeExtra;Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZILjava/lang/Object;)Lco/bird/android/model/extra/ScanBarcodeExtra;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/extra/ScanBarcodeExtra;->copy(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)Lco/bird/android/model/extra/ScanBarcodeExtra;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/ScanType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/BirdAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/ScanIntention;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    return v0
.end method

.method public final copy(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)Lco/bird/android/model/extra/ScanBarcodeExtra;
    .locals 8

    const-string v0, "scanType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/extra/ScanBarcodeExtra;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/extra/ScanBarcodeExtra;-><init>(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/extra/ScanBarcodeExtra;

    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    iget-object v3, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    iget-object v3, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    iget-object v3, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    iget-object v3, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    iget-boolean p1, p1, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAction()Lco/bird/android/model/constant/BirdAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    return-object v0
.end method

.method public final getBirdCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getDamageStatusUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    return v0
.end method

.method public final getIntention()Lco/bird/android/model/constant/ScanIntention;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    return-object v0
.end method

.method public final getMode()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method

.method public final getScanType()Lco/bird/android/model/ScanType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    iget-object v1, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    iget-object v3, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    iget-object v4, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    iget-boolean v5, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ScanBarcodeExtra(scanType="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birdCode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", intention="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", damageStatusUpdate="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->scanType:Lco/bird/android/model/ScanType;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->birdCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->action:Lco/bird/android/model/constant/BirdAction;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->mode:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->intention:Lco/bird/android/model/constant/ScanIntention;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/constant/ScanIntention;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-boolean p2, p0, Lco/bird/android/model/extra/ScanBarcodeExtra;->damageStatusUpdate:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

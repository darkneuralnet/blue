.class public interface abstract Lco/bird/android/model/ReleaseLocationDetails;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/ReleaseLocationDetails$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0012\u00106\u001a\u00020\u00032\u0008\u0008\u0002\u00107\u001a\u000208H\u0016J\n\u00109\u001a\u0004\u0018\u00010:H&J\n\u0010;\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>H\u0016J\u0014\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0@H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\tR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0005R\u0016\u0010 \u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\tR\u0014\u0010\"\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\tR\u0012\u0010$\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0005R\u0018\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\rR\u0012\u0010(\u001a\u00020)X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0012\u0010,\u001a\u00020-X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0012\u00100\u001a\u00020-X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u0010/R\u0012\u00102\u001a\u00020-X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u0010/R\u0012\u00104\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u0010\u0005\u00a8\u0006A"
    }
    d2 = {
        "Lco/bird/android/model/ReleaseLocationDetails;",
        "Landroid/os/Parcelable;",
        "active",
        "",
        "getActive",
        "()Z",
        "address",
        "",
        "getAddress",
        "()Ljava/lang/String;",
        "brandNames",
        "",
        "getBrandNames",
        "()Ljava/util/List;",
        "capacity",
        "",
        "getCapacity",
        "()I",
        "claimedBy",
        "getClaimedBy",
        "enforceReleaseWindow",
        "getEnforceReleaseWindow",
        "hours",
        "getHours",
        "id",
        "getId",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "mustClaimToRelease",
        "getMustClaimToRelease",
        "nestId",
        "getNestId",
        "notes",
        "getNotes",
        "open",
        "getOpen",
        "photos",
        "getPhotos",
        "purpose",
        "Lco/bird/android/model/constant/NestPurpose;",
        "getPurpose",
        "()Lco/bird/android/model/constant/NestPurpose;",
        "radius",
        "",
        "getRadius",
        "()D",
        "releaseWindowEndHour",
        "getReleaseWindowEndHour",
        "releaseWindowStartHour",
        "getReleaseWindowStartHour",
        "requireReleasePhoto",
        "getRequireReleasePhoto",
        "canReleaseNow",
        "calendar",
        "Ljava/util/Calendar;",
        "expiresAt",
        "Lorg/joda/time/DateTime;",
        "getBrandNameToDisplay",
        "isClaimed",
        "by",
        "Lco/bird/android/model/User;",
        "releaseWindow",
        "Lkotlin/Pair;",
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


# virtual methods
.method public abstract canReleaseNow(Ljava/util/Calendar;)Z
.end method

.method public abstract expiresAt()Lorg/joda/time/DateTime;
.end method

.method public abstract getActive()Z
.end method

.method public abstract getAddress()Ljava/lang/String;
.end method

.method public abstract getBrandNameToDisplay()Ljava/lang/String;
.end method

.method public abstract getBrandNames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCapacity()I
.end method

.method public abstract getClaimedBy()Ljava/lang/String;
.end method

.method public abstract getEnforceReleaseWindow()Z
.end method

.method public abstract getHours()Ljava/lang/String;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getLocation()Lco/bird/android/model/wire/WireLocation;
.end method

.method public abstract getMustClaimToRelease()Z
.end method

.method public abstract getNestId()Ljava/lang/String;
.end method

.method public abstract getNotes()Ljava/lang/String;
.end method

.method public abstract getOpen()Z
.end method

.method public abstract getPhotos()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPurpose()Lco/bird/android/model/constant/NestPurpose;
.end method

.method public abstract getRadius()D
.end method

.method public abstract getReleaseWindowEndHour()D
.end method

.method public abstract getReleaseWindowStartHour()D
.end method

.method public abstract getRequireReleasePhoto()Z
.end method

.method public abstract isClaimed(Lco/bird/android/model/User;)Z
.end method

.method public abstract releaseWindow()Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

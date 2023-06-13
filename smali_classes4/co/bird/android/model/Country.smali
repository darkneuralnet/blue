.class public final Lco/bird/android/model/Country;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/Country$Factory;,
        Lco/bird/android/model/Country$PhonePrefix;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0008\u0010\u0019\u001a\u00020\u0012H\u0016J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/Country;",
        "Landroid/os/Parcelable;",
        "code",
        "",
        "name",
        "flagEmoji",
        "",
        "locale",
        "Ljava/util/Locale;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/Locale;)V",
        "getCode",
        "()Ljava/lang/String;",
        "getFlagEmoji",
        "()Ljava/lang/CharSequence;",
        "getLocale",
        "()Ljava/util/Locale;",
        "getName",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "getPhonePrefix",
        "Lco/bird/android/model/Country$PhonePrefix;",
        "hashCode",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Factory",
        "PhonePrefix",
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
            "Lco/bird/android/model/Country;",
            ">;"
        }
    .end annotation
.end field

.field public static final Factory:Lco/bird/android/model/Country$Factory;


# instance fields
.field private final code:Ljava/lang/String;

.field private final flagEmoji:Ljava/lang/CharSequence;

.field private final locale:Ljava/util/Locale;

.field private final name:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/model/Country$Factory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/Country$Factory;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Country;->Factory:Lco/bird/android/model/Country$Factory;

    new-instance v0, Lco/bird/android/model/Country$Creator;

    invoke-direct {v0}, Lco/bird/android/model/Country$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/Country;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/Locale;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flagEmoji"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/Country;->name:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/Country;->flagEmoji:Ljava/lang/CharSequence;

    iput-object p4, p0, Lco/bird/android/model/Country;->locale:Ljava/util/Locale;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/Locale;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/Country;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/Locale;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/Country;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    check-cast p1, Lco/bird/android/model/Country;

    iget-object p1, p1, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getFlagEmoji()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Country;->flagEmoji:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Country;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Country;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPhonePrefix()Lco/bird/android/model/Country$PhonePrefix;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x8cc

    if-eq v1, v2, :cond_4

    const/16 v2, 0x923

    if-eq v1, v2, :cond_2

    const/16 v2, 0x9ab

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "MX"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lco/bird/android/model/Country$PhonePrefix;->MEXICO:Lco/bird/android/model/Country$PhonePrefix;

    goto :goto_1

    :cond_2
    const-string v1, "IL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Lco/bird/android/model/Country$PhonePrefix;->ISRAEL:Lco/bird/android/model/Country$PhonePrefix;

    goto :goto_1

    :cond_4
    const-string v1, "FR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lco/bird/android/model/Country$PhonePrefix;->FRANCE:Lco/bird/android/model/Country$PhonePrefix;

    goto :goto_1

    :cond_5
    :goto_0
    sget-object v0, Lco/bird/android/model/Country$PhonePrefix;->US:Lco/bird/android/model/Country$PhonePrefix;

    :goto_1
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/Country;->code:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/Country;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/Country;->flagEmoji:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget-object p2, p0, Lco/bird/android/model/Country;->locale:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method

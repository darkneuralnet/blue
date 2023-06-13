.class public final Lco/bird/android/core/base/viewmodel/UnmarkDamaged;
.super Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010 \u001a\u0004\u0008$\u0010\"\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/android/core/base/viewmodel/UnmarkDamaged;",
        "Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;",
        "Landroid/content/Context;",
        "context",
        "",
        "title",
        "message",
        "Landroid/graphics/drawable/Drawable;",
        "g",
        "j",
        "Lco/bird/android/model/constant/BirdModel;",
        "model",
        "m",
        "",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "h",
        "Lco/bird/android/model/constant/BirdModel;",
        "getModel",
        "()Lco/bird/android/model/constant/BirdModel;",
        "i",
        "Ljava/lang/Integer;",
        "a",
        "()Ljava/lang/Integer;",
        "positiveText",
        "getNegativeText",
        "negativeText",
        "<init>",
        "(Lco/bird/android/model/constant/BirdModel;)V",
        "core-base_release"
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
            "Lco/bird/android/core/base/viewmodel/UnmarkDamaged;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lco/bird/android/model/constant/BirdModel;

.field public final i:Ljava/lang/Integer;

.field public final j:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged$a;

    invoke-direct {v0}, Lco/bird/android/core/base/viewmodel/UnmarkDamaged$a;-><init>()V

    sput-object v0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/BirdModel;)V
    .locals 1

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    sget p1, Lnl4;->flight_sheet_unmark_damaged_confirm:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->i:Ljava/lang/Integer;

    sget p1, Lnl4;->general_cancel_button:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->j:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/core/base/viewmodel/UnmarkDamaged;Lco/bird/android/model/constant/BirdModel;ILjava/lang/Object;)Lco/bird/android/core/base/viewmodel/UnmarkDamaged;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->m(Lco/bird/android/model/constant/BirdModel;)Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->i:Ljava/lang/Integer;

    return-object v0
.end method

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
    instance-of v1, p1, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    iget-object v1, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    iget-object p1, p1, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public g(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    invoke-static {v0, p1}, LPM;->a(Lco/bird/android/model/constant/BirdModel;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public getNegativeText()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public j(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final m(Lco/bird/android/model/constant/BirdModel;)Lco/bird/android/core/base/viewmodel/UnmarkDamaged;
    .locals 1

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    invoke-direct {v0, p1}, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;-><init>(Lco/bird/android/model/constant/BirdModel;)V

    return-object v0
.end method

.method public message(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnl4;->flight_sheet_unmark_damaged_message:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.getString(R.stri\u2026t_unmark_damaged_message)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public title(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnl4;->flight_sheet_unmark_damaged_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.getString(R.stri\u2026eet_unmark_damaged_title)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UnmarkDamaged(model="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;->h:Lco/bird/android/model/constant/BirdModel;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

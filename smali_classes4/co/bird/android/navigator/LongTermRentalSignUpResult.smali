.class public final Lco/bird/android/navigator/LongTermRentalSignUpResult;
.super Lco/bird/android/navigator/ActivityResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/navigator/LongTermRentalSignUpResult$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/navigator/LongTermRentalSignUpResult;",
        "Lco/bird/android/navigator/ActivityResult;",
        "Lco/bird/android/navigator/LongTermRentalSignUpResult$b;",
        "result",
        "a",
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
        "b",
        "Lco/bird/android/navigator/LongTermRentalSignUpResult$b;",
        "()Lco/bird/android/navigator/LongTermRentalSignUpResult$b;",
        "<init>",
        "(Lco/bird/android/navigator/LongTermRentalSignUpResult$b;)V",
        "navigator_release"
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
            "Lco/bird/android/navigator/LongTermRentalSignUpResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/navigator/LongTermRentalSignUpResult$a;

    invoke-direct {v0}, Lco/bird/android/navigator/LongTermRentalSignUpResult$a;-><init>()V

    sput-object v0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/navigator/LongTermRentalSignUpResult$b;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/navigator/ActivityResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/navigator/LongTermRentalSignUpResult;Lco/bird/android/navigator/LongTermRentalSignUpResult$b;ILjava/lang/Object;)Lco/bird/android/navigator/LongTermRentalSignUpResult;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/navigator/LongTermRentalSignUpResult;->a(Lco/bird/android/navigator/LongTermRentalSignUpResult$b;)Lco/bird/android/navigator/LongTermRentalSignUpResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/navigator/LongTermRentalSignUpResult$b;)Lco/bird/android/navigator/LongTermRentalSignUpResult;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/navigator/LongTermRentalSignUpResult;

    invoke-direct {v0, p1}, Lco/bird/android/navigator/LongTermRentalSignUpResult;-><init>(Lco/bird/android/navigator/LongTermRentalSignUpResult$b;)V

    return-object v0
.end method

.method public final b()Lco/bird/android/navigator/LongTermRentalSignUpResult$b;
    .locals 1

    iget-object v0, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

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
    instance-of v1, p1, Lco/bird/android/navigator/LongTermRentalSignUpResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/navigator/LongTermRentalSignUpResult;

    iget-object v1, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    iget-object p1, p1, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LongTermRentalSignUpResult(result="

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

    iget-object p2, p0, Lco/bird/android/navigator/LongTermRentalSignUpResult;->b:Lco/bird/android/navigator/LongTermRentalSignUpResult$b;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

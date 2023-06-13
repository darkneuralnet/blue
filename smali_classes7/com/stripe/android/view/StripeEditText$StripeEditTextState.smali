.class public final Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/StripeEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StripeEditTextState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/view/StripeEditText$StripeEditTextState;",
        "Landroid/os/Parcelable;",
        "superState",
        "errorMessage",
        "",
        "shouldShowError",
        "",
        "(Landroid/os/Parcelable;Ljava/lang/String;Z)V",
        "getErrorMessage",
        "()Ljava/lang/String;",
        "getShouldShowError",
        "()Z",
        "getSuperState",
        "()Landroid/os/Parcelable;",
        "component1",
        "component2",
        "component3",
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
        "payments-core_release"
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
            "Lcom/stripe/android/view/StripeEditText$StripeEditTextState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final errorMessage:Ljava/lang/String;

.field private final shouldShowError:Z

.field private final superState:Landroid/os/Parcelable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState$Creator;

    invoke-direct {v0}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    iput-object p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/view/StripeEditText$StripeEditTextState;Landroid/os/Parcelable;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->copy(Landroid/os/Parcelable;Ljava/lang/String;Z)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    return v0
.end method

.method public final copy(Landroid/os/Parcelable;Ljava/lang/String;Z)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
    .locals 1

    new-instance v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;-><init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V

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
    instance-of v1, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    iget-object v3, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    iget-boolean p1, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldShowError()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    return v0
.end method

.method public final getSuperState()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StripeEditTextState(superState="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowError="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

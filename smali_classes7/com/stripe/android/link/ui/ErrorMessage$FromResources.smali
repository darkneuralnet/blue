.class public final Lcom/stripe/android/link/ui/ErrorMessage$FromResources;
.super Lcom/stripe/android/link/ui/ErrorMessage;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/ErrorMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FromResources"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/ErrorMessage$FromResources;",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "stringResId",
        "",
        "(I)V",
        "getStringResId",
        "()I",
        "component1",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "getMessage",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "link_release"
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/link/ui/ErrorMessage$FromResources;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final stringResId:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/ErrorMessage$FromResources$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/ErrorMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/ErrorMessage$FromResources;IILjava/lang/Object;)Lcom/stripe/android/link/ui/ErrorMessage$FromResources;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->copy(I)Lcom/stripe/android/link/ui/ErrorMessage$FromResources;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    return v0
.end method

.method public final copy(I)Lcom/stripe/android/link/ui/ErrorMessage$FromResources;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;-><init>(I)V

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
    instance-of v1, p1, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;

    iget v1, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    iget p1, p1, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getMessage(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(stringResId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStringResId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FromResources(stringResId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    iget p2, p0, Lcom/stripe/android/link/ui/ErrorMessage$FromResources;->stringResId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

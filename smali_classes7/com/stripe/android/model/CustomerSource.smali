.class public final Lcom/stripe/android/model/CustomerSource;
.super Lcom/stripe/android/model/CustomerPaymentSource;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/model/CustomerSource;",
        "Lcom/stripe/android/model/CustomerPaymentSource;",
        "source",
        "Lcom/stripe/android/model/Source;",
        "(Lcom/stripe/android/model/Source;)V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "getSource",
        "()Lcom/stripe/android/model/Source;",
        "tokenizationMethod",
        "Lcom/stripe/android/model/TokenizationMethod;",
        "getTokenizationMethod",
        "()Lcom/stripe/android/model/TokenizationMethod;",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/CustomerSource;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final source:Lcom/stripe/android/model/Source;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/CustomerSource$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/CustomerSource$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/CustomerSource;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/Source;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/model/CustomerPaymentSource;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/CustomerSource;Lcom/stripe/android/model/Source;ILjava/lang/Object;)Lcom/stripe/android/model/CustomerSource;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/CustomerSource;->copy(Lcom/stripe/android/model/Source;)Lcom/stripe/android/model/CustomerSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/Source;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/Source;)Lcom/stripe/android/model/CustomerSource;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/CustomerSource;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/CustomerSource;-><init>(Lcom/stripe/android/model/Source;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/CustomerSource;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/CustomerSource;

    iget-object v1, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    iget-object p1, p1, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSource()Lcom/stripe/android/model/Source;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    return-object v0
.end method

.method public getTokenizationMethod()Lcom/stripe/android/model/TokenizationMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/SourceTypeModel;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/model/SourceTypeModel$Card;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/SourceTypeModel;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/SourceTypeModel$Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/SourceTypeModel$Card;->getTokenizationMethod()Lcom/stripe/android/model/TokenizationMethod;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CustomerSource(source="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->source:Lcom/stripe/android/model/Source;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/Source;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

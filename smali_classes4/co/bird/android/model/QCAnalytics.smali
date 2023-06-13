.class public final Lco/bird/android/model/QCAnalytics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/model/QCAnalytics;",
        "Landroid/os/Parcelable;",
        "sessionId",
        "",
        "numProgrammaticChecks",
        "",
        "numProgrammaticChecksFailed",
        "numProgrammaticChecksPassed",
        "flow",
        "Lco/bird/android/model/constant/QualityControlFlow;",
        "(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)V",
        "getFlow",
        "()Lco/bird/android/model/constant/QualityControlFlow;",
        "getNumProgrammaticChecks",
        "()I",
        "getNumProgrammaticChecksFailed",
        "getNumProgrammaticChecksPassed",
        "getSessionId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
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
            "Lco/bird/android/model/QCAnalytics;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final flow:Lco/bird/android/model/constant/QualityControlFlow;

.field private final numProgrammaticChecks:I

.field private final numProgrammaticChecksFailed:I

.field private final numProgrammaticChecksPassed:I

.field private final sessionId:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/QCAnalytics$Creator;

    invoke-direct {v0}, Lco/bird/android/model/QCAnalytics$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/QCAnalytics;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)V
    .locals 1

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    iput p2, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    iput p3, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    iput p4, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    iput-object p5, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/4 p5, 0x0

    :cond_3
    move-object v6, p5

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/QCAnalytics;-><init>(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/QCAnalytics;Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;ILjava/lang/Object;)Lco/bird/android/model/QCAnalytics;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/QCAnalytics;->copy(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)Lco/bird/android/model/QCAnalytics;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    return v0
.end method

.method public final component5()Lco/bird/android/model/constant/QualityControlFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)Lco/bird/android/model/QCAnalytics;
    .locals 7

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/QCAnalytics;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/QCAnalytics;-><init>(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)V

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
    instance-of v1, p1, Lco/bird/android/model/QCAnalytics;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/QCAnalytics;

    iget-object v1, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    iget v3, p1, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    iget v3, p1, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    iget v3, p1, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    iget-object p1, p1, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFlow()Lco/bird/android/model/constant/QualityControlFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    return-object v0
.end method

.method public final getNumProgrammaticChecks()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    return v0
.end method

.method public final getNumProgrammaticChecksFailed()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    return v0
.end method

.method public final getNumProgrammaticChecksPassed()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    return v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    iget v1, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    iget v2, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    iget v3, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    iget-object v4, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "QCAnalytics(sessionId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", numProgrammaticChecks="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", numProgrammaticChecksFailed="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", numProgrammaticChecksPassed="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", flow="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/QCAnalytics;->sessionId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecks:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksFailed:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/android/model/QCAnalytics;->numProgrammaticChecksPassed:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/QCAnalytics;->flow:Lco/bird/android/model/constant/QualityControlFlow;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

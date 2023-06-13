.class public final Lco/bird/android/model/IssueTypeLock;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/model/IssueTypeLock;",
        "Landroid/os/Parcelable;",
        "issueType",
        "Lco/bird/android/model/IssueType;",
        "locked",
        "",
        "status",
        "Lco/bird/android/model/IssueStatus;",
        "(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)V",
        "getIssueType",
        "()Lco/bird/android/model/IssueType;",
        "getLocked",
        "()Z",
        "getStatus",
        "()Lco/bird/android/model/IssueStatus;",
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
        "",
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
            "Lco/bird/android/model/IssueTypeLock;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final issueType:Lco/bird/android/model/IssueType;

.field private final locked:Z

.field private final status:Lco/bird/android/model/IssueStatus;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/IssueTypeLock$Creator;

    invoke-direct {v0}, Lco/bird/android/model/IssueTypeLock$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/IssueTypeLock;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)V
    .locals 1

    const-string v0, "issueType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    iput-boolean p2, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    iput-object p3, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/IssueTypeLock;-><init>(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/IssueTypeLock;Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;ILjava/lang/Object;)Lco/bird/android/model/IssueTypeLock;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/IssueTypeLock;->copy(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)Lco/bird/android/model/IssueTypeLock;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/IssueType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    return v0
.end method

.method public final component3()Lco/bird/android/model/IssueStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)Lco/bird/android/model/IssueTypeLock;
    .locals 1

    const-string v0, "issueType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/IssueTypeLock;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/IssueTypeLock;-><init>(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)V

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
    instance-of v1, p1, Lco/bird/android/model/IssueTypeLock;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/IssueTypeLock;

    iget-object v1, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    iget-object v3, p1, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    iget-boolean v3, p1, Lco/bird/android/model/IssueTypeLock;->locked:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    iget-object p1, p1, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIssueType()Lco/bird/android/model/IssueType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    return-object v0
.end method

.method public final getLocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    return v0
.end method

.method public final getStatus()Lco/bird/android/model/IssueStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    invoke-virtual {v0}, Lco/bird/android/model/IssueType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    iget-boolean v1, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    iget-object v2, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IssueTypeLock(issueType="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", locked="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lco/bird/android/model/IssueTypeLock;->issueType:Lco/bird/android/model/IssueType;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/IssueType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean p2, p0, Lco/bird/android/model/IssueTypeLock;->locked:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/IssueTypeLock;->status:Lco/bird/android/model/IssueStatus;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

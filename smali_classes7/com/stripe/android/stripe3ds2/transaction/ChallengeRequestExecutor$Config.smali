.class public final Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Config"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002:\u0001.B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u000e\u0010\u0016\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0017J\u000e\u0010\u0018\u001a\u00020\u0006H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0019J\u000e\u0010\u001a\u001a\u00020\u0008H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001bJ\u000e\u0010\u001c\u001a\u00020\u0006H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001dJ\u000e\u0010\u001e\u001a\u00020\u000bH\u00c0\u0003\u00a2\u0006\u0002\u0008\u001fJ;\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\"H\u00d6\u0001J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"H\u00d6\u0001R\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000e\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
        "Ljava/io/Serializable;",
        "Landroid/os/Parcelable;",
        "messageTransformer",
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
        "sdkReferenceId",
        "",
        "creqData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "acsUrl",
        "keys",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;",
        "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V",
        "getAcsUrl$3ds2sdk_release",
        "()Ljava/lang/String;",
        "getCreqData$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "getKeys$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;",
        "getMessageTransformer$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
        "getSdkReferenceId$3ds2sdk_release",
        "component1",
        "component1$3ds2sdk_release",
        "component2",
        "component2$3ds2sdk_release",
        "component3",
        "component3$3ds2sdk_release",
        "component4",
        "component4$3ds2sdk_release",
        "component5",
        "component5$3ds2sdk_release",
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
        "Keys",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final acsUrl:Ljava/lang/String;

.field private final creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

.field private final keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

.field private final messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

.field private final sdkReferenceId:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Creator;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V
    .locals 1

    const-string v0, "messageTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkReferenceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keys"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->copy(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    return-object v0
.end method

.method public final component2$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    return-object v0
.end method

.method public final component4$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;
    .locals 7

    const-string v0, "messageTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkReferenceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keys"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;-><init>(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V

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
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAcsUrl$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreqData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    return-object v0
.end method

.method public final getKeys$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    return-object v0
.end method

.method public final getMessageTransformer$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    return-object v0
.end method

.method public final getSdkReferenceId$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Config(messageTransformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sdkReferenceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", creqData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", acsUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", keys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->sdkReferenceId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->acsUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->keys:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

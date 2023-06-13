.class public final Lcom/stripe/android/model/ConsumerSession$VerificationSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsumerSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VerificationSession"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;,
        Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "type",
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;",
        "state",
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;",
        "(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V",
        "getState",
        "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;",
        "getType",
        "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
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
        "SessionState",
        "SessionType",
        "payments-model_release"
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
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

.field private final type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsumerSession$VerificationSession;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->copy(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;-><init>(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    iget-object p1, p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VerificationSession(type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

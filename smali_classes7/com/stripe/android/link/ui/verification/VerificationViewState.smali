.class public final Lcom/stripe/android/link/ui/verification/VerificationViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J=\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
        "",
        "isProcessing",
        "",
        "requestFocus",
        "errorMessage",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "isSendingNewCode",
        "didSendNewCode",
        "(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)V",
        "getDidSendNewCode",
        "()Z",
        "getErrorMessage",
        "()Lcom/stripe/android/link/ui/ErrorMessage;",
        "getRequestFocus",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final didSendNewCode:Z

.field private final errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field private final isProcessing:Z

.field private final isSendingNewCode:Z

.field private final requestFocus:Z


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/ui/verification/VerificationViewState;-><init>(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p7, v0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    move v1, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/4 p3, 0x0

    :cond_2
    move-object v2, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move v3, v0

    goto :goto_1

    :cond_3
    move v3, p4

    :goto_1
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move p6, v0

    goto :goto_2

    :cond_4
    move p6, p5

    :goto_2
    move-object p1, p0

    move p2, p7

    move p3, v1

    move-object p4, v2

    move p5, v3

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/link/ui/verification/VerificationViewState;-><init>(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/link/ui/ErrorMessage;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move-object p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    return v0
.end method

.method public final copy(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 7

    new-instance v6, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/verification/VerificationViewState;-><init>(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    iget-boolean p1, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDidSendNewCode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    return v0
.end method

.method public final getErrorMessage()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public final getRequestFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final isProcessing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    return v0
.end method

.method public final isSendingNewCode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    iget-object v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    iget-boolean v4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "VerificationViewState(isProcessing="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requestFocus="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSendingNewCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", didSendNewCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

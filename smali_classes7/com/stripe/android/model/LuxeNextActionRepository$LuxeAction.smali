.class public final Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/LuxeNextActionRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LuxeAction"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J+\u0010\u000f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;",
        "",
        "postConfirmStatusNextStatus",
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus;",
        "postAuthorizeIntentStatus",
        "",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "",
        "(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;)V",
        "getPostAuthorizeIntentStatus",
        "()Ljava/util/Map;",
        "getPostConfirmStatusNextStatus",
        "()Lcom/stripe/android/model/LuxeActionCreatorForStatus;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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


# instance fields
.field private final postAuthorizeIntentStatus:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/LuxeActionCreatorForStatus;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "postAuthorizeIntentStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    iput-object p2, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->copy(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;)Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/LuxeActionCreatorForStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;)Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/LuxeActionCreatorForStatus;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;"
        }
    .end annotation

    const-string v0, "postAuthorizeIntentStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;-><init>(Lcom/stripe/android/model/LuxeActionCreatorForStatus;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;

    iget-object v1, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    iget-object v3, p1, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    iget-object p1, p1, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getPostAuthorizeIntentStatus()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    return-object v0
.end method

.method public final getPostConfirmStatusNextStatus()Lcom/stripe/android/model/LuxeActionCreatorForStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postConfirmStatusNextStatus:Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    iget-object v1, p0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->postAuthorizeIntentStatus:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LuxeAction(postConfirmStatusNextStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", postAuthorizeIntentStatus="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

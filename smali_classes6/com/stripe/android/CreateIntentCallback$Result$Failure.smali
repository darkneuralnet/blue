.class public final Lcom/stripe/android/CreateIntentCallback$Result$Failure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/CreateIntentCallback$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/CreateIntentCallback$Result;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000c\u001a\u00060\u0003j\u0002`\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\u0008\u000fJ#\u0010\u0010\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/CreateIntentCallback$Result$Failure;",
        "Lcom/stripe/android/CreateIntentCallback$Result;",
        "cause",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "displayMessage",
        "",
        "(Ljava/lang/Exception;Ljava/lang/String;)V",
        "getCause$payments_core_release",
        "()Ljava/lang/Exception;",
        "getDisplayMessage$payments_core_release",
        "()Ljava/lang/String;",
        "component1",
        "component1$payments_core_release",
        "component2",
        "component2$payments_core_release",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final cause:Ljava/lang/Exception;

.field private final displayMessage:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    iput-object p2, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Exception;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/CreateIntentCallback$Result$Failure;Ljava/lang/Exception;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/CreateIntentCallback$Result$Failure;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->copy(Ljava/lang/Exception;Ljava/lang/String;)Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$payments_core_release()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    return-object v0
.end method

.method public final component2$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Exception;Ljava/lang/String;)Lcom/stripe/android/CreateIntentCallback$Result$Failure;
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/CreateIntentCallback$Result$Failure;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/CreateIntentCallback$Result$Failure;

    iget-object v1, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    iget-object v3, p1, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCause$payments_core_release()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    return-object v0
.end method

.method public final getDisplayMessage$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->cause:Ljava/lang/Exception;

    iget-object v1, p0, Lcom/stripe/android/CreateIntentCallback$Result$Failure;->displayMessage:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failure(cause="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayMessage="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/api/response/WirePaymentActionRequiredResponse;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0008\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;",
        "Lco/bird/api/response/WirePaymentActionRequiredResponse;",
        "action",
        "Lco/bird/api/request/PaymentAction;",
        "(Lco/bird/api/request/PaymentAction;)V",
        "getAction",
        "()Lco/bird/api/request/PaymentAction;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "co.bird.android.api"
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
.field private final action:Lco/bird/api/request/PaymentAction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action"
    .end annotation

    .annotation runtime Lft5;
        value = "action"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;-><init>(Lco/bird/api/request/PaymentAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/api/request/PaymentAction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/api/request/PaymentAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;-><init>(Lco/bird/api/request/PaymentAction;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;Lco/bird/api/request/PaymentAction;ILjava/lang/Object;)Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->copy(Lco/bird/api/request/PaymentAction;)Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/api/request/PaymentAction;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    return-object v0
.end method

.method public final copy(Lco/bird/api/request/PaymentAction;)Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;
    .locals 1

    new-instance v0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;

    invoke-direct {v0, p1}, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;-><init>(Lco/bird/api/request/PaymentAction;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;

    iget-object v1, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    iget-object p1, p1, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getAction()Lco/bird/api/request/PaymentAction;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/api/request/PaymentAction;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;->action:Lco/bird/api/request/PaymentAction;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PreloadAndMaybeConfigureAutoReloadResponse(action="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lco/bird/api/request/PaymentAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/api/request/PaymentAction;",
        "",
        "actionKind",
        "Lco/bird/android/model/constant/PaymentActionKind;",
        "actionPayload",
        "",
        "",
        "gatewayKind",
        "Lco/bird/android/model/constant/PaymentGatewayKind;",
        "(Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;)V",
        "getActionKind",
        "()Lco/bird/android/model/constant/PaymentActionKind;",
        "getActionPayload",
        "()Ljava/util/Map;",
        "getGatewayKind",
        "()Lco/bird/android/model/constant/PaymentGatewayKind;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final actionKind:Lco/bird/android/model/constant/PaymentActionKind;
    .annotation runtime Lft5;
        value = "action_kind"
    .end annotation
.end field

.field private final actionPayload:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "action_payload"
    .end annotation
.end field

.field private final gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;
    .annotation runtime Lft5;
        value = "gateway_kind"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;)V
    .locals 1
    .param p1    # Lco/bird/android/model/constant/PaymentActionKind;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "action_kind"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "action_payload"
        .end annotation
    .end param
    .param p3    # Lco/bird/android/model/constant/PaymentGatewayKind;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "gateway_kind"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/PaymentActionKind;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/PaymentGatewayKind;",
            ")V"
        }
    .end annotation

    const-string v0, "actionKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatewayKind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    iput-object p2, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    iput-object p3, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/PaymentAction;Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;ILjava/lang/Object;)Lco/bird/api/request/PaymentAction;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/request/PaymentAction;->copy(Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;)Lco/bird/api/request/PaymentAction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/PaymentActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/PaymentGatewayKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;)Lco/bird/api/request/PaymentAction;
    .locals 1
    .param p1    # Lco/bird/android/model/constant/PaymentActionKind;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "action_kind"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "action_payload"
        .end annotation
    .end param
    .param p3    # Lco/bird/android/model/constant/PaymentGatewayKind;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "gateway_kind"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/PaymentActionKind;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/PaymentGatewayKind;",
            ")",
            "Lco/bird/api/request/PaymentAction;"
        }
    .end annotation

    const-string v0, "actionKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatewayKind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/PaymentAction;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/request/PaymentAction;-><init>(Lco/bird/android/model/constant/PaymentActionKind;Ljava/util/Map;Lco/bird/android/model/constant/PaymentGatewayKind;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/PaymentAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/PaymentAction;

    iget-object v1, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    iget-object v3, p1, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    iget-object p1, p1, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getActionKind()Lco/bird/android/model/constant/PaymentActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    return-object v0
.end method

.method public final getActionPayload()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final getGatewayKind()Lco/bird/android/model/constant/PaymentGatewayKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/request/PaymentAction;->actionKind:Lco/bird/android/model/constant/PaymentActionKind;

    iget-object v1, p0, Lco/bird/api/request/PaymentAction;->actionPayload:Ljava/util/Map;

    iget-object v2, p0, Lco/bird/api/request/PaymentAction;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PaymentAction(actionKind="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionPayload="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gatewayKind="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

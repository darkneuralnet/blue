.class public final Lco/bird/android/model/constant/PaymentMethodDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jm\u0010&\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\r2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\'\u001a\u00020\t2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0011R\u0016\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006,"
    }
    d2 = {
        "Lco/bird/android/model/constant/PaymentMethodDetails;",
        "",
        "id",
        "",
        "brand",
        "lastCardNumbers",
        "expMonth",
        "expYear",
        "default",
        "",
        "gatewayKind",
        "Lco/bird/android/model/constant/PaymentGatewayKind;",
        "type",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "email",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V",
        "getBrand",
        "()Ljava/lang/String;",
        "getDefault",
        "()Z",
        "getEmail",
        "getExpMonth",
        "getExpYear",
        "getGatewayKind",
        "()Lco/bird/android/model/constant/PaymentGatewayKind;",
        "getId",
        "getLastCardNumbers",
        "getType",
        "()Lco/bird/android/model/constant/PaymentMethod;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "model-constant"
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
.field private final brand:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "brand"
    .end annotation
.end field

.field private final default:Z
    .annotation runtime Lft5;
        value = "default"
    .end annotation
.end field

.field private final email:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "email"
    .end annotation
.end field

.field private final expMonth:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "exp_month"
    .end annotation
.end field

.field private final expYear:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "exp_year"
    .end annotation
.end field

.field private final gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;
    .annotation runtime Lft5;
        value = "gateway_kind"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final lastCardNumbers:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "last_card_numbers"
    .end annotation
.end field

.field private final type:Lco/bird/android/model/constant/PaymentMethod;
    .annotation runtime Lft5;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "brand"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "last_card_numbers"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "exp_month"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "exp_year"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "default"
        .end annotation
    .end param
    .param p7    # Lco/bird/android/model/constant/PaymentGatewayKind;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "gateway_kind"
        .end annotation
    .end param
    .param p8    # Lco/bird/android/model/constant/PaymentMethod;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "type"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "email"
        .end annotation
    .end param

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatewayKind"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    iput-boolean p6, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    iput-object p7, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    iput-object p8, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    iput-object p9, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    move-object v3, p0

    move-object v4, p1

    move/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v3 .. v12}, Lco/bird/android/model/constant/PaymentMethodDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/constant/PaymentMethodDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/constant/PaymentMethodDetails;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lco/bird/android/model/constant/PaymentMethodDetails;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)Lco/bird/android/model/constant/PaymentMethodDetails;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    return v0
.end method

.method public final component7()Lco/bird/android/model/constant/PaymentGatewayKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)Lco/bird/android/model/constant/PaymentMethodDetails;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "brand"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "last_card_numbers"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "exp_month"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "exp_year"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "default"
        .end annotation
    .end param
    .param p7    # Lco/bird/android/model/constant/PaymentGatewayKind;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "gateway_kind"
        .end annotation
    .end param
    .param p8    # Lco/bird/android/model/constant/PaymentMethod;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "type"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "email"
        .end annotation
    .end param

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatewayKind"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/constant/PaymentMethodDetails;

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/constant/PaymentMethodDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/constant/PaymentMethodDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/constant/PaymentMethodDetails;

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    iget-boolean v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    iget-object v3, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBrand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefault()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    return v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpMonth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpYear()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    return-object v0
.end method

.method public final getGatewayKind()Lco/bird/android/model/constant/PaymentGatewayKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastCardNumbers()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    :cond_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->brand:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->lastCardNumbers:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expMonth:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->expYear:Ljava/lang/String;

    iget-boolean v5, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->default:Z

    iget-object v6, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    iget-object v7, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->type:Lco/bird/android/model/constant/PaymentMethod;

    iget-object v8, p0, Lco/bird/android/model/constant/PaymentMethodDetails;->email:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PaymentMethodDetails(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", brand="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lastCardNumbers="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expMonth="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expYear="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", default="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", gatewayKind="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", email="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

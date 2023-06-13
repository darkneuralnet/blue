.class public final enum Lcom/stripe/android/StripeApiBeta;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/StripeApiBeta;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/StripeApiBeta;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "WeChatPayV1",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/StripeApiBeta;

.field public static final enum WeChatPayV1:Lcom/stripe/android/StripeApiBeta;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/StripeApiBeta;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/stripe/android/StripeApiBeta;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/StripeApiBeta;->WeChatPayV1:Lcom/stripe/android/StripeApiBeta;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/StripeApiBeta;

    const/4 v1, 0x0

    const-string v2, "wechat_pay_beta=v1"

    const-string v3, "WeChatPayV1"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/StripeApiBeta;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/StripeApiBeta;->WeChatPayV1:Lcom/stripe/android/StripeApiBeta;

    invoke-static {}, Lcom/stripe/android/StripeApiBeta;->$values()[Lcom/stripe/android/StripeApiBeta;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/StripeApiBeta;->$VALUES:[Lcom/stripe/android/StripeApiBeta;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/StripeApiBeta;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/StripeApiBeta;
    .locals 1

    const-class v0, Lcom/stripe/android/StripeApiBeta;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/StripeApiBeta;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/StripeApiBeta;
    .locals 1

    sget-object v0, Lcom/stripe/android/StripeApiBeta;->$VALUES:[Lcom/stripe/android/StripeApiBeta;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/StripeApiBeta;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/StripeApiBeta;->code:Ljava/lang/String;

    return-object v0
.end method

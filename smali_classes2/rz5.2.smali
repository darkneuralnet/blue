.class public final enum Lrz5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrz5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lrz5;",
        "",
        "Ljava/lang/reflect/Type;",
        "b",
        "Ljava/lang/reflect/Type;",
        "()Ljava/lang/reflect/Type;",
        "type",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/reflect/Type;)V",
        "REQUEST_CONTEXT",
        "REQUEST_PAYMENT",
        "CLOSE_VIEW",
        "c",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum CLOSE_VIEW:Lrz5;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "closeView"
    .end annotation

    .annotation runtime Lft5;
        value = "closeView"
    .end annotation
.end field

.field public static final enum REQUEST_CONTEXT:Lrz5;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "requestContext"
    .end annotation

    .annotation runtime Lft5;
        value = "requestContext"
    .end annotation
.end field

.field public static final enum REQUEST_PAYMENT:Lrz5;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "requestPayment"
    .end annotation

    .annotation runtime Lft5;
        value = "requestPayment"
    .end annotation
.end field

.field public static final enum c:Lrz5;

.field public static final synthetic d:[Lrz5;


# instance fields
.field public final b:Ljava/lang/reflect/Type;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lrz5;

    invoke-static {}, Ltz5;->access$getREQUEST_CONTEXT_TYPE$p()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "REQUEST_CONTEXT_TYPE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "REQUEST_CONTEXT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lrz5;-><init>(Ljava/lang/String;ILjava/lang/reflect/Type;)V

    sput-object v0, Lrz5;->REQUEST_CONTEXT:Lrz5;

    new-instance v0, Lrz5;

    invoke-static {}, Ltz5;->access$getREQUEST_PAYMENT_TYPE$p()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "REQUEST_PAYMENT_TYPE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "REQUEST_PAYMENT"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lrz5;-><init>(Ljava/lang/String;ILjava/lang/reflect/Type;)V

    sput-object v0, Lrz5;->REQUEST_PAYMENT:Lrz5;

    new-instance v0, Lrz5;

    invoke-static {}, Ltz5;->access$getCLOSE_VIEW_TYPE$p()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "CLOSE_VIEW_TYPE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "CLOSE_VIEW"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lrz5;-><init>(Ljava/lang/String;ILjava/lang/reflect/Type;)V

    sput-object v0, Lrz5;->CLOSE_VIEW:Lrz5;

    new-instance v0, Lrz5;

    invoke-static {}, Ltz5;->access$getUNKNOWN_TYPE$p()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "UNKNOWN_TYPE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UNKNOWN"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lrz5;-><init>(Ljava/lang/String;ILjava/lang/reflect/Type;)V

    sput-object v0, Lrz5;->c:Lrz5;

    invoke-static {}, Lrz5;->a()[Lrz5;

    move-result-object v0

    sput-object v0, Lrz5;->d:[Lrz5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lrz5;->b:Ljava/lang/reflect/Type;

    return-void
.end method

.method public static final synthetic a()[Lrz5;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lrz5;

    const/4 v1, 0x0

    sget-object v2, Lrz5;->REQUEST_CONTEXT:Lrz5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lrz5;->REQUEST_PAYMENT:Lrz5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lrz5;->CLOSE_VIEW:Lrz5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lrz5;->c:Lrz5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrz5;
    .locals 1

    const-class v0, Lrz5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrz5;

    return-object p0
.end method

.method public static values()[Lrz5;
    .locals 1

    sget-object v0, Lrz5;->d:[Lrz5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrz5;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lrz5;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method

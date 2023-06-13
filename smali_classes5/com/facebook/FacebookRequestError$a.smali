.class public final enum Lcom/facebook/FacebookRequestError$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/FacebookRequestError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/FacebookRequestError$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/facebook/FacebookRequestError$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/FacebookRequestError$a;

.field public static final enum c:Lcom/facebook/FacebookRequestError$a;

.field public static final enum d:Lcom/facebook/FacebookRequestError$a;

.field public static final synthetic e:[Lcom/facebook/FacebookRequestError$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/FacebookRequestError$a;

    new-instance v1, Lcom/facebook/FacebookRequestError$a;

    const-string v2, "LOGIN_RECOVERABLE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/facebook/FacebookRequestError$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/FacebookRequestError$a;->b:Lcom/facebook/FacebookRequestError$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/FacebookRequestError$a;

    const-string v2, "OTHER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/facebook/FacebookRequestError$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/FacebookRequestError$a;->c:Lcom/facebook/FacebookRequestError$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/FacebookRequestError$a;

    const-string v2, "TRANSIENT"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/facebook/FacebookRequestError$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/FacebookRequestError$a;->d:Lcom/facebook/FacebookRequestError$a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/FacebookRequestError$a;->e:[Lcom/facebook/FacebookRequestError$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/FacebookRequestError$a;
    .locals 1

    const-class v0, Lcom/facebook/FacebookRequestError$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/FacebookRequestError$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/FacebookRequestError$a;
    .locals 1

    sget-object v0, Lcom/facebook/FacebookRequestError$a;->e:[Lcom/facebook/FacebookRequestError$a;

    invoke-virtual {v0}, [Lcom/facebook/FacebookRequestError$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/FacebookRequestError$a;

    return-object v0
.end method

.class public final enum Lcom/adyen/checkout/card/api/model/Brand$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/card/api/model/Brand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adyen/checkout/card/api/model/Brand$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/adyen/checkout/card/api/model/Brand$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/adyen/checkout/card/api/model/Brand$c;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "c",
        "a",
        "d",
        "e",
        "f",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final c:Lcom/adyen/checkout/card/api/model/Brand$c$a;

.field public static final enum d:Lcom/adyen/checkout/card/api/model/Brand$c;

.field public static final enum e:Lcom/adyen/checkout/card/api/model/Brand$c;

.field public static final enum f:Lcom/adyen/checkout/card/api/model/Brand$c;

.field public static final synthetic g:[Lcom/adyen/checkout/card/api/model/Brand$c;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/adyen/checkout/card/api/model/Brand$c;

    const/4 v1, 0x0

    const-string v2, "required"

    const-string v3, "REQUIRED"

    invoke-direct {v0, v3, v1, v2}, Lcom/adyen/checkout/card/api/model/Brand$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/adyen/checkout/card/api/model/Brand$c;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    new-instance v0, Lcom/adyen/checkout/card/api/model/Brand$c;

    const/4 v1, 0x1

    const-string v2, "optional"

    const-string v3, "OPTIONAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/adyen/checkout/card/api/model/Brand$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/adyen/checkout/card/api/model/Brand$c;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    new-instance v0, Lcom/adyen/checkout/card/api/model/Brand$c;

    const/4 v1, 0x2

    const-string v2, "hidden"

    const-string v3, "HIDDEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/adyen/checkout/card/api/model/Brand$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/adyen/checkout/card/api/model/Brand$c;->f:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-static {}, Lcom/adyen/checkout/card/api/model/Brand$c;->a()[Lcom/adyen/checkout/card/api/model/Brand$c;

    move-result-object v0

    sput-object v0, Lcom/adyen/checkout/card/api/model/Brand$c;->g:[Lcom/adyen/checkout/card/api/model/Brand$c;

    new-instance v0, Lcom/adyen/checkout/card/api/model/Brand$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/adyen/checkout/card/api/model/Brand$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/adyen/checkout/card/api/model/Brand$c;->c:Lcom/adyen/checkout/card/api/model/Brand$c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/adyen/checkout/card/api/model/Brand$c;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lcom/adyen/checkout/card/api/model/Brand$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/adyen/checkout/card/api/model/Brand$c;

    const/4 v1, 0x0

    sget-object v2, Lcom/adyen/checkout/card/api/model/Brand$c;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/adyen/checkout/card/api/model/Brand$c;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/adyen/checkout/card/api/model/Brand$c;->f:Lcom/adyen/checkout/card/api/model/Brand$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/adyen/checkout/card/api/model/Brand$c;
    .locals 1

    const-class v0, Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/adyen/checkout/card/api/model/Brand$c;

    return-object p0
.end method

.method public static values()[Lcom/adyen/checkout/card/api/model/Brand$c;
    .locals 1

    sget-object v0, Lcom/adyen/checkout/card/api/model/Brand$c;->g:[Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/adyen/checkout/card/api/model/Brand$c;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/card/api/model/Brand$c;->b:Ljava/lang/String;

    return-object v0
.end method

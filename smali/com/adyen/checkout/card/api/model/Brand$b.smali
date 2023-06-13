.class public final Lcom/adyen/checkout/card/api/model/Brand$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/card/api/model/Brand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\tR&\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u0012\u0004\u0008\r\u0010\tR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000cR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000cR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000cR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/adyen/checkout/card/api/model/Brand$b;",
        "",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer;",
        "Lcom/adyen/checkout/card/api/model/Brand;",
        "SERIALIZER",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer;",
        "a",
        "()Lcom/adyen/checkout/core/model/ModelObject$Serializer;",
        "getSERIALIZER$annotations",
        "()V",
        "",
        "BRAND",
        "Ljava/lang/String;",
        "getBRAND$annotations",
        "Landroid/os/Parcelable$Creator;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;",
        "CVC_POLICY",
        "ENABLE_LUHN_CHECK",
        "EXPIRY_DATE_POLICY",
        "SUPPORTED",
        "<init>",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/card/api/model/Brand$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/card/api/model/Brand;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/adyen/checkout/card/api/model/Brand;->a()Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v0

    return-object v0
.end method

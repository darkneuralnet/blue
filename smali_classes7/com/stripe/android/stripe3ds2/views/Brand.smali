.class public final enum Lcom/stripe/android/stripe3ds2/views/Brand;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/Brand$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/views/Brand;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0080\u0001\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB1\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/Brand;",
        "",
        "directoryServerName",
        "",
        "drawableResId",
        "",
        "nameResId",
        "shouldStretch",
        "",
        "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V",
        "getDirectoryServerName$3ds2sdk_release",
        "()Ljava/lang/String;",
        "getDrawableResId$3ds2sdk_release",
        "()I",
        "getNameResId$3ds2sdk_release",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getShouldStretch$3ds2sdk_release",
        "()Z",
        "Visa",
        "Mastercard",
        "Amex",
        "Discover",
        "CartesBancaires",
        "UnionPay",
        "Unknown",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Amex:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum CartesBancaires:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final Companion:Lcom/stripe/android/stripe3ds2/views/Brand$Companion;

.field public static final enum Discover:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Mastercard:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum UnionPay:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Unknown:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Visa:Lcom/stripe/android/stripe3ds2/views/Brand;


# instance fields
.field private final directoryServerName:Ljava/lang/String;

.field private final drawableResId:I

.field private final nameResId:Ljava/lang/Integer;

.field private final shouldStretch:Z


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/views/Brand;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/views/Brand;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Visa:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Mastercard:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Amex:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Discover:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->CartesBancaires:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->UnionPay:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Unknown:Lcom/stripe/android/stripe3ds2/views/Brand;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 26

    new-instance v9, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v1, "Visa"

    const/4 v2, 0x0

    const-string v3, "visa"

    sget v4, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_visa:I

    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_visa:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lcom/stripe/android/stripe3ds2/views/Brand;->Visa:Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v11, "Mastercard"

    const/4 v12, 0x1

    const-string v13, "mastercard"

    sget v14, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_mastercard:I

    sget v1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_mastercard:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Mastercard:Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v2, "Amex"

    const/4 v3, 0x2

    const-string v4, "american_express"

    sget v5, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_amex:I

    sget v1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_amex:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Amex:Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v11, "Discover"

    const/4 v12, 0x3

    const-string v13, "discover"

    sget v14, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_discover:I

    sget v1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_discover:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Discover:Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v2, "CartesBancaires"

    const/4 v3, 0x4

    const-string v4, "cartes_bancaires"

    sget v5, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_cartesbancaires:I

    sget v1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_cartesbancaires:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->CartesBancaires:Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v9, "UnionPay"

    const/4 v10, 0x5

    const-string v11, "unionpay"

    sget v12, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_unionpay:I

    sget v1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_unionpay:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v16}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->UnionPay:Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    const-string v18, "Unknown"

    const/16 v19, 0x6

    const-string v20, "unknown"

    sget v21, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_unknown:I

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v17 .. v25}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Unknown:Lcom/stripe/android/stripe3ds2/views/Brand;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/views/Brand;->$values()[Lcom/stripe/android/stripe3ds2/views/Brand;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->$VALUES:[Lcom/stripe/android/stripe3ds2/views/Brand;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/Brand$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Companion:Lcom/stripe/android/stripe3ds2/views/Brand$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->directoryServerName:Ljava/lang/String;

    iput p4, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->drawableResId:I

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->nameResId:Ljava/lang/Integer;

    iput-boolean p6, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->shouldStretch:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/views/Brand;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/views/Brand;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/views/Brand;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->$VALUES:[Lcom/stripe/android/stripe3ds2/views/Brand;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/views/Brand;

    return-object v0
.end method


# virtual methods
.method public final getDirectoryServerName$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->directoryServerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDrawableResId$3ds2sdk_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->drawableResId:I

    return v0
.end method

.method public final getNameResId$3ds2sdk_release()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->nameResId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getShouldStretch$3ds2sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->shouldStretch:Z

    return v0
.end method

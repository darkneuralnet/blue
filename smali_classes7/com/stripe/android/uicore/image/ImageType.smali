.class public final enum Lcom/stripe/android/uicore/image/ImageType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/image/ImageType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/image/ImageType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0080\u0001\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001d\u0008\u0002\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/ImageType;",
        "",
        "suffixes",
        "",
        "",
        "compressFormat",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V",
        "getCompressFormat",
        "()Landroid/graphics/Bitmap$CompressFormat;",
        "getSuffixes",
        "()Ljava/util/List;",
        "PNG",
        "WEBP",
        "JPEG",
        "Companion",
        "stripe-ui-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/image/ImageType;

.field public static final Companion:Lcom/stripe/android/uicore/image/ImageType$Companion;

.field public static final enum JPEG:Lcom/stripe/android/uicore/image/ImageType;

.field public static final enum PNG:Lcom/stripe/android/uicore/image/ImageType;

.field public static final enum WEBP:Lcom/stripe/android/uicore/image/ImageType;


# instance fields
.field private final compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private final suffixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/image/ImageType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/uicore/image/ImageType;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/uicore/image/ImageType;->PNG:Lcom/stripe/android/uicore/image/ImageType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/uicore/image/ImageType;->WEBP:Lcom/stripe/android/uicore/image/ImageType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/uicore/image/ImageType;->JPEG:Lcom/stripe/android/uicore/image/ImageType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/uicore/image/ImageType;

    const-string v1, "png"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const-string v3, "PNG"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/uicore/image/ImageType;-><init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->PNG:Lcom/stripe/android/uicore/image/ImageType;

    new-instance v0, Lcom/stripe/android/uicore/image/ImageType;

    const-string v1, "webp"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    const-string v3, "WEBP"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/uicore/image/ImageType;-><init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->WEBP:Lcom/stripe/android/uicore/image/ImageType;

    new-instance v0, Lcom/stripe/android/uicore/image/ImageType;

    const-string v1, "jpeg"

    const-string v2, "jpg"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const-string v3, "JPEG"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/uicore/image/ImageType;-><init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->JPEG:Lcom/stripe/android/uicore/image/ImageType;

    invoke-static {}, Lcom/stripe/android/uicore/image/ImageType;->$values()[Lcom/stripe/android/uicore/image/ImageType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->$VALUES:[Lcom/stripe/android/uicore/image/ImageType;

    new-instance v0, Lcom/stripe/android/uicore/image/ImageType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/image/ImageType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->Companion:Lcom/stripe/android/uicore/image/ImageType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/graphics/Bitmap$CompressFormat;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/uicore/image/ImageType;->suffixes:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/uicore/image/ImageType;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/image/ImageType;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/image/ImageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/image/ImageType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/image/ImageType;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/image/ImageType;->$VALUES:[Lcom/stripe/android/uicore/image/ImageType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/uicore/image/ImageType;

    return-object v0
.end method


# virtual methods
.method public final getCompressFormat()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageType;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method public final getSuffixes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageType;->suffixes:Ljava/util/List;

    return-object v0
.end method

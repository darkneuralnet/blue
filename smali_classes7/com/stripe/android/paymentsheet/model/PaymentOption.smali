.class public final Lcom/stripe/android/paymentsheet/model/PaymentOption;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001BT\u0008\u0010\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\"\u0010\u0008\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000cB\u0019\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u001f\u001a\u00020\u000bJ\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005@BX\u0080\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R/\u0010\u0008\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tX\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005@BX\u0080\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0010\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
        "",
        "drawableResourceId",
        "",
        "label",
        "",
        "lightThemeIconUrl",
        "darkThemeIconUrl",
        "imageLoader",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "Landroid/graphics/drawable/Drawable;",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V",
        "(ILjava/lang/String;)V",
        "<set-?>",
        "getDarkThemeIconUrl$paymentsheet_release",
        "()Ljava/lang/String;",
        "getDrawableResourceId$annotations",
        "()V",
        "getDrawableResourceId",
        "()I",
        "Lkotlin/jvm/functions/Function2;",
        "getLabel",
        "getLightThemeIconUrl$paymentsheet_release",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "icon",
        "toString",
        "paymentsheet_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private darkThemeIconUrl:Ljava/lang/String;

.field private final drawableResourceId:I

.field private imageLoader:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Ljava/lang/String;

.field private lightThemeIconUrl:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Not intended for public use."
    .end annotation

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption$imageLoader$1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOption$imageLoader$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->imageLoader:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->lightThemeIconUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->darkThemeIconUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->imageLoader:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/model/PaymentOption;ILjava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/model/PaymentOption;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->copy(ILjava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDrawableResourceId$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Please use fetchIcon instead."
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentOption;
    .locals 1

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    iget v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDarkThemeIconUrl$paymentsheet_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->darkThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDrawableResourceId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLightThemeIconUrl$paymentsheet_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->lightThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final icon()Landroid/graphics/drawable/Drawable;
    .locals 3

    new-instance v0, Lcom/stripe/android/paymentsheet/model/DelegateDrawable;

    new-instance v1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->imageLoader:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, p0}, Lcom/stripe/android/paymentsheet/model/DelegateDrawable;-><init>(Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->drawableResourceId:I

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOption;->label:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PaymentOption(drawableResourceId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

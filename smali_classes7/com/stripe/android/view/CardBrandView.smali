.class public final Lcom/stripe/android/view/CardBrandView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010+\u001a\u00020,H\u0002J\u0008\u0010-\u001a\u00020,H\u0002J\u0008\u0010.\u001a\u00020,H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u0011\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\u0011\u001a\u0004\u0008\u001d\u0010\u0016\"\u0004\u0008\u001e\u0010\u0018R+\u0010 \u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u0011\u001a\u0004\u0008!\u0010\u0016\"\u0004\u0008\"\u0010\u0018R\u001e\u0010$\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/view/CardBrandView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "<set-?>",
        "Lcom/stripe/android/model/CardBrand;",
        "brand",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "setBrand",
        "(Lcom/stripe/android/model/CardBrand;)V",
        "brand$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "iconView",
        "Landroid/widget/ImageView;",
        "",
        "isLoading",
        "()Z",
        "setLoading",
        "(Z)V",
        "isLoading$delegate",
        "progressView",
        "Lcom/stripe/android/view/CardWidgetProgressView;",
        "shouldShowCvc",
        "getShouldShowCvc",
        "setShouldShowCvc",
        "shouldShowCvc$delegate",
        "shouldShowErrorIcon",
        "getShouldShowErrorIcon",
        "setShouldShowErrorIcon",
        "shouldShowErrorIcon$delegate",
        "tintColorInt",
        "getTintColorInt$payments_core_release",
        "()I",
        "setTintColorInt$payments_core_release",
        "(I)V",
        "viewBinding",
        "Lcom/stripe/android/databinding/CardBrandViewBinding;",
        "applyTint",
        "",
        "renderBrandIcon",
        "updateIcon",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardBrandView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBrandView.kt\ncom/stripe/android/view/CardBrandView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,112:1\n33#2,3:113\n33#2,3:116\n33#2,3:119\n33#2,3:122\n40#3:125\n56#3:126\n*S KotlinDebug\n*F\n+ 1 CardBrandView.kt\ncom/stripe/android/view/CardBrandView\n*L\n29#1:113,3\n43#1:116,3\n51#1:119,3\n59#1:122,3\n71#1:125\n71#1:126\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final brand$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final iconView:Landroid/widget/ImageView;

.field private final isLoading$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final progressView:Lcom/stripe/android/view/CardWidgetProgressView;

.field private final shouldShowCvc$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final shouldShowErrorIcon$delegate:Lkotlin/properties/ReadWriteProperty;

.field private tintColorInt:I

.field private final viewBinding:Lcom/stripe/android/databinding/CardBrandViewBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "isLoading"

    const-string v3, "isLoading()Z"

    const-class v4, Lcom/stripe/android/view/CardBrandView;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "brand"

    const-string v3, "getBrand()Lcom/stripe/android/model/CardBrand;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "shouldShowCvc"

    const-string v3, "getShouldShowCvc()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "shouldShowErrorIcon"

    const-string v3, "getShouldShowErrorIcon()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardBrandView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardBrandView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/stripe/android/databinding/CardBrandViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/CardBrandViewBinding;

    move-result-object p1

    const-string p2, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardBrandView;->viewBinding:Lcom/stripe/android/databinding/CardBrandViewBinding;

    iget-object p2, p1, Lcom/stripe/android/databinding/CardBrandViewBinding;->icon:Landroid/widget/ImageView;

    const-string p3, "viewBinding.icon"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/view/CardBrandView;->iconView:Landroid/widget/ImageView;

    iget-object p1, p1, Lcom/stripe/android/databinding/CardBrandViewBinding;->progress:Lcom/stripe/android/view/CardWidgetProgressView;

    const-string p2, "viewBinding.progress"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardBrandView;->progressView:Lcom/stripe/android/view/CardWidgetProgressView;

    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p2, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$1;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardBrandView;)V

    iput-object p2, p0, Lcom/stripe/android/view/CardBrandView;->isLoading$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object p2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    new-instance p3, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$2;

    invoke-direct {p3, p2, p0}, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardBrandView;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardBrandView;->brand$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance p2, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$3;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardBrandView;)V

    iput-object p2, p0, Lcom/stripe/android/view/CardBrandView;->shouldShowCvc$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance p2, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$4;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/view/CardBrandView$special$$inlined$observable$4;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardBrandView;)V

    iput-object p2, p0, Lcom/stripe/android/view/CardBrandView;->shouldShowErrorIcon$delegate:Lkotlin/properties/ReadWriteProperty;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    new-instance p1, Lcom/stripe/android/view/CardBrandView$special$$inlined$doOnNextLayout$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/CardBrandView$special$$inlined$doOnNextLayout$1;-><init>(Lcom/stripe/android/view/CardBrandView;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardBrandView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getProgressView$p(Lcom/stripe/android/view/CardBrandView;)Lcom/stripe/android/view/CardWidgetProgressView;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardBrandView;->progressView:Lcom/stripe/android/view/CardWidgetProgressView;

    return-object p0
.end method

.method public static final synthetic access$updateIcon(Lcom/stripe/android/view/CardBrandView;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->updateIcon()V

    return-void
.end method

.method private final applyTint()V
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->iconView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, LP61;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget v3, p0, Lcom/stripe/android/view/CardBrandView;->tintColorInt:I

    invoke-static {v2, v3}, LP61;->n(Landroid/graphics/drawable/Drawable;I)V

    invoke-static {v1}, LP61;->q(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final renderBrandIcon()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->iconView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->applyTint()V

    :cond_0
    return-void
.end method

.method private final updateIcon()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->renderBrandIcon()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getShouldShowErrorIcon()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->iconView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getErrorIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getShouldShowCvc()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->iconView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getCvcIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->applyTint()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->renderBrandIcon()V

    :goto_0
    return-void
.end method


# virtual methods
.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->brand$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getShouldShowCvc()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->shouldShowCvc$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getShouldShowErrorIcon()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->shouldShowErrorIcon$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getTintColorInt$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/CardBrandView;->tintColorInt:I

    return v0
.end method

.method public final isLoading()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->isLoading$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final setBrand(Lcom/stripe/android/model/CardBrand;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->brand$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setLoading(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->isLoading$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setShouldShowCvc(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->shouldShowCvc$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setShouldShowErrorIcon(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->shouldShowErrorIcon$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardBrandView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTintColorInt$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/CardBrandView;->tintColorInt:I

    return-void
.end method

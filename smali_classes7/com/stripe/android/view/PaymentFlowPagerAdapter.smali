.class public final Lcom/stripe/android/view/PaymentFlowPagerAdapter;
.super LcE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;,
        Lcom/stripe/android/view/PaymentFlowPagerAdapter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010 \n\u0002\u0008\u0014\u0008\u0000\u0018\u00002\u00020\u0001:\u0001HB=\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\u0008\u0002\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0014\u0008\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"\u00a2\u0006\u0004\u0008F\u0010GJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0006H\u0016J\u0008\u0010\u000b\u001a\u00020\u0004H\u0016J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0008\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R.\u0010(\u001a\u0004\u0018\u00010&2\u0008\u0010\'\u001a\u0004\u0018\u00010&8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R*\u0010.\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u00128\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u0010/R7\u0010=\u001a\u0008\u0012\u0004\u0012\u00020#052\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020#058@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R/\u0010C\u001a\u0004\u0018\u00010#2\u0008\u00106\u001a\u0004\u0018\u00010#8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008>\u00108\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u000c058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010:\u00a8\u0006I"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentFlowPagerAdapter;",
        "LcE3;",
        "Landroid/view/ViewGroup;",
        "collection",
        "",
        "position",
        "",
        "instantiateItem",
        "view",
        "",
        "destroyItem",
        "getCount",
        "Lcom/stripe/android/view/PaymentFlowPage;",
        "getPageAt$payments_core_release",
        "(I)Lcom/stripe/android/view/PaymentFlowPage;",
        "getPageAt",
        "Landroid/view/View;",
        "o",
        "",
        "isViewFromObject",
        "",
        "getPageTitle",
        "obj",
        "getItemPosition",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lcom/stripe/android/PaymentSessionConfig;",
        "paymentSessionConfig",
        "Lcom/stripe/android/PaymentSessionConfig;",
        "",
        "",
        "allowedShippingCountryCodes",
        "Ljava/util/Set;",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/model/ShippingMethod;",
        "onShippingMethodSelectedCallback",
        "Lkotlin/jvm/functions/Function1;",
        "Lcom/stripe/android/model/ShippingInformation;",
        "value",
        "shippingInformation",
        "Lcom/stripe/android/model/ShippingInformation;",
        "getShippingInformation$payments_core_release",
        "()Lcom/stripe/android/model/ShippingInformation;",
        "setShippingInformation$payments_core_release",
        "(Lcom/stripe/android/model/ShippingInformation;)V",
        "isShippingInfoSubmitted",
        "Z",
        "isShippingInfoSubmitted$payments_core_release",
        "()Z",
        "setShippingInfoSubmitted$payments_core_release",
        "(Z)V",
        "shouldRecreateShippingMethodsScreen",
        "",
        "<set-?>",
        "shippingMethods$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "getShippingMethods$payments_core_release",
        "()Ljava/util/List;",
        "setShippingMethods$payments_core_release",
        "(Ljava/util/List;)V",
        "shippingMethods",
        "selectedShippingMethod$delegate",
        "getSelectedShippingMethod$payments_core_release",
        "()Lcom/stripe/android/model/ShippingMethod;",
        "setSelectedShippingMethod$payments_core_release",
        "(Lcom/stripe/android/model/ShippingMethod;)V",
        "selectedShippingMethod",
        "getPages",
        "pages",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V",
        "PaymentFlowViewHolder",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentFlowPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFlowPagerAdapter.kt\ncom/stripe/android/view/PaymentFlowPagerAdapter\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,189:1\n33#2,3:190\n33#2,3:193\n*S KotlinDebug\n*F\n+ 1 PaymentFlowPagerAdapter.kt\ncom/stripe/android/view/PaymentFlowPagerAdapter\n*L\n49#1:190,3\n55#1:193,3\n*E\n"
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
.field private final allowedShippingCountryCodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private isShippingInfoSubmitted:Z

.field private final onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ShippingMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

.field private final selectedShippingMethod$delegate:Lkotlin/properties/ReadWriteProperty;

.field private shippingInformation:Lcom/stripe/android/model/ShippingInformation;

.field private final shippingMethods$delegate:Lkotlin/properties/ReadWriteProperty;

.field private shouldRecreateShippingMethodsScreen:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "shippingMethods"

    const-string v3, "getShippingMethods$payments_core_release()Ljava/util/List;"

    const-class v4, Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "selectedShippingMethod"

    const-string v3, "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/PaymentSessionConfig;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ShippingMethod;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSessionConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedShippingCountryCodes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShippingMethodSelectedCallback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LcE3;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->allowedShippingCountryCodes:Ljava/util/Set;

    iput-object p4, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/view/PaymentFlowPagerAdapter$special$$inlined$observable$1;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/PaymentFlowPagerAdapter;)V

    iput-object p2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shippingMethods$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance p1, Lcom/stripe/android/view/PaymentFlowPagerAdapter$special$$inlined$observable$2;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/PaymentFlowPagerAdapter;)V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->selectedShippingMethod$delegate:Lkotlin/properties/ReadWriteProperty;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    sget-object p4, Lcom/stripe/android/view/PaymentFlowPagerAdapter$1;->INSTANCE:Lcom/stripe/android/view/PaymentFlowPagerAdapter$1;

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;-><init>(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$setShouldRecreateShippingMethodsScreen$p(Lcom/stripe/android/view/PaymentFlowPagerAdapter;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shouldRecreateShippingMethodsScreen:Z

    return-void
.end method

.method private final getPages()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/view/PaymentFlowPage;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/stripe/android/view/PaymentFlowPage;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPage;->ShippingInfo:Lcom/stripe/android/view/PaymentFlowPage;

    iget-object v2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPage;->ShippingMethod:Lcom/stripe/android/view/PaymentFlowPage;

    iget-object v4, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    invoke-virtual {v4}, Lcom/stripe/android/PaymentSessionConfig;->isShippingMethodRequired()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    invoke-virtual {v4}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-boolean v4, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->isShippingInfoSubmitted:Z

    if-eqz v4, :cond_2

    :cond_1
    move v2, v5

    :cond_2
    if-eqz v2, :cond_3

    move-object v3, v1

    :cond_3
    aput-object v3, v0, v5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    const-string p2, "collection"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "view"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 2

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPage;->ShippingMethod:Lcom/stripe/android/view/PaymentFlowPage;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shouldRecreateShippingMethodsScreen:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shouldRecreateShippingMethodsScreen:Z

    const/4 p1, -0x2

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LcE3;->getItemPosition(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final getPageAt$payments_core_release(I)Lcom/stripe/android/view/PaymentFlowPage;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPages()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/PaymentFlowPage;

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->context:Landroid/content/Context;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPages()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/PaymentFlowPage;

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentFlowPage;->getTitleResId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->selectedShippingMethod$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingMethod;

    return-object v0
.end method

.method public final getShippingInformation$payments_core_release()Lcom/stripe/android/model/ShippingInformation;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    return-object v0
.end method

.method public final getShippingMethods$payments_core_release()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shippingMethods$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    const-string v0, "collection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/view/PaymentFlowPage;

    sget-object v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;

    invoke-direct {v0, p1}, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;-><init>(Landroid/view/ViewGroup;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;

    invoke-direct {v0, p1}, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;-><init>(Landroid/view/ViewGroup;)V

    :goto_0
    instance-of v1, v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;

    iget-object v2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    iget-object v3, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    iget-object v4, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->allowedShippingCountryCodes:Ljava/util/Set;

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;->bind(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/model/ShippingInformation;Ljava/util/Set;)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getShippingMethods$payments_core_release()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;->bind(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;Lkotlin/jvm/functions/Function1;)V

    :cond_3
    :goto_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string p2, "viewHolder.itemView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final isShippingInfoSubmitted$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->isShippingInfoSubmitted:Z

    return v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "o"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final setSelectedShippingMethod$payments_core_release(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->selectedShippingMethod$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setShippingInfoSubmitted$payments_core_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->isShippingInfoSubmitted:Z

    invoke-virtual {p0}, LcE3;->notifyDataSetChanged()V

    return-void
.end method

.method public final setShippingInformation$payments_core_release(Lcom/stripe/android/model/ShippingInformation;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {p0}, LcE3;->notifyDataSetChanged()V

    return-void
.end method

.method public final setShippingMethods$payments_core_release(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shippingMethods$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

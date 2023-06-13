.class public final Lcom/stripe/android/model/DeferredIntentParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/DeferredIntentParams$Mode;,
        Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002/0BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000c\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000f\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000cH\u00c6\u0003JS\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000cH\u00c6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020!H\u00d6\u0001J\u0014\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010%0(J\t\u0010)\u001a\u00020\tH\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020!H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u00061"
    }
    d2 = {
        "Lcom/stripe/android/model/DeferredIntentParams;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "mode",
        "Lcom/stripe/android/model/DeferredIntentParams$Mode;",
        "setupFutureUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "captureMethod",
        "Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;",
        "customer",
        "",
        "onBehalfOf",
        "paymentMethodTypes",
        "",
        "(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V",
        "getCaptureMethod",
        "()Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;",
        "getCustomer",
        "()Ljava/lang/String;",
        "getMode",
        "()Lcom/stripe/android/model/DeferredIntentParams$Mode;",
        "getOnBehalfOf",
        "getPaymentMethodTypes",
        "()Ljava/util/Set;",
        "getSetupFutureUsage",
        "()Lcom/stripe/android/model/StripeIntent$Usage;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toQueryParams",
        "",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "CaptureMethod",
        "Mode",
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
        "SMAP\nDeferredIntentParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredIntentParams.kt\ncom/stripe/android/model/DeferredIntentParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1559#2:63\n1590#2,4:64\n*S KotlinDebug\n*F\n+ 1 DeferredIntentParams.kt\ncom/stripe/android/model/DeferredIntentParams\n*L\n57#1:63\n57#1:64,4\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/DeferredIntentParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

.field private final customer:Ljava/lang/String;

.field private final mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

.field private final onBehalfOf:Ljava/lang/String;

.field private final paymentMethodTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/DeferredIntentParams$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/DeferredIntentParams$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/DeferredIntentParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/DeferredIntentParams$Mode;",
            "Lcom/stripe/android/model/StripeIntent$Usage;",
            "Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodTypes"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    iput-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    iput-object p3, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    iput-object p4, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 5

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, p5

    :goto_3
    and-int/lit8 v4, p7, 0x20

    if-eqz v4, :cond_4

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v4

    goto :goto_4

    :cond_4
    move-object v4, p6

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v2

    move-object p6, v3

    move-object p7, v1

    move-object p8, v4

    invoke-direct/range {p2 .. p8}, Lcom/stripe/android/model/DeferredIntentParams;-><init>(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/DeferredIntentParams;Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/model/DeferredIntentParams;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/model/DeferredIntentParams;->copy(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/DeferredIntentParams$Mode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/model/DeferredIntentParams;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/DeferredIntentParams$Mode;",
            "Lcom/stripe/android/model/StripeIntent$Usage;",
            "Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/DeferredIntentParams;"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodTypes"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/DeferredIntentParams;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/DeferredIntentParams;-><init>(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/DeferredIntentParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/DeferredIntentParams;

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCaptureMethod()Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    return-object v0
.end method

.method public final getCustomer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    return-object v0
.end method

.method public final getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    return-object v0
.end method

.method public final getOnBehalfOf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toQueryParams()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x7

    new-array v0, v0, [Lkotlin/Pair;

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    invoke-interface {v1}, Lcom/stripe/android/model/DeferredIntentParams$Mode;->getCode()Ljava/lang/String;

    move-result-object v1

    const-string v2, "deferred_intent[mode]"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    instance-of v3, v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getAmount()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    const-string v3, "deferred_intent[amount]"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    instance-of v3, v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    if-eqz v3, :cond_2

    check-cast v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    goto :goto_2

    :cond_2
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getCurrency()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v4

    :goto_3
    const-string v3, "deferred_intent[currency]"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/stripe/android/model/StripeIntent$Usage;->getCode()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v4

    :goto_4
    const-string v3, "deferred_intent[setup_future_usage]"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;->getCode()Ljava/lang/String;

    move-result-object v4

    :cond_5
    const-string v1, "deferred_intent[capture_method]"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "deferred_intent[customer]"

    iget-object v3, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "deferred_intent[on_behalf_of]"

    iget-object v3, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    if-gez v2, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_6
    check-cast v4, Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "deferred_intent[payment_method_types]["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v5

    goto :goto_5

    :cond_7
    invoke-static {v0, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v2, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    iget-object v3, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DeferredIntentParams(mode="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", setupFutureUsage="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", captureMethod="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", customer="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", onBehalfOf="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodTypes="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams;->mode:Lcom/stripe/android/model/DeferredIntentParams$Mode;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->captureMethod:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    if-nez p2, :cond_1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_1
    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->customer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->onBehalfOf:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams;->paymentMethodTypes:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    return-void
.end method

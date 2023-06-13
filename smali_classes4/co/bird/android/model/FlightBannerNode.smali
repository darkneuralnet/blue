.class public final Lco/bird/android/model/FlightBannerNode;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/FlightBannerNode$BannerPriority;,
        Lco/bird/android/model/FlightBannerNode$FlightBanner;,
        Lco/bird/android/model/FlightBannerNode$RiderBarType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lco/bird/android/model/FlightBannerNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0003)*+Bt\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u0007\u0012:\u0008\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J$\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u0007H\u00c6\u0003J;\u0010!\u001a4\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u00c6\u0003J~\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052#\u0008\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u00072:\u0008\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\u0008\u0010\u001d\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014RC\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006,"
    }
    d2 = {
        "Lco/bird/android/model/FlightBannerNode;",
        "",
        "banner",
        "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        "priority",
        "Lco/bird/android/model/FlightBannerNode$BannerPriority;",
        "view",
        "Lkotlin/Function1;",
        "Landroid/content/Context;",
        "Lkotlin/ParameterName;",
        "name",
        "context",
        "Landroid/view/View;",
        "presenterFactory",
        "Lkotlin/Function2;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lco/bird/android/model/FlightBanner;",
        "(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V",
        "getBanner",
        "()Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        "getPresenterFactory",
        "()Lkotlin/jvm/functions/Function2;",
        "getPriority",
        "()Lco/bird/android/model/FlightBannerNode$BannerPriority;",
        "getView",
        "()Lkotlin/jvm/functions/Function1;",
        "compareTo",
        "",
        "other",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "",
        "hashCode",
        "toString",
        "",
        "BannerPriority",
        "FlightBanner",
        "RiderBarType",
        "model_release"
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
        "SMAP\nFlightBannerNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerNode.kt\nco/bird/android/model/FlightBannerNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"
    }
.end annotation


# instance fields
.field private final banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

.field private final presenterFactory:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/View;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lco/bird/android/model/FlightBanner;",
            ">;"
        }
    .end annotation
.end field

.field private final priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field private final view:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
            "Lco/bird/android/model/FlightBannerNode$BannerPriority;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lcom/uber/autodispose/ScopeProvider;",
            "+",
            "Lco/bird/android/model/FlightBanner;",
            ">;)V"
        }
    .end annotation

    const-string v0, "banner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priority"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presenterFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    iput-object p2, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    iput-object p3, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lco/bird/android/model/FlightBannerNode$1;->INSTANCE:Lco/bird/android/model/FlightBannerNode$1;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/FlightBannerNode;-><init>(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/FlightBannerNode;Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lco/bird/android/model/FlightBannerNode;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/FlightBannerNode;->copy(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lco/bird/android/model/FlightBannerNode;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public compareTo(Lco/bird/android/model/FlightBannerNode;)I
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p1, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object p1, p1, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    sub-int p1, v0, p1

    :goto_2
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lco/bird/android/model/FlightBannerNode;

    invoke-virtual {p0, p1}, Lco/bird/android/model/FlightBannerNode;->compareTo(Lco/bird/android/model/FlightBannerNode;)I

    move-result p1

    return p1
.end method

.method public final component1()Lco/bird/android/model/FlightBannerNode$FlightBanner;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/FlightBannerNode$BannerPriority;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    return-object v0
.end method

.method public final component3()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component4()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/View;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lco/bird/android/model/FlightBanner;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lco/bird/android/model/FlightBannerNode;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
            "Lco/bird/android/model/FlightBannerNode$BannerPriority;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lcom/uber/autodispose/ScopeProvider;",
            "+",
            "Lco/bird/android/model/FlightBanner;",
            ">;)",
            "Lco/bird/android/model/FlightBannerNode;"
        }
    .end annotation

    const-string v0, "banner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priority"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presenterFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/FlightBannerNode;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/FlightBannerNode;-><init>(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/FlightBannerNode;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/FlightBannerNode;

    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    iget-object v3, p1, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    iget-object v3, p1, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    iget-object p1, p1, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBanner()Lco/bird/android/model/FlightBannerNode$FlightBanner;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    return-object v0
.end method

.method public final getPresenterFactory()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/View;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lco/bird/android/model/FlightBanner;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getPriority()Lco/bird/android/model/FlightBannerNode$BannerPriority;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    return-object v0
.end method

.method public final getView()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode;->banner:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    iget-object v1, p0, Lco/bird/android/model/FlightBannerNode;->priority:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    iget-object v2, p0, Lco/bird/android/model/FlightBannerNode;->view:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lco/bird/android/model/FlightBannerNode;->presenterFactory:Lkotlin/jvm/functions/Function2;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "FlightBannerNode(banner="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", priority="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", view="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", presenterFactory="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

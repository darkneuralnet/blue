.class public final Lco/bird/android/model/BountyBirdsFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BirdsFilter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/BountyBirdsFilter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0014\u0008\u0086\u0008\u0018\u0000 32\u00020\u0001:\u00013B]\u0012\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0008\u0002\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\u0004\u00081\u00102J\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000c\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000c\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002J\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0096\u0002J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J_\u0010\u001b\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u000e\u0008\u0002\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\"\u001a\u00020\u00062\u0008\u0010!\u001a\u0004\u0018\u00010 H\u00d6\u0003R\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010#\u001a\u0004\u0008$\u0010%R\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010#\u001a\u0004\u0008&\u0010%R\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010#\u001a\u0004\u0008\'\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010(\u001a\u0004\u0008)\u0010*R\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010+\u001a\u0004\u0008,\u0010-R\u0017\u0010\u001a\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010.\u001a\u0004\u0008/\u00100\u00a8\u00064"
    }
    d2 = {
        "Lco/bird/android/model/BountyBirdsFilter;",
        "Lco/bird/android/model/BirdsFilter;",
        "Lco/bird/android/model/wire/WireBird;",
        "Lorg/joda/time/DateTime;",
        "lastRidden",
        "lastLocatedAt",
        "",
        "isIncludedBountyOption",
        "bird",
        "invoke",
        "Lco/bird/android/model/IntervalFilter;",
        "",
        "component1",
        "component2",
        "component3",
        "Lm46;",
        "component4",
        "",
        "Lco/bird/android/model/BountyOption;",
        "component5",
        "component6",
        "lastRiddenMillisAgo",
        "lastLocatedMillisAgo",
        "price",
        "timeProvider",
        "includedBountyOptions",
        "enableLastRiddenFilter",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "Lco/bird/android/model/IntervalFilter;",
        "getLastRiddenMillisAgo",
        "()Lco/bird/android/model/IntervalFilter;",
        "getLastLocatedMillisAgo",
        "getPrice",
        "Lm46;",
        "getTimeProvider",
        "()Lm46;",
        "Ljava/util/Set;",
        "getIncludedBountyOptions",
        "()Ljava/util/Set;",
        "Z",
        "getEnableLastRiddenFilter",
        "()Z",
        "<init>",
        "(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)V",
        "Companion",
        "model_release"
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
        "SMAP\nBountyBirdsFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyBirdsFilter.kt\nco/bird/android/model/BountyBirdsFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/model/BountyBirdsFilter$Companion;

.field private static final MIN_DATE_TIME:Lorg/joda/time/DateTime;


# instance fields
.field private final enableLastRiddenFilter:Z

.field private final includedBountyOptions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/BountyOption;",
            ">;"
        }
    .end annotation
.end field

.field private final lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final price:Lco/bird/android/model/IntervalFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final timeProvider:Lm46;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/BountyBirdsFilter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/BountyBirdsFilter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/BountyBirdsFilter;->Companion:Lco/bird/android/model/BountyBirdsFilter$Companion;

    new-instance v0, Lorg/joda/time/DateTime;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lorg/joda/time/DateTime;-><init>(J)V

    sput-object v0, Lco/bird/android/model/BountyBirdsFilter;->MIN_DATE_TIME:Lorg/joda/time/DateTime;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/BountyBirdsFilter;-><init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;",
            "Lm46;",
            "Ljava/util/Set<",
            "Lco/bird/android/model/BountyOption;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "lastRiddenMillisAgo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastLocatedMillisAgo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "includedBountyOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    iput-object p2, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    iput-object p3, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    iput-object p4, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    iput-object p5, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    iput-boolean p6, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    const-wide/high16 v0, -0x8000000000000000L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    if-eqz p8, :cond_0

    new-instance p1, Lco/bird/android/model/IntervalFilter;

    invoke-direct {p1, v0, v1}, Lco/bird/android/model/IntervalFilter;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    new-instance p2, Lco/bird/android/model/IntervalFilter;

    invoke-direct {p2, v0, v1}, Lco/bird/android/model/IntervalFilter;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    new-instance p3, Lco/bird/android/model/IntervalFilter;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p3, p2, v1}, Lco/bird/android/model/IntervalFilter;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    sget-object p2, Lm46;->a:Lm46$a;

    invoke-virtual {p2}, Lm46$a;->a()Lm46;

    move-result-object p4

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    const/4 p3, 0x1

    if-eqz p2, :cond_4

    const/4 p2, 0x4

    new-array p2, p2, [Lco/bird/android/model/BountyOption;

    const/4 p4, 0x0

    sget-object p5, Lco/bird/android/model/BountyOption;->CHARGE:Lco/bird/android/model/BountyOption;

    aput-object p5, p2, p4

    sget-object p4, Lco/bird/android/model/BountyOption;->DAMAGED_CHARGE:Lco/bird/android/model/BountyOption;

    aput-object p4, p2, p3

    sget-object p4, Lco/bird/android/model/BountyOption;->REBALANCE:Lco/bird/android/model/BountyOption;

    const/4 p5, 0x2

    aput-object p4, p2, p5

    const/4 p4, 0x3

    sget-object p5, Lco/bird/android/model/BountyOption;->DAMAGED_TRANSPORT:Lco/bird/android/model/BountyOption;

    aput-object p5, p2, p4

    invoke-static {p2}, Lkotlin/collections/SetsKt;->mutableSetOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p5

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    move v3, p3

    goto :goto_0

    :cond_5
    move v3, p6

    :goto_0
    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    invoke-direct/range {p2 .. p8}, Lco/bird/android/model/BountyBirdsFilter;-><init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/BountyBirdsFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;ZILjava/lang/Object;)Lco/bird/android/model/BountyBirdsFilter;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/BountyBirdsFilter;->copy(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)Lco/bird/android/model/BountyBirdsFilter;

    move-result-object p0

    return-object p0
.end method

.method private final isIncludedBountyOption(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    sget-object v1, Lco/bird/android/model/BountyOption;->CHARGE:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/BountyKind;->CHARGE:Lco/bird/android/model/constant/BountyKind;

    if-ne v0, v2, :cond_0

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isDamaged(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    sget-object v2, Lco/bird/android/model/BountyOption;->DAMAGED_CHARGE:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/BountyKind;->CHARGE:Lco/bird/android/model/constant/BountyKind;

    if-ne v0, v2, :cond_1

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isDamaged(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    sget-object v2, Lco/bird/android/model/BountyOption;->REBALANCE:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/BountyKind;->REBALANCE:Lco/bird/android/model/constant/BountyKind;

    if-ne v0, v2, :cond_2

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isDamaged(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    sget-object v2, Lco/bird/android/model/BountyOption;->DAMAGED_TRANSPORT:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/BountyKind;->REBALANCE:Lco/bird/android/model/constant/BountyKind;

    if-ne v0, v2, :cond_3

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isDamaged(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final lastLocatedAt(Lco/bird/android/model/wire/WireBird;)Lorg/joda/time/DateTime;
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getTrackedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getGpsAt()Lorg/joda/time/DateTime;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/model/BountyBirdsFilter;->MIN_DATE_TIME:Lorg/joda/time/DateTime;

    :cond_0
    return-object p1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getGpsAt()Lorg/joda/time/DateTime;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getTrackedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, Lco/bird/android/model/BountyBirdsFilter;->MIN_DATE_TIME:Lorg/joda/time/DateTime;

    :cond_2
    return-object p1

    :cond_3
    invoke-static {v0, v1}, LpT0;->f(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1
.end method

.method private final lastRidden(Lco/bird/android/model/wire/WireBird;)Lorg/joda/time/DateTime;
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLastRideEndedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/model/BountyBirdsFilter;->MIN_DATE_TIME:Lorg/joda/time/DateTime;

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/IntervalFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/IntervalFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/IntervalFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    return-object v0
.end method

.method public final component4()Lm46;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    return-object v0
.end method

.method public final component5()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lco/bird/android/model/BountyOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    return v0
.end method

.method public final copy(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)Lco/bird/android/model/BountyBirdsFilter;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;",
            "Lm46;",
            "Ljava/util/Set<",
            "Lco/bird/android/model/BountyOption;",
            ">;Z)",
            "Lco/bird/android/model/BountyBirdsFilter;"
        }
    .end annotation

    const-string v0, "lastRiddenMillisAgo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastLocatedMillisAgo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "includedBountyOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BountyBirdsFilter;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/BountyBirdsFilter;-><init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/BountyBirdsFilter;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/BountyBirdsFilter;

    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    iget-object v3, p1, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    iget-object v3, p1, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    iget-object v3, p1, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    iget-object v3, p1, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    iget-object v3, p1, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    iget-boolean p1, p1, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEnableLastRiddenFilter()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    return v0
.end method

.method public final getIncludedBountyOptions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lco/bird/android/model/BountyOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    return-object v0
.end method

.method public final getLastLocatedMillisAgo()Lco/bird/android/model/IntervalFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    return-object v0
.end method

.method public final getLastRiddenMillisAgo()Lco/bird/android/model/IntervalFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    return-object v0
.end method

.method public final getPrice()Lco/bird/android/model/IntervalFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/model/IntervalFilter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    return-object v0
.end method

.method public final getTimeProvider()Lm46;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    invoke-virtual {v0}, Lco/bird/android/model/IntervalFilter;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    invoke-virtual {v1}, Lco/bird/android/model/IntervalFilter;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    invoke-virtual {v1}, Lco/bird/android/model/IntervalFilter;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public invoke(Lco/bird/android/model/wire/WireBird;)Z
    .locals 5

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lm46;->a:Lm46$a;

    invoke-virtual {v0}, Lm46$a;->a()Lm46;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Lm46;->a()J

    move-result-wide v0

    iget-boolean v2, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    if-eqz v2, :cond_1

    if-eqz v2, :cond_3

    iget-object v2, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    invoke-direct {p0, p1}, Lco/bird/android/model/BountyBirdsFilter;->lastRidden(Lco/bird/android/model/wire/WireBird;)Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v3

    sub-long v3, v0, v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/model/IntervalFilter;->contains(Ljava/lang/Comparable;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iget-object v2, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    invoke-direct {p0, p1}, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedAt(Lco/bird/android/model/wire/WireBird;)Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v3

    sub-long/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lco/bird/android/model/IntervalFilter;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBountyPrice()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v2, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    int-to-long v3, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lco/bird/android/model/IntervalFilter;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lco/bird/android/model/BountyBirdsFilter;->isIncludedBountyOption(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/android/model/BountyBirdsFilter;->lastRiddenMillisAgo:Lco/bird/android/model/IntervalFilter;

    iget-object v1, p0, Lco/bird/android/model/BountyBirdsFilter;->lastLocatedMillisAgo:Lco/bird/android/model/IntervalFilter;

    iget-object v2, p0, Lco/bird/android/model/BountyBirdsFilter;->price:Lco/bird/android/model/IntervalFilter;

    iget-object v3, p0, Lco/bird/android/model/BountyBirdsFilter;->timeProvider:Lm46;

    iget-object v4, p0, Lco/bird/android/model/BountyBirdsFilter;->includedBountyOptions:Ljava/util/Set;

    iget-boolean v5, p0, Lco/bird/android/model/BountyBirdsFilter;->enableLastRiddenFilter:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BountyBirdsFilter(lastRiddenMillisAgo="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastLocatedMillisAgo="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", price="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeProvider="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", includedBountyOptions="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableLastRiddenFilter="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

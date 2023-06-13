.class public final LNl1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNl1;-><init>(Lgl;LRh6;LTq4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LD00;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/BountyBirdsFilter;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LD00;",
        "<name for destructuring parameter 0>",
        "Lkotlin/Triple;",
        "Lco/bird/android/model/BountyBirdsFilter;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(LD00;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFilterBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LNl1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LNl1$a;

    invoke-direct {v0}, LNl1$a;-><init>()V

    sput-object v0, LNl1$a;->g:LNl1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD00;)Lkotlin/Triple;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LD00;",
            ")",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/BountyBirdsFilter;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LD00;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1}, LD00;->b()Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {p1}, LD00;->c()Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {p1}, LD00;->d()Lco/bird/android/buava/Optional;

    move-result-object v3

    invoke-virtual {p1}, LD00;->e()Z

    move-result v4

    invoke-virtual {p1}, LD00;->f()Z

    move-result p1

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-wide/high16 v5, -0x8000000000000000L

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    int-to-long v8, v0

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    goto :goto_0

    :cond_0
    move-wide v7, v5

    :goto_0
    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-wide v9, 0x7fffffffffffffffL

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    int-to-long v11, v0

    invoke-virtual {v1, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    move-wide v0, v9

    :goto_1
    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    int-to-long v11, v2

    invoke-virtual {v5, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    :cond_2
    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    int-to-long v9, v2

    invoke-virtual {v3, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    :cond_3
    new-instance v2, Lkotlin/Triple;

    new-instance v3, Lco/bird/android/model/BountyBirdsFilter;

    new-instance v11, Lco/bird/android/model/IntervalFilter;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v11, v7, v0}, Lco/bird/android/model/IntervalFilter;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    new-instance v7, Lco/bird/android/model/IntervalFilter;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lco/bird/android/model/IntervalFilter;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x1c

    const/4 v13, 0x0

    move-object v5, v3

    move-object v6, v11

    move v11, p1

    invoke-direct/range {v5 .. v13}, Lco/bird/android/model/BountyBirdsFilter;-><init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v2, v3, v0, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD00;

    invoke-virtual {p0, p1}, LNl1$a;->a(LD00;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method

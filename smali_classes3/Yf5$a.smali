.class public final LYf5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYf5;->z([Lio/reactivex/c;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lio/reactivex/F<",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/Throwable;",
        ">;>;>;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lio/reactivex/F;",
        "Lco/bird/android/buava/Optional;",
        "",
        "kotlin.jvm.PlatformType",
        "singles",
        "Lio/reactivex/h;",
        "c",
        "(Ljava/util/List;)Lio/reactivex/h;"
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
        "SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$concatUntilFirstSuccess$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n1789#2,3:645\n*S KotlinDebug\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$concatUntilFirstSuccess$2\n*L\n68#1:645,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LYf5$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYf5$a;

    invoke-direct {v0}, LYf5$a;-><init>()V

    sput-object v0, LYf5$a;->g:LYf5$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LYf5$a;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LYf5$a;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/util/List;)Lio/reactivex/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/reactivex/F<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Throwable;",
            ">;>;>;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "singles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v1, LYf5$a$c;

    invoke-direct {v1}, LYf5$a$c;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type io.reactivex.Single<co.bird.android.buava.Optional<kotlin.Throwable>>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/F;

    new-instance v4, LYf5$a$a;

    invoke-direct {v4, v0, v1, v3}, LYf5$a$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;LYf5$a$c;Lio/reactivex/F;)V

    new-instance v3, LWf5;

    invoke-direct {v3, v4}, LWf5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v3}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v2

    const-string v3, "error: Throwable? = null\u2026())\n          }\n        }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, LYf5$a$b;

    invoke-direct {p1, v0}, LYf5$a$b;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    new-instance v0, LXf5;

    invoke-direct {v0, p1}, LXf5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v0}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LYf5$a;->c(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

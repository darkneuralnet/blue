.class public final Li25$c2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->onResume(Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "LYz1;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "optionalView",
        "LYz1;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onResume$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Li25$c2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li25$c2;

    invoke-direct {v0}, Li25$c2;-><init>()V

    sput-object v0, Li25$c2;->g:Li25$c2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "LYz1;",
            ">;"
        }
    .end annotation

    const-string v0, "optionalView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireFrequentFlyerView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getMapStatus()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v2, LYz1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getProgress()Lco/bird/android/model/wire/WireFrequentFlyerProgress;

    move-result-object p1

    invoke-direct {v2, v0, p1}, LYz1;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerProgress;)V

    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Li25$c2;->a(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

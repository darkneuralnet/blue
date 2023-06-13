.class public final LtC3$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lwb4<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "+",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00ca\u0001\u0012^\u0008\u0001\u0012Z\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0008\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0008\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007 \u0002*d\u0012^\u0008\u0001\u0012Z\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0008\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0008\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "",
        "birdVersionAddress",
        "Lio/reactivex/K;",
        "Lwb4;",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "c",
        "(Lkotlin/Triple;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtC3;


# direct methods
.method public constructor <init>(LtC3;)V
    .locals 0

    iput-object p1, p0, LtC3$r;->g:LtC3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;
    .locals 0

    invoke-static {p0, p1}, LtC3$r;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Lco/bird/android/model/BirdActionsAndSettings;
    .locals 0

    invoke-static {p0}, LtC3$r;->d(Ljava/lang/Throwable;)Lco/bird/android/model/BirdActionsAndSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/Throwable;)Lco/bird/android/model/BirdActionsAndSettings;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lco/bird/android/model/BirdActionsAndSettings;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lco/bird/android/model/BirdActionsAndSettings;-><init>(Ljava/util/List;Lco/bird/android/model/PrivateBirdSetting;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwb4;

    return-object p0
.end method


# virtual methods
.method public final c(Lkotlin/Triple;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lco/bird/android/model/persistence/VehicleVersion;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lwb4<",
            "Lco/bird/android/model/persistence/Bird;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/BirdActionsAndSettings;",
            "Lco/bird/android/model/persistence/VehicleVersion;",
            ">;>;"
        }
    .end annotation

    const-string v0, "birdVersionAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/VehicleVersion;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v2, p0, LtC3$r;->g:LtC3;

    invoke-virtual {v2}, LtC3;->I0()LgH;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LgH;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v2

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v2

    const-wide/16 v3, 0x3

    invoke-virtual {v2, v3, v4}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object v2

    new-instance v3, LyC3;

    invoke-direct {v3}, LyC3;-><init>()V

    invoke-virtual {v2, v3}, Lio/reactivex/F;->Q(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v2

    new-instance v3, LtC3$r$a;

    invoke-direct {v3, v0, p1, v1}, LtC3$r$a;-><init>(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V

    new-instance p1, LzC3;

    invoke-direct {p1, v3}, LzC3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LtC3$r;->c(Lkotlin/Triple;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

.class public final LF34$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF34;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/Bird;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Triple<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0006\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Bird;",
        "it",
        "Lio/reactivex/B;",
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;"
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
        "SMAP\nPrivateBirdAirDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAirDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdAirDetailsPresenterImpl$onResume$15\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,284:1\n52#2,2:285\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAirDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdAirDetailsPresenterImpl$onResume$15\n*L\n189#1:285,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LF34;


# direct methods
.method public constructor <init>(LF34;)V
    .locals 0

    iput-object p1, p0, LF34$o;->g:LF34;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LF34$o;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Bird;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Triple<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, LF34$o;->g:LF34;

    invoke-virtual {v0}, LtC3;->J0()LkI;

    move-result-object v0

    iget-object v1, p0, LF34$o;->g:LF34;

    invoke-virtual {v1, p1}, LtC3;->G2(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, LkI;->c(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LF34$o;->g:LF34;

    invoke-virtual {v1}, LtC3;->J0()LkI;

    move-result-object v1

    iget-object v2, p0, LF34$o;->g:LF34;

    invoke-virtual {v2, p1}, LtC3;->G2(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object p1

    invoke-interface {v1, p1}, LkI;->k(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, LF34$o$b;->a:LF34$o$b;

    invoke-static {v0, p1, v1}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF34$o$a;

    iget-object v1, p0, LF34$o;->g:LF34;

    invoke-direct {v0, v1}, LF34$o$a;-><init>(LF34;)V

    new-instance v1, LO34;

    invoke-direct {v1, v0}, LO34;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p0, p1}, LF34$o;->b(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

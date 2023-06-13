.class public final LKf3$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKf3;-><init>(LTq4;LEa;Lqi1;LCx4;Le13;Lgl;LaM;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/Observable<",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "",
        "b",
        "()Lio/reactivex/Observable;"
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
        "SMAP\nPillConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration$visibility$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,134:1\n22#2,2:135\n*S KotlinDebug\n*F\n+ 1 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration$visibility$2\n*L\n68#1:135,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LKf3;


# direct methods
.method public constructor <init>(LKf3;)V
    .locals 0

    iput-object p1, p0, LKf3$h;->g:LKf3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 0

    invoke-static {p0, p1}, LKf3$h;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/configs/RentalConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/configs/RentalConfig;

    return-object p0
.end method


# virtual methods
.method public final b()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v0, p0, LKf3$h;->g:LKf3;

    invoke-static {v0}, LKf3;->access$getReactiveConfig$p(LKf3;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    sget-object v1, LKf3$h$a;->g:LKf3$h$a;

    new-instance v2, LSf3;

    invoke-direct {v2, v1}, LSf3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reactiveConfig.config.ma\u2026lConfigs.onDemandConfig }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LKf3$h;->g:LKf3;

    invoke-static {v1}, LKf3;->access$getReactiveConfig$p(LKf3;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->U8()Lio/reactivex/Observable;

    move-result-object v2

    const-string v3, "reactiveConfig.pillButtonConfig()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LKf3$h;->g:LKf3;

    invoke-virtual {v3}, LKf3;->j()Lio/reactivex/subjects/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LKf3;->k(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, LKf3$h$b;

    invoke-direct {v2}, LKf3$h$b;-><init>()V

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "Observable.combineLatest\u2026ombineFunction(t1, t2) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKf3$h;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

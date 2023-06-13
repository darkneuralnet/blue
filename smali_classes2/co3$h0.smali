.class public final Lco3$h0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "nestId",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/lang/String;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco3;


# direct methods
.method public constructor <init>(Lco3;)V
    .locals 0

    iput-object p1, p0, Lco3$h0;->g:Lco3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco3$h0;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco3$h0;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lio/reactivex/B;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "nestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco3$h0;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getOperatorManager$p(Lco3;)Lom3;

    move-result-object v0

    invoke-interface {v0, p1}, Lom3;->S(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x32

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco3$h0$a;->g:Lco3$h0$a;

    new-instance v3, Lmo3;

    invoke-direct {v3, v2}, Lmo3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Lio/reactivex/Observable;->timeout(Lio/reactivex/B;Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco3$h0$b;

    iget-object v2, p0, Lco3$h0;->g:Lco3;

    invoke-direct {v1, v2}, Lco3$h0$b;-><init>(Lco3;)V

    new-instance v2, Lno3;

    invoke-direct {v2, v1}, Lno3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco3$h0;->g:Lco3;

    invoke-static {v1}, Lco3;->access$getOperatorManager$p(Lco3;)Lom3;

    move-result-object v1

    invoke-interface {v1, p1}, Lom3;->S(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco3$h0;->g:Lco3;

    invoke-static {v1}, Lco3;->access$getOperatorManager$p(Lco3;)Lom3;

    move-result-object v1

    invoke-interface {v1, p1}, Lom3;->G0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v1

    iget-object v2, p0, Lco3$h0;->g:Lco3;

    invoke-static {v2}, Lco3;->access$getOperatorManager$p(Lco3;)Lom3;

    move-result-object v2

    invoke-interface {v2, p1}, Lom3;->S(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco3$h0;->c(Ljava/lang/String;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

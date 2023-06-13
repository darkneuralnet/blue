.class public final LGL5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGL5;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGL5;


# direct methods
.method public constructor <init>(LGL5;)V
    .locals 0

    iput-object p1, p0, LGL5$c;->g:LGL5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LGL5;)V
    .locals 0

    invoke-static {p0}, LGL5$c;->f(LGL5;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGL5$c;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(LGL5;)V
    .locals 0

    invoke-static {p0}, LGL5$c;->e(LGL5;)V

    return-void
.end method

.method public static final e(LGL5;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LGL5;->access$getRideManager$p(LGL5;)LYR4;

    move-result-object v0

    invoke-static {p0}, LGL5;->access$getRiddenBird(LGL5;)Lco/bird/android/model/wire/WireBird;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, ""

    :cond_1
    sget-object v1, Lco/bird/android/model/PhysicalLockEventKind;->UNLOCKED:Lco/bird/android/model/PhysicalLockEventKind;

    invoke-interface {v0, p0, v1}, LYR4;->h0(Ljava/lang/String;Lco/bird/android/model/PhysicalLockEventKind;)Lio/reactivex/F;

    return-void
.end method

.method public static final f(LGL5;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LGL5;->access$getUi$p(LGL5;)LWL5;

    move-result-object p0

    invoke-interface {p0}, LWL5;->b9()V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LGL5$c;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getRideManager$p(LGL5;)LYR4;

    move-result-object p1

    iget-object v0, p0, LGL5$c;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getRiddenBird(LGL5;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-interface {p1, v0}, LYR4;->x(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LGL5$c;->g:LGL5;

    new-instance v1, LHL5;

    invoke-direct {v1, v0}, LHL5;-><init>(LGL5;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LGL5$c;->g:LGL5;

    new-instance v1, LIL5;

    invoke-direct {v1, v0}, LIL5;-><init>(LGL5;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LGL5$c$a;

    iget-object v1, p0, LGL5$c;->g:LGL5;

    invoke-direct {v0, v1}, LGL5$c$a;-><init>(LGL5;)V

    new-instance v1, LJL5;

    invoke-direct {v1, v0}, LJL5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LGL5$c;->d(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

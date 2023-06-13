.class public final LfS1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfS1;->y(LlS1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfS1;


# direct methods
.method public constructor <init>(LfS1;)V
    .locals 0

    iput-object p1, p0, LfS1$l;->g:LfS1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LfS1$l;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LfS1;)V
    .locals 0

    invoke-static {p0}, LfS1$l;->d(LfS1;)V

    return-void
.end method

.method public static final d(LfS1;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LfS1$l$b;->g:LfS1$l$b;

    invoke-virtual {p0, v0}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LfS1$l;->g:LfS1;

    invoke-static {v0}, LfS1;->access$getOperatorManager$p(LfS1;)Lom3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getBirdId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lom3;->b(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LfS1$l$a;

    iget-object v1, p0, LfS1$l;->g:LfS1;

    invoke-direct {v0, v1}, LfS1$l$a;-><init>(LfS1;)V

    new-instance v1, LhS1;

    invoke-direct {v1, v0}, LhS1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, LfS1$l;->g:LfS1;

    new-instance v1, LiS1;

    invoke-direct {v1, v0}, LiS1;-><init>(LfS1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->r(Lio/reactivex/functions/a;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun consume(ren\u2026e)\n      .subscribe()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {p0, p1}, LfS1$l;->c(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

.class public final LwF4$p$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwF4$p;->c(Lkotlin/Pair;)Lio/reactivex/u;
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
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lkotlin/Unit;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LwF4;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/DialogResponse;


# direct methods
.method public constructor <init>(LwF4;Ljava/lang/String;Lco/bird/android/model/DialogResponse;)V
    .locals 0

    iput-object p1, p0, LwF4$p$b;->g:LwF4;

    iput-object p2, p0, LwF4$p$b;->h:Ljava/lang/String;

    iput-object p3, p0, LwF4$p$b;->i:Lco/bird/android/model/DialogResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LwF4$p$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.method public final b(Lkotlin/Unit;)Lio/reactivex/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LwF4$p$b;->g:LwF4;

    invoke-static {p1}, LwF4;->access$getVehicleServicingManager$p(LwF4;)Lrn6;

    move-result-object p1

    iget-object v0, p0, LwF4$p$b;->h:Ljava/lang/String;

    invoke-interface {p1, v0}, Lrn6;->d(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LwF4$p$b$a;

    iget-object v1, p0, LwF4$p$b;->g:LwF4;

    invoke-direct {v0, v1}, LwF4$p$b$a;-><init>(LwF4;)V

    new-instance v1, LBF4;

    invoke-direct {v1, v0}, LBF4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "fun onCreate(birdId: Str\u2026r.Result.RESULT_OK) }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LwF4$p$b;->g:LwF4;

    invoke-static {v0}, LwF4;->access$getUi$p(LwF4;)LGF4;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LwF4$p$b;->i:Lco/bird/android/model/DialogResponse;

    invoke-static {v0}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->k(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LwF4$p$b;->b(Lkotlin/Unit;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

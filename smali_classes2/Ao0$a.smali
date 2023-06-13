.class public final LAo0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAo0;->onResume()V
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "birdId",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/lang/String;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAo0;


# direct methods
.method public constructor <init>(LAo0;)V
    .locals 0

    iput-object p1, p0, LAo0$a;->g:LAo0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LAo0$a;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAo0$a;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lio/reactivex/h;
    .locals 3

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v1, p0, LAo0$a;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getOperatorManager$p(LAo0;)Lom3;

    move-result-object v1

    invoke-interface {v1, p1}, Lom3;->a(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, LAo0$a$a;->g:LAo0$a$a;

    new-instance v2, Lyo0;

    invoke-direct {v2, v1}, Lyo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->distinct(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v1, "operatorManager.streamBi\u2026tinct { bird -> bird.id }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LAo0$a;->g:LAo0;

    invoke-static {v1}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object v1

    invoke-interface {v1}, Llp0;->B()Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, LAo0$a$b;->g:LAo0$a$b;

    new-instance v1, LAo0$a$c;

    iget-object v2, p0, LAo0$a;->g:LAo0;

    invoke-direct {v1, v2}, LAo0$a$c;-><init>(LAo0;)V

    invoke-static {p1, v0, v1}, LYf5;->F(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lio/reactivex/b;->e:Lio/reactivex/b;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    new-instance v0, LAo0$a$d;

    iget-object v1, p0, LAo0$a;->g:LAo0;

    invoke-direct {v0, v1}, LAo0$a$d;-><init>(LAo0;)V

    new-instance v1, Lzo0;

    invoke-direct {v1, v0}, Lzo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/k;->Z(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LAo0$a;->c(Ljava/lang/String;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

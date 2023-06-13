.class public final Luu4$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luu4;->v(Lzu4;)V
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
        "reservationId",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
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
.field public final synthetic g:Luu4;


# direct methods
.method public constructor <init>(Luu4;)V
    .locals 0

    iput-object p1, p0, Luu4$h;->g:Luu4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Luu4;)V
    .locals 0

    invoke-static {p0}, Luu4$h;->e(Luu4;)V

    return-void
.end method

.method public static synthetic b(Luu4;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Luu4$h;->f(Luu4;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Luu4$h;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Luu4;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEt2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEt2;-><init>(Z)V

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Luu4;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Luu4;->access$getReleaseAssignmentManager$p(Luu4;)Liu4;

    move-result-object p0

    invoke-interface {p0}, Liu4;->o0()Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/String;)Lio/reactivex/h;
    .locals 2

    const-string v0, "reservationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luu4$h;->g:Luu4;

    invoke-static {v0}, Luu4;->access$getReleaseAssignmentManager$p(Luu4;)Liu4;

    move-result-object v0

    invoke-interface {v0, p1}, Liu4;->A0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/c;->U(J)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Luu4$h$a;

    iget-object v1, p0, Luu4$h;->g:Luu4;

    invoke-direct {v0, v1}, Luu4$h$a;-><init>(Luu4;)V

    new-instance v1, Lwu4;

    invoke-direct {v1, v0}, Lwu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Luu4$h;->g:Luu4;

    new-instance v1, Lxu4;

    invoke-direct {v1, v0}, Lxu4;-><init>(Luu4;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Luu4$h;->g:Luu4;

    new-instance v1, Lyu4;

    invoke-direct {v1, v0}, Lyu4;-><init>(Luu4;)V

    invoke-static {v1}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Luu4$h;->d(Ljava/lang/String;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

.class public final LEa4$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEa4;->x(LIa4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LxD1;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LxD1;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(LxD1;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LEa4;


# direct methods
.method public constructor <init>(LEa4;)V
    .locals 0

    iput-object p1, p0, LEa4$g;->g:LEa4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LEa4;)V
    .locals 0

    invoke-static {p0}, LEa4$g;->e(LEa4;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LEa4$g;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LEa4$g;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(LEa4;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzt2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzt2;-><init>(Z)V

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    invoke-static {p0}, LEa4;->access$getPaymentManagerV2$p(LEa4;)LAM3;

    move-result-object v0

    invoke-interface {v0}, LAM3;->e()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lrm1;->a:Lrm1;

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, LmY0;->a:LmY0;

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.method public final d(LxD1;)Lio/reactivex/h;
    .locals 4

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LxD1;->a()I

    move-result v0

    invoke-virtual {p1}, LxD1;->b()Landroid/content/Intent;

    move-result-object p1

    iget-object v1, p0, LEa4$g;->g:LEa4;

    invoke-static {v1}, LEa4;->access$getGooglePayManager$p(LEa4;)LiD1;

    move-result-object v1

    iget-object v2, p0, LEa4$g;->g:LEa4;

    invoke-static {v2}, LEa4;->access$getSource$p(LEa4;)Lco/bird/android/model/PaymentAddSource;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v1, v0, p1, v3, v2}, LiD1;->d(ILandroid/content/Intent;ZLco/bird/android/model/PaymentAddSource;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LEa4$g$a;

    iget-object v1, p0, LEa4$g;->g:LEa4;

    invoke-direct {v0, v1}, LEa4$g$a;-><init>(LEa4;)V

    new-instance v1, LFa4;

    invoke-direct {v1, v0}, LFa4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LEa4$g;->g:LEa4;

    new-instance v1, LGa4;

    invoke-direct {v1, v0}, LGa4;-><init>(LEa4;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LEa4$g$b;

    iget-object v1, p0, LEa4$g;->g:LEa4;

    invoke-direct {v0, v1}, LEa4$g$b;-><init>(LEa4;)V

    new-instance v1, LHa4;

    invoke-direct {v1, v0}, LHa4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LxD1;

    invoke-virtual {p0, p1}, LEa4$g;->d(LxD1;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

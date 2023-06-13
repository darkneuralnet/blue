.class public final LKg6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKg6;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Agreement;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Agreement;",
        "agreement",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/Agreement;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LKg6;


# direct methods
.method public constructor <init>(LKg6;)V
    .locals 0

    iput-object p1, p0, LKg6$b;->g:LKg6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LKg6$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LKg6$b;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

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

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final c(Lco/bird/android/model/Agreement;)Lio/reactivex/h;
    .locals 5

    const-string v0, "agreement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKg6$b;->g:LKg6;

    invoke-virtual {v0}, LKg6;->n()LRg6;

    move-result-object v0

    iget-object v1, p0, LKg6$b;->g:LKg6;

    invoke-virtual {v1}, LKg6;->k()Lg9;

    move-result-object v1

    invoke-virtual {v1}, Lg9;->f()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, LRg6;->setCancelable(Z)V

    iget-object v0, p0, LKg6$b;->g:LKg6;

    invoke-virtual {v0}, LKg6;->n()LRg6;

    move-result-object v1

    invoke-interface {v1}, LRg6;->M0()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v3, LKg6$b$a;

    iget-object v4, p0, LKg6$b;->g:LKg6;

    invoke-direct {v3, v4, p1}, LKg6$b$a;-><init>(LKg6;Lco/bird/android/model/Agreement;)V

    new-instance v4, LLg6;

    invoke-direct {v4, v3}, LLg6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object v1

    new-instance v3, LKg6$b$b;

    iget-object v4, p0, LKg6$b;->g:LKg6;

    invoke-direct {v3, v4, p1}, LKg6$b$b;-><init>(LKg6;Lco/bird/android/model/Agreement;)V

    new-instance p1, LMg6;

    invoke-direct {p1, v3}, LMg6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/p;->x(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    const-string v1, "override fun onCreate() \u2026r)\n      .subscribe()\n  }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v2}, LKg6;->access$onErrorShowRetryDialog(LKg6;Lio/reactivex/p;Z)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Agreement;

    invoke-virtual {p0, p1}, LKg6$b;->c(Lco/bird/android/model/Agreement;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

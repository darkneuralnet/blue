.class public final Lzr0$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0;->V(LXr0;)V
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
        "c",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
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
        "SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$27\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1747#2,3:382\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$27\n*L\n256#1:382,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lzr0;


# direct methods
.method public constructor <init>(Lzr0;)V
    .locals 0

    iput-object p1, p0, Lzr0$s;->g:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lzr0$s;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lzr0;)V
    .locals 0

    invoke-static {p0}, Lzr0$s;->e(Lzr0;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final e(Lzr0;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LvA5;->a:LvA5;

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    new-instance v0, LmA5;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LmA5;-><init>(Z)V

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lzr0$s;->g:Lzr0;

    invoke-static {p1}, Lzr0;->access$getNonRequiredFieldMap$p(Lzr0;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move v2, v1

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    iget-object p1, p0, Lzr0$s;->g:Lzr0;

    new-instance v0, LmA5;

    invoke-direct {v0, v1}, LmA5;-><init>(Z)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lzr0$s;->g:Lzr0;

    invoke-static {p1}, Lzr0;->access$getOperatorManager$p(Lzr0;)Lom3;

    move-result-object p1

    iget-object v0, p0, Lzr0$s;->g:Lzr0;

    invoke-static {v0}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lom3;->A0(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/c;->U(J)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Lzr0$s$a;

    iget-object v1, p0, Lzr0$s;->g:Lzr0;

    invoke-direct {v0, v1}, Lzr0$s$a;-><init>(Lzr0;)V

    new-instance v1, LNr0;

    invoke-direct {v1, v0}, LNr0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_1
    iget-object v0, p0, Lzr0$s;->g:Lzr0;

    new-instance v1, LOr0;

    invoke-direct {v1, v0}, LOr0;-><init>(Lzr0;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lzr0$s;->c(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

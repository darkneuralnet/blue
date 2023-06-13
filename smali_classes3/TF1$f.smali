.class public final LTF1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTF1;-><init>(LUF1;Lcom/uber/autodispose/ScopeProvider;LDQ3;Le13;Liy6;LXF1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/api/response/HardCountResponse;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/lang/String;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0008\u001ab\u0012*\u0008\u0001\u0012&\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*0\u0012*\u0008\u0001\u0012&\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/api/response/HardCountResponse;",
        "hardCountSessionOptional",
        "Lio/reactivex/u;",
        "Lkotlin/Pair;",
        "",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/buava/Optional;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTF1;


# direct methods
.method public constructor <init>(LTF1;)V
    .locals 0

    iput-object p1, p0, LTF1$f;->g:LTF1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lio/reactivex/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/HardCountResponse;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "hardCountSessionOptional"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, LTF1$f;->g:LTF1;

    invoke-static {p1}, LTF1;->access$showNoHardCountSessionWarning(LTF1;)V

    iget-object p1, p0, LTF1$f;->g:LTF1;

    invoke-static {p1}, LTF1;->access$getUi$p(LTF1;)LUF1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LUF1;->o8(Z)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/HardCountResponse;

    invoke-virtual {v0}, Lco/bird/api/response/HardCountResponse;->getExpectedQuantity()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/HardCountResponse;

    invoke-virtual {p1}, Lco/bird/api/response/HardCountResponse;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LTF1$f;->g:LTF1;

    invoke-static {v1}, LTF1;->access$getHardCountManager$p(LTF1;)LXF1;

    move-result-object v1

    invoke-interface {v1, p1}, LXF1;->b(Ljava/lang/String;)V

    iget-object v1, p0, LTF1$f;->g:LTF1;

    invoke-static {v1}, LTF1;->access$getHardCountManager$p(LTF1;)LXF1;

    move-result-object v1

    invoke-interface {v1, p1}, LXF1;->a(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/c;->k(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LTF1$f;->a(Lco/bird/android/buava/Optional;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

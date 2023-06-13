.class public final Lf64$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf64;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "LTk5;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\n\u001a\u00020\u00012\u00b7\u0001\u0010\t\u001a\u00b2\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00060\u0006 \u0002*X\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "LRe4;",
        "",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/buava/Optional;",
        "",
        "",
        "LTk5;",
        "Lco/bird/android/model/persistence/Bird;",
        "<name for destructuring parameter 0>",
        "a",
        "(LRe4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lf64;


# direct methods
.method public constructor <init>(Lf64;)V
    .locals 0

    iput-object p1, p0, Lf64$o;->g:Lf64;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lkotlin/Unit;",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;+",
            "Ljava/util/List<",
            "+",
            "LTk5;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-nez v0, :cond_2

    move v3, v1

    :cond_2
    iget-object v0, p0, Lf64$o;->g:Lf64;

    invoke-static {v0}, Lf64;->access$getRxBleBirdManager$p(Lf64;)Lrd5;

    move-result-object v0

    invoke-interface {v0}, Lrd5;->c()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lf64$o;->g:Lf64;

    invoke-static {v1}, Lf64;->access$getOverviewUi$p(Lf64;)Lj64;

    move-result-object v1

    iget-object v4, p0, Lf64$o;->g:Lf64;

    invoke-static {v4}, Lf64;->access$getConverter$p(Lf64;)LL54;

    move-result-object v4

    const-string v5, "privateBirds"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "nearbyBirdVehicles"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3, v0, p1, v2}, LL54;->b(ZLjava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj64;->b(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, Lf64$o;->a(LRe4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.class public final LQY2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a3\u0010\u0005\u001a\u00020\u00042\"\u0010\u0003\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Ld13;",
        "LHY2;",
        "navigators",
        "LOY2;",
        "a",
        "([Ld13;LEt0;I)LOY2;",
        "navigation-animation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a([Ld13;LEt0;I)LOY2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ld13<",
            "+",
            "LHY2;",
            ">;",
            "LEt0;",
            "I)",
            "LOY2;"
        }
    .end annotation

    const-string v0, "navigators"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1eaed2fa

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.google.accompanist.navigation.animation.rememberAnimatedNavController (NavHostController.kt:35)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p2, -0x1d58f75c

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    new-instance p2, LLe;

    invoke-direct {p2}, LLe;-><init>()V

    invoke-interface {p1, p2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p2, LLe;

    new-instance v0, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result p0

    new-array p0, p0, [Ld13;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ld13;

    const/16 p2, 0x8

    invoke-static {p0, p1, p2}, LPY2;->e([Ld13;LEt0;I)LOY2;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method

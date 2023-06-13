.class public final LK20;
.super LA20;
.source "SourceFile"

# interfaces
.implements LoV2;
.implements LC20;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LA20;",
        "LoV2<",
        "LC20;",
        ">;",
        "LC20;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "LK20;",
        "LA20;",
        "LoV2;",
        "LC20;",
        "Lnm2;",
        "childCoordinates",
        "Lkotlin/Function0;",
        "LOs4;",
        "boundsProvider",
        "",
        "a",
        "(Lnm2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LI20;",
        "e",
        "LI20;",
        "k",
        "()LI20;",
        "m",
        "(LI20;)V",
        "responder",
        "LV94;",
        "getKey",
        "()LV94;",
        "key",
        "l",
        "()LC20;",
        "value",
        "defaultParent",
        "<init>",
        "(LC20;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"
    }
.end annotation


# instance fields
.field public e:LI20;


# direct methods
.method public constructor <init>(LC20;)V
    .locals 1

    const-string v0, "defaultParent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LA20;-><init>(LC20;)V

    return-void
.end method

.method public static final synthetic h(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)LOs4;
    .locals 0

    invoke-static {p0, p1, p2}, LK20;->j(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)LOs4;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)LOs4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK20;",
            "Lnm2;",
            "Lkotlin/jvm/functions/Function0<",
            "LOs4;",
            ">;)",
            "LOs4;"
        }
    .end annotation

    invoke-virtual {p0}, LA20;->b()Lnm2;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Lnm2;->F()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    return-object v0

    :cond_2
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LOs4;

    if-nez p2, :cond_3

    return-object v0

    :cond_3
    invoke-static {p0, p1, p2}, LJ20;->a(Lnm2;Lnm2;LOs4;)LOs4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lnm2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnm2;",
            "Lkotlin/jvm/functions/Function0<",
            "LOs4;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v4, LK20$b;

    invoke-direct {v4, p0, p1, p2}, LK20$b;-><init>(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)V

    new-instance v6, LK20$a;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, LK20$a;-><init>(LK20;Lnm2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    invoke-static {v6, p3}, LaD0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public getKey()LV94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LV94<",
            "LC20;",
            ">;"
        }
    .end annotation

    invoke-static {}, LB20;->a()LV94;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK20;->l()LC20;

    move-result-object v0

    return-object v0
.end method

.method public final k()LI20;
    .locals 1

    iget-object v0, p0, LK20;->e:LI20;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "responder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()LC20;
    .locals 0

    return-object p0
.end method

.method public final m(LI20;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LK20;->e:LI20;

    return-void
.end method

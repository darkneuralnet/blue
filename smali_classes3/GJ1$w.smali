.class public final LGJ1$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGJ1;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LcJ1$b;",
        "Lio/reactivex/u<",
        "+",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LcJ1$b;",
        "result",
        "Lio/reactivex/u;",
        "Landroid/net/Uri;",
        "kotlin.jvm.PlatformType",
        "f",
        "(LcJ1$b;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGJ1;


# direct methods
.method public constructor <init>(LGJ1;)V
    .locals 0

    iput-object p1, p0, LGJ1$w;->g:LGJ1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LGJ1$w;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LGJ1;)V
    .locals 0

    invoke-static {p0}, LGJ1$w;->i(LGJ1;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGJ1$w;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGJ1$w;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGJ1$w;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final i(LGJ1;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LGJ1;->access$isAutoDetecting$p(LGJ1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final f(LcJ1$b;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcJ1$b;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handling result "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LGJ1$w;->g:LGJ1;

    invoke-static {v0}, LGJ1;->access$getItemLease$p(LGJ1;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "itemLease"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {p1, v0}, LKi1;->g(LcJ1$b;Lco/bird/android/model/itemlease/ItemLease;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, LGJ1$w;->g:LGJ1;

    invoke-static {p1}, LGJ1;->access$getUi$p(LGJ1;)LSJ1;

    move-result-object p1

    iget-object v0, p0, LGJ1$w;->g:LGJ1;

    invoke-static {v0}, LGJ1;->access$getItemLeaseManager$p(LGJ1;)LMc2;

    move-result-object v0

    invoke-interface {v0}, LMc2;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cap"

    const-string v2, ".jpg"

    invoke-virtual {p1, v0, v1, v2}, LSJ1;->cm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LGJ1$w$a;

    iget-object v1, p0, LGJ1$w;->g:LGJ1;

    invoke-direct {v0, v1}, LGJ1$w$a;-><init>(LGJ1;)V

    new-instance v1, LMJ1;

    invoke-direct {v1, v0}, LMJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LGJ1$w$b;

    iget-object v1, p0, LGJ1$w;->g:LGJ1;

    invoke-direct {v0, v1}, LGJ1$w$b;-><init>(LGJ1;)V

    new-instance v1, LNJ1;

    invoke-direct {v1, v0}, LNJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, LKi1;->c(LcJ1$b;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, LKi1;->b(LcJ1$b;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LGJ1$w;->g:LGJ1;

    invoke-static {p1}, LGJ1;->access$getUi$p(LGJ1;)LSJ1;

    move-result-object p1

    sget-object v0, LfJ1;->d:LfJ1;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, LXC;->birdDialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LGJ1$w$c;

    iget-object v1, p0, LGJ1$w;->g:LGJ1;

    invoke-direct {v0, v1}, LGJ1$w$c;-><init>(LGJ1;)V

    new-instance v1, LOJ1;

    invoke-direct {v1, v0}, LOJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, LGJ1$w;->g:LGJ1;

    new-instance v1, LPJ1;

    invoke-direct {v1, v0}, LPJ1;-><init>(LGJ1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->r(Lio/reactivex/functions/a;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LGJ1$w$d;->g:LGJ1$w$d;

    new-instance v1, LQJ1;

    invoke-direct {v1, v0}, LQJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/p;->J()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LcJ1$b;

    invoke-virtual {p0, p1}, LGJ1$w;->f(LcJ1$b;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

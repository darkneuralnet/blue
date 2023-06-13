.class public final LqI3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqI3;->r(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Z)V
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
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WirePart;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "raw",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/wire/WirePart;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/String;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/PartKind;

.field public final synthetic h:LqI3;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/PartKind;LqI3;Z)V
    .locals 0

    iput-object p1, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    iput-object p2, p0, LqI3$c;->h:LqI3;

    iput-boolean p3, p0, LqI3$c;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LqI3;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LqI3$c;->f(LqI3;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WirePart;
    .locals 0

    invoke-static {p0, p1}, LqI3$c;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WirePart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LqI3;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LqI3$c;->e(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LqI3;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WirePart;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WirePart;

    return-object p0
.end method

.method public static final e(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LqI3;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;
    .locals 7

    const-string v0, "$kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$raw"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    if-eq p0, v0, :cond_1

    if-nez p1, :cond_1

    invoke-static {p2, p4}, LqI3;->access$getCode(LqI3;Ljava/lang/Throwable;)I

    move-result p1

    const/16 p2, 0x190

    const/4 v0, 0x0

    if-gt p2, p1, :cond_0

    const/16 p2, 0x1f4

    if-ge p1, p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    new-instance p1, Lco/bird/android/model/wire/WirePart;

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p1

    move-object v3, p0

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WirePart;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    throw p4
.end method

.method public static final f(LqI3;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$raw"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p3}, LqI3;->access$getCode(LqI3;Ljava/lang/Throwable;)I

    move-result p0

    const/16 v0, 0x190

    const/4 v1, 0x0

    if-gt v0, p0, :cond_0

    const/16 v0, 0x1f4

    if-ge p0, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    new-instance p0, Lco/bird/android/model/wire/WirePart;

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lco/bird/android/model/wire/WirePart;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    throw p3
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LqI3;->h:LqI3$a;

    invoke-virtual {v0}, LqI3$a;->a()Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LJt4;->a:LJt4;

    invoke-virtual {v1, p1}, LJt4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LJt4;->a:LJt4;

    invoke-virtual {v1, p1}, LJt4;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0}, LqI3$a;->b()Ljava/util/Set;

    move-result-object v2

    iget-object v3, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    iget-object v0, p0, LqI3$c;->h:LqI3;

    invoke-static {v0}, LqI3;->access$getStickerManager$p(LqI3;)LNQ5;

    move-result-object v0

    invoke-interface {v0, v1}, LNQ5;->b(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, LqI3$c;->h:LqI3;

    invoke-static {v0}, LqI3;->access$getStickerManager$p(LqI3;)LNQ5;

    move-result-object v0

    invoke-interface {v0, p1}, LNQ5;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    iget-object v2, p0, LqI3$c;->h:LqI3;

    invoke-virtual {v2}, LqI3;->getUi()LjE;

    move-result-object v2

    invoke-static {v0, v2, v5, v4, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v2, LqI3$c$a;

    iget-object v3, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    invoke-direct {v2, v3}, LqI3$c$a;-><init>(Lco/bird/android/model/constant/PartKind;)V

    new-instance v3, LrI3;

    invoke-direct {v3, v2}, LrI3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    iget-object v2, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    iget-object v3, p0, LqI3$c;->h:LqI3;

    new-instance v4, LsI3;

    invoke-direct {v4, v2, v1, v3, p1}, LsI3;-><init>(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LqI3;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lio/reactivex/F;->Q(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, LqI3$a;->a()Ljava/util/Set;

    move-result-object v0

    iget-object v2, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lco/bird/android/model/wire/WirePart;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v1

    :goto_2
    invoke-direct {v0, v2, v3, p1}, Lco/bird/android/model/wire/WirePart;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :cond_4
    iget-object v0, p0, LqI3$c;->h:LqI3;

    invoke-static {v0}, LqI3;->access$getBirdPartManager$p(LqI3;)LSM;

    move-result-object v0

    iget-object v1, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    iget-boolean v2, p0, LqI3$c;->i:Z

    invoke-interface {v0, p1, v1, v2}, LSM;->d(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Z)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LqI3$c;->h:LqI3;

    invoke-virtual {v1}, LqI3;->getUi()LjE;

    move-result-object v1

    invoke-static {v0, v1, v5, v4, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LqI3$c;->h:LqI3;

    iget-object v2, p0, LqI3$c;->g:Lco/bird/android/model/constant/PartKind;

    new-instance v3, LtI3;

    invoke-direct {v3, v1, v2, p1}, LtI3;-><init>(LqI3;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->Q(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LqI3$c;->invoke(Ljava/lang/String;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

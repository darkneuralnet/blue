.class public final LJz6$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJz6;-><init>(Landroid/content/Context;Lsu2;)V
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
        "name",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "e",
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
.field public final synthetic g:LJz6;


# direct methods
.method public constructor <init>(LJz6;)V
    .locals 0

    iput-object p1, p0, LJz6$a;->g:LJz6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJz6$a;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJz6$a;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJz6$a;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lvz6;Lvz6;)I
    .locals 0

    invoke-static {p0, p1}, LJz6$a;->f(Lvz6;Lvz6;)I

    move-result p0

    return p0
.end method

.method public static final f(Lvz6;Lvz6;)I
    .locals 0

    invoke-virtual {p0}, Lvz6;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lvz6;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
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

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;)Lio/reactivex/h;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJz6$a;->g:LJz6;

    invoke-static {v0}, LJz6;->access$getMutableWebArchives$p(LJz6;)La94;

    move-result-object v0

    iget-object v1, p0, LJz6$a;->g:LJz6;

    sget-object v2, LNz6;->c:LNz6;

    invoke-virtual {v1, p1, v2}, LJz6;->k(Ljava/lang/String;LNz6;)Lvz6;

    move-result-object v1

    new-instance v2, LEz6;

    invoke-direct {v2}, LEz6;-><init>()V

    invoke-static {v0, v1, v2}, Lb94;->b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V

    iget-object v0, p0, LJz6$a;->g:LJz6;

    invoke-static {v0}, LJz6;->access$getLocalAssetManager$p(LJz6;)Lsu2;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/AssetManagerType;->WEB_ARCHIVE:Lco/bird/android/model/constant/AssetManagerType;

    sget-object v2, Lco/bird/android/model/constant/TaskPriority;->BACKGROUND:Lco/bird/android/model/constant/TaskPriority;

    invoke-interface {v0, p1, v1, v2}, Lsu2;->a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LJz6$a$a;

    iget-object v2, p0, LJz6$a;->g:LJz6;

    invoke-direct {v1, v2}, LJz6$a$a;-><init>(LJz6;)V

    new-instance v2, LFz6;

    invoke-direct {v2, v1}, LFz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LJz6$a$b;

    iget-object v2, p0, LJz6$a;->g:LJz6;

    invoke-direct {v1, v2, p1}, LJz6$a$b;-><init>(LJz6;Ljava/lang/String;)V

    new-instance p1, LGz6;

    invoke-direct {p1, v1}, LGz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LJz6$a$c;

    iget-object v1, p0, LJz6$a;->g:LJz6;

    invoke-direct {v0, v1}, LJz6$a$c;-><init>(LJz6;)V

    new-instance v1, LHz6;

    invoke-direct {v1, v0}, LHz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LJz6$a;->e(Ljava/lang/String;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

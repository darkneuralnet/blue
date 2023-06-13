.class public final LUS1$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUS1;->m(Landroid/content/Context;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lg32;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "LUS1$c;",
        "+",
        "Lco/bird/android/model/RequirementsResult;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lg32;",
        "image",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "LUS1$c;",
        "Lco/bird/android/model/RequirementsResult;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lg32;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LUS1;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LUS1$c;",
            "Lco/bird/android/model/RequirementsResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LUS1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUS1;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LUS1$c;",
            "Lco/bird/android/model/RequirementsResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LUS1$d;->g:LUS1;

    iput-object p2, p0, LUS1$d;->h:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LUS1$c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LUS1$d;->d(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LUS1$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LUS1$d;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LUS1$c;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LUS1$c;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final c(Lg32;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "LUS1$c;",
            "Lco/bird/android/model/RequirementsResult;",
            ">;>;"
        }
    .end annotation

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUS1$d;->g:LUS1;

    invoke-static {v0, p1}, LUS1;->access$processText(LUS1;Lg32;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LUS1$d;->g:LUS1;

    invoke-static {v1, p1}, LUS1;->access$processFace(LUS1;Lg32;)Lio/reactivex/F;

    move-result-object v1

    iget-object v2, p0, LUS1$d;->g:LUS1;

    invoke-static {v2, p1}, LUS1;->access$processObject(LUS1;Lg32;)Lio/reactivex/F;

    move-result-object v2

    new-instance v3, LUS1$d$a;

    iget-object v4, p0, LUS1$d;->g:LUS1;

    invoke-direct {v3, p1, v4}, LUS1$d$a;-><init>(Lg32;LUS1;)V

    new-instance p1, LVS1;

    invoke-direct {p1, v3}, LVS1;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-static {v0, v1, v2, p1}, Lio/reactivex/F;->q0(Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/K;Lio/reactivex/functions/h;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LUS1$d$b;

    iget-object v1, p0, LUS1$d;->h:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1}, LUS1$d$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, LWS1;

    invoke-direct {v1, v0}, LWS1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg32;

    invoke-virtual {p0, p1}, LUS1$d;->c(Lg32;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

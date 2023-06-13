.class public final LaO4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaO4;->d(Lio/reactivex/k;)Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lna4<",
        "+",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "throwable",
        "Lna4;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/Throwable;)Lna4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LaO4;


# direct methods
.method public constructor <init>(LaO4;)V
    .locals 0

    iput-object p1, p0, LaO4$a;->g:LaO4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, LaO4$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Lna4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lna4<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LaO4$a;->g:LaO4;

    invoke-static {v0}, LaO4;->access$getPredicate$p(LaO4;)Lio/reactivex/functions/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/reactivex/functions/q;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LaO4$a;->g:LaO4;

    invoke-static {v0}, LaO4;->access$getMaxAttempts$p(LaO4;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, LaO4$a;->g:LaO4;

    invoke-static {v0}, LaO4;->access$getRetryCount$p(LaO4;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, LaO4;->access$setRetryCount$p(LaO4;I)V

    invoke-static {v0}, LaO4;->access$getRetryCount$p(LaO4;)I

    move-result v0

    iget-object v1, p0, LaO4$a;->g:LaO4;

    invoke-static {v1}, LaO4;->access$getMaxAttempts$p(LaO4;)I

    move-result v1

    if-ge v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, LaO4$a;->g:LaO4;

    invoke-static {v0}, LaO4;->access$getDelaySeconds$p(LaO4;)I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, LaO4$a;->g:LaO4;

    invoke-static {v3}, LaO4;->access$getScheduler$p(LaO4;)Lio/reactivex/E;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lio/reactivex/k;->p1(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, LaO4$a$a;

    iget-object v2, p0, LaO4$a;->g:LaO4;

    invoke-direct {v1, v2, p1}, LaO4$a$a;-><init>(LaO4;Ljava/lang/Throwable;)V

    new-instance p1, LZN4;

    invoke-direct {p1, v1}, LZN4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/k;->W(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/k;->Q(Ljava/lang/Throwable;)Lio/reactivex/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LaO4$a;->b(Ljava/lang/Throwable;)Lna4;

    move-result-object p1

    return-object p1
.end method

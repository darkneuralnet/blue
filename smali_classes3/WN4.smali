.class public final LWN4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lio/reactivex/Observable<",
        "+",
        "Ljava/lang/Throwable;",
        ">;",
        "Lio/reactivex/Observable<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u001a\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0001B7\u0012\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00030\u0006\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001c\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\t\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00030\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000cR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "LWN4;",
        "Lio/reactivex/functions/o;",
        "Lio/reactivex/Observable;",
        "",
        "attempts",
        "d",
        "Lio/reactivex/functions/q;",
        "b",
        "Lio/reactivex/functions/q;",
        "predicate",
        "",
        "c",
        "I",
        "maxAttempts",
        "delaySeconds",
        "Lio/reactivex/E;",
        "e",
        "Lio/reactivex/E;",
        "scheduler",
        "f",
        "retryCount",
        "<init>",
        "(Lio/reactivex/functions/q;IILio/reactivex/E;)V",
        "rx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/functions/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I

.field public final e:Lio/reactivex/E;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, LWN4;-><init>(Lio/reactivex/functions/q;IILio/reactivex/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/reactivex/functions/q;IILio/reactivex/E;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;II",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWN4;->b:Lio/reactivex/functions/q;

    iput p2, p0, LWN4;->c:I

    iput p3, p0, LWN4;->d:I

    iput-object p4, p0, LWN4;->e:Lio/reactivex/E;

    const/4 p1, 0x0

    iput p1, p0, LWN4;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Lio/reactivex/functions/q;IILio/reactivex/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    new-instance p1, LTN4;

    invoke-direct {p1}, LTN4;-><init>()V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, -0x1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p4

    const-string p5, "computation()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, LWN4;-><init>(Lio/reactivex/functions/q;IILio/reactivex/E;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LWN4;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDelaySeconds$p(LWN4;)I
    .locals 0

    iget p0, p0, LWN4;->d:I

    return p0
.end method

.method public static final synthetic access$getMaxAttempts$p(LWN4;)I
    .locals 0

    iget p0, p0, LWN4;->c:I

    return p0
.end method

.method public static final synthetic access$getPredicate$p(LWN4;)Lio/reactivex/functions/q;
    .locals 0

    iget-object p0, p0, LWN4;->b:Lio/reactivex/functions/q;

    return-object p0
.end method

.method public static final synthetic access$getRetryCount$p(LWN4;)I
    .locals 0

    iget p0, p0, LWN4;->f:I

    return p0
.end method

.method public static final synthetic access$getScheduler$p(LWN4;)Lio/reactivex/E;
    .locals 0

    iget-object p0, p0, LWN4;->e:Lio/reactivex/E;

    return-object p0
.end method

.method public static final synthetic access$setRetryCount$p(LWN4;I)V
    .locals 0

    iput p1, p0, LWN4;->f:I

    return-void
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-static {p0}, LWN4;->c(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static final c(Ljava/lang/Throwable;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/Observable;

    invoke-virtual {p0, p1}, LWN4;->d(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public d(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/Observable<",
            "*>;"
        }
    .end annotation

    const-string v0, "attempts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWN4$a;

    invoke-direct {v0, p0}, LWN4$a;-><init>(LWN4;)V

    new-instance v1, LUN4;

    invoke-direct {v1, v0}, LUN4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "override fun apply(attem\u2026le)\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

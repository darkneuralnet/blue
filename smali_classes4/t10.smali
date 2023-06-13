.class public final Lt10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq10;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016J\u0008\u0010\u0013\u001a\u00020\u0004H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lt10;",
        "Lq10;",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "Lio/reactivex/c;",
        "l0",
        "Lio/reactivex/Observable;",
        "",
        "V",
        "",
        "birdId",
        "E0",
        "h0",
        "imei",
        "",
        "status",
        "U",
        "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;",
        "B0",
        "clear",
        "Lj10;",
        "a",
        "Lj10;",
        "brainClient",
        "Ll10;",
        "b",
        "Ll10;",
        "brainSwapDao",
        "<init>",
        "(Lj10;Ll10;)V",
        "co.bird.android.repository.brain-swap"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lj10;

.field public final b:Ll10;


# direct methods
.method public constructor <init>(Lj10;Ll10;)V
    .locals 1

    const-string v0, "brainClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brainSwapDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt10;->a:Lj10;

    iput-object p2, p0, Lt10;->b:Ll10;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lt10;->K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getBrainSwapDao$p(Lt10;)Ll10;
    .locals 0

    iget-object p0, p0, Lt10;->b:Ll10;

    return-object p0
.end method


# virtual methods
.method public B0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "imei"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt10;->a:Lj10;

    invoke-interface {v0, p1}, Lj10;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lt10$a;

    invoke-direct {v1, p0, p1}, Lt10$a;-><init>(Lt10;Ljava/lang/String;)V

    new-instance p1, Lr10;

    invoke-direct {p1, v1}, Lr10;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun queryBrainS\u2026}\n          }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public E0(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt10;->b:Ll10;

    invoke-virtual {v0, p1}, Ll10;->d(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public U(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;
    .locals 1

    const-string v0, "imei"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt10;->b:Ll10;

    invoke-virtual {v0, p1, p2}, Ll10;->g(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public V()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt10;->b:Ll10;

    invoke-virtual {v0}, Ll10;->f()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, Lt10;->b:Ll10;

    invoke-virtual {v0}, Ll10;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public h0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt10;->b:Ll10;

    invoke-virtual {v0, p1}, Ll10;->c(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public l0(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;
    .locals 3

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt10;->b:Ll10;

    const/4 v1, 0x1

    new-array v1, v1, [Lco/bird/android/model/persistence/BrainSwapRecord;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Ll10;->b([Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

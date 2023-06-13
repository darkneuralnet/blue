.class public final Lbd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LpI4;
.implements Ljava/util/concurrent/Future;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbd0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LpI4;",
        "Ljava/util/concurrent/Future<",
        "LFM4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 T2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001XJ\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u001b\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0096\u0001J\u001b\u0010\u000f\u001a\u000c\u0012\u0004\u0012\u00020\u00040\rj\u0002`\u000e2\u0006\u0010\u000c\u001a\u00020\u0004H\u0096\u0003J\u0019\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001J\u001d\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0096\u0001JE\u0010\u001f\u001a\u00020\u00012:\u0010\u001e\u001a6\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001b\u0012\u0004\u0012\u00020\u001c0\u0016j\u0002`\u001dH\u0096\u0001J1\u0010%\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!0 j\u0008\u0012\u0004\u0012\u00020\"`$H\u0096\u0001JE\u0010&\u001a\u00020\u00012:\u0010\u001e\u001a6\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001b\u0012\u0004\u0012\u00020\u001c0\u0016j\u0002`\u001dH\u0096\u0001J\u0011\u0010)\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0096\u0001J\u0011\u0010+\u001a\n **\u0004\u0018\u00010\u00030\u0003H\u0096\u0001J)\u0010.\u001a\n **\u0004\u0018\u00010\u00030\u00032\u0006\u0010(\u001a\u00020\u00172\u000e\u0010-\u001a\n **\u0004\u0018\u00010,0,H\u0096\u0003J\t\u0010/\u001a\u00020\'H\u0096\u0001J\t\u00100\u001a\u00020\'H\u0096\u0001R\u001a\u00105\u001a\u00020\u00008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u0014\u00108\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<R$\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010=j\u0002`>8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@R\u001c\u0010F\u001a\u00020B8\u0016@\u0016X\u0096\u000f\u00a2\u0006\u000c\u001a\u0004\u00086\u0010C\"\u0004\u0008D\u0010ER\u0014\u0010J\u001a\u00020G8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u0014\u0010N\u001a\u00020K8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010MR4\u0010V\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100P0Oj\u0002`Q8\u0016@\u0016X\u0096\u000f\u00a2\u0006\u000c\u001a\u0004\u0008R\u0010S\"\u0004\u0008T\u0010UR\u001c\u0010[\u001a\u00020W8\u0016@\u0016X\u0096\u000f\u00a2\u0006\u000c\u001a\u0004\u0008X\u0010Y\"\u0004\u00081\u0010Z\u00a8\u0006\\"
    }
    d2 = {
        "Lbd0;",
        "LpI4;",
        "Ljava/util/concurrent/Future;",
        "LFM4;",
        "",
        "toString",
        "LOY;",
        "body",
        "l",
        "Ljava/nio/charset/Charset;",
        "charset",
        "d",
        "header",
        "",
        "Lcom/github/kittinunf/fuel/core/HeaderValues;",
        "get",
        "",
        "value",
        "i",
        "",
        "map",
        "g",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "readBytes",
        "totalBytes",
        "",
        "Lcom/github/kittinunf/fuel/core/ProgressCallback;",
        "handler",
        "e",
        "Lkotlin/Triple;",
        "LaN4;",
        "",
        "Lcom/github/kittinunf/fuel/core/FuelError;",
        "Lcom/github/kittinunf/fuel/core/ResponseResultOf;",
        "h",
        "j",
        "",
        "p0",
        "cancel",
        "kotlin.jvm.PlatformType",
        "r",
        "Ljava/util/concurrent/TimeUnit;",
        "p1",
        "s",
        "isCancelled",
        "isDone",
        "b",
        "Lbd0;",
        "t",
        "()Lbd0;",
        "request",
        "c",
        "LpI4;",
        "wrapped",
        "Ljava/util/concurrent/Future;",
        "future",
        "n",
        "()LOY;",
        "",
        "Lcom/github/kittinunf/fuel/core/RequestFeatures;",
        "k",
        "()Ljava/util/Map;",
        "enabledFeatures",
        "LII4;",
        "()LII4;",
        "p",
        "(LII4;)V",
        "executionOptions",
        "LLH1;",
        "getHeaders",
        "()LLH1;",
        "headers",
        "LWT2;",
        "m",
        "()LWT2;",
        "method",
        "",
        "Lkotlin/Pair;",
        "Lcom/github/kittinunf/fuel/core/Parameters;",
        "getParameters",
        "()Ljava/util/List;",
        "f",
        "(Ljava/util/List;)V",
        "parameters",
        "Ljava/net/URL;",
        "a",
        "()Ljava/net/URL;",
        "(Ljava/net/URL;)V",
        "url",
        "fuel"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Lbd0$a;


# instance fields
.field public final b:Lbd0;

.field public final c:LpI4;

.field public final d:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "LFM4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbd0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbd0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbd0;->f:Lbd0$a;

    const-class v0, Lbd0;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CancellableRequest::class.java.canonicalName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lbd0;->e:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic q()Ljava/lang/String;
    .locals 1

    sget-object v0, Lbd0;->e:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->a()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/net/URL;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->b(Ljava/net/URL;)V

    return-void
.end method

.method public c()LII4;
    .locals 1

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->c()LII4;

    move-result-object v0

    return-object v0
.end method

.method public cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lbd0;->d:Ljava/util/concurrent/Future;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/String;Ljava/nio/charset/Charset;)LpI4;
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1, p2}, LpI4;->d(Ljava/lang/String;Ljava/nio/charset/Charset;)LpI4;

    move-result-object p1

    return-object p1
.end method

.method public e(Lkotlin/jvm/functions/Function2;)LpI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;)",
            "LpI4;"
        }
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->e(Lkotlin/jvm/functions/Function2;)LpI4;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->f(Ljava/util/List;)V

    return-void
.end method

.method public g(Ljava/util/Map;)LpI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "LpI4;"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->g(Ljava/util/Map;)LpI4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbd0;->r()LFM4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lbd0;->s(JLjava/util/concurrent/TimeUnit;)LFM4;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/String;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->get(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public getHeaders()LLH1;
    .locals 1

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->getHeaders()LLH1;

    move-result-object v0

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->getParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getRequest()LpI4;
    .locals 1

    invoke-virtual {p0}, Lbd0;->t()Lbd0;

    move-result-object v0

    return-object v0
.end method

.method public h()Lkotlin/Triple;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Triple<",
            "LpI4;",
            "LFM4;",
            "LaN4<",
            "[B",
            "Lcom/github/kittinunf/fuel/core/FuelError;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->h()Lkotlin/Triple;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/String;Ljava/lang/Object;)LpI4;
    .locals 1

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1, p2}, LpI4;->i(Ljava/lang/String;Ljava/lang/Object;)LpI4;

    move-result-object p1

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lbd0;->d:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-object v0, p0, Lbd0;->d:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method

.method public j(Lkotlin/jvm/functions/Function2;)LpI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;)",
            "LpI4;"
        }
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->j(Lkotlin/jvm/functions/Function2;)LpI4;

    move-result-object p1

    return-object p1
.end method

.method public k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LpI4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->k()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public l(LOY;)LpI4;
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->l(LOY;)LpI4;

    move-result-object p1

    return-object p1
.end method

.method public m()LWT2;
    .locals 1

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->m()LWT2;

    move-result-object v0

    return-object v0
.end method

.method public n()LOY;
    .locals 1

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0}, LpI4;->n()LOY;

    move-result-object v0

    return-object v0
.end method

.method public p(LII4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd0;->c:LpI4;

    invoke-interface {v0, p1}, LpI4;->p(LII4;)V

    return-void
.end method

.method public r()LFM4;
    .locals 1

    iget-object v0, p0, Lbd0;->d:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFM4;

    return-object v0
.end method

.method public s(JLjava/util/concurrent/TimeUnit;)LFM4;
    .locals 1

    iget-object v0, p0, Lbd0;->d:Ljava/util/concurrent/Future;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFM4;

    return-object p1
.end method

.method public t()Lbd0;
    .locals 1

    iget-object v0, p0, Lbd0;->b:Lbd0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cancellable[\n\r\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbd0;->c:LpI4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n\r] done="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbd0;->isDone()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " cancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbd0;->isCancelled()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

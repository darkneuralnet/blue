.class public LRe5$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe5$d;->d(Lx80;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Ljava/lang/Throwable;",
        "Lio/reactivex/B;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lx80;

.field public final synthetic c:LRe5$d;


# direct methods
.method public constructor <init>(LRe5$d;Lx80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LRe5$d$a;->c:LRe5$d;

    iput-object p2, p0, LRe5$d$a;->b:Lx80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 2

    iget-object v0, p0, LRe5$d$a;->c:LRe5$d;

    invoke-static {v0}, LRe5$d;->c(LRe5$d;)LMN4;

    move-result-object v0

    iget-object v1, p0, LRe5$d$a;->b:Lx80;

    invoke-interface {v1}, Lx80;->request()Lokhttp3/Request;

    move-result-object v1

    invoke-static {v0, p1, v1}, LRe5;->d(LMN4;Ljava/lang/Throwable;Lokhttp3/Request;)Lco/bird/api/error/RetrofitException;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LRe5$d$a;->a(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

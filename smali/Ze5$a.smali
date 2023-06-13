.class public LZe5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe5;->b(LEb5;[Ljava/lang/String;)Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/n<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:[Ljava/lang/String;

.field public final synthetic b:LEb5;


# direct methods
.method public constructor <init>([Ljava/lang/String;LEb5;)V
    .locals 0

    iput-object p1, p0, LZe5$a;->a:[Ljava/lang/String;

    iput-object p2, p0, LZe5$a;->b:LEb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/m<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, LZe5$a$a;

    iget-object v1, p0, LZe5$a;->a:[Ljava/lang/String;

    invoke-direct {v0, p0, v1, p1}, LZe5$a$a;-><init>(LZe5$a;[Ljava/lang/String;Lio/reactivex/m;)V

    invoke-interface {p1}, Lio/reactivex/m;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LZe5$a;->b:LEb5;

    invoke-virtual {v1}, LEb5;->k()Lq72;

    move-result-object v1

    invoke-virtual {v1, v0}, Lq72;->c(Lq72$c;)V

    new-instance v1, LZe5$a$b;

    invoke-direct {v1, p0, v0}, LZe5$a$b;-><init>(LZe5$a;Lq72$c;)V

    invoke-static {v1}, Lio/reactivex/disposables/d;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/m;->b(Lio/reactivex/disposables/c;)V

    :cond_0
    invoke-interface {p1}, Lio/reactivex/m;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LZe5;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

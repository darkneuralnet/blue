.class public LZe5$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe5;->d(LEb5;[Ljava/lang/String;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:[Ljava/lang/String;

.field public final synthetic c:LEb5;


# direct methods
.method public constructor <init>([Ljava/lang/String;LEb5;)V
    .locals 0

    iput-object p1, p0, LZe5$c;->b:[Ljava/lang/String;

    iput-object p2, p0, LZe5$c;->c:LEb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, LZe5$c$a;

    iget-object v1, p0, LZe5$c;->b:[Ljava/lang/String;

    invoke-direct {v0, p0, v1, p1}, LZe5$c$a;-><init>(LZe5$c;[Ljava/lang/String;Lio/reactivex/y;)V

    iget-object v1, p0, LZe5$c;->c:LEb5;

    invoke-virtual {v1}, LEb5;->k()Lq72;

    move-result-object v1

    invoke-virtual {v1, v0}, Lq72;->c(Lq72$c;)V

    new-instance v1, LZe5$c$b;

    invoke-direct {v1, p0, v0}, LZe5$c$b;-><init>(LZe5$c;Lq72$c;)V

    invoke-static {v1}, Lio/reactivex/disposables/d;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    sget-object v0, LZe5;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

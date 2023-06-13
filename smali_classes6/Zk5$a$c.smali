.class public LZk5$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5$a;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lio/reactivex/Observable<",
        "Lxe5;",
        ">;",
        "Lio/reactivex/B<",
        "Lxe5;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LZk5$a;


# direct methods
.method public constructor <init>(LZk5$a;)V
    .locals 0

    iput-object p1, p0, LZk5$a$c;->b:LZk5$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;)",
            "Lio/reactivex/B<",
            "Lxe5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LZk5$a$c;->b:LZk5$a;

    iget-object v0, v0, LZk5$a;->c:Lio/reactivex/functions/o;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->window(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, LZk5$a$c;->b:LZk5$a;

    iget-object v0, v0, LZk5$a;->d:Lio/reactivex/functions/o;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, LZk5$a$c;->b:LZk5$a;

    iget-object v0, v0, LZk5$a;->a:Lio/reactivex/functions/o;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

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

    check-cast p1, Lio/reactivex/Observable;

    invoke-virtual {p0, p1}, LZk5$a$c;->a(Lio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

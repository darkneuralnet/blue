.class public final LPk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LOk0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lpd5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LNw2;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;>;",
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "LZ94<",
            "LNw2;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPk0;->a:LZ94;

    iput-object p2, p0, LPk0;->b:LZ94;

    iput-object p3, p0, LPk0;->c:LZ94;

    iput-object p4, p0, LPk0;->d:LZ94;

    iput-object p5, p0, LPk0;->e:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;LZ94;)LPk0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;>;",
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "LZ94<",
            "LNw2;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)",
            "LPk0;"
        }
    .end annotation

    new-instance v6, LPk0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LPk0;-><init>(LZ94;LZ94;LZ94;LZ94;LZ94;)V

    return-object v6
.end method

.method public static c(Lpd5;Lio/reactivex/Observable;Lio/reactivex/Observable;LNw2;Lio/reactivex/E;)LOk0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd5;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;",
            "LNw2;",
            "Lio/reactivex/E;",
            ")",
            "LOk0;"
        }
    .end annotation

    new-instance v6, LOk0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LOk0;-><init>(Lpd5;Lio/reactivex/Observable;Lio/reactivex/Observable;LNw2;Lio/reactivex/E;)V

    return-object v6
.end method


# virtual methods
.method public b()LOk0;
    .locals 5

    iget-object v0, p0, LPk0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpd5;

    iget-object v1, p0, LPk0;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/Observable;

    iget-object v2, p0, LPk0;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/reactivex/Observable;

    iget-object v3, p0, LPk0;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LNw2;

    iget-object v4, p0, LPk0;->e:LZ94;

    invoke-interface {v4}, LZ94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/reactivex/E;

    invoke-static {v0, v1, v2, v3, v4}, LPk0;->c(Lpd5;Lio/reactivex/Observable;Lio/reactivex/Observable;LNw2;Lio/reactivex/E;)LOk0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPk0;->b()LOk0;

    move-result-object v0

    return-object v0
.end method

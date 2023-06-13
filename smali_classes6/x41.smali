.class public final Lx41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lv41;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lpd5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/String;",
            ">;",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx41;->a:LZ94;

    iput-object p2, p0, Lx41;->b:LZ94;

    iput-object p3, p0, Lx41;->c:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;)Lx41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/String;",
            ">;",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;>;)",
            "Lx41;"
        }
    .end annotation

    new-instance v0, Lx41;

    invoke-direct {v0, p0, p1, p2}, Lx41;-><init>(LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lpd5;Lio/reactivex/Observable;)Lv41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpd5;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;)",
            "Lv41;"
        }
    .end annotation

    new-instance v0, Lv41;

    invoke-direct {v0, p0, p1, p2}, Lv41;-><init>(Ljava/lang/String;Lpd5;Lio/reactivex/Observable;)V

    return-object v0
.end method


# virtual methods
.method public b()Lv41;
    .locals 3

    iget-object v0, p0, Lx41;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lx41;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpd5;

    iget-object v2, p0, Lx41;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/reactivex/Observable;

    invoke-static {v0, v1, v2}, Lx41;->c(Ljava/lang/String;Lpd5;Lio/reactivex/Observable;)Lv41;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx41;->b()Lv41;

    move-result-object v0

    return-object v0
.end method

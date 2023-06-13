.class public LOk0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOk0;->a(Lpd5;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lnd5$b;",
        "Lio/reactivex/Observable<",
        "Lde5$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/Observable;


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;)V
    .locals 0

    iput-object p1, p0, LOk0$c;->b:Lio/reactivex/Observable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnd5$b;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnd5$b;",
            ")",
            "Lio/reactivex/Observable<",
            "Lde5$a;",
            ">;"
        }
    .end annotation

    sget-object v0, Lnd5$b;->c:Lnd5$b;

    if-eq p1, v0, :cond_0

    sget-object p1, Lde5$a;->d:Lde5$a;

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LOk0$c;->b:Lio/reactivex/Observable;

    new-instance v0, LOk0$c$a;

    invoke-direct {v0, p0}, LOk0$c$a;-><init>(LOk0$c;)V

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

    check-cast p1, Lnd5$b;

    invoke-virtual {p0, p1}, LOk0$c;->a(Lnd5$b;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.class public Lnd5;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnd5$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/Observable<",
        "Lnd5$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    new-instance v0, Lnd5$a;

    invoke-direct {v0, p0, p1}, Lnd5$a;-><init>(Lnd5;Landroid/content/Context;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->e()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->e()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->unsubscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->share()Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lnd5;->b:Lio/reactivex/Observable;

    return-void
.end method

.method public static a(I)Lnd5$b;
    .locals 0

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lnd5$b;->d:Lnd5$b;

    return-object p0

    :pswitch_0
    sget-object p0, Lnd5$b;->f:Lnd5$b;

    return-object p0

    :pswitch_1
    sget-object p0, Lnd5$b;->c:Lnd5$b;

    return-object p0

    :pswitch_2
    sget-object p0, Lnd5$b;->e:Lnd5$b;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lnd5$b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnd5;->b:Lio/reactivex/Observable;

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    return-void
.end method

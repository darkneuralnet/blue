.class public LZk5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5;-><init>(Lio/reactivex/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/C<",
        "Lxe5;",
        "Lxe5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "Lxe5;",
            "Lio/reactivex/Observable<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic e:Lio/reactivex/E;

.field public final synthetic f:LZk5;


# direct methods
.method public constructor <init>(LZk5;Lio/reactivex/E;)V
    .locals 2

    iput-object p1, p0, LZk5$a;->f:LZk5;

    iput-object p2, p0, LZk5$a;->e:Lio/reactivex/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LZk5;->g()Lio/reactivex/functions/o;

    move-result-object p1

    iput-object p1, p0, LZk5$a;->a:Lio/reactivex/functions/o;

    const-wide/16 v0, 0xa

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1, p2}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, LZk5$a;->b:Lio/reactivex/Observable;

    new-instance p1, LZk5$a$a;

    invoke-direct {p1, p0}, LZk5$a$a;-><init>(LZk5$a;)V

    iput-object p1, p0, LZk5$a;->c:Lio/reactivex/functions/o;

    new-instance p1, LZk5$a$b;

    invoke-direct {p1, p0}, LZk5$a$b;-><init>(LZk5$a;)V

    iput-object p1, p0, LZk5$a;->d:Lio/reactivex/functions/o;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;"
        }
    .end annotation

    new-instance v0, LZk5$a$c;

    invoke-direct {v0, p0}, LZk5$a$c;-><init>(LZk5$a;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->publish(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 0

    invoke-virtual {p0, p1}, LZk5$a;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

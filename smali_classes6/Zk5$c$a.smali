.class public LZk5$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5$c;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lio/reactivex/observables/b<",
        "Ljava/lang/String;",
        "Lxe5;",
        ">;",
        "Lio/reactivex/Observable<",
        "Lxe5;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LZk5$c;


# direct methods
.method public constructor <init>(LZk5$c;)V
    .locals 0

    iput-object p1, p0, LZk5$c$a;->b:LZk5$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/observables/b;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/observables/b<",
            "Ljava/lang/String;",
            "Lxe5;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lxe5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LZk5$c$a;->b:LZk5$c;

    iget-object v0, v0, LZk5$c;->a:Lio/reactivex/C;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

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

    check-cast p1, Lio/reactivex/observables/b;

    invoke-virtual {p0, p1}, LZk5$c$a;->a(Lio/reactivex/observables/b;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

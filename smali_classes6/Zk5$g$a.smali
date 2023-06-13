.class public LZk5$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5$g;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
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
        "Lio/reactivex/Observable<",
        "Lxe5;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LZk5$g;


# direct methods
.method public constructor <init>(LZk5$g;)V
    .locals 0

    iput-object p1, p0, LZk5$g$a;->b:LZk5$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 2
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

    iget-object v0, p0, LZk5$g$a;->b:LZk5$g;

    iget-object v0, v0, LZk5$g;->a:LZk5;

    iget-object v0, v0, LZk5;->b:Lio/reactivex/C;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LZk5$g$a;->b:LZk5$g;

    iget-object v1, v1, LZk5$g;->a:LZk5;

    iget-object v1, v1, LZk5;->c:Lio/reactivex/C;

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

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

    invoke-virtual {p0, p1}, LZk5$g$a;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

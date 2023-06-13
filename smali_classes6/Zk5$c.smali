.class public LZk5$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5;->f(Lio/reactivex/C;)Lio/reactivex/C;
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
.field public final synthetic a:Lio/reactivex/C;


# direct methods
.method public constructor <init>(Lio/reactivex/C;)V
    .locals 0

    iput-object p1, p0, LZk5$c;->a:Lio/reactivex/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    new-instance v0, LZk5$c$b;

    invoke-direct {v0, p0}, LZk5$c$b;-><init>(LZk5$c;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->groupBy(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LZk5$c$a;

    invoke-direct {v0, p0}, LZk5$c$a;-><init>(LZk5$c;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 0

    invoke-virtual {p0, p1}, LZk5$c;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

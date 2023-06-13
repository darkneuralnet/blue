.class public LZk5$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5;->c(I)Lio/reactivex/C;
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
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:LZk5;


# direct methods
.method public constructor <init>(LZk5;IJ)V
    .locals 0

    iput-object p1, p0, LZk5$b;->c:LZk5;

    iput p2, p0, LZk5$b;->a:I

    iput-wide p3, p0, LZk5$b;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 4
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

    iget v0, p0, LZk5$b;->a:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, LZk5$b;->c:LZk5;

    iget-object v3, v3, LZk5;->a:Lio/reactivex/E;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/reactivex/Observable;->take(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LZk5$b$a;

    invoke-direct {v0, p0}, LZk5$b$a;-><init>(LZk5$b;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->repeatWhen(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 0

    invoke-virtual {p0, p1}, LZk5$b;->a(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

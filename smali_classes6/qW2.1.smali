.class public LqW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyy0;
.implements LoW2;
.implements Lio/reactivex/functions/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyy0;",
        "LoW2;",
        "Lio/reactivex/functions/g<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/Integer;

.field public final c:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/disposables/g;


# direct methods
.method public constructor <init>(Lve5;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/reactivex/disposables/g;

    invoke-direct {v0}, Lio/reactivex/disposables/g;-><init>()V

    iput-object v0, p0, LqW2;->d:Lio/reactivex/disposables/g;

    invoke-virtual {p1}, Lve5;->f()Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LqW2$a;

    invoke-direct {v0, p0}, LqW2$a;-><init>(LqW2;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->retry(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, LqW2;->c:Lio/reactivex/Observable;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LqW2;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LqW2;->b:Ljava/lang/Integer;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LqW2;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LqW2;->d:Lio/reactivex/disposables/g;

    invoke-virtual {v0}, Lio/reactivex/disposables/g;->dispose()V

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, LqW2;->d:Lio/reactivex/disposables/g;

    iget-object v1, p0, LqW2;->c:Lio/reactivex/Observable;

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/disposables/g;->a(Lio/reactivex/disposables/c;)Z

    return-void
.end method

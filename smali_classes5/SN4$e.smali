.class public final LSN4$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSN4;->h(Lio/reactivex/E;)Lio/reactivex/functions/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "LSN4$g;",
        "Lio/reactivex/k<",
        "LSN4$g;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/E;)V
    .locals 0

    iput-object p1, p0, LSN4$e;->b:Lio/reactivex/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LSN4$g;)Lio/reactivex/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSN4$g;",
            ")",
            "Lio/reactivex/k<",
            "LSN4$g;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, LSN4$g;->a()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, LSN4$g;->b()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/k;->Q(Ljava/lang/Throwable;)Lio/reactivex/k;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, LSN4$g;->a()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, LSN4$e;->b:Lio/reactivex/E;

    invoke-static {v0, v1, v2, v3}, Lio/reactivex/k;->p1(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {p1}, LyA1;->a(Ljava/lang/Object;)Lio/reactivex/functions/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

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

    check-cast p1, LSN4$g;

    invoke-virtual {p0, p1}, LSN4$e;->a(LSN4$g;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

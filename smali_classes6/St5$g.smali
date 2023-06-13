.class public LSt5$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSt5;->e()Lio/reactivex/functions/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "LL46;",
        "Lio/reactivex/F<",
        "Lue5;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LSt5;


# direct methods
.method public constructor <init>(LSt5;)V
    .locals 0

    iput-object p1, p0, LSt5$g;->b:LSt5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LL46;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LL46;",
            ")",
            "Lio/reactivex/F<",
            "Lue5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSt5$g;->b:LSt5;

    iget-object v0, v0, LSt5;->c:Lei3;

    iget-wide v1, p1, LL46;->a:J

    iget-object p1, p1, LL46;->b:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, p1}, Lei3;->b(JLjava/util/concurrent/TimeUnit;)LYt5;

    move-result-object p1

    iget-object v0, p0, LSt5$g;->b:LSt5;

    iget-object v0, v0, LSt5;->a:Lqy0;

    invoke-interface {v0, p1}, LKk0;->a(LYh3;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

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

    check-cast p1, LL46;

    invoke-virtual {p0, p1}, LSt5$g;->a(LL46;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

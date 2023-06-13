.class public LSt5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSt5;->a(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/g<",
        "Lio/reactivex/disposables/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:J

.field public final synthetic c:Ljava/util/concurrent/TimeUnit;

.field public final synthetic d:LSt5;


# direct methods
.method public constructor <init>(LSt5;JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    iput-object p1, p0, LSt5$a;->d:LSt5;

    iput-wide p2, p0, LSt5$a;->b:J

    iput-object p4, p0, LSt5$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/disposables/c;)V
    .locals 5

    iget-object p1, p0, LSt5$a;->d:LSt5;

    iget-object p1, p1, LSt5;->e:Lio/reactivex/subjects/h;

    new-instance v0, LL46;

    iget-wide v1, p0, LSt5$a;->b:J

    iget-object v3, p0, LSt5$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LL46;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LSt5$a;->a(Lio/reactivex/disposables/c;)V

    return-void
.end method

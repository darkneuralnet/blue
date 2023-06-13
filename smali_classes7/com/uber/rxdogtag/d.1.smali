.class public final synthetic Lcom/uber/rxdogtag/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/uber/rxdogtag/e;

.field public final synthetic c:Lio/reactivex/disposables/c;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/e;Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/d;->b:Lcom/uber/rxdogtag/e;

    iput-object p2, p0, Lcom/uber/rxdogtag/d;->c:Lio/reactivex/disposables/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/d;->b:Lcom/uber/rxdogtag/e;

    iget-object v1, p0, Lcom/uber/rxdogtag/d;->c:Lio/reactivex/disposables/c;

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/e;->c(Lcom/uber/rxdogtag/e;Lio/reactivex/disposables/c;)V

    return-void
.end method

.class public final synthetic Lcom/uber/rxdogtag/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/c;


# instance fields
.field public final synthetic a:Lcom/uber/rxdogtag/M$b;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/M$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/I;->a:Lcom/uber/rxdogtag/M$b;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/I;->a:Lcom/uber/rxdogtag/M$b;

    check-cast p1, Lio/reactivex/F;

    check-cast p2, Lio/reactivex/I;

    invoke-static {v0, p1, p2}, Lcom/uber/rxdogtag/M;->a(Lcom/uber/rxdogtag/M$b;Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;

    move-result-object p1

    return-object p1
.end method

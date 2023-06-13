.class public final synthetic Lcom/uber/rxdogtag/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/rxdogtag/M$d;


# instance fields
.field public final synthetic a:Lcom/uber/rxdogtag/l;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/j;->a:Lcom/uber/rxdogtag/l;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/j;->a:Lcom/uber/rxdogtag/l;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/uber/rxdogtag/l;->b(Lcom/uber/rxdogtag/l;Ljava/lang/Throwable;)V

    return-void
.end method

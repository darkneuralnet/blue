.class public final synthetic Lcom/uber/rxdogtag/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/rxdogtag/M$d;


# instance fields
.field public final synthetic a:Lcom/uber/rxdogtag/w;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/u;->a:Lcom/uber/rxdogtag/w;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/u;->a:Lcom/uber/rxdogtag/w;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/uber/rxdogtag/w;->a(Lcom/uber/rxdogtag/w;Ljava/lang/Throwable;)V

    return-void
.end method

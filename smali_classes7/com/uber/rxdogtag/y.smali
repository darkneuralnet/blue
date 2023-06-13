.class public final synthetic Lcom/uber/rxdogtag/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/uber/rxdogtag/D;

.field public final synthetic c:LoT5;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/D;LoT5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/y;->b:Lcom/uber/rxdogtag/D;

    iput-object p2, p0, Lcom/uber/rxdogtag/y;->c:LoT5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/y;->b:Lcom/uber/rxdogtag/D;

    iget-object v1, p0, Lcom/uber/rxdogtag/y;->c:LoT5;

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/D;->b(Lcom/uber/rxdogtag/D;LoT5;)V

    return-void
.end method

.class public final synthetic Lcom/uber/rxdogtag/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/uber/rxdogtag/l;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/i;->b:Lcom/uber/rxdogtag/l;

    iput-object p2, p0, Lcom/uber/rxdogtag/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/i;->b:Lcom/uber/rxdogtag/l;

    iget-object v1, p0, Lcom/uber/rxdogtag/i;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/l;->e(Lcom/uber/rxdogtag/l;Ljava/lang/Object;)V

    return-void
.end method

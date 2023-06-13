.class public final synthetic Lcom/uber/rxdogtag/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/uber/rxdogtag/D;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/D;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/C;->b:Lcom/uber/rxdogtag/D;

    iput-object p2, p0, Lcom/uber/rxdogtag/C;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/C;->b:Lcom/uber/rxdogtag/D;

    iget-object v1, p0, Lcom/uber/rxdogtag/C;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/D;->c(Lcom/uber/rxdogtag/D;Ljava/lang/Object;)V

    return-void
.end method

.class public final synthetic Lcom/uber/rxdogtag/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/uber/rxdogtag/w;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/rxdogtag/w;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/t;->b:Lcom/uber/rxdogtag/w;

    iput-object p2, p0, Lcom/uber/rxdogtag/t;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/t;->b:Lcom/uber/rxdogtag/w;

    iget-object v1, p0, Lcom/uber/rxdogtag/t;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/w;->c(Lcom/uber/rxdogtag/w;Ljava/lang/Object;)V

    return-void
.end method

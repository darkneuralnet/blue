.class public final synthetic Lcom/uber/rxdogtag/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LhT5;


# direct methods
.method public synthetic constructor <init>(LhT5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/rxdogtag/A;->b:LhT5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/A;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    return-void
.end method

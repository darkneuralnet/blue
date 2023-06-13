.class public final synthetic LaW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LbW5;

.field public final synthetic c:LPV5;


# direct methods
.method public synthetic constructor <init>(LbW5;LPV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaW5;->b:LbW5;

    iput-object p2, p0, LaW5;->c:LPV5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LaW5;->b:LbW5;

    iget-object v1, p0, LaW5;->c:LPV5;

    invoke-static {v0, v1}, LbW5;->d(LbW5;LPV5;)V

    return-void
.end method

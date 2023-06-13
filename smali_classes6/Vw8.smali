.class public final LVw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRC8;


# direct methods
.method public constructor <init>(LRC8;)V
    .locals 0

    iput-object p1, p0, LVw8;->b:LRC8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LVw8;->b:LRC8;

    iget-object v0, v0, LRC8;->n:LIo9;

    invoke-virtual {v0}, LIo9;->b()V

    return-void
.end method

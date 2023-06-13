.class public final synthetic LLk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRk5;


# direct methods
.method public synthetic constructor <init>(LRk5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLk5;->b:LRk5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LLk5;->b:LRk5;

    invoke-static {v0}, LRk5;->Vl(LRk5;)V

    return-void
.end method

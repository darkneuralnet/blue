.class public final synthetic LsJ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LLK;


# direct methods
.method public synthetic constructor <init>(LLK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsJ;->b:LLK;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LsJ;->b:LLK;

    invoke-static {v0}, LLK;->s0(LLK;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

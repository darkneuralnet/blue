.class public final synthetic LEp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LFp6;


# direct methods
.method public synthetic constructor <init>(LFp6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEp6;->b:LFp6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LEp6;->b:LFp6;

    invoke-static {v0}, LFp6;->a(LFp6;)V

    return-void
.end method

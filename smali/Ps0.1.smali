.class public final synthetic LPs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LQs0;


# direct methods
.method public synthetic constructor <init>(LQs0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPs0;->b:LQs0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LPs0;->b:LQs0;

    invoke-static {v0}, LQs0;->a(LQs0;)V

    return-void
.end method

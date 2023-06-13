.class public final synthetic LjR4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LlR4;


# direct methods
.method public synthetic constructor <init>(LlR4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjR4;->b:LlR4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LjR4;->b:LlR4;

    invoke-static {v0}, LlR4;->d(LlR4;)V

    return-void
.end method

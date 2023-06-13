.class public final synthetic LLX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOX5;


# direct methods
.method public synthetic constructor <init>(LOX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLX5;->b:LOX5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LLX5;->b:LOX5;

    invoke-static {v0}, LOX5;->I(LOX5;)V

    return-void
.end method

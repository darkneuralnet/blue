.class public final synthetic LG56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LH56;


# direct methods
.method public synthetic constructor <init>(LH56;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG56;->b:LH56;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LG56;->b:LH56;

    invoke-virtual {v0}, LH56;->d()V

    return-void
.end method

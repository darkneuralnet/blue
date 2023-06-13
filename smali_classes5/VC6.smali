.class public final synthetic LVC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LXC6;


# direct methods
.method public synthetic constructor <init>(LXC6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVC6;->b:LXC6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LVC6;->b:LXC6;

    invoke-static {v0}, LXC6;->b(LXC6;)V

    return-void
.end method

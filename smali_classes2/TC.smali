.class public final synthetic LTC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LXC;


# direct methods
.method public synthetic constructor <init>(LXC;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTC;->b:LXC;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LTC;->b:LXC;

    invoke-static {v0}, LXC;->Ll(LXC;)V

    return-void
.end method

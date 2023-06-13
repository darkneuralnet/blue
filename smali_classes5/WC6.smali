.class public final synthetic LWC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:LXC6;


# direct methods
.method public synthetic constructor <init>(LXC6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWC6;->a:LXC6;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LWC6;->a:LXC6;

    invoke-static {v0}, LXC6;->a(LXC6;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

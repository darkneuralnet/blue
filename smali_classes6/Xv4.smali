.class public final synthetic LXv4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# instance fields
.field public final synthetic a:Lyb4;


# direct methods
.method public synthetic constructor <init>(Lyb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXv4;->a:Lyb4;

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXv4;->a:Lyb4;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(Lyb4;LOs0;)LUv4;

    move-result-object p1

    return-object p1
.end method

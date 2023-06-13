.class public final synthetic LWs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LEs0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LEs0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWs0;->a:Ljava/lang/String;

    iput-object p2, p0, LWs0;->b:LEs0;

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LWs0;->a:Ljava/lang/String;

    iget-object v1, p0, LWs0;->b:LEs0;

    invoke-static {v0, v1, p1}, LXs0;->b(Ljava/lang/String;LEs0;LOs0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

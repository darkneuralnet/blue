.class public final synthetic Lxv6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LWv6;


# direct methods
.method public synthetic constructor <init>(LWv6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxv6;->b:LWv6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxv6;->b:LWv6;

    invoke-static {v0}, LWv6;->m(LWv6;)V

    return-void
.end method

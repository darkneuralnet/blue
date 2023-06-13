.class public final synthetic LgX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LhX0;

.field public final synthetic c:LVh;


# direct methods
.method public synthetic constructor <init>(LhX0;LVh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgX0;->b:LhX0;

    iput-object p2, p0, LgX0;->c:LVh;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LgX0;->b:LhX0;

    iget-object v1, p0, LgX0;->c:LVh;

    invoke-static {v0, v1}, LhX0;->g(LhX0;LVh;)V

    return-void
.end method

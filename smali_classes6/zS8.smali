.class public final LzS8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LsV8;

.field public final synthetic c:LhV8;


# direct methods
.method public constructor <init>(LhV8;LsV8;)V
    .locals 0

    iput-object p1, p0, LzS8;->c:LhV8;

    iput-object p2, p0, LzS8;->b:LsV8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LzS8;->c:LhV8;

    iget-object v1, p0, LzS8;->b:LsV8;

    invoke-static {v0, v1}, LhV8;->k0(LhV8;LsV8;)V

    iget-object v0, p0, LzS8;->c:LhV8;

    invoke-virtual {v0}, LhV8;->u()V

    return-void
.end method

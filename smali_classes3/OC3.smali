.class public final synthetic LOC3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LtC3;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(LtC3;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOC3;->b:LtC3;

    iput-boolean p2, p0, LOC3;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LOC3;->b:LtC3;

    iget-boolean v1, p0, LOC3;->c:Z

    invoke-static {v0, v1}, LtC3$z0;->a(LtC3;Z)V

    return-void
.end method

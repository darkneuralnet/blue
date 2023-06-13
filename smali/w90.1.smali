.class public final synthetic Lw90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LF90;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(LF90;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw90;->b:LF90;

    iput-boolean p2, p0, Lw90;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw90;->b:LF90;

    iget-boolean v1, p0, Lw90;->c:Z

    invoke-static {v0, v1}, LF90;->x(LF90;Z)V

    return-void
.end method

.class public final LSP7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:J

.field public final synthetic c:LaY7;


# direct methods
.method public constructor <init>(LaY7;J)V
    .locals 0

    iput-object p1, p0, LSP7;->c:LaY7;

    iput-wide p2, p0, LSP7;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LSP7;->c:LaY7;

    iget-wide v1, p0, LSP7;->b:J

    invoke-static {v0, v1, v2}, LaY7;->h(LaY7;J)V

    return-void
.end method

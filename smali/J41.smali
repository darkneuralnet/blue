.class public final synthetic LJ41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LK41;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LK41;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ41;->b:LK41;

    iput-object p2, p0, LJ41;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LJ41;->b:LK41;

    iget-object v1, p0, LJ41;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, LK41;->a(LK41;Ljava/lang/Runnable;)V

    return-void
.end method

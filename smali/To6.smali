.class public final synthetic LTo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Landroidx/camera/core/impl/q$b;

.field public final synthetic d:Lpa0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/q$b;Lpa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTo6;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, LTo6;->c:Landroidx/camera/core/impl/q$b;

    iput-object p3, p0, LTo6;->d:Lpa0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LTo6;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, LTo6;->c:Landroidx/camera/core/impl/q$b;

    iget-object v2, p0, LTo6;->d:Lpa0;

    invoke-static {v0, v1, v2}, LUo6;->V(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/q$b;Lpa0;)V

    return-void
.end method

.class public final synthetic LP66;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:LQ66;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;LQ66;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP66;->b:Ljava/lang/Runnable;

    iput-object p2, p0, LP66;->c:LQ66;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LP66;->b:Ljava/lang/Runnable;

    iget-object v1, p0, LP66;->c:LQ66;

    invoke-static {v0, v1}, LQ66;->a(Ljava/lang/Runnable;LQ66;)V

    return-void
.end method

.class public final synthetic Lh74;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li74;

.field public final synthetic c:LTC6;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Li74;LTC6;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh74;->b:Li74;

    iput-object p2, p0, Lh74;->c:LTC6;

    iput-boolean p3, p0, Lh74;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lh74;->b:Li74;

    iget-object v1, p0, Lh74;->c:LTC6;

    iget-boolean v2, p0, Lh74;->d:Z

    invoke-static {v0, v1, v2}, Li74;->e(Li74;LTC6;Z)V

    return-void
.end method

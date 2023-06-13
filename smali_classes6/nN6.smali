.class public final synthetic LnN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LcO6;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LcO6;[B)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LnN6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnN6;->b:LcO6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, LnN6;->c:I

    if-eqz v0, :cond_0

    iget-object v0, p0, LnN6;->b:LcO6;

    invoke-virtual {v0}, LcO6;->c()V

    return-void

    :cond_0
    iget-object v0, p0, LnN6;->b:LcO6;

    invoke-virtual {v0}, LcO6;->b()V

    return-void
.end method

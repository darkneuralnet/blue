.class public final Lqf8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LEf8;


# direct methods
.method public constructor <init>(LEf8;Z)V
    .locals 0

    iput-object p1, p0, Lqf8;->c:LEf8;

    iput-boolean p2, p0, Lqf8;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lqf8;->c:LEf8;

    invoke-static {v0}, LEf8;->a(LEf8;)LhV8;

    move-result-object v0

    iget-boolean v1, p0, Lqf8;->b:Z

    invoke-virtual {v0, v1}, LhV8;->l(Z)V

    return-void
.end method

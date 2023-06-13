.class public final LEO8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LhV8;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(LaP8;LhV8;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, LEO8;->b:LhV8;

    iput-object p3, p0, LEO8;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LEO8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->b()V

    iget-object v0, p0, LEO8;->b:LhV8;

    iget-object v1, p0, LEO8;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, LhV8;->l0(Ljava/lang/Runnable;)V

    iget-object v0, p0, LEO8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->B()V

    return-void
.end method

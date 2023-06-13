.class public final LtM8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LEM8;


# direct methods
.method public constructor <init>(LEM8;)V
    .locals 0

    iput-object p1, p0, LtM8;->b:LEM8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LtM8;->b:LEM8;

    iget-object v0, v0, LEM8;->d:LQM8;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LQM8;->K(LQM8;LV98;)V

    iget-object v0, p0, LtM8;->b:LEM8;

    iget-object v0, v0, LEM8;->d:LQM8;

    invoke-static {v0}, LQM8;->L(LQM8;)V

    return-void
.end method

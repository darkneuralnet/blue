.class public LjZ1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:LHO1;


# direct methods
.method public constructor <init>(LHO1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjZ1;->a:LHO1;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, LjZ1;->a:LHO1;

    invoke-interface {v0}, LHO1;->b()LwO1;

    move-result-object v0

    invoke-interface {v0, p1}, LwO1;->K(Z)V

    iget-object p1, p0, LjZ1;->a:LHO1;

    invoke-interface {p1}, LHO1;->close()V

    return-void
.end method

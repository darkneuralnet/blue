.class public final synthetic LDs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LHs4;

.field public final synthetic c:Llb1;


# direct methods
.method public synthetic constructor <init>(LHs4;Llb1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDs4;->b:LHs4;

    iput-object p2, p0, LDs4;->c:Llb1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDs4;->b:LHs4;

    iget-object v1, p0, LDs4;->c:Llb1;

    invoke-static {v0, v1}, LHs4;->g(LHs4;Llb1;)V

    return-void
.end method
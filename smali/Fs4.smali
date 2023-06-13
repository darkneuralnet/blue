.class public final synthetic LFs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Llb1;


# direct methods
.method public synthetic constructor <init>(Llb1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFs4;->b:Llb1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LFs4;->b:Llb1;

    invoke-static {v0}, LHs4;->h(Llb1;)V

    return-void
.end method

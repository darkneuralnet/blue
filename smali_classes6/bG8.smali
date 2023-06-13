.class public final LbG8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LnG8;


# direct methods
.method public constructor <init>(LnG8;)V
    .locals 0

    iput-object p1, p0, LbG8;->b:LnG8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LbG8;->b:LnG8;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LnG8;->r(LnG8;LwE8;)V

    return-void
.end method

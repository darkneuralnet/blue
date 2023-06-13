.class public final synthetic LSc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LTc;

.field public final synthetic c:LKX1$a;


# direct methods
.method public synthetic constructor <init>(LTc;LKX1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSc;->b:LTc;

    iput-object p2, p0, LSc;->c:LKX1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSc;->b:LTc;

    iget-object v1, p0, LSc;->c:LKX1$a;

    invoke-static {v0, v1}, LTc;->i(LTc;LKX1$a;)V

    return-void
.end method

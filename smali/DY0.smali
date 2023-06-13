.class public final synthetic LDY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LLY0;

.field public final synthetic c:LPV5;


# direct methods
.method public synthetic constructor <init>(LLY0;LPV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDY0;->b:LLY0;

    iput-object p2, p0, LDY0;->c:LPV5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDY0;->b:LLY0;

    iget-object v1, p0, LDY0;->c:LPV5;

    invoke-static {v0, v1}, LLY0;->c(LLY0;LPV5;)V

    return-void
.end method

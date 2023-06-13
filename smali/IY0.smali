.class public final synthetic LIY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:LLY0;

.field public final synthetic b:LPV5;


# direct methods
.method public synthetic constructor <init>(LLY0;LPV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIY0;->a:LLY0;

    iput-object p2, p0, LIY0;->b:LPV5;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LIY0;->a:LLY0;

    iget-object v1, p0, LIY0;->b:LPV5;

    check-cast p1, LPV5$a;

    invoke-static {v0, v1, p1}, LLY0;->g(LLY0;LPV5;LPV5$a;)V

    return-void
.end method

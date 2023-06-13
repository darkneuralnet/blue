.class public final synthetic LHW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LIW5$a;

.field public final synthetic c:LIW5;


# direct methods
.method public synthetic constructor <init>(LIW5$a;LIW5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHW5;->b:LIW5$a;

    iput-object p2, p0, LHW5;->c:LIW5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LHW5;->b:LIW5$a;

    iget-object v1, p0, LHW5;->c:LIW5;

    invoke-static {v0, v1}, LIW5$a;->a(LIW5$a;LIW5;)V

    return-void
.end method

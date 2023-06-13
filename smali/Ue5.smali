.class public final synthetic LUe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LVe5$a;


# direct methods
.method public synthetic constructor <init>(LVe5$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe5;->b:LVe5$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LUe5;->b:LVe5$a;

    invoke-static {v0}, LVe5$a;->a(LVe5$a;)V

    return-void
.end method

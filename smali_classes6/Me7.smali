.class public final synthetic LMe7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LVw6;


# direct methods
.method public synthetic constructor <init>(LVw6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMe7;->b:LVw6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LMe7;->b:LVw6;

    invoke-static {v0}, LVw6;->e(LVw6;)V

    return-void
.end method

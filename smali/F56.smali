.class public final synthetic LF56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LH56;


# direct methods
.method public synthetic constructor <init>(LH56;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF56;->b:LH56;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LF56;->b:LH56;

    invoke-static {v0}, LH56;->a(LH56;)V

    return-void
.end method

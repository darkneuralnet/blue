.class public final synthetic LD30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LM30;


# direct methods
.method public synthetic constructor <init>(LM30;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD30;->b:LM30;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD30;->b:LM30;

    invoke-static {v0}, LM30;->g(LM30;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

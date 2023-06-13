.class public final synthetic LsA1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LtA1;


# direct methods
.method public synthetic constructor <init>(LtA1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsA1;->b:LtA1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LsA1;->b:LtA1;

    invoke-static {v0}, LtA1;->a(LtA1;)V

    return-void
.end method

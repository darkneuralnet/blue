.class public final LrC7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LDe8;


# direct methods
.method public constructor <init>(LDe8;)V
    .locals 0

    iput-object p1, p0, LrC7;->b:LDe8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LrC7;->b:LDe8;

    invoke-virtual {v0}, LDe8;->f()V

    iget-object v0, p0, LrC7;->b:LDe8;

    invoke-virtual {v0}, LDe8;->g()V

    return-void
.end method

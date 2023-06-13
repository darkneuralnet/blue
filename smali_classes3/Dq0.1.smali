.class public final synthetic LDq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LH6;

.field public final synthetic c:LH6;


# direct methods
.method public synthetic constructor <init>(LH6;LH6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDq0;->b:LH6;

    iput-object p2, p0, LDq0;->c:LH6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LDq0;->b:LH6;

    iget-object v1, p0, LDq0;->c:LH6;

    invoke-static {v0, v1}, LIq0;->e(LH6;LH6;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

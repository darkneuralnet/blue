.class public final synthetic LsD4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LuD4;


# direct methods
.method public synthetic constructor <init>(LuD4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsD4;->b:LuD4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LsD4;->b:LuD4;

    invoke-static {v0}, LuD4;->m(LuD4;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

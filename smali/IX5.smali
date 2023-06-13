.class public final synthetic LIX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LJX5;

.field public final synthetic c:LDX5;


# direct methods
.method public synthetic constructor <init>(LJX5;LDX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIX5;->b:LJX5;

    iput-object p2, p0, LIX5;->c:LDX5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LIX5;->b:LJX5;

    iget-object v1, p0, LIX5;->c:LDX5;

    invoke-static {v0, v1}, LJX5;->u(LJX5;LDX5;)V

    return-void
.end method

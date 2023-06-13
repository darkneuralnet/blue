.class public final synthetic LIL6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LpM6;

.field public final c:LOL6;


# direct methods
.method public constructor <init>(LpM6;LOL6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIL6;->b:LpM6;

    iput-object p2, p0, LIL6;->c:LOL6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LIL6;->b:LpM6;

    iget-object v1, p0, LIL6;->c:LOL6;

    iget v1, v1, LOL6;->a:I

    invoke-virtual {v0, v1}, LpM6;->g(I)V

    return-void
.end method

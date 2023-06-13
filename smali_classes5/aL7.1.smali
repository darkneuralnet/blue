.class public final LaL7;
.super LlM7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LzN7;


# direct methods
.method public constructor <init>(LzN7;)V
    .locals 1

    iput-object p1, p0, LaL7;->f:LzN7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LlM7;-><init>(LzN7;LVL7;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Ljava/lang/Object;
    .locals 2

    new-instance v0, LRM7;

    iget-object v1, p0, LaL7;->f:LzN7;

    invoke-direct {v0, v1, p1}, LRM7;-><init>(LzN7;I)V

    return-object v0
.end method

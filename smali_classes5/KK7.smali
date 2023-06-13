.class public final LKK7;
.super LlM7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LzN7;


# direct methods
.method public constructor <init>(LzN7;)V
    .locals 1

    iput-object p1, p0, LKK7;->f:LzN7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LlM7;-><init>(LzN7;LVL7;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKK7;->f:LzN7;

    iget-object v0, v0, LzN7;->d:[Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object p1, v0, p1

    return-object p1
.end method

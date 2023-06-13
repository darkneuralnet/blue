.class public final LQx7;
.super LYA7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LwF7;


# direct methods
.method public constructor <init>(LwF7;)V
    .locals 1

    iput-object p1, p0, LQx7;->f:LwF7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYA7;-><init>(LwF7;LQx7;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQx7;->f:LwF7;

    invoke-static {v0, p1}, LwF7;->i(LwF7;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

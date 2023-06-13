.class public final synthetic LHY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LLY0;

.field public final synthetic c:LOx5;

.field public final synthetic d:LO80$a;


# direct methods
.method public synthetic constructor <init>(LLY0;LOx5;LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHY0;->b:LLY0;

    iput-object p2, p0, LHY0;->c:LOx5;

    iput-object p3, p0, LHY0;->d:LO80$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LHY0;->b:LLY0;

    iget-object v1, p0, LHY0;->c:LOx5;

    iget-object v2, p0, LHY0;->d:LO80$a;

    invoke-static {v0, v1, v2}, LLY0;->i(LLY0;LOx5;LO80$a;)V

    return-void
.end method

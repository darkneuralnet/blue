.class public final synthetic LAs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LHs4;

.field public final synthetic c:Ltp6$a;


# direct methods
.method public synthetic constructor <init>(LHs4;Ltp6$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAs4;->b:LHs4;

    iput-object p2, p0, LAs4;->c:Ltp6$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LAs4;->b:LHs4;

    iget-object v1, p0, LAs4;->c:Ltp6$a;

    invoke-static {v0, v1}, LHs4;->k(LHs4;Ltp6$a;)V

    return-void
.end method

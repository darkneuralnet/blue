.class public final synthetic LAW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LzW0$b$a;

.field public final synthetic c:LH80;

.field public final synthetic d:LHM4;


# direct methods
.method public synthetic constructor <init>(LzW0$b$a;LH80;LHM4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAW0;->b:LzW0$b$a;

    iput-object p2, p0, LAW0;->c:LH80;

    iput-object p3, p0, LAW0;->d:LHM4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LAW0;->b:LzW0$b$a;

    iget-object v1, p0, LAW0;->c:LH80;

    iget-object v2, p0, LAW0;->d:LHM4;

    invoke-static {v0, v1, v2}, LzW0$b$a;->d(LzW0$b$a;LH80;LHM4;)V

    return-void
.end method

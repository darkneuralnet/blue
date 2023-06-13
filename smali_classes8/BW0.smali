.class public final synthetic LBW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LzW0$b$a;

.field public final synthetic c:LH80;

.field public final synthetic d:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(LzW0$b$a;LH80;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBW0;->b:LzW0$b$a;

    iput-object p2, p0, LBW0;->c:LH80;

    iput-object p3, p0, LBW0;->d:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LBW0;->b:LzW0$b$a;

    iget-object v1, p0, LBW0;->c:LH80;

    iget-object v2, p0, LBW0;->d:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, LzW0$b$a;->c(LzW0$b$a;LH80;Ljava/lang/Throwable;)V

    return-void
.end method

.class public final synthetic Ldt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LMo2;

.field public final synthetic c:LX94;


# direct methods
.method public synthetic constructor <init>(LMo2;LX94;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldt0;->b:LMo2;

    iput-object p2, p0, Ldt0;->c:LX94;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ldt0;->b:LMo2;

    iget-object v1, p0, Ldt0;->c:LX94;

    invoke-static {v0, v1}, Let0;->j(LMo2;LX94;)V

    return-void
.end method

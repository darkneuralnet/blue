.class public final synthetic Lyl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/appboy/Appboy;

.field public final synthetic c:LlZ1;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/Appboy;LlZ1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl;->b:Lcom/appboy/Appboy;

    iput-object p2, p0, Lyl;->c:LlZ1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lyl;->b:Lcom/appboy/Appboy;

    iget-object v1, p0, Lyl;->c:LlZ1;

    invoke-static {v0, v1}, Lcom/appboy/Appboy;->t(Lcom/appboy/Appboy;LlZ1;)V

    return-void
.end method

.class public final synthetic Ltl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/appboy/Appboy;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ls20;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/Appboy;Ljava/lang/String;Ls20;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl;->b:Lcom/appboy/Appboy;

    iput-object p2, p0, Ltl;->c:Ljava/lang/String;

    iput-object p3, p0, Ltl;->d:Ls20;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltl;->b:Lcom/appboy/Appboy;

    iget-object v1, p0, Ltl;->c:Ljava/lang/String;

    iget-object v2, p0, Ltl;->d:Ls20;

    invoke-static {v0, v1, v2}, Lcom/appboy/Appboy;->q(Lcom/appboy/Appboy;Ljava/lang/String;Ls20;)V

    return-void
.end method

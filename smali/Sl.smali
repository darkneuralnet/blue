.class public final synthetic LSl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/appboy/Appboy;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSl;->b:Lcom/appboy/Appboy;

    iput-object p2, p0, LSl;->c:Ljava/lang/String;

    iput-object p3, p0, LSl;->d:Ljava/lang/String;

    iput-object p4, p0, LSl;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LSl;->b:Lcom/appboy/Appboy;

    iget-object v1, p0, LSl;->c:Ljava/lang/String;

    iget-object v2, p0, LSl;->d:Ljava/lang/String;

    iget-object v3, p0, LSl;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/appboy/Appboy;->g(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
.class public final synthetic LDl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/appboy/Appboy;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/Appboy;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDl;->b:Lcom/appboy/Appboy;

    iput-boolean p2, p0, LDl;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDl;->b:Lcom/appboy/Appboy;

    iget-boolean v1, p0, LDl;->c:Z

    invoke-static {v0, v1}, Lcom/appboy/Appboy;->a(Lcom/appboy/Appboy;Z)V

    return-void
.end method

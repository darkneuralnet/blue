.class public LvF0$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvF0$b;->a3(Ljava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:LvF0$b;


# direct methods
.method public constructor <init>(LvF0$b;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LvF0$b$b;->d:LvF0$b;

    iput-object p2, p0, LvF0$b$b;->b:Ljava/lang/String;

    iput-object p3, p0, LvF0$b$b;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LvF0$b$b;->d:LvF0$b;

    iget-object v0, v0, LvF0$b;->b:LuF0;

    iget-object v1, p0, LvF0$b$b;->b:Ljava/lang/String;

    iget-object v2, p0, LvF0$b$b;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, LuF0;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

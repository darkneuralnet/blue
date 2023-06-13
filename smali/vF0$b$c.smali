.class public LvF0$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvF0$b;->X4(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:LvF0$b;


# direct methods
.method public constructor <init>(LvF0$b;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LvF0$b$c;->c:LvF0$b;

    iput-object p2, p0, LvF0$b$c;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LvF0$b$c;->c:LvF0$b;

    iget-object v0, v0, LvF0$b;->b:LuF0;

    iget-object v1, p0, LvF0$b$c;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, LuF0;->d(Landroid/os/Bundle;)V

    return-void
.end method

.class public LcZ3$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcZ3$a;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/BroadcastReceiver;

.field public final synthetic c:LcZ3$a;


# direct methods
.method public constructor <init>(LcZ3$a;Landroid/content/BroadcastReceiver;)V
    .locals 0

    iput-object p1, p0, LcZ3$a$b;->c:LcZ3$a;

    iput-object p2, p0, LcZ3$a$b;->b:Landroid/content/BroadcastReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LcZ3$a$b;->c:LcZ3$a;

    iget-object v1, v0, LcZ3$a;->d:LcZ3;

    iget-object v0, v0, LcZ3$a;->b:Landroid/content/Context;

    iget-object v2, p0, LcZ3$a$b;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0, v2}, LcZ3;->e(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    return-void
.end method

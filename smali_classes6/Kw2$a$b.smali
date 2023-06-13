.class public LKw2$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKw2$a;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/BroadcastReceiver;

.field public final synthetic c:LKw2$a;


# direct methods
.method public constructor <init>(LKw2$a;Landroid/content/BroadcastReceiver;)V
    .locals 0

    iput-object p1, p0, LKw2$a$b;->c:LKw2$a;

    iput-object p2, p0, LKw2$a$b;->b:Landroid/content/BroadcastReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, LKw2$a$b;->c:LKw2$a;

    iget-object v0, v0, LKw2$a;->b:LKw2;

    iget-object v0, v0, LKw2;->a:Landroid/content/Context;

    iget-object v1, p0, LKw2$a$b;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
